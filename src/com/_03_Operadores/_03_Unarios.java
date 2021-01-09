package com._03_Operadores;

public class _03_Unarios {
    public static void OperadoresUnarios() {
        int i = -10, j = 13;
        
        System.out.println("\n========== OPERADORES UNARIOS (Leyes De Los Signos) ==========");
        System.out.println("i = " + i);
        System.out.println("+i = " + (+i)); // => (1) * i;
        System.out.println("(-i) = " + (-i)); // => (-1) * i;

        System.out.println("j = " + j);
        System.out.println("(+j) = " + (+j)); // => (1) * j;
        System.out.println("(-j) = " + (-j)); // => (-1) * j;
    }
}
