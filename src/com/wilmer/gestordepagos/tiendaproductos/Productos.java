package com.wilmer.gestordepagos.tiendaproductos;

import com.wilmer.gestordepagos.superclase.DatosGenerales;

public class Productos extends DatosGenerales {
    private float precio;
    private int cantidad;

    public float getPrecio(){
        return  precio;
    }
    public int getCantidad(){
        return  cantidad;
    }

    public void setPrecio(float precio){
       this.precio=precio;
    }
    public void setCantidad(int cantidad){
        this.cantidad=cantidad;
    }

    public Productos(String nombre, float precio){
        this.setNombre(nombre);
        this.setPrecio(precio);
    }

    @Override
    public String toString(){
        return "producto: "+ getNombre() + " precio: "+ getPrecio();
    }


}
