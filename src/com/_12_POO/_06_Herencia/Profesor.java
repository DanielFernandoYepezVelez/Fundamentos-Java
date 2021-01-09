package com._12_POO._06_Herencia;

public class Profesor extends Persona {

    private String asignatura;

    public Profesor() {
        System.out.println("Profesor: Inicializando Constructor Por Defecto");
    }

    public Profesor(String nombre, String apellido) {
        super(nombre, apellido);
    }

    public Profesor(String nombre, String apellido, String asignatura) {
        super(nombre, apellido);
        this.asignatura = asignatura;
    }

    public String getAsignatura() {
        return asignatura;
    }

    public void setAsignatura(String asignatura) {
        this.asignatura = asignatura;
    }

    @Override
    public String saludar() {
        String saludar = super.saludar();
        return saludar + "Soy Un Profesor " + "De: " + this.asignatura + " Y Mi Nombre Es: " + super.getNombre();
    }

    @Override
    public String toString() {
        return super.toString() + "\nasignatura='" + asignatura + '\'';
    }
}
