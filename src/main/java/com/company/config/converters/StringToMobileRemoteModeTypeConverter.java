package com.company.config.converters;

import com.company.enums.MobileRemoteModeType;
import org.aeonbits.owner.Converter;

import java.lang.reflect.Method;

public class StringToMobileRemoteModeTypeConverter implements Converter<MobileRemoteModeType> {
    @Override
    public MobileRemoteModeType convert(Method method, String runMode) {

        return MobileRemoteModeType.valueOf(runMode.toUpperCase());
    }
}
