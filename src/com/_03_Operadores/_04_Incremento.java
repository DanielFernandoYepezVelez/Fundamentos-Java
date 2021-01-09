package com._03_Operadores;

public class _04_Incremento {
    public static void OperadoresIncrementales() {

        System.out.println("\n========== OPERADOR PRE-INCREMENTO ==========");
        int i = 1;
        int j = ++i;

        System.out.println("i = " + i);
        System.out.println("j = " + j);

        System.out.println("\n========== OPERADOR POST-INCREMENTO ==========");
        int k = 1;
        int f = k++;

        System.out.println("k = " + k);
        System.out.println("f = " + f);

        System.out.println("\n========== EJEMPLO COMBINADO PRE Y POST INCREMENTO ==========");
        int d = 10;
        
        System.out.println("d = " + d);
        System.out.println("PRE-INCREMENTO (++d) = " + (++d));
        System.out.println("d = " + d);
        System.out.println("POST-INCREMENTO (d++) = " + (d++));
        System.out.println("d = " + d);
    }
}
