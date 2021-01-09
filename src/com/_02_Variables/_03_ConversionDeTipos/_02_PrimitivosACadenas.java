package com._02_Variables._03_ConversionDeTipos;

public class _02_PrimitivosACadenas {
    public static void primitivosACadenas() {
        byte numeroByte = 125;
        short numeroShort = 385;
        int numeroInt = 50;
        long numeroLong = 44678L;
        float numeroFloat = 45.45e3F;
        double numeroDouble = 324.56e-3;
        boolean logicoBoolean1 = true;
        boolean logicoBoolean2 = false;

        String numeroByteStr = String.valueOf(numeroByte);
        String numeroShortStr = Short.toString(numeroShort);
        String numeroIntStr = String.valueOf(numeroInt);
        String numeroLongStr = Long.toString(numeroLong);
        String numeroFloatStr = String.valueOf(numeroFloat);
        String numeroDoubleStr = Double.toString(numeroDouble);
        String logicoBooleanStr1 = String.valueOf(logicoBoolean1);
        String logicoBooleanStr2 = Boolean.toString(logicoBoolean2);

        System.out.println("\n********** \"Conversiòn De Primitivos A Cadenas\" **********");
        System.out.println("========== Conversion Primitivo \"byte\" ==========");
        System.out.println("numeroByte = " + numeroByte);
        System.out.println("numeroByteStr = " + numeroByteStr);

        System.out.println("\n========== Conversion Primitivo \"short\" ==========");
        System.out.println("numeroShort = " + numeroShort);
        System.out.println("numeroShortStr = " + numeroShortStr);

        System.out.println("\n========== Conversion Primitivo \"int\" ==========");
        System.out.println("numeroInt = " + numeroInt);
        System.out.println("numeroIntStr = " + numeroIntStr);

        System.out.println("\n========== Conversion Primitivo \"long\" ==========");
        System.out.println("numeroLong = " + numeroLong);
        System.out.println("numeroLongStr = " + numeroLongStr);

        System.out.println("\n========== Conversion Primitivo \"float\" ==========");
        System.out.println("numeroFloat = " + numeroFloat);
        System.out.println("numeroFloatStr = " + numeroFloatStr);

        System.out.println("\n========== Conversion Primitivo \"double\" ==========");
        System.out.println("numeroDouble = " + numeroDouble);
        System.out.println("numeroDoubleStr = " + numeroDoubleStr);

        System.out.println("\n========== Conversion Primitivo \"boolean\" ==========");
        System.out.println("logicoBoolean1 = " + logicoBoolean1);
        System.out.println("logicoBooleanStr1 = " + logicoBooleanStr1);
        System.out.println("\nlogicoBoolean2 = " + logicoBoolean2);
        System.out.println("logicoBooleanStr2 = " + logicoBooleanStr2);
    }
}
