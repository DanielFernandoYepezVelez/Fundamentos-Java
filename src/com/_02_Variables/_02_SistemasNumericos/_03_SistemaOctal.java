package com._02_Variables._02_SistemasNumericos;

public class _03_SistemaOctal {
    public static void SistemaOctal() {
        int numeroDecimal1 = 500;
        int numeroDecimal2 = 302;

        int numeroOctal1 = 0764;
        int numeroOctal2 = 0456;

        System.out.println("\n=========== SISTEMA OCTAL ==========");
        System.out.println("Numero Octal De " + numeroDecimal1 + " = " + Integer.toOctalString(numeroDecimal1));
        System.out.println("Numero Octal De " + numeroDecimal2 + " = " + Integer.toOctalString(numeroDecimal2));
        System.out.println("Numero Decimal De 0764" + " = " + numeroOctal1);
        System.out.println("Numero Decimal De 0456" + " = " + numeroOctal2);
    }
}
