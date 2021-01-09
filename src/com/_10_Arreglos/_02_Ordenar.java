package com._10_Arreglos;

import java.util.Arrays;

public class _02_Ordenar {
    public static void ordenarArreglo() {
        int[] numbers = new int[4];
        String[] productos = new String[7];

        numbers[0] = 134;
        numbers[1] = Integer.valueOf("2");
        numbers[2] = 34;
        numbers[3] = 10;

        Arrays.sort(numbers);

        int i = numbers[0];
        int j = numbers[1];
        int k = numbers[2];
        //int l = numbers[3];
        int l = numbers[numbers.length - 1];

        productos[0] = "Kingston Pendrive 64gb";
        productos[1] = "Samsung Galaxy";
        productos[2] = "Disco Duro SSD Samsung Externo";
        productos[3] = "Asus NoteBook";
        productos[4] = "MacBook Air";
        productos[5] = "Chromecast 4ta Generaciòn";
        productos[6] = "Bicicleta Oxford";

        Arrays.sort(productos);

        String productoUno = productos[0];
        String productoDos = productos[1];
        String productoTres = productos[2];
        String productoCuatro = productos[3];
        String productoCinco = productos[4];
        String productoSeis = productos[5];
        String productoSiete = productos[6];

        System.out.println("\n========== ORDENAR ARREGLOS ALFABETICAMENTE ==========");
        System.out.println("i = " + i);
        System.out.println("j = " + j);
        System.out.println("k = " + k);
        System.out.println("l = " + l);

        System.out.println();

        System.out.println("productoUno = " + productoUno);
        System.out.println("productoDos = " + productoDos);
        System.out.println("productoTres = " + productoTres);
        System.out.println("productoCuatro = " + productoCuatro);
        System.out.println("productoCinco = " + productoCinco);
        System.out.println("productoSeis = " + productoSeis);
        System.out.println("productoSiete = " + productoSiete);
    }
}
