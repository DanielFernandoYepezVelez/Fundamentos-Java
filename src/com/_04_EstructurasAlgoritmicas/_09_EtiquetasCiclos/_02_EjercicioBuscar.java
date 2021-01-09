package com._04_EstructurasAlgoritmicas._09_EtiquetasCiclos;

public class _02_EjercicioBuscar {
    public static void iteradoresCombinados() {
        char letra = 'g';
        int cantidad = 0;
        String palabra = "Trigo";
        String frase = "Trigo Trigo Tres Tristes Tigres Tragan Trigo En Un TrigalTrigo";

        int countPalabra = palabra.length();
        int count = frase.length() - countPalabra + 1;

        System.out.println("\n========== EJERCICIO BUSCAR FRASE ==========");
        buscar:
        for (int i = 0; i < count; i++) {
            int k = i;

            for (int j = 0; j < countPalabra; j++) {

                if (frase.charAt(k++) != palabra.charAt(j)) {
                    continue buscar;
                }
            }
            cantidad++;
        }

        System.out.println("Encontrado = " + cantidad + " Veces La Palabra " + "\'" + palabra + "\'" + " En La Frase");
    }
}
