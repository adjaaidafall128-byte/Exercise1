package com.example;

public class Calculator {

    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    // La méthode multiply() était jamais utilisée → supprimée
    // La méthode duplicateLogicAdd() était du code dupliqué → supprimée
    // On garde uniquement ce qui est réellement appelé depuis Main
}