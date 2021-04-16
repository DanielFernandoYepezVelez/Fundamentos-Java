package com._02_Variables._01_TiposPrimitivos._01_Enteros;

public class _01_byte {
    public static void ValoresByte() {
        byte valorNumeroByte = 54;

        /* Cuando Se Exceda El Valor O La Capacidad Máxima Del Tipo De Dato Definido
        Tendremos El Siguiente Error: */
        /* incompatible types: possible lossy conversion from int to byte */
        /* byte excederByte = 129; */

        /* Casteo O Conversión De Tipos */
        /* El 129 Es De Tipo Entero Y Lo Que Hacemos Es Castearlo O Convertirlo A Un Tipo Byte */
        /* El Resultado Que Obtendremos Es Que No Se Esta Almacenando El 129 Como Lo Habiamos Indicado,
            * Por Que El Compilador Nos Dice Que Si Estamos Seguros De Lo Que Estamos Haciendo, Ya Que Si
            * Queremos Almacenar Un Valor Que Supera El Rango Del Tipo De Dato Del Indicador, Estamos Expuestos
            * A Tener Resultados Con Imprecisiones, Así, Sea Casteado O Convertido */
        byte excederByte = (byte) 129;

        System.out.println("\n========= TIPO DE DATO PRIMITIVO \"byte\" =========");
        System.out.println("Tipo byte Corresponde En Bits A: " + Byte.SIZE);
        System.out.println("Tipo byte Corresponde En Bytes A: " + Byte.BYTES);
        System.out.println("Nùmero Minimo Aceptado: " + Byte.MIN_VALUE);
        System.out.println("Nùmero Maximo Aceptado: " + Byte.MAX_VALUE);
        System.out.println("Variable valorNumeroByte = " + valorNumeroByte);
        System.out.println("El Valor Es Muy Grande Para Lo Que Soporta El Tipo BYTE excederByte = " + excederByte + " Obtenemos Valores Con Imprecisiones Por Que Perdemos Bits");
    }
}
