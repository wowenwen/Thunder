package com.nepxion.thunder.console.controller;

/**
 * <p>Title: Nepxion Thunder</p>
 * <p>Description: Nepxion Thunder For Distribution</p>
 * <p>Copyright: Copyright (c) 2017-2050</p>
 * <p>Company: Nepxion</p>
 * @author Haojun Ren
 * @version 1.0
 */

import com.nepxion.thunder.common.constant.ThunderConstant;
import com.nepxion.thunder.common.entity.ApplicationEntity;
import com.nepxion.thunder.common.property.ThunderProperties;
import com.nepxion.thunder.console.context.RegistryContext;

public class PropertyController {
    public static String getProperty(ApplicationEntity applicationEntity) throws Exception {
        return RegistryContext.getDefaultRegistryExecutor().retrieveProperty(applicationEntity);
    }

    public static void modifyProperty(ApplicationEntity applicationEntity, String property) throws Exception {
        RegistryContext.getDefaultRegistryExecutor().persistProperty(property.trim(), applicationEntity);
    }

    public static ThunderProperties getProperties(ApplicationEntity applicationEntity) throws Exception {
        String property = RegistryContext.getDefaultRegistryExecutor().retrieveProperty(applicationEntity);
        ThunderProperties properties = new ThunderProperties(property.getBytes(), ThunderConstant.ENCODING_UTF_8, ThunderConstant.ENCODING_UTF_8);

        return properties;
    }
}