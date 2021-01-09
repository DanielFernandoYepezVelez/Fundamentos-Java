package com._13_POO._03_Paquetes.jardin;

import com._13_POO._03_Paquetes.hogar.*;
//import com._04_POO._03_Paquetes.hogar.Gato;
//import com._04_POO._03_Paquetes.hogar.Persona;

/** Imports Staticos Asi No Tengo Que Poner El Nombre De La Clase */
import static com._13_POO._03_Paquetes.hogar.Persona.*;
//import static com._04_POO._03_Paquetes.hogar.Persona.saludar;
//import static com._04_POO._03_Paquetes.hogar.Persona.GENERO_FEMENINO;
//import static com._04_POO._03_Paquetes.hogar.Persona.GENERO_MASCULINO;

/** Imports Staticos De Un Enum Asi No Tengo Que Poner El Nombre Del Mismo */
import static com._13_POO._03_Paquetes.hogar.ColorPelo.*;
//import static com._04_POO._03_Paquetes.hogar.ColorPelo.NEGRO;
//import static com._04_POO._03_Paquetes.hogar.ColorPelo.CAFE;
//import static com._04_POO._03_Paquetes.hogar.ColorPelo.RUBIO;

public class Main {
    public static void main(String[] args) {
        /** FORMA #1 DE IMPORTAR UNA CLASE DE OTRO PAQUETE */
        //com._04_POO._03_Paquetes.Hogar.Persona persona = new com._04_POO._03_Paquetes.Hogar.Persona();

        /** FORMA #2 DE IMPORTAR UNA CLASE DE OTRO PAQUETE */
        Persona persona = new Persona();
        persona.setNombre("Daniel Fernando");
        persona.setApellido("Yepez Vélez");
        //persona.setColorPelo(ColorPelo.NEGRO);
        persona.setColorPelo(NEGRO);

        String saludando = saludar();
        String generoMujer = GENERO_FEMENINO;
        String generoMasculino = GENERO_MASCULINO;

        System.out.println("saludando Estatico = " + saludando);
        System.out.println("generoMujer = " + generoMujer);
        System.out.println("generoMasculino = " + generoMasculino);
        System.out.println("persona.getColorPelo() = " + persona.getColorPelo());
        System.out.println("persona.getNombre() + persona.getApellido() = " + persona.getNombre() + " " + persona.getApellido());
        
        Perro perro = new Perro();
        perro.nombre = "Tobby";
        perro.raza = "Pomeran";
        String jugando = perro.jugar(persona);
        System.out.println("jugando = " + jugando);
    }
}
