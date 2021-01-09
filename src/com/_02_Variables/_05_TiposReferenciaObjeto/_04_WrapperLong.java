package com._02_Variables._05_TiposReferenciaObjeto;

public class _04_WrapperLong {
    public static void objetoLong() {
        Long longObject1 = Long.valueOf("3");
        Long longObject2 = Long.valueOf(Long.MAX_VALUE);
        Long longObject3 = 3L;

        /** Pasar De Primitvo A Objeto (AutoBoxing)
         * Esto Se Puede Hacer De Forma Implicita También */
        long longPrimitivo1 = Long.MIN_VALUE;
        Long longObject4 = Long.valueOf(longPrimitivo1);

        /** Pasar De Objeto A Primitivo (AutoUnBoxing)
         * Esto Se Puede Hacer De Forma Implicita También*/
        Long longObject5 = Long.valueOf(longObject1);
        long longPrimitivo2 = longObject5;
        long longPrimitivo3 = longObject1.longValue();

        String valorTvLcd = "670";
        Long valorTV = Long.valueOf(valorTvLcd);

        System.out.println("\n========== CLASE WRAPPER LONG ==========");
        System.out.println("longObject1 = " + longObject1);
        System.out.println("longObject2 = " + longObject2);
        System.out.println("longObject3 = " + longObject3);
        System.out.println("longObject4 = " + longObject4);
        System.out.println("longPrimitivo2 = " + longPrimitivo2);
        System.out.println("longPrimitivo3 = " + longPrimitivo3);
        System.out.println("valorTV = " + valorTV);
    }
}
