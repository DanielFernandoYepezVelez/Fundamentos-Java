package com._16_CollectionAPI._01_Set.HashSet;

import java.util.HashSet;
import java.util.Set;

public class Agregar {
    public static void EjemploHashSetAgregar() {

        Set<String> hs = new HashSet<>();

        System.out.println(hs.add("uno"));
        System.out.println(hs.add("dos"));
        System.out.println(hs.add("tres"));
        System.out.println(hs.add("cuatro"));
        System.out.println(hs.add("cinco"));
        System.out.println(hs);

        boolean b = hs.add("tres");

        System.out.println("Permite Elementos Duplicados: " + b);
        System.out.println(hs);
    }
}
