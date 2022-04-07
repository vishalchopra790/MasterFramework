package com.company.driver.manager.web.browserstack;

import com.company.config.factory.BrowserStackConfigFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public final class BrowserStackFirefoxManager {
    private BrowserStackFirefoxManager(){}

    public static WebDriver getDriver() {

        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setBrowserName(BrowserType.FIREFOX);
        return new RemoteWebDriver(BrowserStackConfigFactory.getConfig().browserStackURL(),capabilities);
    }
}
