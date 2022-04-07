package com.company.driver.factory;

import com.company.driver.factory.entity.MobileDriverData;
import com.company.driver.factory.mobile.local.LocalMobileDriverFactory;
import com.company.driver.factory.mobile.remote.RemoteMobileDriverFactory;
import org.openqa.selenium.WebDriver;

public class RemoteMobileDriverImpl implements IMobileDriver{

    @Override
    public WebDriver getDriver(MobileDriverData mobileDriverData) {
        return RemoteMobileDriverFactory.getDriver(mobileDriverData.getMobileRemoteModeType(),mobileDriverData.getMobilePlatformType());
    }
}
