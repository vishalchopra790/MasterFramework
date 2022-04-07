package com.company.driver.factory.web.remote;

import com.company.driver.manager.web.remote.SeleniumGridChromeManager;
import com.company.driver.manager.web.remote.SeleniumGridFirefoxManager;
import com.company.enums.BrowserType;
import org.openqa.selenium.WebDriver;

public final class SeleniumGridFactory {
    private SeleniumGridFactory(){}

    public static WebDriver getDriver(BrowserType browserType){
        return browserType == BrowserType.CHROME ? SeleniumGridChromeManager.getDriver() : SeleniumGridFirefoxManager.getDriver();
    }
}
