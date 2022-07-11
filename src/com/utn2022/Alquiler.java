package com.utn2022;

public class Alquiler {
    private String fechaDeInicio;
    private String fechaFinal;
    private double diasAlquilado;
    private double kilometroUsados;
    private double costoKilometro=50.0;
    private double costoTotal;
    private Cliente cliente;
    private Vehiculo vehiculo;
    private Sucursal sucursal;

    public Alquiler(String fechaDeInicio, String fechaFinal,double diasAlquilado,double kilometroUsados) {
        this.fechaDeInicio = fechaDeInicio;
        this.fechaFinal = fechaFinal;
        this.diasAlquilado = diasAlquilado;
        this.kilometroUsados = kilometroUsados;
        this.costoKilometro =costoKilometro;
        this.costoTotal = costoTotal;
        this.cliente = cliente;
        this.vehiculo = vehiculo;
        this.sucursal = sucursal;
    }

    public Alquiler() {
    }

    public Sucursal getSucursal() {
        return sucursal;
    }

    public void setSucursal(Sucursal sucursal) {
        this.sucursal = sucursal;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public double getCostoTotal() {
        return costoTotal;
    }

    public void setCostoTotal(double costoTotal) {
        this.costoTotal = costoTotal;
    }

    public String getFechaDeInicio() {
        return fechaDeInicio;
    }

    public void setFechaDeInicio(String fechaDeInicio) {
        this.fechaDeInicio = fechaDeInicio;
    }

    public String getFechaFinal() {
        return fechaFinal;
    }

    public void setFechaFinal(String fechaFinal) {
        this.fechaFinal = fechaFinal;
    }

    public double getDiasAlquilado() {
        return diasAlquilado;
    }

    public void setDiasAlquilado(double diasAlquilado) {
        this.diasAlquilado = diasAlquilado;
    }

    public double getKilometroUsados() {
        return kilometroUsados;
    }

    public void setKilometroUsados(double kilometroUsados) {
        this.kilometroUsados = kilometroUsados;
    }

    public double getCostoKilometro() {
        return costoKilometro;
    }


    @Override
    public String toString() {
        return "Alquiler" +
                "fechaDeInicio='" + fechaDeInicio + '\'' +
                ", fechaFinal='" + fechaFinal + '\'' +
                ", diasAlquilado=" + diasAlquilado +
                ", kilometroUsados=" + kilometroUsados +
                ", Costo Total=" + costoTotal +
                "///";
    }
}
