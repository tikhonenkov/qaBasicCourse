package com.db.edu.logger;

import java.util.Locale;

public class LoggerController {

    private LoggerSaver loggerSaver = new LoggerSaver();
    private LoggerFilter loggerFilter = new LoggerFilter();
    private LoggerDecorator loggerDecorator = new LoggerDecorator();

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
