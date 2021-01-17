package com._05_EstructurasAlgoritmicas._07_While;

public class _01_SentenciaWhile {
    public static void iteradorWhile() {
        int i = 0;

        System.out.println("========== ITERADOR WHILE NUMBER ==========");
        while (i < 5) {
            System.out.println("i = " + i);
            i++;
        }

        boolean prueba = true;

        System.out.println("\n========== ITERADOR WHILE BOOLEAN ==========");
        while (prueba) {
            if (i == 7) {
                prueba = false;
            }

            System.out.println("i = " + i);
            i++;
        }

    }
}
