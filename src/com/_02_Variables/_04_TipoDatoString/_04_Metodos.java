package com._02_Variables._04_TipoDatoString;

public class _04_Metodos {
    public static void StringMethods() {
        String nombre = "Daniel Fernando Yepez Vèlez";

        System.out.println("\n========== MÈTODOS IMPORTANTES DE LOS STRING ==========");
        System.out.println("nombre.length() = " + nombre.length());
        System.out.println("nombre.toUpperCase() = " + nombre.toUpperCase());
        System.out.println("nombre.toLowerCase() = " + nombre.toLowerCase());
        System.out.println("nombre.equals(\"Daniel Fernando Yepez Vèlez\") = " + nombre.equals("Daniel Fernando Yepez Vèlez"));
        System.out.println("nombre.equalsIgnoreCase(\"daniel fernando yepez vèlez\") = " + nombre.equalsIgnoreCase("daniel fernando yepez vèlez"));
        System.out.println("nombre.compareTo(\"Daniel Fernando Yepez Vèlez\") = " + nombre.compareTo("Daniel Fernando Yepez Vèlez"));
        System.out.println("nombre.compareToIgnoreCase(\"daniel fernando yepez vèlez\") = " + nombre.compareToIgnoreCase("daniel fernando yepez vèlez"));
        System.out.println("nombre.charAt(3) = " + nombre.charAt(3));
        System.out.println("nombre.charAt(nombre.length() - 1) = " + nombre.charAt(nombre.length() - 1));
        System.out.println("nombre.substring(4) = " + nombre.substring(4));
        System.out.println("nombre.substring(2,9) = " + nombre.substring(2,9));

        String trabalenguas = "trabalenguas";
        System.out.println("trabalenguas.replace(\"a\", \";\") = " + trabalenguas.replace("a", ";"));
        System.out.println("trabalenguas.indexOf(\"a\") = " + trabalenguas.indexOf("a"));
        System.out.println("trabalenguas.lastIndexOf(\"a\") = " + trabalenguas.lastIndexOf("a"));
        System.out.println("trabalenguas.contains(\"gua\") = " + trabalenguas.contains("gua"));
        System.out.println("trabalenguas.startsWith(\"lenguas\") = " + trabalenguas.startsWith("lenguas"));
        System.out.println("trabalenguas.endsWith(\"guas\") = " + trabalenguas.endsWith("guas"));
        System.out.println("        trabalenguas       ");
        System.out.println("        trabalenguas       ".trim());
    }
}
