package com._13_POO._05_Sobrecarga;

import static com._13_POO._05_Sobrecarga.Calculadora.*;

public class Main {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        System.out.println("Sumar Int: " + sumar(10,5));
        System.out.println("Sumar Float: " + sumar(10.0F, 5F));
        System.out.println("Sumar Float - Int: " + sumar(10F, 5));
        System.out.println("Sumar Int - Float: " + sumar(10, 5.0F));
        System.out.println("Sumar Double: " + calculadora.sumar(10D, 5D));
        System.out.println("Sumar String: " + calculadora.sumar("10", "5"));
        System.out.println("Sumar Tres Int: " + calculadora.sumar(10, 5, 3));
        System.out.println("Sumar Long: " + calculadora.sumar(10L, 5L));
        System.out.println("Sumar Int: " + calculadora.sumar(10, '@'));
        System.out.println("Sumar Float - Int: " + calculadora.sumar(10F, '@'));
        System.out.println("Sumar Int Argumentos Variables: " + calculadora.sumar(10, '@', 3, 4, 5));
        System.out.println("Sumar Float - Int Argumentos Variables: " + calculadora.sumar(12F, 34, 10, '@', 3, 4, 5));
        System.out.println("Sumar Double Argumentos Variables: " + calculadora.sumar(10_5D, 10_0, 123e6D, 11F));
    }
}
