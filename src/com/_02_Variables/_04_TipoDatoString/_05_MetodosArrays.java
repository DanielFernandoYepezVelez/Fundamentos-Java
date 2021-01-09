package com._02_Variables._04_TipoDatoString;

public class _05_MetodosArrays {
    public static void StringMethodsArray() {
        String trabalenguas = "trabalenguas";

        System.out.println("\n========== MÈTODOS DE STRING A ARRAYS ==========");
        System.out.println("HASH REFERENCIA ARRAY => trabalenguas.toCharArray() = " + trabalenguas.toCharArray());
        
        char[] arreglo = trabalenguas.toCharArray();
        int longitud = arreglo.length;
        
        for (int i = 0; i < longitud; i++) {
            System.out.println("arreglo[i] = " + arreglo[i]);
        }

        System.out.println("\nHASH REFERENCIA ARRAY => trabalenguas.split(\"a\") = " + trabalenguas.split("a"));

        String[] arreglo2 = trabalenguas.split("a");
        longitud = arreglo2.length;

        for (int i = 0; i < longitud; i++) {
            System.out.println("arreglo2[i] = " + arreglo2[i]);
        }

        String archivo = "imagen.archivo.png";
        System.out.println("\nHASH REFERENCIA ARRAY => archivo.split(\"[.]\") = " + archivo.split("[.]"));

        String[] arreglo3 = archivo.split("[.]");
        longitud = arreglo3.length;

        for (int i = 0; i < longitud; i++) {
            System.out.println("arreglo3[i] = " + arreglo3[i]);
        }

        System.out.println("Obtener La Extenciòn Final: " + arreglo3[longitud - 1]);
    }
}
