package com._02_Variables._03_ConversionDeTipos;

public class _05_ObjetosAPrimitivos {
    public static void objetosAprimitivos() {
        /** Pasar De Objeto A Primitivo () */
        Integer intObject1 = Integer.valueOf("456787");
        int intPrimitivo1 = intObject1.intValue();

        System.out.println("\n********** \"Conversiòn De Objetos A Primitivos(intValue())\" **********");
        System.out.println("NùmeroObjeto = " + intObject1);
        System.out.println("NumeroPrimitivo = " + intPrimitivo1);
    }
}
