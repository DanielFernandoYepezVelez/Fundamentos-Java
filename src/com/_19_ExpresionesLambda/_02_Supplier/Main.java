package com._19_ExpresionesLambda._02_Supplier;

import com._19_ExpresionesLambda.Models.Usuario;

import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        /* Supplier O Proveedor No Recibe Ningún Argumento Y Retorna Un Valor,
         * Solamente Devuelve, Por Eso Es Proveedor.
         * El Retorno Es Del Tipo De Dato Que Se Indica En El Diamante */

        /* Más De Una Linea De Codigo */
        Supplier<String> proveedor = () -> {
            return "Hola Mundo Desde Supplier";
        };

        /* Una Sola Linea De Codigo*/
        Supplier<String> proveedorDos = () -> "Hola Mundo Desde Supplier OPTIMIZADO";

        System.out.println(proveedor.get());
        System.out.println(proveedorDos.get());
        System.out.println("---------------------------------");

        /* Creando Un Usuario De La Clase Usuario, Es Decir, Una Expresión Lambda Que Crea Un Objeto */
        // Usuario usuario = new Usuario();
        // Supplier<Usuario> crearUsuario = () -> new Usuario();
        Supplier<Usuario> crearUsuario = Usuario::new;
        Usuario usuario = crearUsuario.get();

        usuario.setNombre("Ana Maria Giraldo Morales");
        System.out.println(usuario.getNombre());
        System.out.println("---------------------------------");
    }
}
