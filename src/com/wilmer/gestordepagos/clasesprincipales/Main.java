package com.wilmer.gestordepagos.clasesprincipales;

import com.wilmer.gestordepagos.cuentadepago.CuentaCliente;
import com.wilmer.gestordepagos.superclase.DatosGenerales;
import com.wilmer.gestordepagos.tiendaproductos.Productos;

import java.sql.Array;
import java.sql.ClientInfoStatus;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner tecladoEntrada = new Scanner(System.in);
        Productos mouse = new Productos("mouse logitech", 180);
        Productos teclado =new Productos("teclado reddragon", 600);
        Productos monitor = new Productos("monitor asus tuf gaming", 790);
        ArrayList<Productos> listadecompras = new ArrayList<>();
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
        int longitud=0;
        System.out.println(listaDeProductos);
        System.out.println("ingrese su saldo");
        saldo.setSaldo(tecladoEntrada.nextFloat());
        while (saldo.getSaldo()>0 && comprobacion == true){
            System.out.println(listaDeProductos);
            System.out.println("1. comprar mouse");
            System.out.println("2. comprar teclado");
            System.out.println("3. comprar pantalla");
            longitud = tecladoEntrada.nextInt();
            switch (longitud){
                case 1:

                    saldo.setTotalAPagar(180+saldo.getTotalAPagar());
                    listadecompras.add(mouse);
                    break;
                case 2:
                    saldo.setTotalAPagar(600+saldo.getTotalAPagar());
                    listadecompras.add(teclado);
                    break;
                case 3:
                    saldo.setTotalAPagar(790+saldo.getTotalAPagar());
                    listadecompras.add(monitor);
                default:
                    System.out.println("opcion incorrecta");
            }
            System.out.println("total a pagar: " + saldo.getTotalAPagar());
            System.out.println("saldo restante: " + saldo.getSaldo());
            System.out.println("desea seguir comprando? ");
            System.out.println("1. si ");
            System.out.println("2. no ");
            comprobarteclado=tecladoEntrada.nextInt();
            if (comprobarteclado == 1) {
                comprobacion = true;
            }else {
                System.out.println("gracias por comprar:");
                listadecompras.sort(Comparator.comparing(Productos::getPrecio));
                System.out.println(listadecompras);
                System.out.println("total a pagar: " + saldo.getTotalAPagar());
                break;
            }

        }

    }
}