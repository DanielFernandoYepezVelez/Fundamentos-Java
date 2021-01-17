package com._04_Operadores;

public class _12_InstanceOfGeneral {
    public static void tiposGlobales() {
        Object texto = "Creando Un Objeto De La Object De Tipo String";
        Number numeroEntero = 2345;
        Object numeroDecimal = 23.45F;

        boolean b1 = texto instanceof String;
        boolean b2 = texto instanceof Integer;
        boolean b3 = numeroEntero instanceof Integer;
        boolean b4 = numeroDecimal instanceof Float;

        System.out.println("\n========== OPERADOR INSTANCEOF GLOBAL ==========");
        System.out.println("¿Texto Es Del Tipo Object Con Un Valor String? = " + b1);
        System.out.println("¿Texto Es Del Tipo Object Con Un Valor String? = " + b2);
        System.out.println("¿Numero Entero Es Del Tipo Object Con Un Valor Númerico? = " + b3);
        System.out.println("¿Numero Decimal(Float) Es Del Tipo Object Con Un Valor Númerico? = " + b4);

    }
}
