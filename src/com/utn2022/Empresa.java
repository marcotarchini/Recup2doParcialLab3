package com.utn2022;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.io.Serializable;

public class Empresa implements Serializable {

    Cliente cliente = new Cliente();
    Vehiculo vehiculo = new Vehiculo();
    Alquiler alquiler = new Alquiler();
    Sucursal sucursal = new Sucursal();

    public Alquiler alquilar(Cliente cliente, Vehiculo vehiculo, Alquiler alquiler, Sucursal sucursal) {
        Alquiler aux=new Alquiler();
        if (cliente.getRegistro().equals(Registro.CONREGISTRO)) {
            double total=((alquiler.getDiasAlquilado() * vehiculo.getTarifaDiaria()) * (alquiler.getKilometroUsados() * alquiler.getCostoKilometro()));
            ///System.out.println(total);
            aux=alquiler;
            aux.setCostoTotal(total);
            aux.setCliente(cliente);
            aux.setVehiculo(vehiculo);
            aux.setSucursal(sucursal);

        } else  {
        System.out.println("El cliente no cuenta con registro de conducir");
        }
        System.out.println("El cliente: " + cliente + "alquilo el vehiculo" + vehiculo + "\nDatos del alquiler" + alquiler + "en la sucursal: " + sucursal);

        return aux;
    }

    public void mayorAlquiler(Alquiler[]alquileres){
        Alquiler mayor;
        mayor=alquileres[0];
        for (Alquiler aux:alquileres){
            if (aux!=null && mayor.getCostoTotal()< aux.getCostoTotal()){
                mayor=aux;
            }
        }
        System.out.println("\nEl mayor alquiler corresponde a: "+mayor.getCostoTotal()+mayor.getCliente()+mayor.getVehiculo()+mayor.getSucursal());
    }

    public void alquilerPorTipo(Alquiler[]alquileres){
        int camioneta= 0, dospuestas = 0, cuatropuertas=0;

        for (Alquiler aux:alquileres) {
            if (aux!=null && aux.getVehiculo().getTipo().equals(Tipos.CAMIONETA))
                camioneta++;

            if (aux!=null && aux.getVehiculo().getTipo().equals(Tipos.DOSPUERTAS))
                dospuestas++;

            if (aux!=null && aux.getVehiculo().getTipo().equals(Tipos.CUATROPUERTAS))
                cuatropuertas++;

        }
        System.out.println("\nCantidad de alquieles de camioneta: "+camioneta);
        System.out.println("Cantidad de alquieles de 2 puertas: "+dospuestas);
        System.out.println("Cantidad de alquieles de 4 puertas: "+cuatropuertas);
    }

    public void guardarEnArchivo(Alquiler[]alquileres){
        File archivo=new File("alquiler.json");
        ObjectMapper mapper=new ObjectMapper();
        try {
            if (!archivo.exists()) {
                archivo.createNewFile();
            }
            mapper.writeValue(archivo, alquileres);
        } catch (IOException e) {
            System.out.println("No se pudo completar la operacion." + e.getMessage());
        }
    }

}





