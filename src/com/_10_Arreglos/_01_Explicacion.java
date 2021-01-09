package com._10_Arreglos;

public class _01_Explicacion {
    public static void CreateArrays() {
        int[] numbers = new int[4];

        numbers[0] = 134;
        numbers[1] = Integer.valueOf("2");
        numbers[2] = 34;
        numbers[3] = 10;

        int i = numbers[0];
        int j = numbers[1];
        int k = numbers[2];
        //int l = numbers[3];
        int l = numbers[numbers.length - 1];

        System.out.println("========== EXPLICACIÒN ARREGLOS ==========");
        System.out.println("i = " + i);
        System.out.println("j = " + j);
        System.out.println("k = " + k);
        System.out.println("l = " + l);
    }
}
