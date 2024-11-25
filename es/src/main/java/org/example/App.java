package org.example;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        calculator calculator = new calculator(); // Istanziazione della classe Calculator
        Scanner scanner = new Scanner(System.in);

        System.out.println("Benvenuto nella Calcolatrice!");

        System.out.print("Inserisci il primo numero: ");
        int num1 = scanner.nextInt();

        System.out.print("Inserisci il secondo numero: ");
        int num2 = scanner.nextInt();

        // Esegui tutte le operazioni
        System.out.println("\nRisultati delle operazioni:");
        System.out.println("Addizione: " + calculator.add(num1, num2));
        System.out.println("Sottrazione: " + calculator.subtract(num1, num2));
        System.out.println("Moltiplicazione: " + calculator.multiply(num1, num2));

        try {
            System.out.println("Divisione: " + calculator.divide(num1, num2));
        } catch (IllegalArgumentException e) {
            System.out.println("Divisione: " + e.getMessage());
        }

        scanner.close();
    }
}
