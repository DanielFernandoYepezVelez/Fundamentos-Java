package com._19_ExpresionesLambda._05_InterfazFuncional;

import java.util.function.BiFunction;

public class Calculadora {
    /* Con Las Expresiones Lambda No Funciona La Sobrecarga De Métodos */
    public double computer(double a, double b, Aritmetica lambda) {
        return lambda.operacion(a, b);
    }

    public double computarConBifunction(double a, double b, BiFunction<Double, Double, Double> lambda) {
        return lambda.apply(a, b);
    }
}