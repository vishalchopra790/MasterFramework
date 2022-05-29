package com.company.driver.factory.entity;

import com.company.enums.MobilePlatformType;
import com.company.enums.MobileRemoteModeType;

import lombok.AllArgsConstructor;

import lombok.Getter;

@AllArgsConstructor
@Getter
public class MobileDriverData {

    private MobilePlatformType mobilePlatformType;

    private MobileRemoteModeType mobileRemoteModeType;
}
