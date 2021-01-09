package com._04_EstructurasAlgoritmicas._03_IfElseIf;

import java.util.Scanner;

public class _02_EjercicioDiasMes {
    public static void numeroDiasMes() {
        int numeroDias = 0;
        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingrese El Nùmero Del Mes Del 1 - 12: ");
        int mes = teclado.nextInt();

        System.out.println("Ingrese El Número Del Año (YYYY): ");
        int anio = teclado.nextInt();

        if(mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) {
            numeroDias = 31;
        } else if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
            numeroDias = 30;

        } else if (mes == 2) {
            if (anio % 400 == 0 || ( (anio % 4 == 0) && !(anio % 100 == 0) ) ) {
                numeroDias = 29;
            } else {
                numeroDias = 28;
            }
        }

        System.out.println("\nAño = " + anio);
        System.out.println("Numero De Dias = " + numeroDias);
    }
}
