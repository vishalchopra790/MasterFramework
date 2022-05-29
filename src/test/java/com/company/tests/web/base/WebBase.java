package com.company.tests.web.base;

import com.company.driver.Driver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class WebBase {

    @BeforeMethod
    public void setUp(){
        Driver.initDriverForWeb();
        Driver.loadURL();

    }
    @AfterMethod
    public void tearDown() {
        Driver.quitDriver();
    }
}


