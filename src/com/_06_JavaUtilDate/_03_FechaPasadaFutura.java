package com._06_JavaUtilDate;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class _03_FechaPasadaFutura {
    public static void fechaCalendar() {
        System.out.println("\n========== CLASE CALENDAR, FECHA PASADA, ACTUAL, FUTURA ==========");

        /** Detras De Escena Crea Un Calendario Dependiendo De La Zona */
        Calendar calendario = Calendar.getInstance();

        /** Es Lo Mismo Que La Fecha Con La Clase Date */
        Date fechaActual = calendario.getTime();
        System.out.println("fechaActual = " + fechaActual);

        /** El Mes De Enero En Calendar Siempre Inicia Desde Cero(0) */
        calendario.set(2020, 0, 25);
        Date fechaPersonalizadaUno = calendario.getTime();
        System.out.println("fechaPersonalizadaUno = " + fechaPersonalizadaUno);

        calendario.set(1993, 3, 28, 22, 20, 10);
        Date fechaPersonalizadaDos = calendario.getTime();
        System.out.println("fechaPersonalizadaDos = " + fechaPersonalizadaDos);

        calendario.set(2025, Calendar.SEPTEMBER, 28, 22, 20, 10);
        Date fechaPersonalizadaTres = calendario.getTime();
        System.out.println("fechaPersonalizadaTres = " + fechaPersonalizadaTres);

        /** Ingresar Una Fecha Parte Por Parte O Fragmentada */
        calendario.set(Calendar.YEAR, 1970);
        calendario.set(Calendar.MONTH, Calendar.JULY);
        calendario.set(Calendar.DAY_OF_MONTH, 1);

        calendario.set(Calendar.HOUR_OF_DAY, 21);
        calendario.set(Calendar.MINUTE, 44);
        calendario.set(Calendar.SECOND, 8);
        calendario.set(Calendar.MILLISECOND, 125);

        Date fechaPersonalizadaCuatro = calendario.getTime();
        System.out.println("fechaPersonalizadaCuatro = " + fechaPersonalizadaCuatro);

        calendario.set(Calendar.YEAR, 1990);
        calendario.set(Calendar.MONTH, Calendar.OCTOBER);
        calendario.set(Calendar.DAY_OF_MONTH, 23);

        calendario.set(Calendar.HOUR, 7);
        calendario.set(Calendar.AM_PM, Calendar.PM);
        calendario.set(Calendar.MINUTE, 44);
        calendario.set(Calendar.SECOND, 8);
        calendario.set(Calendar.MILLISECOND, 10);

        Date fechaPersonalizadaQuinto = calendario.getTime();
        System.out.println("fechaPersonalizadaQuinto = " + fechaPersonalizadaQuinto);

        /** Aqui Le Doy Formato A La Fecha, Anteriormente Definida O Personalizada Con Calendar */
        SimpleDateFormat formato1 = new SimpleDateFormat("yyyy-MM-dd");
        SimpleDateFormat formato2 = new SimpleDateFormat("yyyy/MMM/dd");
        SimpleDateFormat formato3 = new SimpleDateFormat("yyyy, MMM, dd");
        SimpleDateFormat formato4 = new SimpleDateFormat("yyyy-MMMM-dd HH:mm:ss");
        SimpleDateFormat formato5 = new SimpleDateFormat("yyyy-MMMM-dd hh:mm:ss");
        SimpleDateFormat formato6 = new SimpleDateFormat("yyyy-MMMM-dd HH:mm:ss:SSS");
        SimpleDateFormat formato7 = new SimpleDateFormat("yyyy-MMMM-dd HH:mm:ss:SSS");
        SimpleDateFormat formato8 = new SimpleDateFormat("yyyy-MMMM-dd HH:mm:ss:SSS a");

        System.out.println("formato1.format(fechaPersonalizadaUno) = " + formato1.format(fechaPersonalizadaUno));
        System.out.println("formato2.format(fechaPersonalizadaDos) = " + formato2.format(fechaPersonalizadaDos));
        System.out.println("formato3.format(fechaPersonalizadaTres) = " + formato3.format(fechaPersonalizadaTres));
        System.out.println("formato4.format(fechaPersonalizadaCuatro) = " + formato4.format(fechaPersonalizadaCuatro));
        System.out.println("formato5.format(fechaPersonalizadaCuatro) = " + formato5.format(fechaPersonalizadaCuatro));
        System.out.println("formato6.format(fechaActual) = " + formato6.format(fechaActual));
        System.out.println("formato7.format(fechaPersonalizadaQuinto) = " + formato7.format(fechaPersonalizadaQuinto));
        System.out.println("formato8.format(fechaPersonalizadaQuinto) = " + formato8.format(fechaPersonalizadaQuinto));

        /** Espacio Para Comparar Fechas */
        Calendar calendario2 = Calendar.getInstance();
        Calendar calendario3 = Calendar.getInstance();

        calendario2.set(2020, 12, 18, 15, 33, 20);
        calendario3.set(2020, 12, 18, 15, 33, 20);

        /** Primera Forma De Comparar FECHAS */
        System.out.println();
        if (calendario2.after(calendario3)) {
            System.out.println("Fecha Del Usuario Es Mayor Que La Fecha Actual");
        } else if (calendario2.before(calendario3)) {
            System.out.println("Fecha Del Usuario Es Menor Que La Fecha Actual");
        } else if (calendario2.equals(calendario3)) {
            System.out.println("Las Fechas Son Iguales");
        }

        /** Segunda Forma De Comparar FECHAS */
        if (calendario2.compareTo(calendario3) > 0) {
            System.out.println("Fecha Del Usuario Es Mayor Que La Fecha Actual");
        } else if (calendario2.compareTo(calendario3) < 0) {
            System.out.println("Fecha Del Usuario Es Menor Que La Fecha Actual");
        } else if (calendario2.compareTo(calendario3) == 0) {
            System.out.println("Las Fechas Son Iguales");
        }
    }
}
