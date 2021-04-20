package com._02_Variables._01_TiposPrimitivos._03_Character;

public class _07_char {
    public static void ValoresChar() {
        /* Los Caracteres Se Rigen Por La Lista De Caracteres Unicode (List Unicode) */
        /* Los Tipos De Datos Char, Se Pueden Representar Por Valores: Character, Unicode, Decimal */
        /* Para Que Java Sea Conciente De Que Es Un Caracter Unicode Debemos Agregar '\ + u' + El codigo  De La List Unicode */
        char valorCaracter1 = '@'; // Valor Character
        char valorCaracter2 = '\u0040'; // Valor Unicode
        char valorCaracter3 = 64; // Valor Decimal

        char valorCaracter4 = '!'; // Valor Character
        char valorCaracter5 = '\u0021'; // Valor Unicode
        char valorCaracter6 = 33; // Valor Decimal


        System.out.println("\n========= TIPO DE DATO PRIMITIVO \"char\" =========");
        System.out.println("Tipo char Corresponde En Bits A: " + Character.SIZE);
        System.out.println("Tipo char Corresponde En Bytes A: " + Character.BYTES);
        System.out.println("Character Minimo Aceptado: " + Character.MIN_VALUE);
        System.out.println("Character Maximo Aceptado: " + Character.MAX_VALUE);
        System.out.println("Variable CHARACTER valorCaracter1 = " + valorCaracter1);
        System.out.println("Variable UNICODE valorCaracter2 = " + valorCaracter2);
        System.out.println("Variable DECIMAL valorCaracter3 = " + valorCaracter3);
        System.out.println("Variable CHARACTER valorCaracter4 = " + valorCaracter4);
        System.out.println("Variable UNICODE valorCaracter5 = " + valorCaracter5);
        System.out.println("Variable DECIMAL valorCaracter6 = " + valorCaracter6);

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
