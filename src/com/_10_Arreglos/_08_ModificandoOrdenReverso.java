package com._10_Arreglos;

import java.util.Arrays;

public class _08_ModificandoOrdenReverso {
    public static void modificandoArreglo() {
        System.out.println("\n========== MODIFICANDO ARREGLO REVERSO ==========");
        String[] productos = {"Kingston Pendrive 64gb", "Samsung Galaxy", "Disco Duro SSD Samsung Externo",
                                "Asus NoteBook", "MacBook Air", "Chromecast 4ta Generaciòn", "Bicicleta Oxford" };
        int longitud = productos.length;

        Arrays.sort(productos);

        for (int i = 0; i < longitud; i++) {
            System.out.println("Para El Indicie " + i + ": " + productos[i]);
        }

        /** Mutando O Modificando El Orden De Los Valores De Forma Inversa */
        /** Forma #1 */
        /* for (int i = 0; i < longitud/2; i++) {
            String actual = productos[i];
            String inverso = productos[longitud-1-i];

            productos[i] = inverso;
            productos[longitud-1-i] = actual;
        }

        System.out.println("-----Reverso-----");
        for (int i = 0; i < longitud; i++) {
            System.out.println("Para El Indicie " + i + ": " + productos[i]);
        } */

        /** Forma #2 */
        int total2 = productos.length;

        for (int i = 0; i < total2; i++) {
            String actual = productos[i];
            String inverso = productos[longitud-1-i];

            productos[i] = inverso;
            productos[longitud-1-i] = actual;

            total2--;
        }

        System.out.println("-----Reverso 2-----");
        for (int i = 0; i < longitud; i++) {
            System.out.println("Para El Indicie " + i + ": " + productos[i]);
        }
    }
}
