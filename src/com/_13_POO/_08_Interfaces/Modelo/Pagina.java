package com._13_POO._08_Interfaces.Modelo;

public class Pagina extends Hoja implements Imprimible {

    public Pagina(String contenido) {
        super(contenido);
    }

    @Override
    public String imprimir() {
        return this.contenido;
    }
}
