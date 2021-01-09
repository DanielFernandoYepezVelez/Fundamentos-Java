package com._14_Exceptions._02_Checked;

public class DivisionPorZeroException extends Exception {
    public DivisionPorZeroException(String mensaje) {
        super(mensaje);
    }
}
