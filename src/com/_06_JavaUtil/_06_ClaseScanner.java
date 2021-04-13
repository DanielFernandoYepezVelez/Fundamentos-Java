package com._06_JavaUtil;

import java.util.Scanner;

public class _06_ClaseScanner {
    public static void scanner() {
        Scanner teclado = new Scanner(System.in);

        System.out.println("\n========== CLASE SCANNER ==========");
        System.out.println("Escribe Tu Nombre: ");
        String usuario = teclado.nextLine();

        System.out.println("Nombre Del Usuario: " + usuario);
    }
}
