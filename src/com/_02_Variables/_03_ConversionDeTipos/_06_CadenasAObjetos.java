package com._02_Variables._03_ConversionDeTipos;

public class _06_CadenasAObjetos {
    public static void cadenasAobjetos() {
        String valorTvLcd = "67000";
        Integer valorTV = Integer.valueOf(valorTvLcd);

        System.out.println("\n********** \"Conversiòn De Cadenas A Objetos(valueOf())\" **********");
        System.out.println("NùmeroCadena = " + valorTvLcd);
        System.out.println("NumeroObjeto = " + valorTV);
    }
}
