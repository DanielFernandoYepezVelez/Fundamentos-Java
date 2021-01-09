package com._13_POO._03_Paquetes.jardin;

import com._13_POO._03_Paquetes.hogar.Persona;

public class Perro {

    protected String nombre;
    protected String raza;

    String jugar(Persona persona) {
        return persona.lanzarPelota();
    }

}
