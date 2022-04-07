package com.company.config.factory;

import com.company.config.FrameworkConfig;
import org.aeonbits.owner.ConfigCache;

public class FrameworkConfigFactory {

    private FrameworkConfigFactory() {
    }

    public static FrameworkConfig getConfig(){
        return ConfigCache.getOrCreate(FrameworkConfig.class);
    }
}
