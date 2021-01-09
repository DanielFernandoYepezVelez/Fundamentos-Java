package com._14_Generics.Metodos;

import com._13_POO._09_CrudDAO.modelo.Cliente;
import com._13_POO._09_CrudDAO.modelo.ClientePremium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _03_GenericosComodines {
    public static void genericosComodines() {
        System.out.println("\n========== WILDCARDS GENERICS(Comodin '?') ==========");

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

        imprimirClientes(clientes);
        imprimirClientes(clientesLista);

        imprimirClientesComodin(clientes);
        imprimirClientesComodin(clientesPremiumList);
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

    /** Los Comodines Solo Se Pueden Utilizar En Las Listas */
    /** No Recibe ClientesPremium Por Que Solo Es Una Lista De Tipo
     * Cliente, En Conclusión, Aqui No Recibe Sub-clases O Descendencia
     * Del Tipo Cliente, Como Es El Caso De clientesPremium,
     * ¿POR QUÉ? Porque Estamos Hablando De Listas En Los
     * Parametros, Mas No, De Objetos, Entonces, Una Lista De
     * Clientes Es Totalmente Diferente De Una Lista De
     * Clientes Premium */
    public static void imprimirClientes(List<Cliente> clientes) {
        clientes.forEach(System.out::println);
    }

    /** Para Que Reciba Clientes De Cualquier Tipo
     * Incluyendo Sub-clases O Descendencia Debe Utilizar El Comodin "?" */
    public static void imprimirClientesComodin(List<? extends Cliente> clientes) {
        clientes.forEach(System.out::println);
    }
}
