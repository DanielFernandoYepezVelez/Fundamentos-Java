package com._10_Arreglos;

import java.util.Arrays;

public class _04_IterandoForEach {
    public static void recorriendoArreglosForEach() {
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

        System.out.println("\n========== ITERANDO ARREGLOS FOR-EACH ==========");
        for (String producto: productos) {
            System.out.println("producto = " + producto);
        }
    }
}
