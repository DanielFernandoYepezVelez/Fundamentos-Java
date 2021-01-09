package com._07_ClaseSystem;

import java.util.Properties;

public class _01_PropiedadesDeSistema {
    public static void verPropiedades() {
        String username = System.getProperty("user.name");
        String home = System.getProperty("user.home");
        String directorio = System.getProperty("user.dir");
        String java = System.getProperty("java.version");
        String lineSeparator = System.getProperty("line.separator");
        String lineSeparator2 = System.lineSeparator();

        /** Propiedades Completas De La Clase System */
        Properties propiedades = System.getProperties();

        System.out.println("========== PROPIEDADES DEL SISTEMA OPERATIVO ==========");
        System.out.println("username = " + username);
        System.out.println("home = " + home);
        System.out.println("directorio = " + directorio);
        System.out.println("java = " + java);
        System.out.println("lineSeparator: =>" + lineSeparator + "Una Linea Nueva Uno");
        System.out.println("lineSeparator2: => " + lineSeparator2 + "Una Linea Nueva Dos");
        System.out.println("propiedades = " + propiedades);

        System.out.println("\n========== ALL PROPIEDADES DEL SISTEMA OPERATIVO ==========");
        propiedades.list(System.out);
    }
}
