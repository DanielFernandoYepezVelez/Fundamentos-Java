package com._05_EstructurasAlgoritmicas._04_Switch;

import java.util.Scanner;

public class _03_EjercicioDiasMes {
    public static void numeroDiasMes() {
        int numeroDias = 0;
        Scanner teclado = new Scanner(System.in);

        System.out.println("\nIngrese El Nùmero Del Mes Del 1 - 12: ");
        int mes = teclado.nextInt();

        System.out.println("Ingrese El Número Del Año (YYYY): ");
        int anio = teclado.nextInt();

        switch (mes) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                numeroDias = 31;
                break;

            case 4:
            case 6:
            case 9:
            case 11:
                numeroDias = 30;
                break;

            case 2:
                if (anio % 400 == 0 || ( (anio % 4 == 0) && !(anio % 100 == 0) ) ) {
                    numeroDias = 29;
                } else {
                    numeroDias = 28;
                }
                break;

            default:
                numeroDias = 0;
                System.out.println("Error Ingresando La Información");
                break;
        }

        System.out.println("\nAño = " + anio);
        System.out.println("Numero De Dias = " + numeroDias);
    }
}
