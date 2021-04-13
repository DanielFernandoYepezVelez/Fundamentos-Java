package com._06_JavaUtil;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class _04_StringDateParse {
    public static void StringAdate() {
        System.out.println("\n========== PASAR DE STRING A OBJETO DATE ==========");

        Scanner teclado = new Scanner(System.in);
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");

        System.out.println("Ingrese Una Fecha Con Formato 'yyyy-MM-dd': ");

        try {
            Date fecha = format.parse(teclado.nextLine());

            System.out.println("fecha = " + fecha);
            System.out.println("format.format(fecha) = " + format.format(fecha));

        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
