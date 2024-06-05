package com.wilmer.gestordepagos.cuentadepago;

import com.wilmer.gestordepagos.superclase.DatosGenerales;

public class CuentaCliente extends DatosGenerales {
    private float saldo;

    public float getSaldo(){
        return  saldo;
    }

    public void setSaldo(float saldo){
        this.saldo=saldo;
    }

}
