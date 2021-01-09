package com._15_Exceptions._02_Checked;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        Calculadora cal = new Calculadora();
        String valor = JOptionPane.showInputDialog("Ingrese Un Número Entero: ");

        String numerodor = JOptionPane.showInputDialog("Ingrese Un Valor Númerador: ");
        String denominador = JOptionPane.showInputDialog("Ingrese Un Valor Denominador: ");

        int divisor;
        double division;

        try {
            divisor = Integer.parseInt(valor);
            division = cal.dividir(10, divisor);
            System.out.println("division = " + division);
            
            double division2 = cal.dividir(numerodor, denominador);
            System.out.println("division2 = " + division2);

        } catch (NumberFormatException e) {
            System.out.println("Capturamos El Error En Tiempo De Ejecución Por Un Valor NO Númerico." + e.getMessage());

        } catch (DivisionPorZeroException e) {
            System.out.println("Capturamos El Error En Tiempo De Ejecución Por Un Valor Cero." + e.getMessage());

        } catch (FormatoNumeroException e) {
            System.out.println("Se Detecto Una Excepción Ingrese Un Número Válido. " + e.getMessage());
            e.printStackTrace(System.out);
        
        } finally {
            System.out.println("Es Opcional, Pero Se Ejecuta Siempre Con Excepción o Sin Ella!");
        }

        System.out.println("Continuamos Con El Flujo De La Aplicación Y Está" +
                " Puede Seguir Ejecutando Las Tareas Definidas.");
    }
}
