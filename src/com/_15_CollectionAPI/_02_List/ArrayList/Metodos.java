package com._15_CollectionAPI._02_List.ArrayList;

import com._15_CollectionAPI._02_List.modelo.Alumno;

import java.util.ArrayList;
import java.util.List;

public class Metodos {
    public static void metodosImportantesArrayList() {
        System.out.println("\n========== METODOS IMPORTANTES LISTAS (ArrayList) ==========");
        List<Alumno> al = new ArrayList<>();

        System.out.println(al + "size = " + al.size());
        System.out.println("La Lista Esta Vacia = " + al.isEmpty());

        al.add(new Alumno("Pato", 20));
        al.add(new Alumno("Camilo", 18));
        al.add(new Alumno("Andres", 17));
        al.add(new Alumno("Maria", 16));

        /* Agregar Un Elemento En Un Indice Designado */
        al.add(1, new Alumno("Carmela", 15));

        /* Reemplaza El Elemento Existente En El Indice Designado */
        al.set(3, new Alumno("Maria REEMPLAZADA", 16));

        /* Elimina Un Elemento De La Lista Por Instancia - Referencia U Objeto
        * Se Elimina Por El Método Equals, Se Debe Cumplir Exactamente La
        * Condición O También Definiendo Su Indice */
        //al.remove(new Alumno("Pato", 20));
        al.remove(0);
        al.remove(new Alumno("Andres", 16));

        System.out.println(al + "size = " + al.size());

        boolean b = al.contains(new Alumno("Pato", 20));
        System.out.println("La Lista Contiene A Pato: " + b);

        /* Convertir El ArrayList En Un Arreglo */
        Object a[] = al.toArray();

        for (int i = 0; i < a.length; i++) {
            System.out.println("a[i] Desde El Arreglo = " + a[i]);
        }
    }
}
