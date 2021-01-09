package com._13_Generics.Metodos;

import com._12_POO._09_CrudDAO.modelo.Cliente;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _01_GenericosParametros {
    public static void genericosOgenerales() {
        System.out.println("========== GENERIC METHODS ==========");

        List<Cliente> clientes = new ArrayList<>();
        clientes.add(new Cliente("Daniel", "Fernando"));

        /** Obtener Un Clientes De La Lista */
        //Cliente andres = clientes.get(0);
        Cliente andres = clientes.iterator().next();

        Cliente[] clientesArreglo = { new Cliente("Luciano", "Fernando"),
                                      new Cliente("Andres", "Camilo")};
        Integer[] enterosArreglo = {1, 2, 3};

        /** Método Stático fromArrayToList */
        List<Cliente> clientesLista = fromArrayToList(clientesArreglo);
        List<Integer> enterosLista = fromArrayToList(enterosArreglo);

        clientesLista.forEach(System.out::println);
        enterosLista.forEach(System.out::println);

        List<String> nombres = fromArrayToList(new String[]{"Bea", "Max", "Luz", "Maxi"}, enterosArreglo);
        nombres.forEach(System.out::println);
    }

    public static <T> List<T> fromArrayToList(T[] general) {
        /** Recibe Un Arreglo Y Lo Convierte En Una Lista */
        return Arrays.asList(general);
    }

    public static <T, G> List<T> fromArrayToList(T[] parametroGeneral, G[] parametroGeneral2) {

        System.out.println(" ");
        for (G elemento: parametroGeneral2) {
            System.out.println(elemento);
        }

        /** Recibe Un Arreglo Y Lo Convierte En Una Lista */
        return Arrays.asList(parametroGeneral);
    }
}
