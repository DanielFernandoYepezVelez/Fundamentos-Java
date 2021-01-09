package com._13_POO._07_ClasesAbstractas.Validadores;

public class NumeroValidador extends Validador {

    protected String mensaje = "El Campo %s Debe Ser Un Nùmero";

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
        try {
            Integer.parseInt(valor);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
