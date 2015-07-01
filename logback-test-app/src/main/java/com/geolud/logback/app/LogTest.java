package com.geolud.logback.app;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by georg on 7/1/15.
 */
public class LogTest {

    private static Logger logger = LoggerFactory.getLogger(LogTest.class);

    public static void main(String[] args) {
        new LogTestTrace().log();
        new LogTestDebug().log();
        new LogTestInfo().log();
        new LogTestWarn().log();
        new com.geolud.logback.lib.LogTestTrace().log();
        new com.geolud.logback.lib.LogTestDebug().log();
        new com.geolud.logback.lib.LogTestInfo().log();
        new com.geolud.logback.lib.LogTestWarn().log();

    }
}
