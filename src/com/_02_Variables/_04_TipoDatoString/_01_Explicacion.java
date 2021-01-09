package com._02_Variables._04_TipoDatoString;

public class _01_Explicacion {
    public static void Explicacion() {
        String objetoLiteral1 = "Primer Objeto De La Clase String";
        String objetoInstancia1 = new String("Primer Objeto De La Clase String");

        System.out.println("\n========== COMPARANDO LAS INSTANCIAS U OBJETOS ==========");
        System.out.println("Objeto Literal1 = " + objetoLiteral1);
        System.out.println("Objeto Instancia1 = " + objetoInstancia1);
        System.out.println("Comparando Objetos Por Su Referencia = " + (objetoLiteral1 == objetoInstancia1));

        String objetoLiteral2 = "Segundo Objeto De La Clase String";
        String objetoInstancia2 = new String("Segundo Objeto De La Clase String");

        System.out.println("\n========== COMPARANDO LAS INSTANCIAS U OBJETOS POR VALOR ==========");
        System.out.println("Objeto Literal2 = " + objetoLiteral2);
        System.out.println("Objeto Instancia2 = " + objetoInstancia2);
        System.out.println("Comparando Objetos Por Su Valor = " + (objetoLiteral2.equals(objetoInstancia2)));

        String objetoLiteral3 = "tercer objeto de la clase string";
        String objetoInstancia3 = new String("TERCER OBJETO DE LA CLASE STRING");

        System.out.println("\n========== COMPARANDO LAS INSTANCIAS U OBJETOS POR VALOR SIN IMPORTAR " +
                           "MAYÙSCULAS O MINÙSCULAS ==========");
        System.out.println("Objeto Literal3 = " + objetoLiteral3);
        System.out.println("Objeto Instancia3 = " + objetoInstancia3);
        System.out.println("Comparando Objetos Por Su Valor Ignorando Mayùsculas O Minùsculas = "
                           + (objetoLiteral3.equalsIgnoreCase(objetoInstancia3)));

        String objetoLiteral4 = "Cuarto Objeto De La Clase String Literal";
        String objetoLiteral4_1 = "Cuarto Objeto De La Clase String Literal";

        System.out.println("\n========== COMPARANDO LAS INSTANCIAS U OBJETOS LITERALES ==========");
        System.out.println("Objeto Literal4 = " + objetoLiteral4);
        System.out.println("Objeto Literal4_1 = " + objetoLiteral4_1);
        System.out.println("Comparando Objetos Literales (Optimizaciòn) = " + (objetoLiteral4 == objetoLiteral4_1));

        String objetoLiteral5 = new String("Quinto Objeto De La Clase String New Instancia");
        String objetoLiteral5_1 = new String("Quinto Objeto De La Clase String New Instancia");

        System.out.println("\n========== COMPARANDO LAS INSTANCIAS U OBJETOS NEW ==========");
        System.out.println("Objeto New Instancia5 = " + objetoLiteral5);
        System.out.println("Objeto New Instancia5_1 = " + objetoLiteral5_1);
        System.out.println("Comparando Objetos New = " + (objetoLiteral5 == objetoLiteral5_1));
    }
}
