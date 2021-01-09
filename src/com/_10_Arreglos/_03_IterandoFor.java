package com._10_Arreglos;

import java.util.Arrays;

public class _03_IterandoFor {
    public static void recorriendoArreglosFor() {
        int numbers[] = new int[10];
        int coutn = numbers.length;

        String[] productos = new String[7];
        int longitud = productos.length;

        productos[0] = "Kingston Pendrive 64gb";
        productos[1] = "Samsung Galaxy";
        productos[2] = "Disco Duro SSD Samsung Externo";
        productos[3] = "Asus NoteBook";
        productos[4] = "MacBook Air";
        productos[5] = "Chromecast 4ta Generaciòn";
        productos[6] = "Bicicleta Oxford";

        Arrays.sort(productos);

        System.out.println("\n========== ITERANDO ARREGLOS FOR ==========");
        for (int i = 0; i < longitud; i++) {
            System.out.println("Para El Indicie " + i + ": " + productos[i]);
        }

        System.out.println("");
        for (int i = 0; i < coutn; i++) {
            numbers[i] = (i * 2);
        }

        for (int i = 0; i < coutn; i++) {
            System.out.println("Para El Indicie " + i + ": " + numbers[i]);
        }
    }
}
