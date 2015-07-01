package com.geolud.logbacklib.test;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LogTestDebug {
    private static Logger logger = LoggerFactory.getLogger(LogTestDebug.class);

    public void log(){
        for (int i = 0; i < 1; i++) {
            logger.debug("Debug {}", i);
        }

    }
}
