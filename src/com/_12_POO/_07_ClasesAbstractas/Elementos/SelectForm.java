package com._12_POO._07_ClasesAbstractas.Elementos;

import com._12_POO._07_ClasesAbstractas.Elementos.Select.Opcion;

import java.util.ArrayList;
import java.util.List;

public class SelectForm extends ElementoForm {

    private List<Opcion> opciones;

    public SelectForm(String nombre) {
        super(nombre);
        this.opciones = new ArrayList<Opcion>();
    }

    public SelectForm(String nombre, List<Opcion> opciones) {
        super(nombre);
        this.opciones = opciones;
    }

    public SelectForm addOpcion(Opcion opcion) {
        this.opciones.add(opcion);
        return this;
    }

    @Override
    public String dibujarHtml() {
        StringBuilder sb = new StringBuilder("<select ");
        sb.append(" name='")
                .append(super.nombre)
                .append("'>");

        for (Opcion opcion: this.opciones) {
            sb.append("\n<option value='")
                    .append(opcion.getValor())
                    .append("'");

            if (opcion.isSelected()) {
                sb.append(" selected");
                super.valor = opcion.getValor();
            }

            sb.append(">")
                    .append(opcion.getNombre())
                    .append("</option>");
        }
        sb.append("</select>");
        return sb.toString();
    }

}
