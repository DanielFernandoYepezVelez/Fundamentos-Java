package com._02_Variables._02_SistemasNumericos;

import javax.swing.*;

public class _05_EjercicioJOptionPane {
    public static void Ejemplificacion() {
        int numeroDecimal = 0 ;

        try {
            numeroDecimal = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese Un Nùmero Entero: "));

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "El Valor Nùmerico Ingresado No Es Vàlido");
            _05_EjercicioJOptionPane.Ejemplificacion();
            System.exit(0);
        }

        String numeroBinario = Integer.toBinaryString(numeroDecimal);
        String numeroOctal = Integer.toOctalString(numeroDecimal);
        String numeroHexadecimal = Integer.toHexString(numeroDecimal);

        String tituloDecimal = "\n=========== SISTEMA DECIMAL POR DEFECTO ==========";
        String resDecimal = "\nNumero Decimal De " + numeroDecimal + " = " + numeroDecimal + "\n";

        String tituloBinario = "\n=========== SISTEMA BINARIO ==========";
        String resBinario = "\nNumero Binario De " + numeroDecimal + " = " + Integer.toBinaryString(numeroDecimal) +
                            "\nNumero Decimal De " + numeroBinario + " = " + numeroDecimal + "\n";

        String tituloOctal = "\n=========== SISTEMA OCTAL ==========";
        String resOctal = "\nNumero Octal De " + numeroDecimal + " = " + Integer.toOctalString(numeroDecimal) +
                          "\nNumero Decimal De " + numeroOctal + " = " + numeroDecimal + "\n";

        String tituloHexadecimal = "\n=========== SISTEMA HEXADECIMAL ==========";
        String resHexadecimal = "\nNumero Hexadecimal De " + numeroDecimal + " = " + Integer.toHexString(numeroDecimal) +
                                "\nNumero Decimal De " + numeroHexadecimal + " = " + numeroDecimal + "\n";

        String mensaje = tituloDecimal + resDecimal;
        mensaje += tituloBinario + resBinario;
        mensaje += tituloOctal + resOctal;
        mensaje += tituloHexadecimal + resHexadecimal;

        JOptionPane.showMessageDialog(null, mensaje);
    }
}
