package com.utn2022;

public class Sucursal {

    private String ciudad;
    private String dirección;
    private String númeroTeléfono;

    public Sucursal(String ciudad, String dirección, String númeroTeléfono) {
        this.ciudad = ciudad;
        this.dirección = dirección;
        this.númeroTeléfono = númeroTeléfono;
    }

    public Sucursal() {
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getDirección() {
        return dirección;
    }

    public void setDirección(String dirección) {
        this.dirección = dirección;
    }

    public String getNúmeroTeléfono() {
        return númeroTeléfono;
    }

    public void setNúmeroTeléfono(String númeroTeléfono) {
        this.númeroTeléfono = númeroTeléfono;
    }

    @Override
    public String toString() {
        return "ciudad='" + ciudad + '\'' +
                ", dirección='" + dirección + '\'' +
                ", númeroTeléfono='" + númeroTeléfono + '\'' +
                "///";
    }
}
