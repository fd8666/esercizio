package org.example;

public class calculator {

    // Metodo per l'addizione
    public double add(double a, double b) {
        return a + b;
    }

    // Metodo per la sottrazione
    public double subtract(double a, double b) {
        return a - b;
    }

    // Metodo per la moltiplicazione
    public double multiply(double a, double b) {
        return a * b;
    }

    // Metodo per la divisione
    public double divide(double a, double b) {
        if (b == 0) {
            throw new IllegalArgumentException("Errore: Divisione per zero non consentita!");
        }
        return a / b;
    }
}