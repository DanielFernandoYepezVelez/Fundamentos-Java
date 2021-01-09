package com._12_POO._06_Herencia;

public class MainHerenciaConstructores {
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

        MainHerenciaConstructores.imprimir(alumno);
        MainHerenciaConstructores.imprimir(alumnoInternacional);
        MainHerenciaConstructores.imprimir(profesor);
    }

    public static void imprimir(Persona persona) {
        System.out.println("\nImprimiendo Datos Del Tipo Persona General =>");
        System.out.println("Nombre: " + persona.getNombre()
                + "\nApellido: " + persona.getApellido()
                + "\nEdad: " + persona.getEdad()
                + "\nEmail: " + persona.getEmail());

        if (persona instanceof Alumno) {
            System.out.println("\nImprimiendo Datos Del Tipo Alumno =>");
            System.out.println("Instituciòn: " + ((Alumno) persona).getInstitucion());
            System.out.println("Nota Matemàticas: " + ((Alumno) persona).getNotaMatematica());
            System.out.println("Nota Historia: " + ((Alumno) persona).getNotaHistoria());
            System.out.println("Nota Castelllano: " + ((Alumno) persona).getNotaCastellano());

            if (persona instanceof AlumnoInternacional) {
                System.out.println("\nImprimiendo Datos Del Tipo Alumno Internacional =>");
                System.out.println("Nota Idioma: " + ((AlumnoInternacional) persona).getNotaIdiomas());
                System.out.println("Pais: " + ((AlumnoInternacional) persona).getPais());
            }

            System.out.println("\n=============== SOBRE ESCRITURA PROMEDIO =====================");
            System.out.println("Promedio: " + ((Alumno) persona).calcularPromedio());
            System.out.println("=============== SOBRE ESCRITURA PROMEDIO =====================");
        }

        if (persona instanceof Profesor) {
            System.out.println("\nImprimiendo Datos Del Tipo Profesor =>");
            System.out.println("Asignatura: " + ((Profesor) persona).getAsignatura());
        }

        System.out.println("\n=============== SOBRE ESCRITURA SALUDAR =====================");
        System.out.println(persona.saludar());
        System.out.println("=============== SOBRE ESCRITURA SALUDAR =====================");
    }
}
