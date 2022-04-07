package com.company.driver.factory.entity;

import com.company.enums.MobilePlatformType;
import com.company.enums.MobileRemoteModeType;
import com.company.enums.RunModeType;
import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class MobileDriverData {

    private MobilePlatformType mobilePlatformType;
    private RunModeType runModeType;
    private MobileRemoteModeType mobileRemoteModeType;
}
