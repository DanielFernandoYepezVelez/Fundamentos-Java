package com._02_Variables._01_TiposPrimitivos._02_Decimales;

public class _05_float {
    public static void ValoresFloat() {
        float valorNumeroFloat = 9223372036e7F;
        float valorNumeroFloat2 = 1.5e-10f; // 0.00000000015f

        /* Cuando Se Exceda El Valor O La Capacidad Máxima Del Tipo De Dato Definido
        Tendremos El Siguiente Error: */
        /* floating point number too large */
        /* int excederFloat = 3.4028236E38F; */

        /* Casteo O Conversión De Tipos */
        /* El 3.4028236E38F Es De Tipo Punto Flotante, Especificamente float Y Lo Que Hacemos Es Definir
         * El Valor De Ese Float Como Double Y Luego Lo Casteamos A Float */
        /* El Resultado Que Obtendremos Es Que No Se Esta Almacenando El 3.4028236E38F Como Lo Habiamos Indicado,
         * Por Que El Compilador Nos Dice Que Si Estamos Seguros De Lo Que Estamos Haciendo, Ya Que Si
         * Queremos Almacenar Un Valor Que Supera El Rango Del Tipo De Dato Del Indicador, Estamos Expuestos
         * A Tener Resultados Con Imprecisiones, Así, Sea Casteado O Convertido */
        float excederFloat = (float) 3.4028236E38;

        System.out.println("\n========= TIPO DE DATO PRIMITIVO \"float\" =========");
        System.out.println("Tipo float Corresponde En Bits A: " + Float.SIZE);
        System.out.println("Tipo float Corresponde En Bytes A: " + Float.BYTES);
        System.out.println("Nùmero Minimo Aceptado: " + Float.MIN_VALUE); // Valor Minimo Tenemos -45 Posiciones A La Izquierda
        System.out.println("Nùmero Maximo Aceptado: " + Float.MAX_VALUE); // Valor Maximo Tenemos 38 Posiciones A La Derecha
        System.out.println("Variable valorNumeroFloat = " + valorNumeroFloat);
        System.out.println("Variable valorNumeroFloat2 = " + valorNumeroFloat2);
        System.out.println("El Valor Es Muy Grande Para Lo Que Soporta El Tipo FLOAT excederFloat = " + excederFloat + " Obtenemos Valores Con Imprecisiones Por Que Perdemos Bits");
    }
}
