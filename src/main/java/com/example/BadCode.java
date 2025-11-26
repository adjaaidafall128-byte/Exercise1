package com.example;

public class BadCode {

    private int unusedVariable = 42; // variable jamais utilisée

    public void process(int age, boolean isStudent, boolean isSenior, String day) {
        // Méthode très longue + conditionnelle complexe
        if (age < 18) {
            if (isStudent) {
                if (day.equals("weekend")) {
                    System.out.println("Réduction enfant étudiant weekend");
                } else {
                    System.out.println("Réduction enfant étudiant");
                }
            } else {
                if (day.equals("weekend")) {
                    System.out.println("Réduction enfant weekend");
                } else {
                    System.out.println("Tarif enfant");
                }
            }
        } else if (age > 65 || isSenior) {
            if (day.equals("wednesday")) {
                System.out.println("Tarif senior mercredi");
            } else {
                System.out.println("Tarif senior");
            }
        } else {
            System.out.println("Tarif normal");
        }
        // Fin de la méthode de 30+ lignes
    }
}