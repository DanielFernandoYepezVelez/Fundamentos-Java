package com._07_ClaseSystem;

public class _05_MetodosStaticos {
    public static void metodosClaseSystem() {

        System.out.println("\n========== MÉTODOS ESTÁTICOS DE LA CLASE SYSTEM ==========");
        //System.exit(1); Si Pasa Algún Error, Corta La Ejecuciòn
        System.out.println("Continuando Con La Aplicación");
        System.err.println("Error Renderizado Desde La Clase Systema");

        System.out.println("\n========== RECOLECTOR DE BASURA ==========");
        System.out.println("Automáticamente Java Hace La Limpieza De Los Objetos O Instancias, " +
                "\nPero Yo Cuando Tengo Muchas Instancias U Objetos Sin Utilizar Puedo Invocar El " +
                "\nRecolector De Basura De Forma Explicita!!!");
        System.gc();
        //System.exit(0); // Si NO Pasa Ningún Error, Corta La Ejecución También
    }
}
