package com._13_POO._00_Conceptos._03_Constructor;

public class Main {
    public static void main(String[] args) {
        Aritmetica aritmetica1 = new Aritmetica();
        aritmetica1.a = 3;
        aritmetica1.b = 2;
        aritmetica1.sumar();

        int resultado = aritmetica1.sumarRetorno();
        System.out.println("resultado = " + resultado);
        
        var resultadoArg = aritmetica1.sumarParametros(4, 67);
        System.out.println("resultadoArg = " + resultadoArg);
    }
}
