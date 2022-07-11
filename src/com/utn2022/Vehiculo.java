package com.utn2022;

import java.util.UUID;

public class Vehiculo {
    private Tipos tipo;
    private String modelo;
    private int kilometraje;
    private int año;
    private UUID id;
    private double tarifaDiaria;

    public Vehiculo(Tipos tipo, String modelo, int kilometraje, int año, double tarifaDiaria) {
        this.tipo = tipo;
        this.modelo = modelo;
        this.kilometraje = kilometraje;
        this.año = año;
        this.id = UUID.randomUUID();
        this.tarifaDiaria = tarifaDiaria;
    }

    public Vehiculo() {
    }

    public Tipos getTipo() {
        return tipo;
    }

    public void setTipo(Tipos tipo) {
        this.tipo = tipo;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getKilometraje() {
        return kilometraje;
    }

    public void setKilometraje(int kilometraje) {
        this.kilometraje = kilometraje;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public UUID getId() {
        return id;
    }

    public double getTarifaDiaria() {
        return tarifaDiaria;
    }

    public void setTarifaDiaria(double tarifaDiaria) {
        this.tarifaDiaria = tarifaDiaria;
    }

    @Override
    public String toString() {
        return "Vehiculo:" +
                "tipo=" + tipo +
                ", modelo='" + modelo + '\'' +
                ", kilometraje=" + kilometraje +
                ", año=" + año +
                ", id=" + id +
                ", tarifaDiaria=" + tarifaDiaria +
                "///";
    }
}
