package com._13_POO._00_Conceptos._03_Constructor;

public class Aritmetica {
    /* Valor Por Defecto Es 0, Por El Tipo De Dato Que Estamos Definiendo */
    int a;
    int b;

    /* Constructor */
    public Aritmetica() {
        System.out.println("Ejecutando El Método Constructor");
    }

    /* Métodos */
    public void sumar() {
        int resultado = a + b;
        System.out.println("resultado = " + resultado);
    }

    public int sumarRetorno() {
        //int resultado = a + b;
        return a + b;
    }

    public int sumarParametros(int arg1, int arg2) {
        a = arg1;
        b = arg2;
        //return a + b;
        return this.sumarRetorno();
    }
}
