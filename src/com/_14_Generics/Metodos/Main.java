package com._14_Generics.Metodos;

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
