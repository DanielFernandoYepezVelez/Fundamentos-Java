package com._13_POO._01_AutomovilExplicacion;

public enum TipoAutomovil {
    SEDAN("Sedan", "Auto Normal", 4),
    STATION_WAGON("Station Wagon", "Auto Grande", 4),
    HATCHBACK("Hatchback", "Auto Compacto", 4),
    PICKUP("Pickup", "Camioneta", 4),
    COUPE("Coupe", "Auto Pequeño", 2),
    CONVERTIBLE("Convertible", "Auto Deportivo", 2),
    FURGON("Furgon", "Auto Utilizario", 4);

    private final String nombre;
    private final String descripcion;
    private final int numeroPuertas;

    TipoAutomovil(String nombre, String descripcion, int numeroPuertas) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.numeroPuertas = numeroPuertas;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public int getNumeroPuertas() {
        return numeroPuertas;
    }
}
