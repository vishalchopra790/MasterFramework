package com.company.pages;

import com.company.pages.enums.topmenucomponent.MenuType;
import com.company.pages.enums.topmenucomponent.SubMenuType;
import com.company.pages.pagecomponents.homepage.TopMenuComponent;

public class HomePage {

    private TopMenuComponent topMenuComponent;

    public HomePage(){
        this.topMenuComponent = new TopMenuComponent();
    }

    public TopMenuComponent getTopMenuComponent() {
        return topMenuComponent;
    }

    public SystemUserPage navigateToSystemUsersPage(){
        topMenuComponent.clickMenuItem(MenuType.ADMIN)
                .clickSubMenuItem(SubMenuType.USER_MANAGEMENT)
                .clickSubMenuItem(SubMenuType.USERS);
        return new SystemUserPage();
    }
}
