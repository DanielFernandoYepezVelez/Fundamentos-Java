package com._07_ClaseSystem;

import java.io.FileInputStream;
import java.util.Properties;

public class _02_AsignarPropiedadesDeSistema {
    public static void asignarPropiedades() {

        System.out.println("\n======== ASIGNANDO EL ARCHIVO DE PROPIEDADES =========");
        try {
            FileInputStream archivo = new FileInputStream("src/com/_07_ClaseSystem/_03_config.properties");

            Properties p = new Properties(System.getProperties());

            /** Definido Una Sola Propiedad */
            p.setProperty("mi.propiedad.personalizada","Mi Valor Guardado En La Propiedad Personalizada");

            /** Paso El Archivo De La Propiedades */
            p.load(archivo);

            System.setProperties(p);
            /** Forma Uno */
            // System.getProperties().list(System.out);

            /** Forma Dos */
            Properties ps = System.getProperties();
            ps.list(System.out);
        } catch (Exception e) {
            System.out.println("No Existe El Archivo: " + e);
        }
    }
}
