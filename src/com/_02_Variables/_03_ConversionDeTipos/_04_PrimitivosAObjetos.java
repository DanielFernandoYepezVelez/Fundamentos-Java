package com._02_Variables._03_ConversionDeTipos;

public class _04_PrimitivosAObjetos {
    public static void primitivosAobjetos() {
        /** Pasar De Primitvo A Objeto (AutoBoxing) */
        int intPrimitivo1 = 23;
        Integer intObject1 = Integer.valueOf(intPrimitivo1);

        System.out.println("\n********** \"Conversiòn De Primitivos A Objetos(valueOf())\" **********");
        System.out.println("NumeroPrimitivo = " + intPrimitivo1);
        System.out.println("NùmeroObjeto = " + intObject1);
    }
}
