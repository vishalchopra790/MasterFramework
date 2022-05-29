package com.company.driver.factory.web.remote;

import com.company.driver.manager.web.browserstack.BrowserStackChromeManager;
import com.company.driver.manager.web.browserstack.BrowserStackFirefoxManager;
import com.company.enums.BrowserType;
import org.openqa.selenium.WebDriver;

public final class BrowserStackFactory {
    private BrowserStackFactory(){}

    public static WebDriver getDriver(BrowserType browserType){
        return browserType == BrowserType.CHROME ? BrowserStackChromeManager.getDriver() : BrowserStackFirefoxManager.getDriver();
    }
}
