package org.example;

public class calculator {

    // Metodo per l'addizione
    public static int add(int a, int b) {
        return a + b;
    }

    // Metodo per la sottrazione
    public static int subtract(int a, int b) {
        return a - b;
    }

    // Metodo per la moltiplicazione
    public static int multiply(int a, int b) {
        return a * b;
    }

    // Metodo per la divisione
    public static int divide(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Errore: Divisione per zero non consentita!");
        }
        return a / b;
    }
}