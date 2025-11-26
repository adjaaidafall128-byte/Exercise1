package com.example;

public class LegacyPrinter {
    public void printMessage(String message) {
        System.out.println(message);
    }

    @Deprecated
    public void printOldMessage(String message) {
        System.out.println("OLD: " + message);
    }
}