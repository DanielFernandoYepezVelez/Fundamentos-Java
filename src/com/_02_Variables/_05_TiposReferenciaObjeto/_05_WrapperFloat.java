package com._02_Variables._05_TiposReferenciaObjeto;

public class _05_WrapperFloat {
    public static void objetoFloat() {
        Float floatObject1 = Float.valueOf("13");
        Float floatObject2 = Float.valueOf(Float.MAX_VALUE);
        Float floatObject3 = 33F;

        /** Pasar De Primitvo A Objeto (AutoBoxing)
         * Esto Se Puede Hacer De Forma Implicita También */
        float floatPrimitivo1 = Float.MIN_VALUE;
        Float floatObject4 = Float.valueOf(floatPrimitivo1);

        /** Pasar De Objeto A Primitivo (AutoUnBoxing)
         * Esto Se Puede Hacer De Forma Implicita También */
        Float floatObject5 = Float.valueOf(floatObject1);
        float floatPrimitivo2 = floatObject5;
        float floatPrimitivo3 = floatObject1.floatValue();

        String valorTvLcd = "67000";
        Float valorTV = Float.valueOf(valorTvLcd);

        System.out.println("\n========== CLASE WRAPPER FLOAT ==========");
        System.out.println("floatObject1 = " + floatObject1);
        System.out.println("floatObject2 = " + floatObject2);
        System.out.println("floatObject3 = " + floatObject3);
        System.out.println("floatObject4 = " + floatObject4);
        System.out.println("floatPrimitivo2 = " + floatPrimitivo2);
        System.out.println("floatPrimitivo3 = " + floatPrimitivo3);
        System.out.println("valorTV = " + valorTV);
    }
}
