package com._15_Exceptions;

import javax.swing.*;

public class _01_ExcepcionesUnchecked {
    public static void excepcionesNoComprobadas() {

        String valor = JOptionPane.showInputDialog("Ingrese Un Número Entero: ");

        try {

            int divisor = Integer.parseInt(valor);
            int division = 10 / divisor;
            System.out.println("division = " + division);

        } catch (NumberFormatException e) {
            System.out.println("Capturamos El Error En Tiempo De Ejecución Por Un Valor NO Númerico." + e.getMessage());

        } catch (ArithmeticException e) {
            System.out.println("Capturamos El Error En Tiempo De Ejecución Por Un Valor Cero." + e.getMessage());

        } finally {
            System.out.println("Es Opcional, Pero Se Ejecuta Siempre Con Excepción o Sin Ella!");
        }

        System.out.println("Continuamos Con El Flujo De La Aplicación Y Está" +
                " Puede Seguir Ejecutando Las Tareas Definidas.");
    }
}
