package com._16_CollectionAPI._01_Set.IterandoSet;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class IterarHashSet {
    public static void EjemploHashSetIterar() {

        Set<String> hs = new HashSet<>();
        hs.add("Uno");
        hs.add("Dos");
        hs.add("Tres");
        hs.add("Cuatro");
        hs.add("Cinco");

        System.out.println("========== Iterando HashSet Usando Un ForEach ==========");
        for (String numeros: hs) {
            System.out.println(numeros);
        }

        System.out.println("\n========== Iterando HashSet Usando While E Iterator ==========");
        Iterator<String> it = hs.iterator();

        while (it.hasNext()) {
            String elemento = it.next();
            System.out.println(elemento);
        }

        System.out.println("\n========== Iterando HashSet Usando Stream O Expresiones Lambda Foreach ==========");
        hs.forEach(System.out::println);
    }
}
