package com._03_Operadores;

public class _02_Asignacion {
    public static void OperadoresAsignacion() {
        int i = 5;

        System.out.println("\n========== OPERADORES DE ASIGNACIÒN ==========");
        System.out.println("i = " + i);

        i += 4;
        System.out.println("i += " + i);

        i -= 2;
        System.out.println("i -= " + i);

        i *= 3;
        System.out.println("i *= " + i);

        i /= 4;
        System.out.println("i /= " + i);

        i %= 2;
        System.out.println("i %= " + i);

        String sqlString = "SELECT * FROM clietes AS c";
        sqlString += " WHERE c.nombre = 'Daniel'";
        sqlString += " AND c.activo = 1";

        System.out.println("sqlString += " + sqlString);
    }
}
