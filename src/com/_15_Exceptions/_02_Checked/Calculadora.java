package com._15_Exceptions._02_Checked;

public class Calculadora {

    public double dividir(int numerador, int denominador) throws DivisionPorZeroException {
        if(denominador == 0) {
            throw new DivisionPorZeroException("No Se Puede Dividir Por Cero");
        }

        return numerador/ (double)denominador;
    }

    public double dividir(String numerador, String denominador)
            throws DivisionPorZeroException, FormatoNumeroException {

        try {
            int num = Integer.parseInt(numerador);
            int den = Integer.parseInt(denominador);
            return this.dividir(num, den);

        } catch (NumberFormatException e) {
            throw new FormatoNumeroException("Debe Ingresar Un Númerador Y Denominador");
        }
    }
}
