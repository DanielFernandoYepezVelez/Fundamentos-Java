package com._15_CollectionAPI._02_List.ArrayList;

import com._15_CollectionAPI._02_List.modelo.Alumno;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparableComparator {
    public static void ejemploArrayList() {
        List<Alumno> sa = new ArrayList<>();

        sa.add(new Alumno("Pato", 20));
        sa.add(new Alumno("Camilo", 18));
        sa.add(new Alumno("Andres", 17));
        sa.add(new Alumno("Maria", 16));
        sa.add(new Alumno("Carmela", 15));
        sa.add(new Alumno("Roberto", 14));
        sa.add(new Alumno("Rosa", 11));
        sa.add(new Alumno("Rosa", 11));
        sa.add(new Alumno("Valencia", 12));
        sa.add(new Alumno("Valencia", 12));
        System.out.println(sa);

        System.out.println("\n========== ARRAYLIST COMPARABLE COMPARATOR ==========");
        // Forma Manual
        //Collections.sort(sa, (a, b) -> a.getNombre().compareTo(b.getNombre()));
        //sa.sort((a, b) -> b.getNombre().compareTo(a.getNombre()));

        // Utilizando Java 8 (Se Ordena Según El Atributo)
        //sa.sort(Comparator.comparing((Alumno a) -> a.getEdad()));
        //sa.sort(Comparator.comparing((Alumno a) -> a.getEdad()).reversed());

        // Optimizando Aún Más Con El Método De Referencia
        sa.sort(Comparator.comparing(Alumno::getEdad).reversed());

        System.out.println("\n========== Iterando ArrayList Usando While E Iterator ==========");
        sa.forEach(System.out::println);
    }
}
