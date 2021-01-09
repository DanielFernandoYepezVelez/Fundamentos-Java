package com._13_POO._04_Factura.Modelo;

public class Producto {

    private int idProducto;
    private String nombre;
    private double precio;

    private static int ultimoIdProducto;

    public Producto() {
        this.idProducto = ++Producto.ultimoIdProducto;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return idProducto +
                "\t" + nombre +
                "\t" + precio;
    }
}