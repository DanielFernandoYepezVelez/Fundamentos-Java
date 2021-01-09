package com._13_POO._04_Factura.Modelo;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Factura {

    private int idFolio;
    private Cliente cliente;
    private int indiceItems;
    private ItemFactura[] items;
    private String descripcion;
    private Date fecha;

    private static int ultimoFolio;
    public static final int MAX_ITEMS = 10;

    public Factura(Cliente cliente, String descripcion) {
        this.idFolio = ++Factura.ultimoFolio;
        this.items = new ItemFactura[Factura.MAX_ITEMS];
        this.cliente = cliente;
        this.descripcion = descripcion;
        this.fecha = new Date();
    }

    public int getIdFolio() {
        return idFolio;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public ItemFactura[] getItems() {
        return items;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Date getFecha() {
        return fecha;
    }

    /* public void setFecha(Date fecha) {
        this.fecha = fecha;
    } */

    public void addItemFactura(ItemFactura item) {
        if(indiceItems < MAX_ITEMS) {
            this.items[this.indiceItems++] = item;
        }
    }

    public double calcularTotal() {
        double total = 0;

        for (ItemFactura item: this.items) {
            if(item == null) {
                continue;
            }

            total += item.calcularImporte();
        }

        return total;
    }

    public String verDetalle() {
        StringBuilder sb = new StringBuilder("Factura Nº: ");
        sb.append(this.idFolio)
                .append("\nCliente: ")
                .append(this.cliente.getNombre())
                .append("\t RUT: ")
                .append(this.cliente.getRut())
                .append("\nDescripcion: ")
                .append(this.descripcion)
                .append("\n");

        SimpleDateFormat df = new SimpleDateFormat("dd 'De' MMMM, YYYY");

        sb.append("Fecha Emisiòn: ")
                .append(df.format(this.fecha))
                .append("\n")
                .append("\n#\tNOMBRE\t$\tCANTIDAD\tTOTAL\n");

        for (ItemFactura item: this.items) {
            if(item == null) {
                continue;
            }

            sb.append(item)
                .append("\n");

            /*sb.append(item.getProducto().getIdProducto())
                    .append("\t")
                    .append(item.getProducto().getNombre())
                    .append("\t")
                    .append(item.getProducto().getPrecio())
                    .append("\t")
                    .append(item.getCantidad())
                    .append("\t")
                    .append(item.calcularImporte())
                    .append("\n");*/

        }

        sb.append("\nGran Total: ")
                .append(this.calcularTotal());

        return sb.toString();
    }

    @Override
    public String toString() {
        return this.verDetalle();
    }
}
