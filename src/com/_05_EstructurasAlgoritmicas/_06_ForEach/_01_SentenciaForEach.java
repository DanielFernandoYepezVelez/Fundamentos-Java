package com._05_EstructurasAlgoritmicas._06_ForEach;

public class _01_SentenciaForEach {
    public static void iteradorModerno() {

        int[] numbers = {1, 2, 3, 4, 5};

        System.out.println("========== ITERADOR FOR-EACH NÙMEROS ==========");
        for (int number: numbers) {
            System.out.println(number);
        }

        String[] names = {"Daniel", "Fernando", "Yepez", "Garzón"};

        System.out.println("========== ITERADOR FOR-EACH NOMBRES ==========");
        for (String name: names) {
            System.out.println(name);
        }
    }
}
