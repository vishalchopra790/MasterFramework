package com.company.driver.impl.web;

import com.company.driver.IWebDriver;
import com.company.driver.factory.entity.WebDriverData;
import com.company.driver.factory.web.remote.RemoteDriverFactory;
import org.openqa.selenium.WebDriver;

public class RemoteWebDriverImpl implements IWebDriver {
    @Override
    public WebDriver getDriver(WebDriverData webDriverData) {
        return RemoteDriverFactory.getDriver(webDriverData.getBrowserRemoteModeType(),webDriverData.getBrowserType());
    }
}
