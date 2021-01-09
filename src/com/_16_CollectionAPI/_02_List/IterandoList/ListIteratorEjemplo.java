package com._16_CollectionAPI._02_List.IterandoList;

import com._16_CollectionAPI._02_List.modelo.Alumno;

import java.util.LinkedList;
import java.util.ListIterator;

public class ListIteratorEjemplo {
    public static void ejemploListIterator(){
        System.out.println("\n========== LIST ITERATOR ==========");
        LinkedList<Alumno> enlazada = new LinkedList<>();

        System.out.println(enlazada + "size = " + enlazada.size());
        System.out.println("La Lista Esta Vacia = " + enlazada.isEmpty());

        enlazada.add(new Alumno("Pato", 20));
        enlazada.add(new Alumno("Camilo", 18));
        enlazada.add(new Alumno("Andres", 17));
        enlazada.add(new Alumno("Maria", 16));

        System.out.println(enlazada + "size = " + enlazada.size());

        ListIterator<Alumno> li = enlazada.listIterator();

        System.out.println("========== NEXT ==========");
        while (li.hasNext()) {
            Alumno alumno = li.next();
            System.out.println(alumno);
        }

        System.out.println("\n========== PREVIOS ==========");
        while (li.hasPrevious()) {
            Alumno alumno = li.previous();
            System.out.println(alumno);
        }
    }
}
