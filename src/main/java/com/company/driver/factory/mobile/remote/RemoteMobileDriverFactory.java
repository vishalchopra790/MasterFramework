package com.company.driver.factory.mobile.remote;

import com.company.driver.factory.web.remote.BrowserStackFactory;
import com.company.driver.factory.web.remote.SeleniumGridFactory;
import com.company.driver.factory.web.remote.SelenoidFactory;
import com.company.driver.manager.mobile.remote.broswerstack.BrowserStackAndroidManager;
import com.company.enums.BrowserRemoteModeType;
import com.company.enums.BrowserType;
import com.company.enums.MobilePlatformType;
import com.company.enums.MobileRemoteModeType;
import org.openqa.selenium.WebDriver;

import java.util.EnumMap;
import java.util.Map;
import java.util.function.Function;

public final class RemoteMobileDriverFactory {

    private RemoteMobileDriverFactory(){}
    private static final Map<MobileRemoteModeType, Function<MobilePlatformType,WebDriver>> MAP=new EnumMap<>(MobileRemoteModeType.class);

    static{
        MAP.put(MobileRemoteModeType.BROWSER_STACK, SauceLabsMobileFactory::getDriver);
        MAP.put(MobileRemoteModeType.SAUCE_LABS, BrowserStackMobileFactory::getDriver);
    }

    public static WebDriver getDriver(MobileRemoteModeType mobileRemoteMode, MobilePlatformType mobilePlatformType){
        return MAP.get(mobileRemoteMode).apply(mobilePlatformType);
    }
}
