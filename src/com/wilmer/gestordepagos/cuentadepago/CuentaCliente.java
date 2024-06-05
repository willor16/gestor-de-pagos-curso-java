package com.wilmer.gestordepagos.cuentadepago;

import com.wilmer.gestordepagos.superclase.DatosGenerales;

public class CuentaCliente extends DatosGenerales {
    private float saldo;
    private float totalAPagar;

    public float getTotalAPagar(){
        return totalAPagar;
    }
    public float getSaldo(){
        return  saldo;
    }

    public void setTotalAPagar(float pago){
        this.totalAPagar=pago;
    }
    public void setSaldo(float saldo){
        this.saldo=saldo;
    }

}
