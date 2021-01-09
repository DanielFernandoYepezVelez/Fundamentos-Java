package com._02_Variables._05_TiposReferenciaObjeto;

public class _03_WrapperInteger {
        public static Integer valorDefecto;

    public static void objetoInteger() {
        Integer intObject1 = Integer.valueOf("3");
        Integer intObject2 = Integer.valueOf(3);
        Integer intObject3 = 3;
        
        /** Pasar De Primitvo A Objeto (AutoBoxing)
         * Esto Se Puede Hacer De Forma Implicita También */
        int intPrimitivo1 = 23;
        Integer intObject4 = Integer.valueOf(intPrimitivo1);
        
        /** Pasar De Objeto A Primitivo (AutoUnBoxing)
         * Esto Se Puede Hacer De Forma Implicita También*/
        Integer intObject5 = Integer.valueOf(intObject1);
        int intPrimitivo2 = intObject5;
        int intPrimitivo3 = intObject1.intValue();

        String valorTvLcd = "67000";
        Integer valorTV = Integer.valueOf(valorTvLcd);

        System.out.println("\n========== CLASE WRAPPER INTEGER ==========");
        System.out.println("intObject1 = " + intObject1);
        System.out.println("intObject2 = " + intObject2);
        System.out.println("intObject3 = " + intObject3);
        System.out.println("intObject4 = " + intObject4);
        System.out.println("intPrimitivo2 = " + intPrimitivo2);
        System.out.println("intPrimitivo3 = " + intPrimitivo3);
        System.out.println("valorTV = " + valorTV);

        System.out.println("\n========== VALOR POR DEFECTO ==========");
        System.out.println("Valor Por Defecto Método = " + _03_WrapperInteger.valorDefecto);
    }

}
