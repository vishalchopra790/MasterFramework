package com.company.driver.factory.mobile.local;

import com.company.driver.manager.mobile.local.AndroidManager;
import com.company.driver.manager.mobile.local.IOSManager;
import com.company.driver.manager.web.local.ChromeManager;
import com.company.driver.manager.web.local.FirefoxManager;
import com.company.enums.BrowserType;
import com.company.enums.MobilePlatformType;
import org.openqa.selenium.WebDriver;

import java.util.EnumMap;
import java.util.Map;
import java.util.function.Supplier;

public final class LocalMobileDriverFactory {

    private LocalMobileDriverFactory(){
    }
    private static final Map<MobilePlatformType, Supplier<WebDriver>> MAP=new EnumMap<>(MobilePlatformType.class);

    static{
        MAP.put(MobilePlatformType.ANDROID, AndroidManager::getDriver);
        MAP.put(MobilePlatformType.IOS, IOSManager::getDriver);
    }

    public static WebDriver getDriver(MobilePlatformType mobilePlatformType){
        return MAP.get(mobilePlatformType).get();
    }


}
