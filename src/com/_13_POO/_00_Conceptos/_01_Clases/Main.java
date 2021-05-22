package com._13_POO._00_Conceptos._01_Clases;

public class Main {
    public static void main(String[] args) {
        /* Aquí Estoy Declarando Solo Una Variable Con El Tipo De Dato Persona, PERO No Es Un Objeto */
        Persona persona1;

        /* Aquí SI Estoy Creando Un Objeto O Creando Una Instancia De La Clase Persona */
        persona1 = new Persona();
        /* La Posición De La Memoria Ram En Donde Se Esta Almacenando Este Objeto */
        System.out.println("persona1 = " + persona1);

        persona1.nombre = "Daniel Fernando";
        persona1.apellido = "Yepez Vélez";
        persona1.desplegarInformacion();

        System.out.println("\n--------------------------------");

        Persona persona2 = new Persona();
        /* La Posición De La Memoria Ram En Donde Se Esta Almacenando Este Objeto */
        System.out.println("persona2 = " + persona2);

        /* Los Valores Que Entrega Son Nulos, Por La Ausencia De Valor */
        System.out.println("Nombre: " + persona2.nombre);
        System.out.println("Apellido: " + persona2.apellido);

        persona2.nombre = "Karla";
        persona2.apellido = "Henado";
        persona2.desplegarInformacion();
    }
}
