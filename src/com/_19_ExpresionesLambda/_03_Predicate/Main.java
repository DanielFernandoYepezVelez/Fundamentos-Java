package com._19_ExpresionesLambda._03_Predicate;

import com._19_ExpresionesLambda.Models.Usuario;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        /* Expresiones Lambda Para Evaluar Una Expresión Booleana
        * Siempre Retorna Un Boolean.
        * Recibe O Consume Un Argumento Como Parametro De Cualquier Tipo. */
        Predicate<Integer> test = num -> num > 10;
        boolean resultado = test.test(7);
        System.out.println("resultado = " + resultado);
        System.out.println("--------------------------------");

        /* El Método Equals De Un Objeto Retorna Un Boolean, True O False */
        Predicate<String> testeDos = rol -> rol.equals("ROL_ADMIN");
        System.out.println(testeDos.test("ROL_ADMIN"));
        System.out.println("--------------------------------");

        /* Es Muy Similar Al Anterior Pero Recibe Dos Argumentos Como Parametros
        * Para Consumir Y Retorna Un Boolean */
        BiPredicate<Integer, Integer> testCinco = (a, b) -> a > b;
        boolean resultado2 = testCinco.test(10, 12);
        System.out.println(resultado2);

        BiPredicate<String, String> testTres = (a, b) -> a.equals(b);
        System.out.println(testTres.test("Daniel", "Fernando"));
        System.out.println("--------------------------------");

        /* Ejemplo Método De Referencia */
        BiPredicate<String, String> testCuatro = String::equals;
        System.out.println(testCuatro.test("Fernando", "Fernando"));
        System.out.println("--------------------------------");

        Usuario a = new Usuario();
        Usuario b = new Usuario();

        a.setNombre("Maria");
        b.setNombre("Maria");
        BiPredicate<Usuario, Usuario> testSeis = (ua, ub) -> ua.getNombre().equals(ub.getNombre());
        System.out.println(testSeis.test(a, b));
        System.out.println("--------------------------------");
    }
}
