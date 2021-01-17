package com._05_EstructurasAlgoritmicas._05_For;

public class _01_SentenciaFor {
    public static void forNormal() {

        System.out.println("========== ITERACIÓN INCREMENTAL ==========");
        for (int i = 0; i <= 5; i++) {
            System.out.println(i);
        }

        System.out.println("\n========== ITERACIÓN DECREMENTAL ==========");
        for (int i = 5; i >= 0; i--) {
            System.out.println(i);
        }

        /** Ejercicio Interesante Para Analizar Y Tener En Cuenta */

        System.out.println("\n========== ITERACIÓN COMBINADA ==========");
        for (int i = 1, j = 10; i <= j; i++, j--) {
            System.out.println(i + " - " + j);
        }

        System.out.println("\n========== ITERACIÓN NÚMEROS IMPARES ==========");
        for (int i = 0; i <= 5; i++) {

            if (i % 2 == 0) {
                continue;
            }

            System.out.println("Numero Impares: " + i);
        }

        System.out.println("\n========== ITERACIÓN NÚMEROS PARES ==========");
        for (int i = 0; i <= 5; i++) {

            if (i % 2 != 0) {
                continue;
            }

            System.out.println("Numero Pares: " + i);
        }

    }
}
