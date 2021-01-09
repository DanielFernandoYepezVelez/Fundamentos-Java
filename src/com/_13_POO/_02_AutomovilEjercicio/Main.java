package com._13_POO._02_AutomovilEjercicio;

import com._13_POO._01_AutomovilExplicacion.Color;
import com._13_POO._01_AutomovilExplicacion.TipoAutomovil;

public class Main {
    public static void main(String[] args) {

        Persona conductorSubaru = new Persona("Luci", "Acevedo");
        Automovil subaru = new Automovil("Subaru", "Impreza", Color.AZUL);
        Motor motorSubaru = new Motor(2.0, TipoMotor.BENCINA);
        Estanque estanqueSubaru = new Estanque();
        Rueda[] ruedasSubaru = new Rueda[4];

        subaru.setConductor(conductorSubaru);
        subaru.setMotor(motorSubaru);
        subaru.setEstanque(estanqueSubaru);
        subaru.setTipo(TipoAutomovil.CONVERTIBLE);
        //subaru.setRuedas(ruedasSubaru);

        //for (int i = 0; i < ruedasSubaru.length; i++) {
            //ruedasSubaru[i] = new Rueda("Yokohama", 16, 7.5);
        //}

        for (int i = 0; i < ruedasSubaru.length; i++) {
            subaru.addRueda(new Rueda("Yokohama", 16, 7.5));
        }

        Persona conductorMazda = new Persona("Pato", "Rodriguez");
        Automovil mazda = new Automovil("Mazda", "BT-50", Color.ROJO);
        Motor motorMazda = new Motor(3.0, TipoMotor.DIESEL);
        Estanque estanqueMazda = new Estanque();
        Rueda[] ruedasMazda = new Rueda[4];

        mazda.setConductor(conductorMazda);
        mazda.setMotor(motorMazda);
        mazda.setEstanque(estanqueMazda);
        mazda.setTipo(TipoAutomovil.COUPE);
        //mazda.setRuedas(ruedasMazda);

        //for (int i = 0; i < ruedasMazda.length; i++) {
            //ruedasMazda[i] = new Rueda("Michelin", 18, 10.5);
        //}

        for (int i = 0; i < ruedasMazda.length; i++) {
            mazda.addRueda(new Rueda("Michelin", 18, 10.5));
        }

        System.out.println("\n========== AUTOMOVILES DETALLES ==========");
        System.out.println(subaru.verDetalle());
        System.out.println(mazda.verDetalle());

        System.out.println("\n========== AUTOMOVILES CONDUCTORES ==========");
        System.out.println("subaru.getConductor().toString() = " + subaru.getConductor().toString());
        System.out.println("mazda.getConductor().toString() = " + mazda.getConductor().toString());

        System.out.println("\n========== AUTOMOVILES RUEDAS ==========");
        for (Rueda rueda: subaru.getRuedas()) {
            System.out.println(rueda.getFabricante() + " " + rueda.getAro() + " " + rueda.getAncho());
        }

        System.out.println(" ");
        for (Rueda rueda: mazda.getRuedas()) {
            System.out.println(rueda.getFabricante() + " " + rueda.getAro() + " " + rueda.getAncho());
        }

        System.out.println("\n========== VALIDAR VALORES NULL, PARA LA EXCEPTION (NULLPOINTEREXCEPTION) ==========");
        System.out.println("Los Objetos O Valores Nulos Disparan Esta Exception.");
    }
}
