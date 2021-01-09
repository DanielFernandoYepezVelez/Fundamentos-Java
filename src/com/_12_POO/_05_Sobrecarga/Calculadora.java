package com._12_POO._05_Sobrecarga;

public class Calculadora {

    public static int sumar(int a, int b) {
        return a + b;
    }

    public static float sumar(float a, float b) {
        return a + b;
    }

    public static float sumar(int a, float b) {
        return a + b;
    }

    public static float sumar(float a, int b) {
        return a +b;
    }

    public double sumar(double a, double b) {
        return a + b;
    }

    public int sumar(String a, String b) {
        int resultado;

        try {
            resultado = Integer.parseInt(a) + Integer.parseInt(b);
        } catch (NumberFormatException e) {
            resultado = 0;
        }

        return resultado;
    }

    public int sumar(int a, int b, int c) {
        return a + b + c;
    }

    /** Aqui Estoy Recibiendo Argumentos Variables */
    public int sumar(int... argumentos) {
        int total = 0;

        for (int i: argumentos) {
            total += i;
        }

        return total;
    }

    /** Aqui Estoy Recibiendo Argumentos Variables */
    public float sumar(float a, int... argumentos) {
        float total = a;

        for (int i: argumentos) {
            total += i;
        }

        return total;
    }

    /** Aqui Estoy Recibiendo Argumentos Variables */
    public double sumar(double... varargs) {
        double total = 0.0;

        for (double d: varargs) {
            total += d;
        }

        return total;
    }
}
