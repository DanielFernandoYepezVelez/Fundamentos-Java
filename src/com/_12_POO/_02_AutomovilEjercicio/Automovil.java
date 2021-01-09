package com._12_POO._02_AutomovilEjercicio;

import com._12_POO._01_AutomovilExplicacion.Color;
import com._12_POO._01_AutomovilExplicacion.TipoAutomovil;

public class Automovil implements Comparable<Automovil> {

    private int idAuto;
    private String fabricante;
    private String modelo;
    private Color color = Color.GRIS;
    private Motor motor;
    private Estanque estanque;
    private Persona conductor;
    private Rueda[] ruedas;
    private int indiceRuedas;
    private TipoAutomovil tipo;

    private static Color colorPatente = Color.NARANJO;
    private static int capacidadEstanqueStatic = 30;
    private static int ultimoIdAuto;

    public static final Integer VELOCIDAD_MAX_CARRETERA = 120;
    public static final int VELOCIDAD_MAX_CIUDAD = 60;

    public Automovil() {
        this.idAuto = ++Automovil.ultimoIdAuto;
        this.ruedas = new Rueda[4];
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

    public Automovil(String fabricante, String modelo, Color color, Motor motor) {
        this(fabricante, modelo, color);
        this.motor = motor;
    }

    public Automovil(String fabricante, String modelo, Color color, Motor motor, Estanque estanque) {
        this(fabricante, modelo, color, motor);
        this.estanque = estanque;
    }

    public Automovil(String fabricante, String modelo, Color color, Motor motor, Estanque estanque, Persona conductor, Rueda[] ruedas) {
        this(fabricante, modelo, color, motor, estanque);
        this.conductor = conductor;
        this.ruedas = ruedas;
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

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public Estanque getEstanque() {
        if(this.estanque == null) {
            this.estanque = new Estanque();
        }

        return estanque;
    }

    public void setEstanque(Estanque estanque) {
        this.estanque = estanque;
    }

    public Persona getConductor() {
        return conductor;
    }

    public void setConductor(Persona conductor) {
        this.conductor = conductor;
    }

    public Rueda[] getRuedas() {
        return ruedas;
    }

    public void setRuedas(Rueda[] ruedas) {
        this.ruedas = ruedas;
    }

    public void addRueda(Rueda rueda) {
        if(indiceRuedas < this.ruedas.length) {
            this.ruedas[indiceRuedas++] = rueda;
        }
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

        if(this.motor != null) {
            sb.append("\nthis.motor = " + this.motor.getCilindrada());
        }

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
        return km / (porcentajeBencina * this.estanque.getCapacidad());
    }

    public float calcularConsumo(int km, int porcentajeBencina) {
        return km / ((porcentajeBencina/100F) * this.estanque.getCapacidad());
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
                ", cilindrada=" + motor.getCilindrada() +
                ", capacidadEstanque=" + estanque.getCapacidad() +
                '}';
    }

    /** Aquì Es Cuando La Interface Comparable No Tiene
    Definido Un Tipo De Dato Y Por Ende Es Genèrico, Y Asì,
    Puede Recibir Objetos Genèricos De Tipo Object */
    /* @Override
    public int compareTo(Object o) {
        Automovil autoObject = (Automovil) o;
        return this.fabricante.compareToIgnoreCase(autoObject.fabricante);
    } */


    /** Aquì Es Cuando La Interface Comparable Tiene
    Definido Un Tipo De Dato Y Por Ende No Es Genèrico Y
    Solo Puede Recibir Objetos De Tipo Automovil */
    @Override
    public int compareTo(Automovil autoObject) {
        return this.fabricante.compareToIgnoreCase(autoObject.fabricante);
    }
}