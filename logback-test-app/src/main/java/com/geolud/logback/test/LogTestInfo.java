package com.geolud.logback.test;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by georg on 7/1/15.
 */
public class LogTestInfo {
    private static Logger logger = LoggerFactory.getLogger(LogTestInfo.class);

    public void log(){
        for (int i = 0; i < 1; i++) {
            logger.info("Info {}", i);
        }

    }
}
