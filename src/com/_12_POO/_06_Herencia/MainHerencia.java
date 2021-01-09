package com._12_POO._06_Herencia;

public class MainHerencia {
    public static void main(String[] args) {
        /** Ejemplo Casteo Mètodo De Alumno A Persona */
        Persona alumno2 = new Alumno();
        ((Alumno)alumno2).setInstitucion("Enrique Olaya Herrera");
        System.out.println("((Alumno) alumno2).getInstitucion() = " + ((Alumno) alumno2).getInstitucion());
        
        Alumno alumno = new Alumno();
        alumno.setNombre("Daniel Fernando");
        alumno.setApellido("Yepez Vèlez");
        alumno.setNotaCastellano(5.5);
        alumno.setNotaHistoria(6.3);
        alumno.setNotaMatematica(4.9);
        System.out.println("\nalumno.getNombre() + alumno.getApellido() = " + alumno.getNombre() + " " + alumno.getApellido());
        
        AlumnoInternacional alumnoI = new AlumnoInternacional();
        alumnoI.setNombre("Peter");
        alumnoI.setApellido("Goslin");
        alumnoI.setPais("Australia");
        alumnoI.setInstitucion("Instituto Nacional");
        alumnoI.setNotaIdiomas(6.8);
        alumnoI.setNotaCastellano(6.2);
        alumnoI.setNotaHistoria(5.8);
        alumnoI.setNotaMatematica(6.5);
        alumnoI.setEdad(15);
        System.out.println("\nalumnoI.getNombre() = " + alumnoI.getNombre());
        System.out.println("alumnoI.getApellido() = " + alumnoI.getApellido());
        System.out.println("alumnoI.getInstitucion() = " + alumnoI.getInstitucion());
        System.out.println("alumnoI.getPais() = " + alumnoI.getPais() + "\n");
        
        Class clase = alumnoI.getClass();
        
        while (clase.getSuperclass() != null) {
            String hija = clase.getName();
            String padre = clase.getSuperclass().getName();

            System.out.println("Yo Soy La Clase Hija Desde Donde Estoy Iniciando: " + hija);
            clase = clase.getSuperclass();
        }
        
        Profesor profesor = new Profesor();
        profesor.setNombre("Hernan Dario");
        profesor.setApellido("Garzòn Mendienta");
        profesor.setAsignatura("Matemàticas");
        System.out.println("\nprofesor.getNombre() " + "+ profesor.getApellido() " + "+ profesor.getAsignatura() = " + profesor.getNombre() + " " + profesor.getApellido() + " " + profesor.getAsignatura());
    }
}
