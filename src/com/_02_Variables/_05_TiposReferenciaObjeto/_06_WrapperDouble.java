package com._02_Variables._05_TiposReferenciaObjeto;

public class _06_WrapperDouble {
    public static void objetoDouble() {
        Double doubleObject1 = Double.valueOf("3");
        Double doubleObject2 = Double.valueOf(Double.MAX_VALUE);
        Double doubleObject3 = 3D;

        /** Pasar De Primitvo A Objeto (AutoBoxing)
         * Esto Se Puede Hacer De Forma Implicita También*/
        double doublePrimitivo1 = Double.MIN_VALUE;
        Double doubleObject4 = Double.valueOf(doublePrimitivo1);

        /** Pasar De Objeto A Primitivo (AutoUnBoxing)
         * Esto Se Puede Hacer De Forma Implicita También */
        Double doubleObject5 = Double.valueOf(doubleObject1);
        double doublePrimitivo2 = doubleObject5;
        double doublePrimitivo3 = doubleObject1.longValue();

        String valorTvLcd = "670";
        Long valorTV = Long.valueOf(valorTvLcd);

        System.out.println("\n========== CLASE WRAPPER DOUBLE ==========");
        System.out.println("doubleObject1 = " + doubleObject1);
        System.out.println("doubleObject2 = " + doubleObject2);
        System.out.println("doubleObject3 = " + doubleObject3);
        System.out.println("doubleObject4 = " + doubleObject4);
        System.out.println("doublePrimitivo2 = " + doublePrimitivo2);
        System.out.println("doublePrimitivo3 = " + doublePrimitivo3);
        System.out.println("valorTV = " + valorTV);
    }
}
