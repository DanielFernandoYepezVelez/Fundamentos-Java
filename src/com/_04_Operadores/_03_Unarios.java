package com._04_Operadores;

public class _03_Unarios {
    public static void OperadoresUnarios() {
        int i = -10, j = 13;
        var verdadero = true;
        var cambioVerdadero = !verdadero;
        
        System.out.println("\n========== OPERADORES UNARIOS (Leyes De Los Signos Y Booleanos) ==========");
        System.out.println("i = " + i);
        System.out.println("+i = " + (+i)); // => (1) * i;
        System.out.println("(-i) = " + (-i)); // => (-1) * i;

        System.out.println("j = " + j);
        System.out.println("(+j) = " + (+j)); // => (1) * j;
        System.out.println("(-j) = " + (-j)); // => (-1) * j;

        System.out.println("verdadero = " + verdadero);
        System.out.println("Cambio Verdadero = " + cambioVerdadero);
    }
}
