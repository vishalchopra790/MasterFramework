package com.company.driver.factory.entity;

import com.company.enums.*;
import lombok.AllArgsConstructor;

import lombok.Getter;

@AllArgsConstructor
@Getter
public class WebDriverData {
    private BrowserType browserType;
    private BrowserRemoteModeType browserRemoteModeType;

}
