package com._06_JavaUtilDate;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class _05_CompararFechas {
    public static void dateCompare() {
        System.out.println("\n========== COMPARAR FECHAS ==========");

        Scanner teclado = new Scanner(System.in);
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");

        System.out.println("Ingrese Una Fecha Con Formato 'yyyy-MM-dd': ");

        try {
            Date fecha = format.parse(teclado.nextLine());
            Date fecha2 = new Date();

            System.out.println("\nfecha = " + fecha);
            System.out.println("fecha2 = " + fecha2);
            System.out.println("format.format(fecha) = " + format.format(fecha));

            /** Primera Forma De Comparar FECHAS */
            System.out.println();
            if (fecha.after(fecha2)) {
                System.out.println("Fecha Del Usuario Es Mayor Que La Fecha Actual");
            } else if (fecha.before(fecha2)) {
                System.out.println("Fecha Del Usuario Es Menor Que La Fecha Actual");
            } else if (fecha.equals(fecha2)) {
                System.out.println("Las Fechas Son Iguales");
            }

            /** Segunda Forma De Comparar FECHAS */
            if (fecha.compareTo(fecha2) > 0) {
                System.out.println("Fecha Del Usuario Es Mayor Que La Fecha Actual");
            } else if (fecha.compareTo(fecha2) < 0) {
                System.out.println("Fecha Del Usuario Es Menor Que La Fecha Actual");
            } else if (fecha.compareTo(fecha2) == 0) {
                System.out.println("Las Fechas Son Iguales");
            }

        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
