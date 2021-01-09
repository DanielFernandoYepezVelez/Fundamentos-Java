package com._09_LineaDeComando;

public class _02_Calculadora {
    public static void main(String[] args) {

        if(args.length != 3) {
            System.out.println("Por Favor Ingresar Una Operación (suma, resta, multi, div) Y Dos Números Enteros: ");
            System.exit(-1);
        }

        String operacion = args[0];
        int a = Integer.parseInt(args[1]);
        int b = Integer.parseInt(args[2]);
        double resultado = 0.00;

        switch (operacion) {
            case "suma":
                resultado = a + b;
                break;

            case "resta":
                resultado = a - b;
                break;

            case "multi":
                resultado = a * b;
                break;

            case "div":
                if(b == 0) {
                    System.out.println("No Se Puede Dividir Por Zero(0)!");
                    System.exit(-1);
                }

                resultado = (double) a / b;
                break;

            default:
                resultado = a + b;
                break;
        }

        System.out.println("Resultado De La Operaciòn " + operacion + " Es: " + resultado);
    }

}
