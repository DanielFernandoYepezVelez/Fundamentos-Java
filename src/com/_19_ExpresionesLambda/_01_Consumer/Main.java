package com._19_ExpresionesLambda._01_Consumer;

import com._19_ExpresionesLambda.Models.Usuario;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {
        /* Expresiones Lambdas Predefinidas En Java, Se Ejecutan Con El accept */
        /* El Consumer No Retorna Nada, Solo Realiza Un Trabajo, Hace Una Implementación */

        /* Recibe Un Solo Argumento */
        Consumer<String> consumidorString = saludo -> System.out.println(saludo);

        Consumer<Date> consumidorFecha = fecha -> {
            SimpleDateFormat f = new SimpleDateFormat("yy-MM-dd");
            System.out.println(f.format(fecha));
        };

        consumidorString.accept("Hola Mundo Primer Expresión Lambda");
        consumidorFecha.accept(new Date());
        System.out.println("-------------------------");

        /* Recibe Dos Argumentos */
        BiConsumer<String, Integer> consumidorBi = (nombre, edad) -> {
            System.out.println(nombre + ", Tiene" + edad + " Años!");
        };

        consumidorBi.accept("Daniel", 45);
        System.out.println("-------------------------");

        /* Reemplazar Lambda Con Referencia De Método */
        /* Consumer<String> consumidorDos = mensaje -> System.out.println(mensaje); */
        Consumer<String> consumidorDos = System.out::println;

        consumidorDos.accept("Hola Mundo Método De Referencia");

        List<String> nombres = Arrays.asList("Daniel", "Fernando", "Camilo");

        nombres.forEach(consumidorDos); // Recibe Un Consumer
        System.out.println("-------------------------");

        /* Trabajando Un Modelo Con Una Expresión Lambda */
        Usuario usuario = new Usuario();

        BiConsumer<Usuario, String> asignarNombre = (persona, nombre) -> {
            persona.setNombre(nombre);
        };

        asignarNombre.accept(usuario, "Daniel Fernando Yepez Vélez");
        System.out.println("Nombre Usuario: " + usuario.getNombre());

        /* Aquí Hago Una Referencia Del Método, Pero Funciona Igual Que El Anterior De Arriba */
        BiConsumer<Usuario, String> asignarNombreReferencia = Usuario::setNombre;

        asignarNombreReferencia.accept(usuario, "Camilo Andres Pulgarin Mazo");
        System.out.println("Nombre Usuario: " + usuario.getNombre());
        System.out.println("-------------------------");
    }
}
