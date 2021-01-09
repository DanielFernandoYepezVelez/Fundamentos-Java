package com._08_ClaseMath;

public class _02_MetodoRandom {
    public static void metodoRandom() {
        String colores[] =  {"azul", "amarillo", "rojo", "verde"};
        double random = Math.random();

        System.out.println("\n========== MÉTODO ALEATORIO RANDOM (0 - 1, 1 No Inclusivo) ==========");
        System.out.println("random = " + random);
        
        /** Nunca Se Va A Incluir El 7 */
        random *= 7;
        System.out.println("random Multiplicado = " + random);
        
        random = Math.floor(random);
        System.out.println("random Piso = " + random);

        double nuevo = Math.random() * colores.length;
        nuevo = Math.floor(nuevo);
        System.out.println("nuevo Aleatorio Colores = " + colores[(int)nuevo]);
    }
}
