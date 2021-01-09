package com._05_ParametrosArgumentos;

import javax.swing.text.EditorKit;

public class _02_PorReferencia {
    public static void parametrosReferencia() {
        int[] edad = {10, 11, 12};

        System.out.println("\n========== PASANDO ARGUMENTOS A LOS PARAMETROS DEFINIDOS ANTERIORMENTE POR REFERENCIA ==========");
        System.out.println("Iniciamos El Método Main");

        for (int i = 0; i < edad.length ; i++) {
            System.out.println("edad = " + edad[i]);
        }

        System.out.println("Antes De LLamar El Mètodo Test");

        test(edad);

        System.out.println("Después De LLamar El Método Test");

        for (int i = 0; i < edad.length ; i++) {
            System.out.println("edad = " + edad[i]);
        }

        System.out.println("Finaliza El Mètodo Main Con Los Datos Del Arreglo Modificados");
    }

    public static void test(int[] edadArray) {
        System.out.println("\nIniciamos El Método Test");

        for (int i = 0; i < edadArray.length ; i++) {
            edadArray[i] += 20;
        }
    }
}
