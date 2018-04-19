package com.db.edu.logger;

import java.util.Locale;

public class LoggerController {

    private LoggerSaver loggerSaver = new LoggerSaver();
    private LoggerFilter loggerFilter;
    private LoggerDecorator loggerDecorator;

    /**
     *
     * @param message - save message
     */
    public void log(String message) {
        if (loggerFilter.filter()) {
            loggerSaver.save(loggerDecorator.decorate(message));
        }
    }
}
