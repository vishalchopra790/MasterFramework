package com.company.driver.manager.mobile.local;

import com.company.config.factory.FrameworkConfigFactory;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public final class IOSManager {

    private IOSManager(){}
    public static WebDriver getDriver(){
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability(CapabilityType.PLATFORM_NAME, Platform.IOS);
        capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "XCUITest");
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "iPod touch (7th generation)");
        capabilities.setCapability(MobileCapabilityType.APP,
                System.getProperty("user.dir")+"/ios-app.zip");
        return new RemoteWebDriver(FrameworkConfigFactory.getConfig().localAppiumServerURL(),capabilities);
    }
}
