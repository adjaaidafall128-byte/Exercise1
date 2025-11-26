package com.example;

public class BadCode {

    // variable inutilisée supprimée

    public void process(int age, boolean isStudent, boolean isSenior, String day) {
        double price = calculatePrice(age, isStudent, isSenior, day);
        System.out.println("Prix final : " + price + " €");
    }

    private double calculatePrice(int age, boolean isStudent, boolean isSenior, String day) {
        if (age < 18) {
            return isStudent ? getStudentChildPrice(day) : getChildPrice(day);
        }
        if (age > 65 || isSenior) {
            return getSeniorPrice(day);
        }
        return 10.0; // tarif normal
    }

    private double getStudentChildPrice(String day) {
        return day.equals("weekend") ? 5.0 : 6.0;
    }

    private double getChildPrice(String day) {
        return day.equals("weekend") ? 7.0 : 8.0;
    }

    private double getSeniorPrice(String day) {
        return day.equals("wednesday") ? 4.0 : 6.0;
    }
}