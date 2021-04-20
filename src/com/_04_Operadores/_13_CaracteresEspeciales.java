package com._04_Operadores;

public class _13_CaracteresEspeciales {
    public static void especiales() {
        String nombre = "Daniel Fernando Yepez Vélez";

        System.out.println("\n========== CARACTERES ESPECIALES ==========");
        System.out.println("Nueva Linea: \n" + nombre);
        System.out.println("Tabulador: \t" + nombre);
        System.out.println("Retroceso(Sin Espacios): \b\b" + nombre);
        System.out.println("Escapar Comilla Simple: \'" + nombre + "\'");
        System.out.println("Escapar Comilla Doble: \"" + nombre + "\"");

        char espacio = '\u0020';
        char retroceso = '\b';

        System.out.println("\n========= CARACTERES ESPECIALES \"char\" =========");
        System.out.println("Espacio => "  + espacio);
        System.out.println("Retroceso => " + retroceso);
        System.out.println("Tabulaciòn => \t");
        System.out.println("Salto De Linea => \n");
        System.out.println("Retorno Al Inicio => \r");
    }
}
