package com.example;

public class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    // Intentional "code smell": Unused method
    public int multiply(int a, int b) {
        return a * b;
    }

    // Intentional "code smell": Duplicate logic
    public int duplicateLogicAdd(int x, int y) {
        return x + y;
    }
}
