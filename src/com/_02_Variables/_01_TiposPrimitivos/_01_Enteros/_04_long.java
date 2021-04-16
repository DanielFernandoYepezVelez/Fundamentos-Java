package com._02_Variables._01_TiposPrimitivos._01_Enteros;

public class _04_long {
    public static void ValoresLong() {
        long valorNumeroLong = 2147483648L;

        /* Cuando Se Exceda El Valor O La Capacidad Máxima Del Tipo De Dato Definido
        Tendremos El Siguiente Error: */
        /* integer number too large */
        /* int excederLong = 9223372036854775809; */

        /* Casteo O Conversión De Tipos */
        /* El 9223372036854775809 Es De Tipo Punto Flotante O Double Y Lo Que Hacemos Es Castearlo O Convertirlo A Un Tipo Long */
        /* El Resultado Que Obtendremos Es Que No Se Esta Almacenando El 9223372036854775809 Como Lo Habiamos Indicado,
         * Por Que El Compilador Nos Dice Que Si Estamos Seguros De Lo Que Estamos Haciendo, Ya Que Si
         * Queremos Almacenar Un Valor Que Supera El Rango Del Tipo De Dato Del Indicador, Estamos Expuestos
         * A Tener Resultados Con Imprecisiones, Así, Sea Casteado O Convertido */
        /* Aquí En Esta Parte Tenemos Un Caso Especial, Por Que Aunque Es Casteado O Convertido A Tipo long,
         * Sigue Mostrandome El Error, Por Ende Debo Agregar La Literal Al Final Del Valor De Tipo Float O Double */
        long excederLong = (long) 9223372036854775809D;

        System.out.println("\n========= TIPO DE DATO PRIMITIVO \"long\" =========");
        System.out.println("Tipo long Corresponde En Bits A: " + Long.SIZE);
        System.out.println("Tipo long Corresponde En Bytes A: " + Long.BYTES);
        System.out.println("Nùmero Minimo Aceptado: " + Long.MIN_VALUE);
        System.out.println("Nùmero Maximo Aceptado: " + Long.MAX_VALUE);
        System.out.println("Variable valorNumeroLong = " + valorNumeroLong);
        System.out.println("El Valor Es Muy Grande Para Lo Que Soporta El Tipo LONG excederLong = " + excederLong + " Obtenemos Valores Con Imprecisiones Por Que Perdemos Bits");
    }
}
