package com._16_CollectionAPI._01_Set.HashSet;

import java.util.HashSet;
import java.util.Set;

public class DuplicadosSegmentados {
    public static void EjemploHashSetBuscarDuplicadoSegmentado() {
        System.out.println("\n========== EJEMPLO DUPLICADOS SEGMENTADOS ===========");
        String[] peces = {"Corvina", "Lenguado", "Pejerrey", "Corvina", "Robalo", "Atún", "Lenguado"};

        Set<String> unicos = new HashSet<>();
        Set<String> duplicados = new HashSet<>();

        for (String pez: peces) {
            if (!unicos.add(pez)) {
                duplicados.add(pez);
            }
        }

        unicos.removeAll(duplicados);

        System.out.println("Unicos: " + unicos);
        System.out.println("Duplicados: " + duplicados);
    }
}
