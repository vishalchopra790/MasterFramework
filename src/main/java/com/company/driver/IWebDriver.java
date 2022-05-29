package com.company.driver;

import com.company.driver.factory.entity.WebDriverData;
import org.openqa.selenium.WebDriver;

public interface IWebDriver {
    WebDriver getDriver(WebDriverData webDriverData);
}
