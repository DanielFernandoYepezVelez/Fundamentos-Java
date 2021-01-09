package com._10_Arreglos;

import java.util.Arrays;

public class _07_IterandoOrdenInverso {
    public static void ordenInverso() {
        System.out.println("\n========== ITERANDO ORDEN INVERSO ==========");
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int count = numbers.length;

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

        /** Primera Forma De Decrementar */
        for (int i = 0; i < longitud; i++) {
            System.out.println("Para El Indicie " + (longitud - 1 - i) + ": " + productos[longitud - 1 - i]);
        }

        System.out.println("------");
        for (int i = 0; i < count; i++) {
            System.out.println("Para El Indicie " + (count - 1 - i) + ": " + numbers[count - 1 - i]);
        }

        /** Segunda Forma De Decrementar */
        System.out.println("----------------------------------");
        for (int i = longitud - 1; i >= 0; i--) {
            System.out.println("Para El Indicie " + i + ": " + productos[i]);
        }

        System.out.println("------");
        for (int i = count - 1; i >= 0; i--) {
            System.out.println("Para El Indicie " + i + ": " + numbers[i]);
        }
    }
}
