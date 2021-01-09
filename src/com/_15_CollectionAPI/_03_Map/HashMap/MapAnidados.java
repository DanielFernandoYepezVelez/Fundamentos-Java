package com._15_CollectionAPI._03_Map.HashMap;

import java.util.HashMap;
import java.util.Map;

public class MapAnidados {
    public static void ejemploMapsAnidados() {
        System.out.println("\n========== RELACIONES DE OBJETOS MAP<kEY, VALUE> ==========");
        System.out.println("Las Relaciones De Objetos Es Similar A Cuando Un Atributo De Una Clase Puede Ser Del Tipo De Dato De Otra Clase");
        System.out.println("Un HashMap Puede Ser Del Tipo De Dato De Otra Clase, Pero También Puede Ser Del Tipo De Dato De Otro HashMap\n");

        Map<String, Object> persona = new HashMap<>();
        persona.put("edad", "30");
        persona.put(null, "12345");
        persona.put("nombre", "Daniel");
        persona.put("apellido", "yepez");
        persona.put("apellidoPaterno", "yepez");
        persona.put("email", "Daniel.02@gmail.com");

        Map<String, String> direccion = new HashMap<>();
        direccion.put("calle", "78");
        direccion.put("numero", "122");
        direccion.put("pais", "Colombia");
        direccion.put("ciudad", "Medellin");
        direccion.put("departamento", "Antioquia");

        /** RELACIONAR LOS MAPS */
        persona.put("direccion", direccion);

        System.out.println("persona = " + persona);

        /** OBTENER UN MAP QUE ESTA DENTRO DE OTRO MAP */
        Map<String, String> direccionPersona = (Map<String, String>) persona.get("direccion");

        String pais = direccionPersona.get("pais");
        String ciudad = direccionPersona.get("ciudad");
        String departamento = direccionPersona.get("departamento");
        String barrio = direccionPersona.getOrDefault("barrio", "Por Defecto");

        System.out.println("El Pais Es = " + pais);
        System.out.println("El Departamento Es = " + departamento);
        System.out.println("La Ciudad Es = " + ciudad);
        System.out.println("El Barrio Es = " + barrio);
    }
}
