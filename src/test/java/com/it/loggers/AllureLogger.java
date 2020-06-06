package com.it.loggers;

import io.qameta.allure.Step;
import org.apache.log4j.Logger;

public class AllureLogger {
    private static final Logger LOGGER = Logger.getLogger(AllureLogger.class);

    private AllureLogger() {
    }

    /**
     * Uses the @Step annotation to log the given log message to Allure.
     *
     * @param message the message to log to the allure report
     */
    @Step("{0}")
    public static void log(String message) {
        LOGGER.debug("Logged to allure: " + message);
    }
}
