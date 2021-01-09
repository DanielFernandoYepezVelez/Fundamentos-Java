package com._13_POO._07_ClasesAbstractas.Elementos;

public class TextAreaForm extends ElementoForm {

    private int filas;
    private int columnas;

    public TextAreaForm(String nombre) {
        super(nombre);
    }

    public TextAreaForm(String nombre, int filas, int columnas) {
        super(nombre);
        this.filas = filas;
        this.columnas = columnas;
    }

    public int getFilas() {
        return filas;
    }

    public void setFilas(int filas) {
        this.filas = filas;
    }

    public int getColumnas() {
        return columnas;
    }

    public void setColumnas(int columnas) {
        this.columnas = columnas;
    }

    @Override
    public String dibujarHtml() {
        return  "<textarea name='" + super.nombre +
                "' cols=''" + this.columnas +
                " rows='" + this.filas + "'>" + super.valor + "</textarea>";
    }

}
