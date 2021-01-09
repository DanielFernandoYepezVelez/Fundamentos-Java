package com._15_CollectionAPI._01_Set.TreeSet.model;

public class Alumno implements Comparable<Alumno>{

    private String nombre;
    //private int nota;
    private Integer nota;

    public Alumno() {
    }

    public Alumno(String nombre, int nota) {
        this.nombre = nombre;
        this.nota = nota;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getNota() {
        return nota;
    }

    public void setNota(Integer nota) {
        this.nota = nota;
    }

    @Override
    public String toString() {
        return "nombre='" + nombre + ", nota=" + nota;
    }

    @Override
    public int compareTo(Alumno a) {
        // COMPARANDO STRINGS
        /* if (this.nombre == null) {
            return 0;
        }

        return this.nombre.compareTo(a.nombre); */

        // COMPARANDO PRIMITIVOS INT
        /* int valor = 0;

        if(this.nota == a.nota) {
            valor = 0;
        } else if (this.nota > a.nota) {
            valor = 1;
        } else if (this.nota < a.nota) {
            valor = -1;
        }

        return valor;
        */

        // COMPARANDO WRAPPERS INTEGER
        if (this.nota == null) {
            return 0;
        }

        return this.nota.compareTo(a.nota);
    }
}
