package com._09_LineaDeComando;

public class _01_ExplicacionInicial {
    public static void main(String[] args) {

        if (args.length == 0) {
            System.out.println("Debe Ingresar Argumentos");
            System.exit(-1);
        }

        for (int i = 0; i < args.length; i++) {
            System.out.println("Argumentos nº " + i + ": " + args[i]);
        }

    }
}
