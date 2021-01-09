package com._12_POO._01_AutomovilExplicacion;

public enum Color {
    /** Auto-invocando El Constructor Pero Del ENUM Y Paso El Argumento Del Color */
    ROJO("Rojo"),
    AMARILLO("Amarillo"),
    AZUL("Azul"),
    BLANCO("Blanco"),
    GRIS("Gris"),
    NARANJO("Naranjo");

    /** Atributos */
    private final String color;

    /** Constructor */
    Color(String color) {
        this.color = color;
    }

    /** Accedo Al Color Por Medio De Los Getters Como En Una Clase Normal */
    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return this.color;
    }
}