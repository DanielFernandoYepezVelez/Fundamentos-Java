package com._04_Operadores;

import java.util.Scanner;

public class _09_Ternario {
    public static void ternarioTresPartes() {
        /** Variable = Condición ? Si Es Verdadero Aquí Se Cumple : Si Es Falso Aquí Se Cumple; */
        Scanner teclado = new Scanner(System.in);
        String variable = 7 == 7 ? "Si Es Verdadero" : "Si Es Falso";

        String estado = "";
        double matematicas = 0.0;
        double ciencias = 0.0;
        double historia = 0.0;

        System.out.println("\n========== OPERADOR TERNARIO ==========");
        System.out.println("Variable = Condición ? Si Es Verdadero Aquí Se Cumple : Si Es Falso Aquí Se Cumple;");
        System.out.println("variable = " + variable);

        System.out.println("Ingresar La Nota De Matemàticas 2.0 - 7.0: ");
        matematicas = teclado.nextDouble();

        System.out.println("Ingresar La Nota De Ciencias 2.0 - 7.0: ");
        ciencias = teclado.nextDouble();

        System.out.println("Ingresar La Nota De Historia 2.0 - 7.0: ");
        historia = teclado.nextDouble();

        double promedio = (matematicas + ciencias + historia) / 3;

        estado = promedio >= 5.49 ? "Aprobado" : "Rechazado";

        System.out.println("estado = " + estado);
    }
}
