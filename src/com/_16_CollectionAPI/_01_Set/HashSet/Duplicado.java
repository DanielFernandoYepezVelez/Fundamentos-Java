package com._16_CollectionAPI._01_Set.HashSet;

import java.util.HashSet;
import java.util.Set;

public class Duplicado {
    public static void EjemploHashSetBuscarDuplicado() {
        System.out.println("\n========== EJEMPLO DUPLICADOS ===========");
        String[] peces = {"Corvina", "Lenguado", "Pejerrey", "Corvina", "Robalo", "Atún", "Lenguado"};

        Set<String> unicos = new HashSet<>();

        for (String pez: peces) {
            if (!unicos.add(pez)) {
                System.out.println("Elemento Duplicado: " + pez);
            }
        }

        System.out.println(unicos.size() + " Elementos No Duplicados: " + unicos);
    }
}
