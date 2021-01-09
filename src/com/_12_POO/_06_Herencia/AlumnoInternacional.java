package com._12_POO._06_Herencia;

public final class AlumnoInternacional extends Alumno {

    private String pais;
    private double notaIdiomas;

    public AlumnoInternacional() {
        System.out.println("Alumno Internacional: Inicializando Constructor Por Defecto");
    }

    public AlumnoInternacional(String nombre, String apellido) {
        super(nombre, apellido);
    }

    public AlumnoInternacional(String nombre, String apellido, String pais) {
        super(nombre, apellido);
        this.pais = pais;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public double getNotaIdiomas() {
        return notaIdiomas;
    }

    public void setNotaIdiomas(double notaIdiomas) {
        this.notaIdiomas = notaIdiomas;
    }

    @Override
    public double calcularPromedio() {
        //System.out.println("Calcular Promedio: " + AlumnoInternacional.class.getCanonicalName());
        return ((super.calcularPromedio() * 3) + this.notaIdiomas) / 4;
    }

    @Override
    public String saludar() {
        return "Hola Que Tal, Soy Alumno Internacional " + "De " + this.pais + " Y Mi Nombre Es: " + super.getNombre();
    }

    @Override
    public String toString() {
        return super.toString() + "\npais='" + pais + '\'' +
                ", notaIdiomas=" + notaIdiomas;
    }
}
