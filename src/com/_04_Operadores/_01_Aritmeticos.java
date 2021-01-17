package com._04_Operadores;

public class _01_Aritmeticos {
    public static void OperadoresAritmeticos() {
        int i = 5, j = 4, suma = i + j, resta = i - j,
        producto = i * j;

        System.out.println("\n========== OPERADORES ARITMÈTICOS ==========");
        System.out.println("suma = " + suma);
        System.out.println("i + j = " + i + j);

        System.out.println("\nresta = " + resta);
        System.out.println("(i - j) = " + (i - j));

        System.out.println("\nproducto = " + producto);
        System.out.println("i * j = " + i * j);

        float division = (float) i / j;
        System.out.println("\ndivision = " + division);
        System.out.println("(float) i / (float) j = " + (float) i / (float) j);

        int resto = i % j;
        System.out.println("\nresto = " + resto);
        System.out.println("i % j = " + i % j);
    }
}
