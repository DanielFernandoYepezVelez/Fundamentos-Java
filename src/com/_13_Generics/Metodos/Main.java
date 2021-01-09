package com._13_Generics.Metodos;

import com._13_Generics.Metodos._01_GenericosParametros;
import com._13_Generics.Metodos._02_GenericosLimites;
import com._13_Generics.Metodos._03_GenericosComodines;
import com._13_Generics.Metodos._04_GenericosEjercicio;

public class Main {
    public static void main(String[] args) {

        _01_GenericosParametros.genericosOgenerales();
        _02_GenericosLimites.genericosLimites();
        _03_GenericosComodines.genericosComodines();

        System.out.println("\nMAXIMO ENTRE 1, 9, 4: ");
        System.out.println(_04_GenericosEjercicio.maximo(1, 9, 4));

        System.out.println("MAXIMO ENTRE 3.9, 11.6, 7.78: ");
        System.out.println(_04_GenericosEjercicio.maximo(3.9, 11.6, 7.78));

        System.out.println("MAXIMO ENTRE Zanahoria, Arándanos, Manzana: ");
        System.out.println(_04_GenericosEjercicio.maximo("zanahoria", "arándanos", "manzana"));
    }
}
