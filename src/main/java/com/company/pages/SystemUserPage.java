package com.company.pages;

import com.company.pages.pagecomponents.adduserspage.AddUserComponent;
import com.company.pages.pagecomponents.adduserspage.SearchComponent;
import com.company.pages.pagecomponents.adduserspage.UserListComponent;

public class SystemUserPage {
   private SearchComponent searchComponent;
   private AddUserComponent addUserComponent;
   private UserListComponent userListComponent;

   public SystemUserPage(){
       SearchComponent searchComponent = new SearchComponent();
       AddUserComponent addUserComponent = new AddUserComponent();
       UserListComponent UserListComponent = new UserListComponent();
   }

    public AddUserComponent getAddUserComponent() {
        return addUserComponent;
    }
    public UserListComponent getUserListComponent() {
        return userListComponent;
    }
}
