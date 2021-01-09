package com._13_POO._08_Interfaces.Modelo;

public class Informe extends Hoja implements Imprimible {

    private Persona autor;
    private Persona revisor;

    public Informe(Persona autor, Persona revisor, String contenido) {
        super(contenido);
        this.autor = autor;
        this.revisor = revisor;
    }

    @Override
    public String imprimir() {
        return "Informe Escrito Por: " + this.autor +
                "\nRevisado Por: " + this.revisor +
                "\n" + super.contenido;
    }

}
