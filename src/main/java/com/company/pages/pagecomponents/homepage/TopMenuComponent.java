package com.company.pages.pagecomponents.homepage;

import com.company.pages.enums.topmenucomponent.MenuType;
import com.company.pages.enums.topmenucomponent.SubMenuType;
import com.company.utils.PageActionsHelper;

import org.openqa.selenium.By;

public class TopMenuComponent {

    private static final String MENU = "//b[text()='%s']/parent::a";
    private static final String SUB_MENU = "//a[text()='%s']";


    public TopMenuComponent clickMenuItem(MenuType menuType){
        String xpath = String.format(MENU, menuType.getName());
        PageActionsHelper.waitAndClick(By.xpath(xpath));
        return this;
    }

    public TopMenuComponent clickSubMenuItem(SubMenuType subMenuType){
        String xpath = String.format(SUB_MENU, subMenuType.getName());
        PageActionsHelper.waitAndClick(By.xpath(xpath));
        return this;
    }
}
