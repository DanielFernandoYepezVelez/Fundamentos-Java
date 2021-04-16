package com._02_Variables._01_TiposPrimitivos._01_Enteros;

public class _02_short {
    public static void ValoresShort() {
        short valorNumeroShort = 32;

        /* Cuando Se Exceda El Valor O La Capacidad Máxima Del Tipo De Dato Definido
        Tendremos El Siguiente Error: */
        /* incompatible types: possible lossy conversion from int to short */
        /* short excederShort = 32768; */

        /* Casteo O Conversión De Tipos */
        /* El 32768 Es De Tipo Entero Y Lo Que Hacemos Es Castearlo O Convertirlo A Un Tipo short */
        /* El Resultado Que Obtendremos Es Que No Se Esta Almacenando El 32768 Como Lo Habiamos Indicado,
         * Por Que El Compilador Nos Dice Que Si Estamos Seguros De Lo Que Estamos Haciendo, Ya Que Si
         * Queremos Almacenar Un Valor Que Supera El Rango Del Tipo De Dato Del Indicador, Estamos Expuestos
         * A Tener Resultados Con Imprecisiones, Así, Sea Casteado O Convertido */
        short excederShort = (short) 32768;

        System.out.println("\n========= TIPO DE DATO PRIMITIVO \"short\" =========");
        System.out.println("Tipo short Corresponde En Bits A: " + Short.SIZE);
        System.out.println("Tipo short Corresponde En Bytes A: " + Short.BYTES);
        System.out.println("Nùmero Minimo Aceptado: " + Short.MIN_VALUE);
        System.out.println("Nùmero Maximo Aceptado: " + Short.MAX_VALUE);
        System.out.println("Variable valorNumeroShort = " + valorNumeroShort);
        System.out.println("El Valor Es Muy Grande Para Lo Que Soporta El Tipo SHORT excederShort = " + excederShort + " Obtenemos Valores Con Imprecisiones Por Que Perdemos Bits");
    }
}
