package com._12_POO._07_ClasesAbstractas.Elementos;

import com._12_POO._07_ClasesAbstractas.Validadores.LargoValidador;
import com._12_POO._07_ClasesAbstractas.Validadores.Validador;
import com._12_POO._07_ClasesAbstractas.Validadores.mensaje.IMensajeFormatiable;

import java.util.ArrayList;
import java.util.List;

abstract public class ElementoForm {

    protected String valor;
    protected String nombre;

    private List<Validador> validadores;
    private List<String> errores;

    public ElementoForm() {
        this.validadores = new ArrayList<Validador>();
        this.errores = new ArrayList<String>();
    }

    public ElementoForm(String nombre) {
        this();
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public List<String> getErrores() {
        return errores;
    }

    public ElementoForm addValidador(Validador validador) {
        this.validadores.add(validador);
        return this;
    }

    public boolean esValido() {
        for (Validador valid: this.validadores) {

            if(!valid.esValido(this.valor)) {

                if(valid instanceof IMensajeFormatiable) {
                    this.errores.add(((LargoValidador) valid).getMensajeFormateado(this.nombre));

                } else {
                    this.errores.add(String.format(valid.getMensaje(), this.nombre));
                }
            }
        }

        return this.errores.isEmpty();
    }

    abstract public String dibujarHtml();
}
