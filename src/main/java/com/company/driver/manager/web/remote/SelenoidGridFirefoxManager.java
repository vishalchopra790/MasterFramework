package com.company.driver.manager.web.remote;

import com.company.config.factory.FrameworkConfigFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public final class SelenoidGridFirefoxManager {

    private SelenoidGridFirefoxManager(){}

    public static WebDriver getDriver() {
        DesiredCapabilities capabilities=new DesiredCapabilities();
        capabilities.setCapability("browserName","firefox");
        capabilities.setCapability("browserVersion","97.0");
        capabilities.setCapability("enableVNC",true);
        capabilities.setCapability("enableVideo",false);
        return new RemoteWebDriver(FrameworkConfigFactory.getConfig().selenoidURL(),capabilities);
    }
}
