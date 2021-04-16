package com._02_Variables._01_TiposPrimitivos._02_Decimales;

public class _06_double {
    public static void ValoresDouble() {
        double valorNumeroDouble = 9223.372036854775807e5;
        double valorNumeroDouble2 = 9223D;

        /* Aqui No Tenemos Problema Por Que Este Es El Tipo De Dato Màs Grande En Java */

        System.out.println("\n========= TIPO DE DATO PRIMITIVO \"double\" =========");
        System.out.println("Tipo double Corresponde En Bits A: " + Double.SIZE);
        System.out.println("Tipo double Corresponde En Bytes A: " + Double.BYTES);
        System.out.println("Nùmero Minimo Aceptado: " + Double.MIN_VALUE); // Valor Minimo Tenemos -324 Posiciones A La Izquierda
        System.out.println("Nùmero Maximo Aceptado: " + Double.MAX_VALUE); // Valor Maximo Tenemos 308 Posiciones A La Derecha
        System.out.println("Variable valorNumeroDouble = " + valorNumeroDouble);
        System.out.println("Variable valorNumeroDouble2 = " + valorNumeroDouble2);
    }
}
