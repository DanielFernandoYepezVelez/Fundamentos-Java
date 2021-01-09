package com._02_Variables._05_TiposReferenciaObjeto;

public class _02_WrapperShort {
    public static void objetoShort() {
        Short shortObject1 = Short.valueOf("3");
        Short shortObject2 = Short.valueOf(Short.MAX_VALUE);
        Short shortObject3 = 3;

        /** Pasar De Primitvo A Objeto (AutoBoxing)
         * Esto Se Puede Hacer De Forma Implicita También*/
        short shortPrimitivo1 = Short.MIN_VALUE;
        Short shortObject4 = Short.valueOf(shortPrimitivo1);

        /** Pasar De Objeto A Primitivo (AutoUnBoxing)
         * Esto Se Puede Hacer De Forma Implicita También */
        Short shortObject5 = Short.valueOf(shortObject1);
        short shortPrimitivo2 = shortObject5;
        short shortPrimitivo3 = shortObject1.shortValue();

        String valorTvLcd = "670";
        Short valorTV = Short.valueOf(valorTvLcd);

        System.out.println("\n========== CLASE WRAPPER SHORT ==========");
        System.out.println("shortObject1 = " + shortObject1);
        System.out.println("shortObject2 = " + shortObject2);
        System.out.println("shortObject3 = " + shortObject3);
        System.out.println("shortObject4 = " + shortObject4);
        System.out.println("shortPrimitivo2 = " + shortPrimitivo2);
        System.out.println("shortPrimitivo3 = " + shortPrimitivo3);
        System.out.println("valorTV = " + valorTV);
    }
}
