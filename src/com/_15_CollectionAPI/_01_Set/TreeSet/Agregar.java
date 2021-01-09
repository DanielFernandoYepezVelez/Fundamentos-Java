package com._15_CollectionAPI._01_Set.TreeSet;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class Agregar {
    public static void EjemploTreeSet() {

        System.out.println("========== ORDENADOS DE FORMA NATURAL ==========");
        Set<String> ts = new TreeSet<>((a, b) -> b.compareTo(a));
        ts.add("uno");
        ts.add("dos");
        ts.add("tres");
        ts.add("tres");
        ts.add("cuatro");
        ts.add("cinco");

        System.out.println("TreeSet String: " + ts);

        Set<Integer> numeros = new TreeSet<>(Comparator.reverseOrder());
        numeros.add(1);
        numeros.add(5);
        numeros.add(3);
        numeros.add(4);
        numeros.add(2);
        numeros.add(6);
        numeros.add(10);

        System.out.println("TreeSet Números: " + numeros);
    }
}
