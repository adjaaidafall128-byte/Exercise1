package com.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LegacyPrinter {

    private static final Logger log = LoggerFactory.getLogger(LegacyPrinter.class);

    public void printMessage(String message) {
        log.info(message);
    }

    /**
     * @deprecated Utilisez plutôt {@link #printMessage(String)} 
     * @since 1.0
     * @forRemoval true
     */
    @Deprecated(since = "1.0", forRemoval = true)
    public void printOldMessage(String message) {
        log.info("OLD: {}", message);
    }
}