package com._04_EstructurasAlgoritmicas._05_For;

import javax.swing.*;

public class _02_ArraysFor {
    public static void iterarArreglos() {
        String[] names = {"Daniel", "Fernando", "Yepez", "Garzón"};
        int count = names.length;

        System.out.println("\n========== ITERANDO ARREGLOS ==========");
        for (int i = 0; i < count; i++) {

            if (names[i].equalsIgnoreCase("daniel") ||
                    names[i].equalsIgnoreCase("garzón")) {
                continue;
            }

            System.out.println((i + 1) + " - " + names[i]);
        }

        boolean find = false;
        String search = JOptionPane.showInputDialog("Ingrese Un Nombre, Ejemplo \"Daniel\" o \"Fernando\": ");

        for (int i = 0; i < count; i++) {

            if (names[i].equalsIgnoreCase(search)) {
                find = true;
                break;
            }
        }

        if(find) {
            JOptionPane.showMessageDialog(null, search + " Fue Encontrado De Forma Exitosa!!");
        } else {
            JOptionPane.showMessageDialog(null, search + " No Existe En El Sistema De Nombres!!");
        }
    }
}
