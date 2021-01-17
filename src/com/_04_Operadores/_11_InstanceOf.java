package com._04_Operadores;

public class _11_InstanceOf {
    public static void instancia() {
        Integer numero = 12;
        Double decimal = 45.54;
        Boolean booleano = false;
        String texto = "Creando Un Objeto De La Clase String.. Que Tal!!!";

        boolean b1 = texto instanceof Object;
        boolean b2 = numero instanceof Object;
        boolean b3 = texto instanceof String;
        boolean b4 = numero instanceof Integer;
        boolean b5 = numero instanceof Number;
        boolean b6 = decimal instanceof Number;
        boolean b7 = booleano instanceof Boolean;

        System.out.println("\n========== OPERADOR INSTANCEOF ==========");
        System.out.println("¿Texto Es Del Tipo Object? = " + b1);
        System.out.println("¿Numero Es Del Tipo Object? = " + b2);
        System.out.println("¿Texto Es Del Tipo String? = " + b3);
        System.out.println("¿Numero Es Del Tipo Integer? = " + b4);
        System.out.println("¿Numero Es Del Tipo Number? = " + b5);
        System.out.println("¿Decimal Es Del Tipo Number? = " + b6);
        System.out.println("¿Booleano Es Del Tipo Boolean? = " + b7);

    }
}
