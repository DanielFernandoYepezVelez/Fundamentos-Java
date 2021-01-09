package com._02_Variables._01_TiposPrimitivos;

public class _05_float {
    public static void ValoresFloat() {
        float valorNumeroFloat = 9223372036e7F;
        float valorNumeroFloat2 = 1.5e-10f; // 0.00000000015f

        System.out.println("\n========= TIPO DE DATO PRIMITIVO \"float\" =========");
        System.out.println("Tipo float Corresponde En Bits A: " + Float.SIZE);
        System.out.println("Tipo float Corresponde En Bytes A: " + Float.BYTES);
        System.out.println("Nùmero Minimo Aceptado: " + Float.MIN_VALUE);
        System.out.println("Nùmero Maximo Aceptado: " + Float.MAX_VALUE);
        System.out.println("Variable valorNumeroFloat = " + valorNumeroFloat);
        System.out.println("Variable valorNumeroFloat2 = " + valorNumeroFloat2);
    }
}
