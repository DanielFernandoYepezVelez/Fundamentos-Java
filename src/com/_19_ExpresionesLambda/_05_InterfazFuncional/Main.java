package com._19_ExpresionesLambda._05_InterfazFuncional;

public class Main {
    public static void main(String[] args) {

        /* Estamos Utilizando Una Interface Funcional Como Expresión Lambda
        * Es Muy Similar Al Bifunction Por Que Recibe Argumentos Y Retorna Valores */
        Aritmetica suma = (a, b) -> a + b;
        Aritmetica resta = (a, b) -> a -b;

        Calculadora cal = new Calculadora();

        System.out.println(cal.computer(10, 5, suma));
        System.out.println(cal.computer(10, 5, resta));
        System.out.println(cal.computer(10, 5, (a, b) -> a * b));

        /* Podemos Utilizar Las Expresiones Lambdas Existentes Y Predefinidas O
           Nosotros Podemos Implementar Nuestras Propias Expresiones Lambdas */
        System.out.println(cal.computarConBifunction(10, 5, (a, b) -> a + b));
        System.out.println(cal.computarConBifunction(10, 5, Double::sum));
    }
}