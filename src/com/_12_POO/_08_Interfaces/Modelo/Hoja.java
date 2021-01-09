package com._12_POO._08_Interfaces.Modelo;

abstract public class Hoja {

    protected String contenido;

    public Hoja(String contenido) {
        this.contenido = contenido;
    }

    abstract public String imprimir();

}
