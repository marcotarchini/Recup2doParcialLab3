package com.utn2022;

public class Main {

    public static void main(String[] args) {
        Vehiculo vehiculo1=new Vehiculo(Tipos.DOSPUERTAS,"Vento",32000,2015,10.0);
        Vehiculo vehiculo2=new Vehiculo(Tipos.CUATROPUERTAS,"Europa",120000,1992,50.0);
        Vehiculo vehiculo3=new Vehiculo(Tipos.CAMIONETA, "Amarok",10000,2020,20.0);

        Cliente cliente1=new Cliente("Marco "+"Tarchini","29909079",Registro.CONREGISTRO);
        Cliente cliente2=new Cliente("Juan "+"Perez", "23548745",Registro.SINREGISTRO);

        Sucursal sucursal1=new Sucursal("MardelPlata","Luro7825","2235485665");
        Sucursal sucursal2=new Sucursal("BuenosAires","GralPaz2356","11548796589");

        Alquiler alquiler1=new Alquiler("01/07/2022","03/07/2022",2.0,50.0);
        Alquiler alquiler2=new Alquiler("03/07/2022","06/072/022",3.0,80.0);

	Empresa empresa=new Empresa();

        Alquiler alquileres[]=new Alquiler[10];
        alquileres[0]=empresa.alquilar(cliente1,vehiculo2,alquiler2,sucursal1);
        empresa.alquilar(cliente2,vehiculo2,alquiler2,sucursal1);
        alquileres[1]=empresa.alquilar(cliente1,vehiculo1,alquiler1,sucursal2);
        alquileres[2]=empresa.alquilar(cliente1,vehiculo2,alquiler2,sucursal1);
        alquileres[3]=empresa.alquilar(cliente1,vehiculo3,alquiler2,sucursal2);
        alquileres[4]=empresa.alquilar(cliente1,vehiculo2,alquiler1,sucursal1);
        alquileres[5]=empresa.alquilar(cliente1,vehiculo3,alquiler2,sucursal2);

    empresa.mayorAlquiler(alquileres);

    empresa.alquilerPorTipo(alquileres);

    empresa.guardarEnArchivo(alquileres);


    }
}
