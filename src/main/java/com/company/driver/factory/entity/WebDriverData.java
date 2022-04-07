package com.company.driver.factory.entity;

import com.company.enums.*;
import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class WebDriverData {
    private BrowserType browserType;
    private BrowserRemoteModeType browserRemoteModeType;
    private RunModeType runModeType;
}
