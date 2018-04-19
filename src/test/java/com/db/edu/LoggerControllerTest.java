package com.db.edu;

import com.db.edu.logger.LoggerController;
import org.junit.Test;

public class LoggerControllerTest {

    @Test
    public void checkLogger(){
        LoggerController logger = new LoggerController();
        logger.log("Test Maxim");
    }
}
