package com._13_POO._00_Conceptos._04_Sobrecarga;

public class Main {
    public static void main(String[] args) {
        Aritmetica aritmetica1 = new Aritmetica();
        System.out.println("aritmetica1.a = " + aritmetica1.a);
        System.out.println("aritmetica1.b = " + aritmetica1.b);

        System.out.println();
        Aritmetica aritmeticaArgs = new Aritmetica(5, 7);
        System.out.println("aritmeticaArgs.a = " + aritmeticaArgs.a);
        System.out.println("aritmeticaArgs.b = " + aritmeticaArgs.b);
    }
}
