package com._16_CollectionAPI._01_Set.TreeSet;

import com._16_CollectionAPI._01_Set.TreeSet.model.Alumno;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class Comparable {
    public static void  ejemploTreeSetComparable() {
        System.out.println("\n========== TreeSet COMPARABLE ELEMENTOS REPETIDOS ==========");
        System.out.println("Y Esta Bien Si Muestra Un Error, Por Que Eso Quiere Decir Que Dicho Objeto " +
                "No Esta Implementando La Interface Comparable");

        Set<Alumno> sa1 = new TreeSet<>();
        sa1.add(new Alumno("Pato", 5));
        sa1.add(new Alumno("Kata", 6));
        sa1.add(new Alumno("Luci", 4));
        sa1.add(new Alumno("Jano", 7));
        sa1.add(new Alumno("Daniel", 3));
        sa1.add(new Alumno("Zeuss", 2));

        System.out.println("Comparación Nota = " + sa1);

        /* Sobre-escribiendo La Comparación De Nota En La Clase Alumno
        * A La Comparación De Nombre Definida En La Expresión lambda */

        //Set<Alumno> sa = new TreeSet<>((a, b) -> a.getNombre().compareTo(b.getNombre()));
        // Metodo De Referencia Java 8
        Set<Alumno> sa = new TreeSet<>(Comparator.comparing(Alumno::getNota).reversed());
        sa.add(new Alumno("Pato", 5));
        sa.add(new Alumno("Kata", 6));
        sa.add(new Alumno("Luci", 4));
        sa.add(new Alumno("Jano", 7));
        sa.add(new Alumno("Daniel", 3));
        sa.add(new Alumno("Zeuss", 2));

        System.out.println("Comparación Nombre = " + sa);
    }
}
