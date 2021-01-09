package com._05_ParametrosArgumentos;

public class Main {
    public static void main(String[] args) {

        _01_PorValor.parametrosValor();
        _02_PorReferencia.parametrosReferencia();

        System.out.println("\n========== PASANDO ARGUMENTOS A LOS PARAMETROS DEFINIDOS ANTERIORMENTE POR REFERENCIA OBJETO(CLASES) ==========");
        _03_PorReferenciaClase persona = new _03_PorReferenciaClase();

        System.out.println("Persona Nombre No Definido Con Valor Inicial: " + persona.getNombre());

        persona.setNombre("Daniel Fernando Yepez Velez");
        System.out.println("Nombre Persona Por Referencia Clase = " + persona.getNombre());

        persona.setNombre("Andres Felipe Guzman");
        System.out.println("Nuevo Nombre Persona Por Referencia Clase = " + persona.getNombre());
    }
}
