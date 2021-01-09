package com._12_POO._02_AutomovilEjercicio;

public class Persona {

    private String nombre;
    private String apellido;

    public Persona(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    @Override
    public String toString() {
        return this.nombre + " " + this.apellido;
    }

}
