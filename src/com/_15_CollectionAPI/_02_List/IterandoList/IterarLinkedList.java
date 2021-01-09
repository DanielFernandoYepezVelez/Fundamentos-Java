package com._15_CollectionAPI._02_List.IterandoList;

import com._15_CollectionAPI._02_List.modelo.Alumno;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class IterarLinkedList {
    public static void EjemploLinkedList() {
        List<Alumno> sa = new LinkedList<>();

        sa.add(new Alumno("Pato", 20));
        sa.add(new Alumno("Camilo", 18));
        sa.add(new Alumno("Andres", 17));
        sa.add(new Alumno("Maria", 16));
        sa.add(new Alumno("Carmela", 15));
        sa.add(new Alumno("Roberto", 14));
        sa.add(new Alumno("Rosa", 11));
        sa.add(new Alumno("Valencia", 12));

        System.out.println(sa);

        System.out.println("\n========== Iterando LinkedList Usando Un For Clasico QUE NO TIENE EL SET ==========");
        for (int i = 0; i < sa.size(); i++) {
            System.out.println(sa.get(i));
        }

        System.out.println("\n========== Iterando LinkedList Usando Un ForEach ==========");
        for (Alumno alumnos: sa) {
            System.out.println(alumnos);
        }

        System.out.println("\n========== Iterando LinkedList Usando While E Iterator ==========");
        Iterator<Alumno> it = sa.iterator();

        while (it.hasNext()) {
            Alumno elemento = it.next();
            System.out.println(elemento);
        }

        System.out.println("\n========== Iterando LinkedList Usando While E Iterator ==========");
        sa.forEach(System.out::println);
    }
}
