package com._16_CollectionAPI._02_List;

import com._16_CollectionAPI._02_List.ArrayList.ComparableComparator;
import com._16_CollectionAPI._02_List.ArrayList.Metodos;
import com._16_CollectionAPI._02_List.IterandoList.IterarArrayList;
import com._16_CollectionAPI._02_List.IterandoList.IterarLinkedList;
import com._16_CollectionAPI._02_List.IterandoList.ListIteratorEjemplo;
import com._16_CollectionAPI._02_List.LinkedList.ListasDoblementeEnlazadas;

public class Main {
    public static void main(String[] args) {

        IterarArrayList.EjemploArrayList();
        IterarLinkedList.EjemploLinkedList();
        ComparableComparator.ejemploArrayList();
        com._16_CollectionAPI._02_List.LinkedList.ComparableComparator.ejemploLinkedList();
        Metodos.metodosImportantesArrayList();
        com._16_CollectionAPI._02_List.LinkedList.Metodos.metodosImportantesLinkedList();
        ListasDoblementeEnlazadas.ejemploLinkedList();
        ListIteratorEjemplo.ejemploListIterator();

    }
}
