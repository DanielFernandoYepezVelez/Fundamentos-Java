package com._02_Variables._05_TiposReferenciaObjeto;

public class _08_WrapperBoolean {
    public static void comparandoObjetos() {
        Integer numberObject1, numberObject2;
        numberObject1 = 1;
        numberObject2 = 2;

        boolean primitiveBoolean1 = numberObject1 > numberObject2;
        Boolean objectBoolean1 = Boolean.valueOf(primitiveBoolean1);
        Boolean objectBoolean2 = Boolean.valueOf(false);
        Boolean objectBoolean3 = Boolean.valueOf("true");
        Boolean objectBoolean4 = true;
        boolean primitiveBoolean2 = objectBoolean1.booleanValue();

        System.out.println("\n========== WRAPPER BOOLEAN RELACIONALES ==========");
        System.out.println("primitiveBoolean1 = " + primitiveBoolean1);
        System.out.println("primitiveBoolean2 = " + primitiveBoolean2);
        System.out.println("objectBoolean1 = " + objectBoolean1);
        System.out.println("objectBoolean2 = " + objectBoolean2);
        System.out.println("objectBoolean3 = " + objectBoolean3);
        System.out.println("objectBoolean4 = " + objectBoolean4);

        System.out.println("\n(==) En El Caso De Los Wrapper Boolean Se Compara Por El Valor!!! (OJO!!!)");
        System.out.println("Comparando Boolean Wrapper Por El Valor Con El (==): " + (objectBoolean1 == objectBoolean2));
        System.out.println("Comparando Boolean Wrapper Por El Valor Con El (==): " + (objectBoolean1.equals(objectBoolean2)));
        System.out.println("Comparando Boolean Wrapper Por El Valor Con El (==): " + (objectBoolean1 == objectBoolean3));
        System.out.println("Comparando Boolean Wrapper Por El Valor Con El (==): " + (objectBoolean1.equals(objectBoolean4)));
    }
}
