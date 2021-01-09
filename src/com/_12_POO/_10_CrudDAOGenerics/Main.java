package com._12_POO._10_CrudDAOGenerics;

import com._12_POO._10_CrudDAOGenerics.Repositorio.List.ClienteList;
import com._12_POO._10_CrudDAOGenerics.Repositorio.Direccion;
import com._12_POO._10_CrudDAOGenerics.Repositorio.IAllInterfaces;
import com._12_POO._10_CrudDAOGenerics.Repositorio.IOrdenable;
import com._12_POO._10_CrudDAOGenerics.Repositorio.List.ProductoList;
import com._12_POO._10_CrudDAOGenerics.modelo.Cliente;
import com._12_POO._10_CrudDAOGenerics.modelo.Producto;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        IAllInterfaces<Cliente> repositorio = new ClienteList();
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

        System.out.println("\n========================= PRODUCTOS ===============================");
        IAllInterfaces<Producto> repo = new ProductoList();
        repo.crear(new Producto("Mesa", 50.53));
        repo.crear(new Producto("Silla", 12.4));
        repo.crear(new Producto("Lampara", 34.56));
        repo.crear(new Producto("NoteBook", 400.89));

        System.out.println("\n===== CREAR PRODUCTOS =====");
        List<Producto> productos = repo.listar();
        //clientes.forEach(c -> System.out.println(c));
        productos.forEach(System.out::println);

        System.out.println("\n===== PAGINACIÒN DE PRODUCTOS =====");
        List<Producto> paginable2 = repo.listar(1,3);
        paginable2.forEach(System.out::println);

        System.out.println("\n===== ORDENAR PRODUCTOS ASC =====");
        List<Producto> productosOrdenAsc = repo.listar("descripcion", Direccion.ASC);
        List<Producto> productosOrdenDesc = ((IOrdenable) repo).listar("descripcion", Direccion.DESC);

        for (Producto pro: productosOrdenAsc) {
            System.out.println(pro);
        }

        System.out.println("\n===== ORDENAR PRODUCTOS DESC =====");
        for (Producto pro: productosOrdenDesc) {
            System.out.println(pro);
        }

        System.out.println("\n===== ACTUALIZAR PRODUCTOS =====");
        Producto updateProducto = new Producto("Nuevo Producto", 23.45);
        updateProducto.setId(7);

        repo.editar(updateProducto);
        System.out.println(updateProducto);

        System.out.println("-----------------");
        repo.listar("nombre", Direccion.ASC).forEach(System.out::println);

        System.out.println("\n===== ELIMINAR PRODUCTO =====");
        repo.eliminar(9);
        repo.listar().forEach(System.out::println);

        System.out.println("-----------");
        System.out.println("Total Registros: " + repo.total());

    }
}
