package com._02_Variables._01_TiposPrimitivos._01_Enteros;

public class _03_int {
    public static void ValoresInt() {
        int valorNumeroInt = 167;

        /* Cuando Se Exceda El Valor O La Capacidad Máxima Del Tipo De Dato Definido
        Tendremos El Siguiente Error: */
        /* integer number too large */
        /* int excederInt = 2147483648; */

        /* Casteo O Conversión De Tipos */
        /* El 2147483649 Es De Tipo Long Y Lo Que Hacemos Es Castearlo O Convertirlo A Un Tipo int */
        /* El Resultado Que Obtendremos Es Que No Se Esta Almacenando El 2147483649 Como Lo Habiamos Indicado,
         * Por Que El Compilador Nos Dice Que Si Estamos Seguros De Lo Que Estamos Haciendo, Ya Que Si
         * Queremos Almacenar Un Valor Que Supera El Rango Del Tipo De Dato Del Indicador, Estamos Expuestos
         * A Tener Resultados Con Imprecisiones, Así, Sea Casteado O Convertido */
        /* Aquí En Esta Parte Tenemos Un Caso Especial, Por Que Aunque Es Casteado O Convertido A Tipo Int,
         * Sigue Mostrandome El Error, Por Ende Debo Agregar La Literal Al Final Del Valor De Tipo Long O Double */
        int excederInt = (int) 2147483649L;

        System.out.println("\n========= TIPO DE DATO PRIMITIVO \"int\" =========");
        System.out.println("Tipo int Corresponde En Bits A: " + Integer.SIZE);
        System.out.println("Tipo int Corresponde En Bytes A: " + Integer.BYTES);
        System.out.println("Nùmero Minimo Aceptado: " + Integer.MIN_VALUE);
        System.out.println("Nùmero Maximo Aceptado: " + Integer.MAX_VALUE);
        System.out.println("Variable valorNumeroInt = " + valorNumeroInt);
        System.out.println("El Valor Es Muy Grande Para Lo Que Soporta El Tipo INT excederInt = " + excederInt + " Obtenemos Valores Con Imprecisiones Por Que Perdemos Bits");
    }
}
