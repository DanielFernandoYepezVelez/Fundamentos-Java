package com._02_Variables._05_TiposReferenciaObjeto;

public class _07_WrapperRelacionales {
    public static void comparandoObjetos() {
        Integer numObject1 = Integer.valueOf(100);
        Integer numObject2 = numObject1;

        System.out.println("\n========== COMPARANDO OBJETOS WRAPPER ==========");
        System.out.println("(==) Compara Los Objetos Por Referencia!!! ");
        System.out.println("numObject1 = " + numObject1);
        System.out.println("numObject2 = " + numObject2);
        System.out.println("Son Objetos Que Apuntan A La Misma Referencia: " + (numObject1 == numObject2));

        numObject2 = 10;

        System.out.println("\nnumObject1 = " + numObject1);
        System.out.println("numObject2 = " + numObject2);
        System.out.println("Son Objetos Que Apuntan A La Misma Referencia: " + (numObject1 == numObject2));

        System.out.println("\n(equals ó intValue()) Compara Los Objetos Por Valor Y No Por Referencia!!! ");
        System.out.println("numObject1 = " + numObject1);
        System.out.println("numObject2 = " + numObject2);
        System.out.println("Son Objetos Que Tienen El Mismo Valor: " + (numObject1.equals(numObject2)));
        System.out.println("Son Objetos Que Tienen El Mismo Valor: " + (numObject1.intValue() == numObject2.intValue()));

        System.out.println("\n========== WRAPPER OPERADORES RELACIONALES ==========");
        System.out.println("numObject1 = " + numObject1);
        System.out.println("numObject2 = " + numObject2);
        System.out.println("(numObject2 > numObject1) = " + (numObject2 > numObject1));
        System.out.println("(numObject2 < numObject1) = " + (numObject2 < numObject1));
        System.out.println("(numObject2 >= numObject1) = " + (numObject2 >= numObject1));
        System.out.println("(numObject2 <= numObject1) = " + (numObject2 <= numObject1));
    }
}
