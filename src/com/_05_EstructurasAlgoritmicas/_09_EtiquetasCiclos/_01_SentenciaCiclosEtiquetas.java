package com._05_EstructurasAlgoritmicas._09_EtiquetasCiclos;

public class _01_SentenciaCiclosEtiquetas {
    public static void etiquetas() {

        System.out.println("========== FOR ETIQUETA CONTINUE; ==========");
        bucle1:
        for (int i = 0; i < 5; i++) {

            for (int j = 0; j < 2; j++) {
                if(i == 2) {
                    continue bucle1;
                }

                System.out.println("i = " + i + ", j = " + j + " ");
            }
        }

        System.out.println("\n========== FOR ETIQUETA BREAK; ==========");
        etiqueta1:
        for (int i = 0; i < 5; i++) {

            for (int j = 0; j < 2; j++) {
                if(i == 2) {
                    break etiqueta1;
                }

                System.out.println("i = " + i + ", j = " + j + " ");
            }
        }

        /** Esto Tambièn Se Puede Aplicar Para Los Whiles, Solo Que Tenemos Que
         * Transformar los Ciclos */
    }
}
