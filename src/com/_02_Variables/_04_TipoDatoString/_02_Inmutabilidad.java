package com._02_Variables._04_TipoDatoString;

public class _02_Inmutabilidad {
    public static void Inmutabilidad() {
        String curso = "Programaciòn Java";
        String profesor = "Daniel Fernando Yepez Vèlez";
        String resultado = curso.concat(" Con ".concat(profesor));

        System.out.println("\n========== INMUTABILIDAD DE LA CLASE STRING ==========");
        System.out.println("Curso = " + curso);
        System.out.println("Profesor = " + profesor );
        System.out.println("resultado = " + resultado);

        String resultado2 = resultado.replace("a", "A");

        System.out.println("\n========== MÀS EJEMPLOS INMUTABILIDAD DE LA CLASE STRING ==========");
        System.out.println("resultado = " + resultado);
        System.out.println("resultado2 = " + resultado2);
    }
}
