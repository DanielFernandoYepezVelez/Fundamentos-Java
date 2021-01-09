package com._08_ClaseMath;

import java.util.Random;

public class _03_ClaseRandom {
    public static void claseRandom() {
        String colores[] =  {"azul", "amarillo", "rojo", "verde"};

        System.out.println("\n========== CLASE ALEATORIA RANDOM (Entrega Mayor Flexibilidad Númerica) ==========");
        Random randomObject = new Random();

        int randomInt = randomObject.nextInt();
        int randomInt2 = randomObject.nextInt(7);
        int randomInt3 = 15 + randomObject.nextInt(25-15+1);

        System.out.println("randomInt = " + randomInt);
        System.out.println("randomInt2 = " + randomInt2);
        System.out.println("randomInt3 = " + randomInt3);

        double randomDouble = randomObject.nextDouble();
        System.out.println("randomDouble = " + randomDouble);

        long randomLong = randomObject.nextLong();
        System.out.println("randomLong = " + randomLong);

        randomInt = randomObject.nextInt(colores.length);
        System.out.println("randomInt Colores = " + colores[randomInt]);
    }
}
