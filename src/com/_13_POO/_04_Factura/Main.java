package com._13_POO._04_Factura;

import java.util.Scanner;
import com._13_POO._04_Factura.Modelo.*;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        Cliente cliente = new Cliente();
        cliente.setRut("8883833-5");
        cliente.setNombre("Daniel Fernando");

        System.out.print("Ingrese La Descripciòn De La Factura: ");
        String descripcion = teclado.nextLine();

        Factura factura = new Factura(cliente, descripcion);

        Producto producto;
        String nombre;
        double precio;
        int cantidad;

        System.out.println();

        for (int i = 0; i < 5; i++) {
            producto = new Producto();

            System.out.print("Ingrese El Nombre Del Producto Nº " + producto.getIdProducto() + ": ");
            nombre = teclado.nextLine();
            producto.setNombre(nombre);

            System.out.print("Ingrese El Precio: ");
            precio = teclado.nextDouble();
            producto.setPrecio(precio);

            System.out.print("Ingrese La Cantidad: ");
            cantidad = teclado.nextInt();

            ItemFactura item = new ItemFactura(producto, cantidad);
            factura.addItemFactura(item);

            System.out.println();
            teclado.nextLine(); // CLAVE PARA EVITAR EL SALTO DE LINEA
        }

        // System.out.println(factura.verDetalle());
        System.out.println(factura);
    }
}
