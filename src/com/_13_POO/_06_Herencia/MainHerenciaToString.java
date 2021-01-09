package com._13_POO._06_Herencia;

public class MainHerenciaToString {
    public static void main(String[] args) {
        Alumno alumno = new Alumno("Daniel Fernando", "Yepez Vèlez", 27, "Instituto Nacional");
        alumno.setNotaCastellano(5.5);
        alumno.setNotaHistoria(6.3);
        alumno.setNotaMatematica(4.9);
        alumno.setEmail("daniel@correo.com");

        AlumnoInternacional alumnoInternacional = new AlumnoInternacional("Hugo Andrès", "Marshall Rojas", "Colombia");
        alumnoInternacional.setEdad(22);
        alumnoInternacional.setInstitucion("Enrique Olaya Herrera");
        alumnoInternacional.setNotaIdiomas(6.8);
        alumnoInternacional.setNotaCastellano(6.2);
        alumnoInternacional.setNotaHistoria(5.8);
        alumnoInternacional.setNotaMatematica(6.5);
        alumnoInternacional.setEmail("danielInternacional@correo.com");

        Profesor profesor = new Profesor("Carlos Camilo", "Rosado Bustamante", "Matematicas");
        profesor.setEdad(37);
        profesor.setEmail("danielProfesor@correo.com");

        MainHerenciaToString.imprimir(alumno);
        MainHerenciaToString.imprimir(alumnoInternacional);
        MainHerenciaToString.imprimir(profesor);
    }

    public static void imprimir(Persona persona) {
        System.out.println("===============================");
        System.out.println(persona);
    }
}
