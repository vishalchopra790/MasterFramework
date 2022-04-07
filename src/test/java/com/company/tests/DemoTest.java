package com.company.tests;

import com.company.config.factory.BrowserStackConfigFactory;
import com.company.config.factory.FrameworkConfigFactory;
import com.company.driver.Driver;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DemoTest {

    @BeforeMethod
    public void setUp(){
        Driver.initDriverForWeb();
    }
    @Test
    public void testLogin(){
        //Dri.get("https://google.com");
        System.out.println(BrowserStackConfigFactory.getConfig().browserStackURL());

    }
}
