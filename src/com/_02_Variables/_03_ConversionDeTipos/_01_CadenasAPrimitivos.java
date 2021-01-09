package com._02_Variables._03_ConversionDeTipos;

public class _01_CadenasAPrimitivos {
    public static void cadenasAprimitivos() {
        String numeroByteStr = "125";
        String numeroShortStr = "385";
        String numeroIntStr = "50";
        String numeroLongStr = "44678";
        String numeroFloarStr = "45.45e3F";
        String numeroDoubleStr = "324.56e3";
        String logicoBooleanStr1 = "true";
        String logicoBooleanStr2 = "false";

        byte numeroByte = Byte.parseByte(numeroByteStr);
        short numeroShort = Short.parseShort(numeroShortStr);
        int numeroInt = Integer.parseInt(numeroIntStr);
        long numeroLong = Long.parseLong(numeroLongStr);
        float numeroFloat = Float.parseFloat(numeroFloarStr);
        double numeroDouble = Double.parseDouble(numeroDoubleStr);
        boolean logicoBoolean1 = Boolean.parseBoolean(logicoBooleanStr1);
        boolean logicoBoolean2 = Boolean.parseBoolean(logicoBooleanStr2);

        System.out.println("\n********** \"Conversiòn De Cadenas A Primitivos\" **********");
        System.out.println("========== Conversion Primitivo \"byte\" ==========");
        System.out.println("numeroByteStr = " + numeroByteStr);
        System.out.println("numeroByte = " + numeroByte);

        System.out.println("\n========== Conversion Primitivo \"short\" ==========");
        System.out.println("numeroShortStr = " + numeroShortStr);
        System.out.println("numeroShort = " + numeroShort);

        System.out.println("\n========== Conversion Primitivo \"int\" ==========");
        System.out.println("numeroIntStr = " + numeroIntStr);
        System.out.println("numeroInt = " + numeroInt);

        System.out.println("\n========== Conversion Primitivo \"long\" ==========");
        System.out.println("numeroLongStr = " + numeroLongStr);
        System.out.println("numeroLong = " + numeroLong);

        System.out.println("\n========== Conversion Primitivo \"float\" ==========");
        System.out.println("numeroFloatStr = " + numeroFloarStr);
        System.out.println("numeroFloat = " + numeroFloat);

        System.out.println("\n========== Conversion Primitivo \"double\" ==========");
        System.out.println("numeroDoubleStr = " + numeroDoubleStr);
        System.out.println("numeroDouble = " + numeroDouble);

        System.out.println("\n========== Conversion Primitivo \"boolean\" ==========");
        System.out.println("logicoBooleanStr1 = " + logicoBooleanStr1);
        System.out.println("logicoBoolean1 = " + logicoBoolean1);
        System.out.println("\nlogicoBooleanStr2 = " + logicoBooleanStr2);
        System.out.println("logicoBoolean2 = " + logicoBoolean2);
    }
}
