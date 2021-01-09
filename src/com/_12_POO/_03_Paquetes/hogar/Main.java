package com._12_POO._03_Paquetes.hogar;

import com._12_POO._03_Paquetes.jardin.Perro;

/** Imports Staticos */
import static com._12_POO._03_Paquetes.hogar.Persona.saludar;

public class Main {
    public static void main(String[] args) {
        Persona persona = new Persona();
        String saludo = saludar();
        System.out.println("saludo = " + saludo);
        
        Perro perro = new Perro();
    }
}
