package com._16_CollectionAPI._01_Set.HashSet;

import com._16_CollectionAPI._01_Set.HashSet.modelo.Alumno;

import java.util.HashSet;
import java.util.Set;

public class EqualsHashCode {
    public static void  ejemploHashSetComparable() {
        System.out.println("\n========== HashSet Equals AND HashCode ==========");
        Set<Alumno> sa1 = new HashSet<>();
        sa1.add(new Alumno("Pato", 5));
        sa1.add(new Alumno("Kata", 6));
        sa1.add(new Alumno("Luci", 4));
        sa1.add(new Alumno("Jano", 7));
        sa1.add(new Alumno("Daniel", 3));
        sa1.add(new Alumno("Daniel", 2));
        sa1.add(new Alumno("Zeuss", 2));
        sa1.add(new Alumno("Zeuss", 2));

        System.out.println("Comparación Nota = " + sa1);
    }
}
