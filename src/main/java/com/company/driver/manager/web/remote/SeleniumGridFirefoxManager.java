package com.company.driver.manager.web.remote;

import com.company.config.factory.FrameworkConfigFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public final class SeleniumGridFirefoxManager {
    private SeleniumGridFirefoxManager(){}

    public static WebDriver getDriver() {

        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setBrowserName(BrowserType.FIREFOX);
        return new RemoteWebDriver(FrameworkConfigFactory.getConfig().seleniumGridURL(),capabilities);
    }
}
