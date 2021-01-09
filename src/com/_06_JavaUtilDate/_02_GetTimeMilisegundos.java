package com._06_JavaUtilDate;

import java.util.Date;

public class _02_GetTimeMilisegundos {
    public static void getTime() {
        /** TRABAJANDO CON LA FECHA ACTUAL DEL SISTEMA */
        System.out.println("\n========== MÈTODO GETTIME MILISEGUNDOS POR DEFECTO ==========");

        long j = 0;
        Date fecha = new Date();

        for (int i = 0; i < 1000000; i++) {
            j += i;
        }

        System.out.println("j = " + j);

        Date fecha2 = new Date();
        long tiempoFinalMilisegundos = fecha2.getTime() - fecha.getTime();

        System.out.println("Tiempo Transcurrido En El for = " + tiempoFinalMilisegundos);
    }
}
