package com._19_ExpresionesLambda._04_Function;

import java.util.function.BiFunction;
import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        /* Es Una Expresión Lambda Predefinida, Es De Tipo GENERIC, Recibe Un Argumento
        * Como Parametro Y También Retorna Un Valor, Es Una Combinación Entre El
        * Consumer Que Recibe Argumentos Como Parametros Y El Supplier Que Retorna
        * Un Valor.
        * Primer Tipo De Dato, Lo Que Recibe.
        * Segundo Tipo De Dato, Lo Que Retorna. */
        Function<String, String> f1 = param -> {
            return "Hola Que Tal! " + param;
        };

        String primerResultado = f1.apply("Señora Bustamante");
        System.out.println(primerResultado);

        Function<String, String> f2 = param -> "Hola Amigo De " + param;

        String segundoResultado = f2.apply("Carolina Ceballos");
        System.out.println(segundoResultado);
        System.out.println("------------------------------------------");

        /* Ejemplo De Referencia De Método */
        Function<String, String> f3 = param -> param.toUpperCase();
        System.out.println(f3.apply("Carlos daniel"));

        Function<String, String> f4 = String::toUpperCase;
        System.out.println(f3.apply("Camilo Andres"));
        System.out.println("------------------------------------------");

        /* BiFunction Recibe Dos Argumentos Como Parametros Y Siempre
        * Retorna Un Valor.
        * Primer Tipo De Dato, Lo Que Recibe.
        * Segundo Tipo De Dato, Lo Que Recibe.
        * Terce Tipo De Dato, Lo Que Retorna.  */
        BiFunction<String, String, String> f5 = (a, b) -> a.toUpperCase().concat(" " + b.toUpperCase());

        String tercerResultado = f5.apply("matematicas", "lengua Española");
        System.out.println(tercerResultado);

        /* El ComparaTo Retorna Un Valor Entero, Si Son Iguales (0), Sino Ordenamiento De La Tabla Unicode */
        BiFunction<String, String, Integer> f6 = (a, b) -> a.compareTo(b);
        System.out.println(f6.apply("andres", "andres"));
        System.out.println("------------------------------------------");

        /* Ejemplo De Referencia De Método, Si Son Iguales (0), Sino Ordenamiento De La Tabla Unicode */
        BiFunction<String, String, Integer> f7 = String::compareTo;
        System.out.println(f7.apply("Daniel", "andres"));

        BiFunction<String, String, String> f8 = String::concat;
        System.out.println(f8.apply("Daniel", " Andres"));
        System.out.println("------------------------------------------");
    }
}
