package com._02_Variables._02_SistemasNumericos;

public class _02_SistemaBinario {
    public static void SistemaBinario() {
        int numeroDecimal1 = 500;
        int numeroDecimal2 = 302;

        int numeroBinario1 = 0b111110100;
        int numeroBinario2 = 0b100101110;

        System.out.println("\n=========== SISTEMA BINARIO ==========");
        System.out.println("Numero Binario De " + numeroDecimal1 + " = " + Integer.toBinaryString(numeroDecimal1));
        System.out.println("Numero Binario De " + numeroDecimal2 + " = " + Integer.toBinaryString(numeroDecimal2));
        System.out.println("Numero Decimal De 0b111110100" + " = " + numeroBinario1);
        System.out.println("Numero Decimal De 0b100101110" + " = " + numeroBinario2);
    }
}
