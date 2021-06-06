package com._02_Variables._01_TiposPrimitivos._05_Dinamico;

public class _08_var {
    public static void ValoresVar() {
        /* var => Solo Funciona Para Variables Locales, Para Variables De Clase (Atributos) O
        Para Definir Parametros No Es Posible */

        // Tipo De Dato Inferencial
        var valorVar = 555f;
        var valorUnicode = '\u0040'; // Valor Unicode
        var valorInt = 64; // Ojo Se Infiere Como Un Valor Entero(INT) Y No Como Un Valor Decimal(CHAR)

        System.out.println("\n========= TIPO DE DATO PRIMITIVO \"var\" =========");
        System.out.println("Es Un Tipo De Dato Variable O Dinàmico, Por Que Dependiendo De Su Valor Define O Infiere El Tipo De Dato");
        System.out.println("valorVar = " + valorVar);
        System.out.println("valorVar = " + valorUnicode);
        System.out.println("valorVar = " + valorInt);
    }
}
