package com._12_POO._01_AutomovilExplicacion;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Automovil auto = new Automovil("Subaru", "Impreza");
        auto.setCilindrada(2.0);
        auto.setColor(Color.BLANCO);
        auto.setTipo(TipoAutomovil.HATCHBACK);

        Automovil mazda = new Automovil("Mazda", "BT-50", Color.ROJO, 3.0);
        mazda.setTipo(TipoAutomovil.PICKUP);

        Automovil nissan = new Automovil("Nissan", "Navara", Color.GRIS, 3.5, 50);
        nissan.setTipo(TipoAutomovil.PICKUP);

        Automovil nissan2 = new Automovil("Nissan", "Navara", Color.GRIS, 3.5, 50);
        nissan2.setTipo(TipoAutomovil.CONVERTIBLE);

        System.out.println("auto.getFabricante() = " + auto.getFabricante());

        System.out.println(auto.verDetalle());
        System.out.println(auto.acelerar(3360));
        System.out.println(auto.frenar());
        System.out.println(auto.acelerarFrenar(4456));
        System.out.println("Kilomètros Por Litro: " + auto.calcularConsumo(300, 0.6F));
        System.out.println("Kilomètros Por Litro: " + auto.calcularConsumo(300, 60));

        System.out.println("\nmazda.getFabricante() = " + mazda.getFabricante());

        System.out.println(mazda.verDetalle());
        System.out.println(mazda.acelerar(4457));
        System.out.println(mazda.frenar());
        System.out.println(mazda.acelerarFrenar(2238));
        System.out.println("Kilomètros Por Litro: " + mazda.calcularConsumo(400, 0.8F));
        System.out.println("Kilomètros Por Litro: " + mazda.calcularConsumo(400, 80));

        System.out.println("\nnissan.getFabricante() = " + nissan.getFabricante());
        System.out.println(nissan.verDetalle());
        System.out.println("Kilomètros Por Litro: " + nissan.calcularConsumo(400, 70));

        System.out.println("\n========== COMPARANDO LOS OBJETOS CREADOS CON equals e == ==========");
        System.out.println("Son Iguales: nissan == nissan2 = " + (nissan == nissan2));
        System.out.println("Son Iguales: nissan == nissan2 = " + (nissan.equals(nissan2)));
        System.out.println("Reescribiendo El Equals Y Son Iguales Por Valor: nissan == nissan2 = " + (nissan.equals(nissan2)));

        System.out.println("\n========== COMPARANDO OBJETOS DIFERENTES ==========");
        Date fecha = new Date();
        System.out.println("nissan.equals(fecha) = " + nissan.equals(fecha));

        System.out.println("\n========== MÈTODO ESPECIAL TOSTRING() ==========");
        System.out.println(auto);
        System.out.println(mazda.toString());
        System.out.println(nissan);
        System.out.println(nissan2.toString());

        System.out.println("\n========== ATRIBUTOS ESTÀTICOS DE LA CLASE ==========");
        Automovil.setColorPatente(Color.AZUL);
        Automovil.setCapacidadEstanqueStatic(65);

        System.out.println("Automovil.getColorPatente() = " + Automovil.getColorPatente());

        System.out.println(auto.verDetalle());
        System.out.println(mazda.verDetalle());
        System.out.println(nissan.verDetalle());
        System.out.println("Kilomètros Por Litro Para Todos Los Automoviles: " + Automovil.calcularConsumoEstatico(300, 60));

        System.out.println("\n========== ATRIBUTOS ESTÀTICOS Y FINAL O CONSTANTES DE LA CLASE ==========");
        System.out.println("VELOCIDAD_MAX_CARRETERA => " + Automovil.VELOCIDAD_MAX_CARRETERA);
        System.out.println("VELOCIDAD_MAX_CIUDAD => " + Automovil.VELOCIDAD_MAX_CIUDAD);

        System.out.println("\n========== ENUMERADORES DE LA CLASE (Colleciòn De Atributos Constantes) ==========");
        System.out.println("auto.getColor().getColor() = " + auto.getColor().getColor());
        System.out.println("mazda.getColor().toString() = " + mazda.getColor().toString());
        System.out.println("nissan.getColor().getColor() = " + nissan.getColor().getColor());
        System.out.println("nissan2.getColor().getColor() = " + nissan2.getColor().toString());

        System.out.println("auto.getTipo().getNombre() = " + auto.getTipo().getNombre());
        System.out.println("mazda.getTipo().getDescripcion() = " + mazda.getTipo().getDescripcion());
        System.out.println("nissan.getTipo().getNumeroPuertas() = " + nissan.getTipo().getNumeroPuertas());
        System.out.println("nissan2.getTipo() = " + nissan2.getTipo());

        System.out.println("\n========== ENUMERADORES DE LA CLASE (Colleciòn De Atributos Constantes) CON SWITCH CASE ==========");

        switch (auto.getTipo()) {
            case SEDAN:
                System.out.println("El Nombre Del Automovil Es SEDAN");
                break;

            case STATION_WAGON:
                System.out.println("El Nombre Del Automovil Es STATION_WAGON");
                break;

            case PICKUP:
                System.out.println("El Nombre Del Automovil Es PICKUP");
                break;

            case HATCHBACK:
                System.out.println("El Nombre Del Automovil Es HATCHBACK");
                break;

            case COUPE:
                System.out.println("El Nombre Del Automovil Es COUPE");
                break;

            case FURGON:
                System.out.println("El Nombre Del Automovil Es FURGON");
                break;

            case CONVERTIBLE:
                System.out.println("El Nombre Del Automovil Es CONVERTIBLE");
                break;

            default:
                System.out.println("El Automovil No Esta Definido Correctamente");
                break;
        }

        System.out.println("\n========== ENUMERADORES DE LA CLASE (Colleciòn De Atributos Constantes) ITERABLES ==========");
        TipoAutomovil[] tipos = TipoAutomovil.values();

        for (TipoAutomovil tiposAutosEnums: tipos) {
            System.out.println("tiposAutosEnums.getNombre() = " + tiposAutosEnums.getNombre() +
                               "   tiposAutosEnums.getDescripcion() = " + tiposAutosEnums.getDescripcion() +
                               "   tiposAutosEnums.getNumeroPuertas() = " + tiposAutosEnums.getNumeroPuertas());
        }
    }
}
