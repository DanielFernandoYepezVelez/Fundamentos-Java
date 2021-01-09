package com._12_POO._08_Interfaces.Modelo;

import java.util.ArrayList;
import java.util.List;

public class Curriculo extends Hoja implements Imprimible {

    private Persona persona;
    private String carrera;
    private List<String> experiencias;

    public Curriculo(Persona persona, String carrera, String contenido) {
        super(contenido);
        this.persona = persona;
        this.carrera = carrera;
        this.experiencias = new ArrayList<>();
    }

    public Curriculo addExperiencia(String exp) {
        this.experiencias.add(exp);
        return this;
    }

    @Override
    public String imprimir() {
        StringBuilder sb = new StringBuilder();

        sb.append(persona)
                .append("\n")
                .append("Resumen: ").append(super.contenido)
                .append("\n").append("Profesiòn: ")
                .append(this.carrera).append("\n")
                .append("Experiencia: \n");

        for (String exp: this.experiencias) {
            sb.append(" - ").append(exp).append("\n");
        }

        return sb.toString();
    }

}
