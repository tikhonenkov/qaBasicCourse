package com.db.edu.logger;

import java.util.Random;

public class LoggerFilter {
    public boolean filter() {
        return new Random().nextBoolean();
    }
}
