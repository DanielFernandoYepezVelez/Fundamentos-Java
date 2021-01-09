package com._04_EstructurasAlgoritmicas._04_Switch;

public class _01_SwitchCase {
    public static void sentenciaSwitchCase() {
        Character numeroCaracter = '2';

        switch (numeroCaracter) {
            case '0':
                System.out.println("El Número Es Cero.");
                break;

            case '1':
                System.out.println("El Número Es Uno");
                break;

            case '2':
                System.out.println("El Número Es Dos");
                break;

            case '3':
                System.out.println("El Nùmero Es Tres");
                break;

            default:
                System.out.println("El Valor Ingresado No Es Vàlido");
                break;
        }
    }
}
