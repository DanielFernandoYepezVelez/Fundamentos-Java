package com._13_POO._08_Interfaces.Modelo;

public interface Imprimible {

    /** Atributos Staticos Y Constantes */
    String TEXTO_DEFECTO = "Imprimiendo Un Valor Por Defecto, Interface";

    String imprimir();

    /** Método Opcional Para La Clases Hijas JAVA (8+)
    default String imprimir() {
        return "Imprimiendo Un Valor Por Defecto";
    } */

    /** Método Static Aceptados Por Las Interfaces JAVA (8+) */
    static void imprimir(Imprimible imprimible) {
        System.out.println(imprimible.imprimir());
    }

}
