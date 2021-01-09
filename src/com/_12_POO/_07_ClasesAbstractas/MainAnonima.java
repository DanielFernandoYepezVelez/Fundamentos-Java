package com._12_POO._07_ClasesAbstractas;

import com._12_POO._07_ClasesAbstractas.Elementos.ElementoForm;
import com._12_POO._07_ClasesAbstractas.Elementos.InputForm;
import com._12_POO._07_ClasesAbstractas.Elementos.Select.Opcion;
import com._12_POO._07_ClasesAbstractas.Elementos.SelectForm;
import com._12_POO._07_ClasesAbstractas.Elementos.TextAreaForm;
import com._12_POO._07_ClasesAbstractas.Validadores.*;

import java.util.Arrays;
import java.util.List;

public class MainAnonima {
    public static void main(String[] args) {
        InputForm username = new InputForm("username");
        username.addValidador(new RequeridoValidador());

        InputForm password = new InputForm("clave", "password");
        password.addValidador(new RequeridoValidador())
                .addValidador(new LargoValidador(6, 12));

        InputForm email = new InputForm("email", "email");
        email.addValidador(new RequeridoValidador())
                .addValidador(new EmailValidador());

        InputForm edad = new InputForm("edad", "number");
        edad.addValidador(new NumeroValidador());

        TextAreaForm experiencia = new TextAreaForm("exp", 5, 9);

        SelectForm lenguaje = new SelectForm("lenguaje");
        lenguaje.addValidador(new NoNuloValidador());

        Opcion java = new Opcion("1","Java");

        lenguaje.addOpcion(java)
                .addOpcion(new Opcion("2", "Python"))
                .addOpcion(new Opcion("3", "JavaScript"))
                .addOpcion(new Opcion("4", "TypeScript"))
                .addOpcion(new Opcion("5", "PHP"));

        /** Clase Anonima Instanciando La Clase Padre Abstracta (UNA SOLA VEZ) */
        ElementoForm saludar = new ElementoForm("saludo") {
            @Override
            public String dibujarHtml() {
                return "<input disabled name='" + this.nombre + "' value='" + this.valor + "' >";
            }
        };

        saludar.setValor("Hola Que Tal Este Campo Està Deshabilitado!");
        username.setValor("");
        password.setValor("1234");
        email.setValor("jonh.doe@correo.com");
        edad.setValor("28");

        experiencia.setValor("... Más De 10 Años De Experiencia ...");

        java.setSelected(true);

        /** Forma Más Optimizada Del ArrayList() */
        List<ElementoForm> elementos = Arrays.asList(username,
                password,
                email,
                edad,
                experiencia,
                lenguaje,
                saludar);

        /** Api De Stream De Java 8 (Funciones De Flecha) */
        elementos.forEach(elemento -> {
            System.out.println(elemento.dibujarHtml());
            System.out.println("<br />");
        });

        elementos.forEach(e -> {
            if (!e.esValido()) {
                //e.getErrores().forEach(err -> System.out.println(e.getNombre() + ": " + err));
                e.getErrores().forEach(System.out::println);
            }
        });
    }
}
