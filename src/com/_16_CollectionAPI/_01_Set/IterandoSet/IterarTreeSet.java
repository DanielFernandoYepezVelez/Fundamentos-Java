package com._16_CollectionAPI._01_Set.IterandoSet;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class IterarTreeSet {
    public static void EjemploTreeSetIterar() {

        Set<String> ts = new TreeSet<>();
        ts.add("Uno");
        ts.add("Dos");
        ts.add("Tres");
        ts.add("Cuatro");
        ts.add("Cinco");

        System.out.println("\n========== Iterando TreetSet Usando Un ForEach ==========");
        for (String numeros: ts) {
            System.out.println(numeros);
        }

        System.out.println("\n========== Iterando TreetSet Usando While E Iterator ==========");
        Iterator<String> it = ts.iterator();

        while (it.hasNext()) {
            String elemento = it.next();
            System.out.println(elemento);
        }

        System.out.println("\n========== Iterando TreetSet Usando While E Iterator ==========");
        ts.forEach(System.out::println);
    }
}
