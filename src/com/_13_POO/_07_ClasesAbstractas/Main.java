package com._13_POO._07_ClasesAbstractas;

import com._13_POO._07_ClasesAbstractas.Elementos.ElementoForm;
import com._13_POO._07_ClasesAbstractas.Elementos.InputForm;
import com._13_POO._07_ClasesAbstractas.Elementos.Select.Opcion;
import com._13_POO._07_ClasesAbstractas.Elementos.SelectForm;
import com._13_POO._07_ClasesAbstractas.Elementos.TextAreaForm;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        InputForm username = new InputForm("username");
        InputForm password = new InputForm("clave", "password");
        InputForm email = new InputForm("email", "email");
        InputForm edad = new InputForm("edad", "number");

        TextAreaForm experiencia = new TextAreaForm("exp", 5, 9);

        SelectForm lenguaje = new SelectForm("lenguaje");
        Opcion java = new Opcion("1", "Java");
        lenguaje.addOpcion(java)
                .addOpcion(new Opcion("2", "Python"))
                .addOpcion(new Opcion("3", "JavaScript"))
                .addOpcion(new Opcion("4", "TypeScript"))
                .addOpcion(new Opcion("5", "PHP"));

        username.setValor("John.doe");
        password.setValor("1234");
        email.setValor("jonh.doe@correo.com");
        edad.setValor("28");

        experiencia.setValor("... Más De 10 Años De Experiencia ...");

        java.setSelected(true);

        /* List<ElementoForm> elementos = new ArrayList<>();
        elementos.add(username);
        elementos.add(password);
        elementos.add(email);
        elementos.add(edad);
        elementos.add(experiencia);
        elementos.add(lenguaje); */

        /** Forma Más Optimizada Del ArrayList() */
        List<ElementoForm> elementos = Arrays.asList(username,
                password,
                email,
                edad,
                experiencia,
                lenguaje);

        /** for (ElementoForm elemento: elementos) {
            System.out.println(elemento.dibujarHtml());
        } */

        /** Api De Stream De Java 8 (Funciones De Flecha) */
        elementos.forEach(elemento -> {
            System.out.println(elemento.dibujarHtml());
            System.out.println("<br />");
        });
    }
}
