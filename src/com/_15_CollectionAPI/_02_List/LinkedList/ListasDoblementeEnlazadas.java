package com._15_CollectionAPI._02_List.LinkedList;

import com._15_CollectionAPI._02_List.modelo.Alumno;

import java.util.LinkedList;

public class ListasDoblementeEnlazadas {
    public static void ejemploLinkedList() {
        System.out.println("\n========== LISTAS DOBLEMENTE ENLAZADAS (LinkedList) ==========");
        LinkedList<Alumno> enlazada = new LinkedList<>();

        System.out.println(enlazada + "size = " + enlazada.size());
        System.out.println("La Lista Esta Vacia = " + enlazada.isEmpty());

        enlazada.add(new Alumno("Pato", 20));
        enlazada.add(new Alumno("Camilo", 18));
        enlazada.add(new Alumno("Andres", 17));
        enlazada.add(new Alumno("Maria", 16));

        System.out.println(enlazada + "size = " + enlazada.size());

        /** AGREGAR */
        enlazada.addFirst(new Alumno("Primer Nombre", 34));
        enlazada.addLast(new Alumno("Ultimo Nombre", 25));

        System.out.println(enlazada + "size = " + enlazada.size());

        /** OBTENER */
        //System.out.println("Primero =>: " + enlazada.getFirst()); // Lanza Una Exception Si No Encuentra El Elemento
        System.out.println("Primero =>: " + enlazada.peekFirst()); // No Lanza Una Exception Si No Encuentra El Elemento

        //System.out.println("Ultimo =>: " + enlazada.getLast()); // Lanza Una Exception Si No Encuentra El Elemento
        System.out.println("Ultimo =>: " + enlazada.peekLast()); // No Lanza Una Exception Si No Encuentra El Elemento

        System.out.println("Indicando El Indice =>: " + enlazada.get(2));

        /** ELIMINAR */
        //enlazada.removeFirst(); // Lanza Una Exception Si No Encuentra El Elemento
        enlazada.pollFirst(); // No Lanza Una Exception Si No Encuentra El Elemento
        //enlazada.pop() // Similar Al removeFirst Y También Lanza Una Exception

        // enlazada.removeLast(); // Lanza Una Exception Si No Encuentra El Elemento
        enlazada.pollLast(); // No Lanza Una Exception Si No Encuentra El Elemento

        System.out.println(enlazada + "size = " + enlazada.size());

        /** Buscar Indice */
        Alumno a = new Alumno("Danielillo", 20);
        enlazada.addLast(a);

        System.out.println("Indice De Danielillo: " + enlazada.indexOf(a));
        System.out.println(enlazada + "size = " + enlazada.size());

        /** MODIFICAR */
        enlazada.set(2, new Alumno("Elemento Modificado", 22));
        System.out.println(enlazada + "size = " + enlazada.size());
    }
}
