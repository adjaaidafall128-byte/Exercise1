package com.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {

    private static final Logger log = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int sum = calculator.add(5, 10);
        log.info("Sum: {}", sum);

        LegacyPrinter printer = new LegacyPrinter();
        printer.printMessage("Hello, World!");
    }
}