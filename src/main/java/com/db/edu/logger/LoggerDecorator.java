package com.db.edu.logger;

public class LoggerDecorator {
    public String decorate(String message) {
        return System.currentTimeMillis() + " " + message;
    }
}
