package com.example;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int sum = calculator.add(5, 10);
        System.out.println("Sum: " + sum);

        LegacyPrinter printer = new LegacyPrinter();
        printer.printMessage("Hello, World!");
    }
}
