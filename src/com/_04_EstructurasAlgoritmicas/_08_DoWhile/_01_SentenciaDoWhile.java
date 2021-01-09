package com._04_EstructurasAlgoritmicas._08_DoWhile;

public class _01_SentenciaDoWhile {
    public static void iterandorDoWhile() {
        int i = 0;
        boolean test = false;

        System.out.println("========== ITERADOR DO WHILE PRUEBA ==========");
        do {
            if (i == 7) {
                test = false;
            }

            System.out.println("Se Ejecuta Como Minímo Una Sola Vez");
            System.out.println(i);
        } while (test);

        boolean test2 = true;

        System.out.println("\n========== ITERADOR DO WHILE ==========");
        do {
            if (i == 7) {
                test2 = false;
            }

            System.out.println(i);
            i++;
        } while (test2);
    }
}
