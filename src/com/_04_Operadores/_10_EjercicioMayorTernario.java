package com._04_Operadores;

import java.util.Scanner;

public class _10_EjercicioMayorTernario {
    public static void numeroMayor() {
        Scanner teclado = new Scanner(System.in);

        int max = 0;

        System.out.println("Ingrese Un Valor Númerico: ");
        int num1 = teclado.nextInt();

        System.out.println("Ingrese Un Segundo Valor Númerico: ");
        int num2 = teclado.nextInt();

        System.out.println("Ingrese Un Tercer Valor Númerico: ");
        int num3 = teclado.nextInt();

        System.out.println("Ingrese Un Cuarto Valor Númerico: ");
        int num4 = teclado.nextInt();

        /** Lògica Nùmero Mayor */
        max = (num1 > num2) ? num1 : num2;
        max = (max > num3) ? max : num3;
        max = (max > num4) ? max : num4;

        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
        System.out.println("num3 = " + num3);
        System.out.println("num4 = " + num4);
        System.out.println("El Nùmero Mayor Es max = " + max);
    }
}
