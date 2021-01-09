package com._02_Variables._04_TipoDatoString;

public class _06_EjercicioExtension {
    public static void ExtencionArchivo() {
        String archivo = "alguna_imagen.jpeg";
        int i = archivo.indexOf(".");
        int i1 = archivo.lastIndexOf(".");

        System.out.println("\n========== OBTENER LA EXTENCIÓN DE UN ARCHIVO EJERCICIO ==========");
        System.out.println("archivo.length() = " + archivo.length());
        System.out.println("archivo.substring(14) = " + archivo.substring(14));
        System.out.println("archivo.substring(archivo.length() - 4) = " + archivo.substring(archivo.length() - 4));
        System.out.println("archivo.substring(i+1) = " + archivo.substring(i+1));
        System.out.println("archivo.substring(i1+1) = " + archivo.substring(i1+1));
    }
}
