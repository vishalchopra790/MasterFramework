package com.company.pages.pagecomponents.adduserspage;

import com.company.utils.PageActionsHelper;
import org.openqa.selenium.By;

    public class UserListComponent {

    private static final By ADD_BUTTON = By.id("btnAdd");

    public AddUserComponent setAddButton() {
        PageActionsHelper.waitAndClick(ADD_BUTTON);
        return new AddUserComponent();
    }
}
