package com._04_Operadores;

public class _06_Relaciones {
    public static void OperadoresRelacionales() {
        int i = 3;
        byte j = 7;
        float k = 127e-7F;
        double l = 2.1413e3;
        boolean m = false;

        System.out.println("\n========== OPERADORES RELACIONES ==========");
        System.out.println("RELACIONES DATOS PRIMITIVOS");
        System.out.println("(i == j) = " + (i == j));
        System.out.println("(i != j) = " + (i != j));
        System.out.println("(m == true) = " + (m == true));
        System.out.println("(i > j) = " + (i > j));
        System.out.println("(k >= l) = " + (k >= l));
        System.out.println("(i < j) = " + (i < j));
        System.out.println("(k <= l) = " + (k <= l));
    }
}
