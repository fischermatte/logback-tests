package com.geolud.logback;

import com.geolud.logback.test.LogTestDebug;
import com.geolud.logback.test.LogTestInfo;
import com.geolud.logback.test.LogTestTrace;
import com.geolud.logback.test.LogTestWarn;
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
        new com.geolud.logbacklib.test.LogTestTrace().log();
        new com.geolud.logbacklib.test.LogTestDebug().log();
        new com.geolud.logbacklib.test.LogTestInfo().log();
        new com.geolud.logbacklib.test.LogTestWarn().log();

    }
}
