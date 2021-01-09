package com._02_Variables._01_TiposPrimitivos;

public class _06_double {
    public static void ValoresDouble() {
        double valorNumeroDouble = 9223.372036854775807e5;
        double valorNumeroDouble2 = 9223D;

        System.out.println("\n========= TIPO DE DATO PRIMITIVO \"double\" =========");
        System.out.println("Tipo double Corresponde En Bits A: " + Double.SIZE);
        System.out.println("Tipo double Corresponde En Bytes A: " + Double.BYTES);
        System.out.println("Nùmero Minimo Aceptado: " + Double.MIN_VALUE);
        System.out.println("Nùmero Maximo Aceptado: " + Double.MAX_VALUE);
        System.out.println("Variable valorNumeroDouble = " + valorNumeroDouble);
        System.out.println("Variable valorNumeroDouble2 = " + valorNumeroDouble2);
    }
}
