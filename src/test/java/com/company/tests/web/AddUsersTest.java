package com.company.tests.web;

import br.com.six2six.fixturefactory.Fixture;
import br.com.six2six.fixturefactory.loader.FixtureFactoryLoader;
import com.company.fixtures.addusers.entity.UserData;
import com.company.pages.LoginPage;
import com.company.pages.pagecomponents.adduserspage.UserListComponent;
import com.company.tests.web.base.WebBase;
import io.github.sskorol.core.DataSupplier;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import java.util.List;


public class AddUsersTest extends WebBase {


    @BeforeSuite
    public void setup(){
        FixtureFactoryLoader.loadTemplates("com.company.fixtures");
    }
    @DataSupplier(runInParallel = true)
    public List<UserData> getData(){
      List<UserData> valid =Fixture.from(UserData.class).gimme(4,"valid","valid","valid","just_username");
      return valid;

    }

    @Test(dataProvider="getData")
    public void testAddUsers(UserData userData){
        new LoginPage().loginToApplication("Admin","admin123")
                .navigateToSystemUsersPage();

        new UserListComponent().setAddButton()
                .fillDetails(userData);
        ;
    }
}
