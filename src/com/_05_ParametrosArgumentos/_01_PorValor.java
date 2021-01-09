package com._05_ParametrosArgumentos;

public class _01_PorValor {
    public static void parametrosValor() {
        int i = 10;

        System.out.println("========== PASANDO ARGUMENTOS A LOS PARAMETROS DEFINIDOS ANTERIORMENTE POR VALOR ==========");
        System.out.println("Iniciando El Método Main Con i = " + i);
        test(i);

        System.out.println("Finaliza El Mètodo Main Con El Mismo Valor De i = " + i);
    }

    public static void test(int numeroI) {
        System.out.println("Iniciando El Mètodo test Con i = " + numeroI);

        numeroI = 35;
        test2(numeroI);
        System.out.println("Finaliza El Mètodo test Con El Nuevo Valor De i = " + numeroI);
    }

    public static void test2(Integer numeroI) {
        System.out.println("Iniciando El Mètodo test2 Con i = " + numeroI);

        numeroI = 35;
        System.out.println("Finaliza El Mètodo test2 Con El Nuevo Valor De i = " + numeroI);
    }
}
