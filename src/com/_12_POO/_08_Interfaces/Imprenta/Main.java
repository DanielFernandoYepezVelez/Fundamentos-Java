package com._12_POO._08_Interfaces.Imprenta;

import com._12_POO._08_Interfaces.Modelo.*;

public class Main {
    public static void main(String[] args) {
        Curriculo cv = new Curriculo(new Persona("Daniel Fernando", "Yepez Vèlez"),
                                            "Desarrollador", "Resumen Laboral...");
        cv.addExperiencia("Java")
            .addExperiencia("Angular")
            .addExperiencia("Oracle DBA")
            .addExperiencia("Spring Framework")
            .addExperiencia("Desarrollador FullStack");

        Libro libro = new Libro(new Persona("Erich", "Gama"),
                                    "Patrones De Diseños: Elementos Reusables POO",
                                        Genero.PROGRAMACION);

        libro.addPagina(new Pagina("Patròn Singleton"))
                .addPagina(new Pagina("Patròn Observador"))
                .addPagina(new Pagina("Patròn Fabrica"))
                .addPagina(new Pagina("Patròn Compositor"));

        Informe info = new Informe(new Persona("Martin", "Fowler"),
                                    new Persona("James", "Gosling"),
                                        "Estudio Sobre MicroServicios");

        Imprimible.imprimir(cv);
        Imprimible.imprimir(info);
        Imprimible.imprimir(libro);

        /** Ejemplo De Una Clase Anonima Que Implementa La Interface Imprimible */
        Imprimible.imprimir(new Imprimible() {
            @Override
            public String imprimir() {
                return "Hola Que Tal!!! Imprimiendo Una Clase Genérico De Una Clase Anònima";
            }
        });

        System.out.println(Imprimible.TEXTO_DEFECTO);
    }

    /* public static void imprimir(Imprimible imprimible) {
        System.out.println(imprimible.imprimir());
    } */
}
