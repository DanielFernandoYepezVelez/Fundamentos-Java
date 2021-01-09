package com._16_CollectionAPI._02_List.modelo;

import java.util.Objects;

public class Alumno implements Comparable<Alumno> {
    private String nombre;
    private Integer edad;

    public Alumno(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "nombre=" + nombre + ", edad=" + edad;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Alumno alumno = (Alumno) o;
        return Objects.equals(nombre, alumno.nombre) && Objects.equals(edad, alumno.edad);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, edad);
    }

    @Override
    public int compareTo(Alumno a) {
        if(this.edad == null) {
            return 0;
        }

        return this.edad.compareTo(a.edad);
    }
}
