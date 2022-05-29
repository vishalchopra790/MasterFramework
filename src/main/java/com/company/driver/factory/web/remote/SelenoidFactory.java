package com.company.driver.factory.web.remote;

import com.company.driver.manager.web.remote.SelenoidGridChromeManager;
import com.company.driver.manager.web.remote.SelenoidGridFirefoxManager;
import com.company.enums.BrowserType;
import org.openqa.selenium.WebDriver;

public final class SelenoidFactory {
    private SelenoidFactory(){}

    public static WebDriver getDriver(BrowserType browserType){
        return browserType == BrowserType.CHROME ? SelenoidGridChromeManager.getDriver() : SelenoidGridFirefoxManager.getDriver();
    }
}
