package com._13_POO._07_ClasesAbstractas.Validadores;

public class EmailValidador extends Validador{

    protected String mensaje = "El Campo %s Tiene Un Formato De Correo Invàlido";
    private final static String EMAIL_REGEX = "^(.+)@(.+)$";

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
        return valor.matches(EMAIL_REGEX);
    }

}
