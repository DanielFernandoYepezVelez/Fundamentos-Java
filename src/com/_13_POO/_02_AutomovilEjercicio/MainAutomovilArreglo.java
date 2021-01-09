package com._13_POO._02_AutomovilEjercicio;

import com._13_POO._01_AutomovilExplicacion.Color;
import com._13_POO._01_AutomovilExplicacion.TipoAutomovil;

import java.util.Arrays;

public class MainAutomovilArreglo {
    public static void main(String[] args) {

        Persona conductorSubaru = new Persona("Luci", "Acevedo");
        Automovil subaru = new Automovil("Subaru", "Impreza", Color.AZUL);
        Motor motorSubaru = new Motor(2.0, TipoMotor.BENCINA);
        Estanque estanqueSubaru = new Estanque();

        subaru.setConductor(conductorSubaru);
        subaru.setMotor(motorSubaru);
        subaru.setEstanque(estanqueSubaru);
        subaru.setTipo(TipoAutomovil.CONVERTIBLE);

        Persona conductorMazda = new Persona("Pato", "Rodriguez");
        Automovil mazda = new Automovil("Mazda", "BT-50", Color.ROJO);
        Motor motorMazda = new Motor(3.0, TipoMotor.DIESEL);
        Estanque estanqueMazda = new Estanque();

        mazda.setConductor(conductorMazda);
        mazda.setMotor(motorMazda);
        mazda.setEstanque(estanqueMazda);
        mazda.setTipo(TipoAutomovil.COUPE);

        Automovil[] autos = new Automovil[2];
        autos[0] = subaru;
        autos[1] = mazda;

        /** Ordena Los Objetos Gracias A La Interface CompareTo De Automovil */
        Arrays.sort(autos);

        for (int i = 0; i < autos.length; i++) {
            System.out.println(autos[i].toString());
        }
    }
}
