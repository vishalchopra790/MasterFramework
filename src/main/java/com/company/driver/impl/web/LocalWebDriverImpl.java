package com.company.driver.impl.web;

import com.company.driver.IWebDriver;
import com.company.driver.factory.entity.WebDriverData;
import com.company.driver.factory.web.local.LocalDriverFactory;
import org.openqa.selenium.WebDriver;

public class LocalWebDriverImpl implements IWebDriver {
    @Override
    public WebDriver getDriver(WebDriverData webDriverData) {
        return LocalDriverFactory.getDriver(webDriverData.getBrowserType());
    }
}
