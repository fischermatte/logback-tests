package com.geolud.logback.lib;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by georg on 7/1/15.
 */
public class LogTestTrace {
    private static Logger logger = LoggerFactory.getLogger(LogTestTrace.class);

    public void log(){
        for (int i = 0; i < 1; i++) {
            logger.trace("Trace {}", i);
        }
    }
}
