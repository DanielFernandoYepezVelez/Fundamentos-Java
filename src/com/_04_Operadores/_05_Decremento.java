package com._04_Operadores;

public class _05_Decremento {
    public static void OperadoresDecrementales() {

        System.out.println("\n========== OPERADOR PRE-DECREMENTO ==========");
        int i = 3;
        int j = --i;

        System.out.println("i = " + i);
        System.out.println("j = " + j);

        System.out.println("\n========== OPERADOR POST-DECREMENTO ==========");
        int k = 3;
        int f = k--;

        System.out.println("k = " + k);
        System.out.println("f = " + f);

        System.out.println("\n========== EJEMPLO COMBINADO PRE Y POST DECREMENTO ==========");
        int d = 10;

        System.out.println("d = " + d);
        System.out.println("PRE-DECREMENTO (--d) = " + (--d));
        System.out.println("d = " + d);
        System.out.println("POST-DECREMENTO (d--) = " + (d--));
        System.out.println("d = " + d);
    }
}
