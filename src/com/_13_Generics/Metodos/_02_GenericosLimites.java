package com._13_Generics.Metodos;

import com._12_POO._09_CrudDAO.modelo.Cliente;
import com._12_POO._09_CrudDAO.modelo.ClientePremium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _02_GenericosLimites {
    public static void genericosLimites() {
        System.out.println("\n========== BOUNDED GENERICS(Limites Especificos) ==========");

        List<Cliente> clientes = new ArrayList<>();
        clientes.add(new Cliente("Daniel", "Fernando"));

        Cliente[] clientesArreglo = {new Cliente("Luciano", "Fernando"),
                new Cliente("Andres", "Camilo")};
        Integer[] enterosArreglo = {1, 2, 3};

        /** Método Stático fromArrayToList */
        List<Cliente> clientesLista = fromArrayToList(clientesArreglo);
        List<Integer> enterosLista = fromArrayToList(enterosArreglo);

        clientesLista.forEach(System.out::println);
        enterosLista.forEach(System.out::println);

        List<ClientePremium> clientesPremiumList = fromArrayToList(
                new ClientePremium[]{new ClientePremium("Paco", "Fernando Premium")});
        clientesPremiumList.forEach(System.out::println);

        List<String> nombres = fromArrayToList(new String[]{"Bea", "Max", "Luz", "Maxi"}, enterosArreglo);
        nombres.forEach(System.out::println);
    }

    public static <T> List<T> fromArrayToList(T[] general) {
        /** Recibe Un Arreglo Y Lo Convierte En Una Lista */
        return Arrays.asList(general);
    }

    public static <T extends Number> List<T> fromArrayToList(T[] general) {
        /** Recibe Un Arreglo Y Lo Convierte En Una Lista */
        return Arrays.asList(general);
    }

    /** Trabaja Con Clientes O Con Sus Subclases(Clase Hijas) Màs Cercanas */
    public static <T extends Cliente & Comparable<T>> List<T> fromArrayToList(T[] general) {
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
