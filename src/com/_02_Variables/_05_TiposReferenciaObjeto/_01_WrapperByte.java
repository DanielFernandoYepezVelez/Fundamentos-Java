package com._02_Variables._05_TiposReferenciaObjeto;

public class _01_WrapperByte {
    public static void objetoByte() {
        Byte byteObject1 = Byte.valueOf("3");
        Byte byteObject2 = Byte.valueOf(Byte.MAX_VALUE);
        Byte byteObject3 = 3;

        /** Pasar De Primitvo A Objeto (AutoBoxing)
         * Esto Se Puede Hacer De Forma Implicita También */
        byte bytePrimitivo1 = Byte.MIN_VALUE;
        Byte byteObject4 = Byte.valueOf(bytePrimitivo1);

        /** Pasar De Objeto A Primitivo (AutoUnBoxing)
         * Esto Se Puede Hacer De Forma Implicita También*/
        Byte byteObject5 = Byte.valueOf(byteObject1);
        byte bytePrimitivo2 = byteObject5;
        byte bytePrimitivo3 = byteObject1.byteValue();

        String valorTvLcd = "6";
        Byte valorTV = Byte.valueOf(valorTvLcd);

        System.out.println("========== CLASE WRAPPER BYTE ==========");
        System.out.println("byteObject1 = " + byteObject1);
        System.out.println("byteObject2 = " + byteObject2);
        System.out.println("byteObject3 = " + byteObject3);
        System.out.println("byteObject4 = " + byteObject4);
        System.out.println("bytePrimitivo2 = " + bytePrimitivo2);
        System.out.println("bytePrimitivo3 = " + bytePrimitivo3);
        System.out.println("valorTV = " + valorTV);
    }
}
