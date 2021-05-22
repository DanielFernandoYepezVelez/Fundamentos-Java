package com._13_POO._00_Conceptos._01_Clases;

public class Persona {
    /* Atributos De La Clase */
    String nombre;
    String apellido;

    /* Método De La Clase */
    public void desplegarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + apellido);
    }

    /* Es Posible Tener El Método Main Dentro De La Clase, Pero Lo Recomendado Es Tenerlo En Otro Archivo */
    /* public static void main(String[] args) {

    } */
}
