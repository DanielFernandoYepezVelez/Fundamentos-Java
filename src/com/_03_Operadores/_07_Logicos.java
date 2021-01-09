package com._03_Operadores;

public class _07_Logicos {
    public static void OperadoresLogicos() {

        int i = 3;
        byte j = 7;
        float k = 127e-7F;
        double l = 2.1413e3;
        boolean m = false;

        System.out.println("\n========== OPERADORES LOGICOS ==========");
        System.out.println("RELACIONES Y/O EXPRESIONES LOGICAS DATOS PRIMITIVOS => ");
        System.out.println("(    (i == j) && (k > l)  ) = " + (    (i == j) && (k > l)   ));
        System.out.println("(    (i != j) && (k < l)  ) = " + (    (i != j) && (k < l)   ));
        System.out.println("(   (i == j) || (m == true)  ) = " + (   (i == j) || (m == true)   ));
        System.out.println("(   (i == j) || (m == false)  ) = " + (   (i == j) || (m == false)   ));
        
        boolean b3 = i == j && (k > l || m == false);
        boolean b4 = (i == j && k > l) || m == false;

        System.out.println("b3 = " + b3);
        System.out.println("b4 = " + b4);
        
        /** Ojo A La Predencia De Los Operadores Lògicos */
        boolean precedenciaLògicosAND = false || true && false;
        boolean precedenciaLògicosOR =  true || true && false;

        System.out.println("\n========== \"AND\" PRIORIZA POR ENCIMA DEL \"OR\" ==========");
        System.out.println("precedenciaLògicosAND = " + precedenciaLògicosAND);
        System.out.println("precedenciaLògicosOR = " + precedenciaLògicosOR);
    }
}
