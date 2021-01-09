package com._04_EstructurasAlgoritmicas._04_Switch;

import java.util.Scanner;

public class _02_EjercicioNombreMes {
    public static void nombreMes() {
        Scanner teclado = new Scanner(System.in);
        String nombreMes = null;

        System.out.println("\nIngrese El Nùmero Del Mes: ");
        int mes = teclado.nextInt();

        switch (mes) {
            case 1:
                nombreMes = "January";
                break;

            case 2:
                nombreMes = "February";
                break;

            case 3:
                nombreMes = "March";
                break;

            case 4:
                nombreMes = "April";
                break;

            case 5:
                nombreMes = "May";
                break;

            case 6:
                nombreMes = "June";
                break;

            case 7:
                nombreMes = "July";
                break;

            case 8:
                nombreMes = "August";
                break;

            case 9:
                nombreMes = "September";
                break;

            case 10:
                nombreMes = "October";
                break;

            case 11:
                nombreMes = "November";
                break;

            case 12:
                nombreMes = "December";
                break;

            default:
                nombreMes = "El Mes Asignado No Existe En El Calendario Gregoriano";
                 break;
        }

        System.out.println("nombreMes = " + nombreMes);
    }
}
