package com._04_EstructurasAlgoritmicas._03_IfElseIf;

public class _01_CondicionAnidada {
    public static void ifAnidado() {
        float promedio = 5.8F;

        if (promedio >= 6.5) {
            System.out.println("Felicitaciones, Excelente Promedio!!!!");
        } else if (promedio >= 6.0) {
            System.out.println("Muy Buen Promedio!!!");
        } else if (promedio >= 5.5) {
            System.out.println("Buen Promedio!!!");
        } else if (promedio >= 5.0) {
            System.out.println("Regular, Necesitas Esforzarte Un Poco Más!!!");
        } else if (promedio >= 4.0) {
            System.out.println("Insuficiente, Necesitas Estudiar Más!!!");
        } else {
            System.out.println("Reprobado!!!");
        }

        System.out.println("Tu Promedio Es " + promedio);
    }
}
