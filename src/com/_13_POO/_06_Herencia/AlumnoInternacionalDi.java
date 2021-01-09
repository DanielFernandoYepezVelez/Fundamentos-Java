package com._13_POO._06_Herencia;

public class AlumnoInternacionalDi extends /**AlumnoInternacional*/ Alumno {

    private final void Informacion() {
        System.out.println("No Puedo Heredar De AlumnoInternacional," +
                " Por Que Es Una Clase Final, Entonces Deberia Heredar" +
                " Directamente De La Clase Alumno." +
                " Los Mètodos Con La Palabra final No Se Puedes Sobreescribir," +
                " Por Que Son Constantes Como Todos Los Miembros Que Se Declaren" +
                " Con La Palabra \"Final\".");
    }

}