package com._12_POO._01_AutomovilExplicacion;

public class Automovil {

    private int idAuto;
    private String fabricante;
    private String modelo;
    private Color color = Color.GRIS;
    private double cilindrada;
    private int capacidadEstanque = 40;
    private TipoAutomovil tipo;

    private static Color colorPatente = Color.NARANJO;
    private static int capacidadEstanqueStatic = 30;
    private static int ultimoIdAuto;

    public static final Integer VELOCIDAD_MAX_CARRETERA = 120;
    public static final int VELOCIDAD_MAX_CIUDAD = 60;

    /*public static final String COLOR_ROJO = "Rojo";
    public static final String COLOR_AMARILLO = "Amarillo";
    public static final String COLOR_AZUL = "Azul";
    public static final String COLOR_BLANCO = "Blanco";
    public static final String COLOR_GRIS = "Gris";*/

    public Automovil() {
        this.idAuto = ++Automovil.ultimoIdAuto;
    }

    public Automovil(String fabricante, String modelo) {
        this();
        this.fabricante = fabricante;
        this.modelo = modelo;
    }

    public Automovil(String fabricante, String modelo, Color color) {
        this(fabricante, modelo);
        this.color = color;
    }

    public Automovil(String fabricante, String modelo, Color color, double cilindrada) {
        this(fabricante, modelo, color);
        this.cilindrada = cilindrada;
    }

    public Automovil(String fabricante, String modelo, Color color, double cilindrada, int capacidadEstanque) {
        this(fabricante, modelo, color, cilindrada);
        this.capacidadEstanque = capacidadEstanque;
    }

    public int getIdAuto() {
        return idAuto;
    }

    public void setIdAuto(int idAuto) {
        this.idAuto = idAuto;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public double getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(double cilindrada) {
        this.cilindrada = cilindrada;
    }

    public int getCapacidadEstanque() {
        return capacidadEstanque;
    }

    public void setCapacidadEstanque(int capacidadEstanque) {
        this.capacidadEstanque = capacidadEstanque;
    }

    public static Color getColorPatente() {
        return colorPatente;
    }

    public static void setColorPatente(Color colorPatente) {
        Automovil.colorPatente = colorPatente;
    }

    public static int getCapacidadEstanqueStatic() {
        return capacidadEstanqueStatic;
    }

    public TipoAutomovil getTipo() {
        return tipo;
    }

    public void setTipo(TipoAutomovil tipo) {
        this.tipo = tipo;
    }

    public static void setCapacidadEstanqueStatic(int capacidadEstanqueStatic) {
        Automovil.capacidadEstanqueStatic = capacidadEstanqueStatic;
    }

    public String verDetalle() {
        StringBuilder sb = new StringBuilder();

        sb.append("\nthis.idAuto = " + this.idAuto);
        sb.append("\nthis.fabricante = " + this.fabricante);
        sb.append("\nthis.modelo = " + this.modelo);
        sb.append("\nthis.tipo = " + this.getTipo().getNombre());
        sb.append("\nthis.puertas = " + this.getTipo().getNumeroPuertas());
        sb.append("\nthis.color = " + this.color);
        sb.append("\nAutomovil.colorPatente = " + Automovil.colorPatente.getColor());
        sb.append("\nthis.cilindrada = " + this.cilindrada);

        return sb.toString();
    }

    public String acelerar(int revoluciones) {
        return "El Auto " + this.fabricante + " Acelerando A " + revoluciones + "rpm";
    }

    public String frenar() {
        return this.fabricante + " " + this.modelo + " Frenando Correctamente!";
    }

    public String acelerarFrenar(int rpm) {
        String acelerar = this.acelerar(rpm);
        String frenar = this.frenar();

        return acelerar + "\n" + frenar;
    }

    public float calcularConsumo(int km, float porcentajeBencina) {
        return km / (porcentajeBencina * this.capacidadEstanque);
    }

    public float calcularConsumo(int km, int porcentajeBencina) {
        return km / ((porcentajeBencina/100F) * this.capacidadEstanque);
    }

    public static float calcularConsumoEstatico(int km, int porcentajeBencina) {
        return km / ((porcentajeBencina/100F) * Automovil.capacidadEstanqueStatic);
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj) {
            return true;
        }

        if(!(obj instanceof Automovil)) {
            return false;
        }

        Automovil autoObject = (Automovil) obj;

        return (this.fabricante != null && this.modelo != null &&
                this.fabricante.equals(autoObject.getFabricante()) &&
                this.modelo.equals(autoObject.getModelo()));
    }

    @Override
    public String toString() {
        return "Automovil{" +
                "id='" + idAuto + '\'' +
                ", fabricante='" + fabricante + '\'' +
                ", modelo='" + modelo + '\'' +
                ", tipo='" + tipo.getNombre() + '\'' +
                ", puertas='" + tipo.getNumeroPuertas() + '\'' +
                ", color='" + color + '\'' +
                ", cilindrada=" + cilindrada +
                ", capacidadEstanque=" + capacidadEstanque +
                '}';
    }
}
