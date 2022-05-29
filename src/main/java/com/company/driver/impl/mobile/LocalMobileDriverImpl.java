package com.company.driver.impl.mobile;

import com.company.driver.IMobileDriver;
import com.company.driver.factory.entity.MobileDriverData;
import com.company.driver.factory.mobile.local.LocalMobileDriverFactory;
import org.openqa.selenium.WebDriver;

public class LocalMobileDriverImpl implements IMobileDriver {

    @Override
    public WebDriver getDriver(MobileDriverData mobileDriverData) {
        return LocalMobileDriverFactory.getDriver(mobileDriverData.getMobilePlatformType());
    }
}
