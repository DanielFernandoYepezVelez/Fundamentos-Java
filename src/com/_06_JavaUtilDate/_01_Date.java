package com._06_JavaUtilDate;

import java.text.SimpleDateFormat;
import java.util.Date;

public class _01_Date {
    public static void classDate() {
        /** TRABAJANDO CON LA FECHA ACTUAL DEL SISTEMA */
        /** Fecha Por Defecto-Actual (DATE) */
        Date fecha = new Date();

        System.out.println("Fecha Por Defecto-Actual Y Sin Formato = " + fecha);

        /** Fechas Personalizada Con Respecto Al Formato */
        SimpleDateFormat df1 = new SimpleDateFormat("dd, MM, yyyy");
        SimpleDateFormat df2 = new SimpleDateFormat("dd, MMM, yyyy");
        SimpleDateFormat df3 = new SimpleDateFormat("dd, MMMM, yyyy");
        SimpleDateFormat df4 = new SimpleDateFormat("dd-MM-yyyy");
        SimpleDateFormat df5 = new SimpleDateFormat("dd-MMM-yyyy");
        SimpleDateFormat df6 = new SimpleDateFormat("dd-MMMM-yyyy");
        SimpleDateFormat df7 = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat df8 = new SimpleDateFormat("dd/MMM/yyyy");
        SimpleDateFormat df9 = new SimpleDateFormat("dd/MMMM/yyyy");
        SimpleDateFormat df10 = new SimpleDateFormat("\"yyyy.MM.dd G 'at' HH:mm:ss z\"");
        SimpleDateFormat df11 = new SimpleDateFormat("'Fecha:' yyyy.MM.dd G 'Hora:' HH:mm:ss z");
        SimpleDateFormat df12 = new SimpleDateFormat("dd 'De' MMMM, yyyy");
        SimpleDateFormat df13 = new SimpleDateFormat("E dd 'De' MMMM, yyyy");
        SimpleDateFormat df14 = new SimpleDateFormat("EEEE dd 'De' MMMM, yyyy");

        String fechaStr = df1.format(fecha);

        System.out.println("Fecha Con Formato Uno = " + fechaStr);
        System.out.println("Fecha Con Formato Dos = " + df2.format(fecha));
        System.out.println("Fecha Con Formato Tres = " + df3.format(fecha));
        System.out.println("Fecha Con Formato Cuatro = " + df4.format(fecha));
        System.out.println("Fecha Con Formato Cinco = " + df5.format(fecha));
        System.out.println("Fecha Con Formato Seis = " + df6.format(fecha));
        System.out.println("Fecha Con Formato Siete = " + df7.format(fecha));
        System.out.println("Fecha Con Formato Ocho = " + df8.format(fecha));
        System.out.println("Fecha Con Formato Nueve = " + df9.format(fecha));
        System.out.println("Fecha Con Formato Diez = " + df10.format(fecha));
        System.out.println("Fecha Con Formato Once = " + df11.format(fecha));
        System.out.println("Fecha Con Formato Doce = " + df12.format(fecha));
        System.out.println("Fecha Con Formato Trece = " + df13.format(fecha));
        System.out.println("Fecha Con Formato Catorce = " + df14.format(fecha));
    }
}
