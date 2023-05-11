package com._14_Generics.Metodos;

import com._13_POO._09_CrudDAO.modelo.Cliente;

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

        Cliente[] clientesArreglo = { new Cliente("Luciano", "Fernando"), new Cliente("Andres", "Camilo")};
        Integer[] enterosArreglo = {1, 2, 3};

        /** Método Stático Generico fromArrayToList */
        List<Cliente> clientesLista = fromArrayToList(clientesArreglo);
        List<Integer> enterosLista = fromArrayToList(enterosArreglo);

        // Métodos De Referencia
        clientesLista.forEach(System.out::println);
        enterosLista.forEach(System.out::println);

        String[] nombresArreglo = {"Bea", "Max", "Luz", "Maxi"};
        List<String> nombres = fromArrayToList(nombresArreglo, enterosArreglo);
        
        nombres.forEach(System.out::println);
    }

    /* Definimos Un Método Estatico Con UN Tipo De Dato Generico (PUEDE RECIBIR Y RETORNAR CUALQUIER TIPO DE DATO) 
    Y Dicho Tipo De Dato Generico Viene Como Parametro */
    // OJO!! <T> => Tipo De Dato Generico Para El Primer Parametro Definido T[], Pero, Retorna Una Lista De Dicho Tipo De Dato Generico List<T>.
    public static <T> List<T> fromArrayToList(T[] general) {
        /** Recibe Un Arreglo Generico Y Lo Convierte En Una Lista */
        return Arrays.asList(general);
    }

    /* Definimos Un Método Estatico Con DOS Tipos De Datos Genericos (PUEDE RECIBIR Y RETORNAR CUALQUIER TIPO DE DATO)
    Y Dichos Tipos De Dato Genericos Vienen Como Parametros */
    // OJO!! <T> => Tipo De Dato Generico Para El Primer Parametro Definido T[], Pero, Retorna Una Lista De Dicho Tipo De Dato Generico List<T>.
    // OJO!! <G> => Tipo De Dato Generico Para El Segundo Parametro Definido G[], Pero, Retorna Una Lista Del Primer Tipo De Dato Generico List<T>.
    public static <T, G> List<T> fromArrayToList(T[] parametroGeneral, G[] parametroGeneral2) {
        System.out.println(" ");
        for (G elemento: parametroGeneral2) {
            System.out.println(elemento);
        }

        /** Recibe Un Arreglo Y Lo Convierte En Una Lista */
        return Arrays.asList(parametroGeneral);
    }
}
