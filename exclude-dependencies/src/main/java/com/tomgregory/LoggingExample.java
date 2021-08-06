package com.tomgregory;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LoggingExample {
    public static void main(String[] args) {
        Logger logger = LoggerFactory.getLogger(LoggingExample.class);
        logger.error("Error level output");
    }
}