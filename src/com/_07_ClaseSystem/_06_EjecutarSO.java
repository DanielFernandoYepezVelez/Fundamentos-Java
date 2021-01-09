package com._07_ClaseSystem;

import java.io.IOException;

public class _06_EjecutarSO {
    public static void EjecutarSistemaOperativo() {

        Runtime rt = Runtime.getRuntime();
        Process proceso;

        System.out.println("\n========== EJECUTANDO LA CLASE RUNTIME ==========");
        try {

            if (System.getProperty("os.name").toLowerCase().startsWith("windows")) {
                proceso = rt.exec("notepad");

            } else if(System.getProperty("os.name").toLowerCase().startsWith("mac")) {
                proceso = rt.exec("textedit");

            } else if(System.getProperty("os.name").toLowerCase().startsWith("linux") ||
                    System.getProperty("os.name").toLowerCase().contains("nix")) {
                proceso = rt.exec("gedit");

            } else {
                proceso = rt.exec("gedit");
            }

            proceso.waitFor();

        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
            System.err.println("El Comando Es Desconocido: " + e.getMessage());
        }

        System.out.println("Se Ha Cerrado El Bloc De Notas");
    }
}
