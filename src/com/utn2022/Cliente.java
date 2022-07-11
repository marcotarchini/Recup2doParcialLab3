package com.utn2022;

public class Cliente {
    private String NombreCompleto;
    private String dni;
    private Registro registro;

    public Cliente(String nombreCompleto, String dni, Registro registro) {
        NombreCompleto = nombreCompleto;
        this.dni = dni;
        this.registro = registro;
    }

    public Cliente() {
    }

    public String getNombreCompleto() {
        return NombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        NombreCompleto = nombreCompleto;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public Registro getRegistro() {
        return registro;
    }

    public void setRegistro(Registro registro) {
        this.registro = registro;
    }

    @Override
    public String toString() {
        return
                "///Nombre Completo='" + NombreCompleto + '\'' +
                ", dni='" + dni + '\'' +
                ", registro=" + registro +
                "///";
    }
}
