package com.company.driver;



import com.company.driver.factory.DriverFactory;
import com.company.driver.factory.entity.MobileDriverData;
import com.company.driver.factory.entity.WebDriverData;

import com.company.enums.MobilePlatformType;
import org.openqa.selenium.WebDriver;


import java.util.Objects;

import static com.company.config.factory.FrameworkConfigFactory.getConfig;

public final class Driver {
    private Driver() {
    }

    public static void initDriverForWeb() {
       if(Objects.isNull(DriverManager.getDriver())) {
           WebDriverData driverData = new WebDriverData(getConfig().browser(), getConfig().browserRemoteMode());

           WebDriver driver = DriverFactory.getDriverForWeb(getConfig().browserRunMode()).getDriver(driverData);
           DriverManager.setDriver(driver);
           loadURL();
       }
    }
    public static void loadURL(){
        DriverManager.getDriver().get(getConfig().webURL());
    }
    public static void initDriverForMobile() {
        MobileDriverData driverData=new MobileDriverData(MobilePlatformType.ANDROID,getConfig().mobileRemoteMode());

        WebDriver driver = DriverFactory.getDriverForMobile(getConfig().mobileRunMode()).getDriver(driverData);
         DriverManager.setDriver(driver);
    }
    public static void quitDriver() {
        if(Objects.nonNull(DriverManager.getDriver())) {
            DriverManager.getDriver().quit();
            DriverManager.unload();

        }
    }
}
