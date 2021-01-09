package com._16_CollectionAPI._03_Map.HashMap;

import java.util.HashMap;
import java.util.Map;

public class Concepto {
    public static void ejemploHashMap() {
        System.out.println("========== DEFINICIÓN DEL CONCEPTO MAP<kEY, VALUE> ==========");

        Map<String, String> persona = new HashMap<>();

        /** Guardar En El Map (Las LLaves Son Unicas, Solo Deja La Ultima LLave Leída) */
        persona.put(null, "12345");
        persona.put("nombre", "Daniel");
        persona.put("apellido", "yepez");
        persona.put("apellidoPaterno", "yepez");
        persona.put("email", "Daniel.02@gmail.com");
        persona.put("edad", "30");

        System.out.println("persona = " + persona);

        /** OBTENER VALORES DEL MAP */
        String nombre = persona.get("nombre");
        System.out.println("nombre = " + nombre);

        String apellido = persona.get("apellido");
        System.out.println("apellido = " + apellido);
    }
}
