package com._14_Generics.Clases;

public class Main {
    public static void main(String[] args) {
        _01_Camion<_04_Animal> transporteCaballos = new _01_Camion<>(5);
        transporteCaballos.add(new _04_Animal("Peregrino", "Caballo"));
        transporteCaballos.add(new _04_Animal("grillo", "Caballo"));
        transporteCaballos.add(new _04_Animal("Tunquen", "Caballo"));
        transporteCaballos.add(new _04_Animal("Topocalma", "Caballo"));
        transporteCaballos.add(new _04_Animal("Longotoma", "Caballo"));

        imprimirCamion(transporteCaballos);

        _01_Camion<_03_Maquinaria> transporteMaquinas = new _01_Camion<>(3);
        transporteMaquinas.add(new _03_Maquinaria("Bulldozer"));
        transporteMaquinas.add(new _03_Maquinaria("Grúa Horquilla"));
        transporteMaquinas.add(new _03_Maquinaria("Perforadora"));

        System.out.println("-------");
        imprimirCamion(transporteMaquinas);

        _01_Camion<_02_Automovil> transporteAuto = new _01_Camion<>(3);
        transporteAuto.add(new _02_Automovil("Toyota"));
        transporteAuto.add(new _02_Automovil("Mitsubishi"));
        transporteAuto.add(new _02_Automovil("Chevrolet"));

        System.out.println("-------");
        imprimirCamion(transporteAuto);
    }

    public static <T> void imprimirCamion(_01_Camion<T> transporte) {
        for (T a: transporte) {
            if(a instanceof _04_Animal) {
                System.out.println(((_04_Animal) a).getNombre() + " Tipo: " + ((_04_Animal) a).getTipo());

            } else if (a instanceof _02_Automovil) {
                System.out.println(((_02_Automovil) a).getMarca());

            } else if (a instanceof _03_Maquinaria) {
                System.out.println(((_03_Maquinaria) a).getTipo());
            }
        }
    }
}
