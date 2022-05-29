package com.company.driver;

import com.company.driver.factory.entity.MobileDriverData;
import org.openqa.selenium.WebDriver;

public interface IMobileDriver {
    WebDriver getDriver(MobileDriverData mobileDriverData);
}
