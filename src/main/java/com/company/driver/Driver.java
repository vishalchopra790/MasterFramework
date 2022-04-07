package com.company.driver;



import com.company.driver.factory.DriverFactory;
import com.company.driver.factory.entity.DriverData;
import com.company.driver.factory.entity.MobileDriverData;
import com.company.driver.factory.entity.WebDriverData;
import com.company.driver.factory.mobile.local.LocalMobileDriverFactory;
import com.company.driver.factory.web.remote.RemoteDriverFactory;
import com.company.enums.MobilePlatformType;
import org.openqa.selenium.WebDriver;

import static com.company.config.factory.FrameworkConfigFactory.getConfig;

public final class Driver {
    private Driver() {
    }

    public static void initDriverForWeb() {
       WebDriverData driverData= WebDriverData.builder().browserType(getConfig().browser())
               .browserRemoteModeType(getConfig().browserRemoteMode())
               .runModeType(getConfig().browserRunMode()).build();
        WebDriver driver = DriverFactory.getDriverForWeb(driverData);
        driver.quit();
    }
    public static void initDriverForMobile() {
        MobileDriverData driverData=MobileDriverData.builder().mobilePlatformType(MobilePlatformType.ANDROID)
                .mobileRemoteModeType(getConfig().mobileRemoteMode())
                .runModeType(getConfig().mobileRunMode()).build();
        WebDriver driver = DriverFactory.getDriverForMobile(driverData);
        driver.quit();
    }
    public static void quitDriver() {
        //Vishal
    }
}
