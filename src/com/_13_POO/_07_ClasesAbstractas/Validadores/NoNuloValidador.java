package com._13_POO._07_ClasesAbstractas.Validadores;

public class NoNuloValidador extends Validador{

    protected String mensaje = "El Campo %s No Puede Ser Nulo";

    @Override
    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    @Override
    public String getMensaje() {
        return this.mensaje;
    }

    @Override
    public boolean esValido(String valor) {
        return (valor != null);
    }

}
