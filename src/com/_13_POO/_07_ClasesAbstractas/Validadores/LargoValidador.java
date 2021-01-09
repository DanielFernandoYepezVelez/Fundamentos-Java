package com._13_POO._07_ClasesAbstractas.Validadores;

import com._13_POO._07_ClasesAbstractas.Validadores.mensaje.IMensajeFormatiable;

public class LargoValidador extends Validador implements IMensajeFormatiable {

    private int min;
    private int max = Integer.MAX_VALUE;
    protected String mensaje = "El Campo %s Debe Tener Minimo %d Caracteres Y Máximo %d Caracteres";

    public LargoValidador() {
    }

    public LargoValidador(int min, int max) {
        this.min = min;
        this.max = max;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public void setMax(int max) {
        this.max = max;
    }

    @Override
    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    @Override
    public String getMensaje() {
        return mensaje;
    }

    @Override
    public boolean esValido(String valor) {
        //this.mensaje = String.format(this.mensaje, this.min, this.max);

        if (valor == null) {
            return true;
        }

        int largo = valor.length();
        return largo >= this.min && largo <= this.max;
    }

    @Override
    public String getMensajeFormateado(String campo) {
        return String.format(this.mensaje, campo, this.min, this.max);
    }

    /* public String getMensajeFormateado(String campo) {
        return String.format(this.mensaje, campo, this.min, this.max);
    } */

}
