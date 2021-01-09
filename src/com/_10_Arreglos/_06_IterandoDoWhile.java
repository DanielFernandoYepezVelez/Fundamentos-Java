package com._10_Arreglos;

import java.util.Arrays;

public class _06_IterandoDoWhile {
    public static void recorriendoArreglosDoWhile() {
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

        System.out.println("\n========== ITERANDO ARREGLOS DO-WHILE ==========");
        int i = 0;

        do {
            System.out.println("Para El Indice: " + i + ": " + productos[i]);
            i++;
        } while (i < longitud);
    }
}
