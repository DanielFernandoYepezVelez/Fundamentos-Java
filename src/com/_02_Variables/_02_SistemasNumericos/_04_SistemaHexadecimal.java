package com._02_Variables._02_SistemasNumericos;

public class _04_SistemaHexadecimal {
    public static void SistemaHexadecimal() {
        int numeroDecimal1 = 500;
        int numeroDecimal2 = 302;

        int numeroHexadecimal1 = 0x1f4;
        int numeroHexadecimal2 = 0x12e;

        System.out.println("\n=========== SISTEMA HEXADECIMAL ==========");
        System.out.println("Numero Hexadecimal De " + numeroDecimal1 + " = " + Integer.toHexString(numeroDecimal1));
        System.out.println("Numero Hexadecimal De " + numeroDecimal2 + " = " + Integer.toHexString(numeroDecimal2));
        System.out.println("Numero Decimal De 0x1f4" + " = " + numeroHexadecimal1);
        System.out.println("Numero Decimal De 0x12e" + " = " + numeroHexadecimal2);
    }
}
