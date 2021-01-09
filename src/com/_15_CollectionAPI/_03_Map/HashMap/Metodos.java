package com._15_CollectionAPI._03_Map.HashMap;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Metodos {
    public static void metodosImportantesHahsMap() {
        System.out.println("\n========== MÉTODOS IMPORTANTES MAP<KEY, VALUE> ==========");

        Map<String, String> persona = new HashMap<>();
        persona.put(null, "12345");
        persona.put("nombre", "Daniel");
        persona.put("apellido", "yepez");
        persona.put("apellidoPaterno", "yepez");
        persona.put("email", "Daniel.02@gmail.com");
        persona.put("edad", "30");

        System.out.println("persona = " + persona);

        /** ELIMINAR */
        String apellidoPaterno = persona.remove("apellidoPaterno");
        boolean apellido = persona.remove("apellido", "yepez");

        System.out.println("Eliminado ApellidoPaterno = "+ apellidoPaterno);
        System.out.println("Eliminado Apellido = " + apellido);

        System.out.println("persona = " + persona);

        /** SI EXISTE EN EL MAP<> */
        boolean b1 = persona.containsKey(null);
        boolean b2 = persona.containsValue("12345");

        System.out.println("Existe La Clave Del Elemento = " + b1);
        System.out.println("Existe El Valor Del Elemento = " + b2);

        /** RECORRIENDO UN MAP */
        Collection<String> valores = persona.values();
        Set<String> llaves = persona.keySet();

        System.out.println("------ Valores ------");
        for (String valor: valores) {
            System.out.println(valor);
        }

        System.out.println("------ Claves - LLaves -------");
        for (String llave: llaves) {
            System.out.println(llave);
        }

        System.out.println("------ Clave - Valor -------");
        for (Map.Entry<String, String> par: persona.entrySet()) {
            System.out.println(par.getKey() + " => " + par.getValue());
        }

        System.out.println("------- Claver - Valor (Otro Modo) -------");
        for (String llave: persona.keySet()) {
            String valor = persona.get(llave);
            System.out.println(llave + " => " + valor);
        }

        System.out.println("------- Expresiones Lambda ------");
        persona.forEach((llave, valor) -> {
            System.out.println(llave + " => " + valor);
        });

        System.out.println("\nTotal = " + persona.size());
        System.out.println("Hay Elementos = " + !persona.isEmpty());

        /** REMPLAZANDO ELEMENTOS */
        persona.replace("nombre", "Nuevo Daniel");
        System.out.println("persona = " + persona);

        boolean b3 = persona.replace("edad", "30", "455567");
        System.out.println("Ultima Modificación Se Ejecutó = " + b3);
        System.out.println("persona = " + persona);
    }
}
