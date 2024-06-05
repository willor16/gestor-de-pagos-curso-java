package com.wilmer.gestordepagos.clasesprincipales;

import com.wilmer.gestordepagos.cuentadepago.CuentaCliente;
import com.wilmer.gestordepagos.superclase.DatosGenerales;
import com.wilmer.gestordepagos.tiendaproductos.Productos;

import java.sql.Array;
import java.sql.ClientInfoStatus;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner tecladoEntrada = new Scanner(System.in);
        Productos mouse = new Productos("mouse logitech", 180);
        Productos teclado =new Productos("teclado reddragon", 600);
        Productos monitor = new Productos("monitor asus tuf gaming", 790);
        ArrayList<DatosGenerales> listaDeProductos = new ArrayList<>();
        listaDeProductos.add(mouse);
        listaDeProductos.add(teclado);
        listaDeProductos.add(monitor);
        CuentaCliente saldo = new CuentaCliente();
        ArrayList compras = new ArrayList();
        System.out.println("********************************");
        System.out.println("bienvenido al sistema de compras");
        System.out.println("********************************");
        boolean comprobacion= true;
        int comprobarteclado = 0;
        System.out.println(listaDeProductos);
        System.out.println("ingrese su saldo");
        saldo.setSaldo(tecladoEntrada.nextFloat());
        while (saldo.getSaldo()>0 && comprobacion == true){
            System.out.println(listaDeProductos);
            System.out.println("desea seguir comprando? ");
            System.out.println("1. si ");
            System.out.println("2. no ");
            comprobarteclado=tecladoEntrada.nextInt();
            if (comprobarteclado == 1) {
                System.out.println(listaDeProductos);
            }else {
                break;
            }


        }

    }
}