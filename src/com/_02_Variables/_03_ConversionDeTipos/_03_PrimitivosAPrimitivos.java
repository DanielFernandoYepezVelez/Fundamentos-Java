package com._02_Variables._03_ConversionDeTipos;

public class _03_PrimitivosAPrimitivos {
    public static void primitivosAprimitivos() {

        /* En La Conversiòn De Primitivo A Primitivo Se Utiliza
         * El Concepto Del Cast O Casteo De Tipos */
        byte numeroByte = 125;
        short numeroShort = 3854;
        int numeroInt = 5056;
        long numeroLong = 44678L;
        float numeroFloat = 45.45e3F;
        double numeroDouble = 32444.56e10D;

        /* Si El Valor Existente Se Va A Almacenar En Un Tipo De Dato
         * Superior O Igual Al Que Se Le Definiò Inicialmente Al Valor
         * Ya Existente, No Hay Ningùn Problema Por Que No Se Pierde
         * Informaciòn */
        double numeroByteCastADouble = numeroByte;
        double numeroShortCastADouble = numeroShort;
        double numeroIntCastADouble = numeroInt;
        double numeroLongCastADouble = numeroLong;
        double numeroFloatCastADouble = numeroFloat;
        double numeroDoubleCastADouble = numeroDouble;

        /*(AMBIGUEDAD PELIGROSA) En El Casteo Se Puede Perder Informaciòn,
         * Si El Valor Existente Se Va A Almacenar En Un Tipo De Dato
         * Inferior Al Que Se Le Definiò Inicialmente Al Valor Ya Existente */
        byte numeroDoubleCastAByte = (byte) numeroDouble;
        short numeroDoubleCastAShort = (short) numeroDouble;
        int numeroDoubleCastAInt = (int) numeroDouble;
        long numeroDoubleCastALong =  (long) numeroDouble;
        float numeroDoubleCastAFloat = (float) numeroDouble;
        double numeroDoubleCast2ADouble = numeroDouble;

        System.out.println("\n********** \"Conversiòn De Primitivos A Primitivos\" **********");
        System.out.println("========== Conversion Primitivo \"byte\" ==========");
        System.out.println("numeroByte = " + numeroByte);
        System.out.println("numeroByteCastADouble = " + numeroByteCastADouble);
        System.out.println("numeroDoubleCastAByte = " + numeroDoubleCastAByte);

        System.out.println("\n========== Conversion Primitivo \"short\" ==========");
        System.out.println("numeroShort = " + numeroShort);
        System.out.println("numeroShortCastADouble = " + numeroShortCastADouble);
        System.out.println("numeroDoubleCastAShort = " + numeroDoubleCastAShort);

        System.out.println("\n========== Conversion Primitivo \"int\" ==========");
        System.out.println("numeroInt = " + numeroInt);
        System.out.println("numeroIntCastADouble = " + numeroIntCastADouble);
        System.out.println("numeroDoubleCastAInt = " + numeroDoubleCastAInt);

        System.out.println("\n========== Conversion Primitivo \"long\" ==========");
        System.out.println("numeroLong = " + numeroLong);
        System.out.println("numeroLongCastADouble = " + numeroLongCastADouble);
        System.out.println("numeroDoubleCastALong = " + numeroDoubleCastALong);

        System.out.println("\n========== Conversion Primitivo \"float\" ==========");
        System.out.println("numeroFloat = " + numeroFloat);
        System.out.println("numeroFloatCastADouble = " + numeroFloatCastADouble);
        System.out.println("numeroDoubleCastAFloat = " + numeroDoubleCastAFloat);

        System.out.println("\n========== Conversion Primitivo \"double\" ==========");
        System.out.println("numeroDouble = " + numeroDouble);
        System.out.println("numeroDoubleCastADouble = " + numeroDoubleCastADouble);
        System.out.println("numeroDoubleCast2ADouble = " + numeroDoubleCast2ADouble);
    }
}
