package com._12_POO._09_CrudDAO;

import com._12_POO._09_CrudDAO.Repositorio.*;
import com._12_POO._09_CrudDAO.modelo.Cliente;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        IAllInterfaces repositorio = new ClienteList();
        repositorio.crear(new Cliente("Daniel", "Yepez"));
        repositorio.crear(new Cliente("Fernando", "Vèlez"));
        repositorio.crear(new Cliente("Luci", "Martinez"));
        repositorio.crear(new Cliente("Andres", "Gùzman"));

        System.out.println("===== CREAR CLIENTES =====");
        List<Cliente> clientes = repositorio.listar();
        //clientes.forEach(c -> System.out.println(c));
        clientes.forEach(System.out::println);

        System.out.println("\n===== PAGINACIÒN DE CLIENTES =====");
        List<Cliente> paginable = repositorio.listar(1,3);
        paginable.forEach(System.out::println);

        System.out.println("\n===== ORDENAR CLIENTES ASC =====");
        List<Cliente> clientesOrdenAsc = repositorio.listar("nombre", Direccion.ASC);
        List<Cliente> clientesOrdenDesc = ((IOrdenable) repositorio).listar("nombre", Direccion.DESC);

        for (Cliente cli: clientesOrdenAsc) {
            System.out.println(cli);
        }

        System.out.println("\n===== ORDENAR CLIENTES DESC =====");
        for (Cliente cli: clientesOrdenDesc) {
            System.out.println(cli);
        }

        System.out.println("\n===== ACTUALIZAR CLIENTE =====");
        Cliente updateClient = new Cliente("Nuevo Fernando", "Nuevo Vélez");
        updateClient.setId(2);

        repositorio.editar(updateClient);
        System.out.println(updateClient);

        System.out.println("-----------------");
        repositorio.listar("nombre", Direccion.ASC).forEach(System.out::println);

        System.out.println("\n===== ELIMINAR CLIENTE =====");
        repositorio.eliminar(2);
        repositorio.listar().forEach(System.out::println);

        System.out.println("-----------");
        System.out.println("Total Registros: " + repositorio.total());
    }
}
