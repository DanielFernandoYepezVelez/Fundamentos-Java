package com._04_Operadores;

import java.util.Scanner;

public class _08_EjercicioLogicosLogin {
    public static void Login() {
        Scanner teclado = new Scanner(System.in);

        String username = "Daniel Fernando Yepez Vèlez";
        String password = "1234";

        String[] users = new String[3];
        String[] pass = new String[3];

        boolean isAuthenticate = false;

        for (int i = 0; (i < users.length && i < pass.length); i++) {

            System.out.println("Ingrese El Username Del Usuario #" + (i+1) + ":");
            users[i] = teclado.nextLine();

            System.out.println("Ingrese El Password Del Usuario #" + (i+1) + ":");
            pass[i] = teclado.nextLine();
        }

        System.out.println();
        for (int i = 0; (i < users.length && i < pass.length); i++) {

            if (users[i].equalsIgnoreCase(username) && pass[i].equalsIgnoreCase(password)) {
                isAuthenticate = true;
            } else {
                System.out.println("Username O Contraseña Incorrecto Del Usuario #" + (i+1) + " " + users[i]);
            }

            if(isAuthenticate) {
                System.out.println("Bienvenido Usuario ".concat(users[i]).concat("!"));
                isAuthenticate = false;
            }
        }
    }
}
