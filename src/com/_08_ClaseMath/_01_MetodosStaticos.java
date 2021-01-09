package com._08_ClaseMath;

public class _01_MetodosStaticos {
    public static void MetodosClaseMath() {

        System.out.println("========= CLASE MATH ==========");
        int absoluto = Math.abs(-3);
        System.out.println("absoluto = " + absoluto);
        
        absoluto = Math.abs(3);
        System.out.println("absoluto = " + absoluto);
        
        double max = Math.max(3.5, 1.2);
        System.out.println("max = " + max);
        
        double min = Math.min(3.8, 2.1);
        System.out.println("min = " + min);
        
        double techo = Math.ceil(3.4);
        System.out.println("techo = " + techo);
        
        double piso = Math.floor(5.9);
        System.out.println("piso = " + piso);
        
        long entero = Math.round(8.6);
        double redondeo = Math.round(Math.PI);
        System.out.println("entero = " + entero);
        System.out.println("PI = " + redondeo);

        double exp = Math.exp(1);
        double exp2 = Math.exp(2);
        System.out.println("exp = " + exp);
        System.out.println("exp2 = " + exp2);
        
        double log = Math.log(10);
        System.out.println("log = " + log);
        
        double potencia = Math.pow(10, 3);
        System.out.println("potencia = " + potencia);
        
        double raiz = Math.sqrt(5);
        System.out.println("raiz = " + raiz);

        double grados = Math.toDegrees(1.57);
        System.out.println("Convertir A Grados = " + grados);
        grados = Math.round(grados);
        System.out.println("Convertir A Grados Redondeados = " + grados);

        double radianes = Math.toRadians(90.00);
        System.out.println("Convertir A Radianes = " + radianes);

        System.out.println("sin(90.00) = " + Math.sin(radianes));
        System.out.println("cos(90.00) = " + Math.cos(radianes));

        radianes = Math.toRadians(180.00);
        System.out.println("Convertir A Radianes = " + radianes);

        System.out.println("sin(180.00) = " + Math.sin(radianes));
        System.out.println("cos(180.00) = " + Math.cos(radianes));

        radianes = Math.toRadians(0.00);
        System.out.println("Convertir A Radianes = " + radianes);

        System.out.println("sin(0.00) = " + Math.sin(radianes));
        System.out.println("cos(0.00) = " + Math.cos(radianes));
    }
}
