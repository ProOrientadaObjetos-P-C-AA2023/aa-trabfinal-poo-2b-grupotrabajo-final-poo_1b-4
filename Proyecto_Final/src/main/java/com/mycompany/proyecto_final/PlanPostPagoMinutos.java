package com.mycompany.proyecto_final;
public class PlanPostPagoMinutos extends PlanesMoviles {
    public double minutosInt;
    public double costoMinutosInt;

    public PlanPostPagoMinutos(double minutosInt, double costoMinutosInt, double minutos, double costoMinutos) {
        super(minutos, costoMinutos);
        this.minutosInt = minutosInt;
        this.costoMinutosInt = costoMinutosInt;
    }    

    public double getMinutosInt() {
        return minutosInt;
    }

    public void setMinutosInt(double minutosInt) {
        this.minutosInt = minutosInt;
    }

    public double getCostoMinutosInt() {
        return costoMinutosInt;
    }

    public void setCostoMinutosInt(double costoMinutosInt) {
        this.costoMinutosInt = costoMinutosInt;
    }

    @Override
    public void calcularCosto() {
        this.pagoFinal = this.minutos * this.costoMinutos + (this.minutosInt * this.costoMinutosInt);
    }

    @Override
    public String toString() {
        return "PlanPostPagoMinutos{" + "minutosInt=" + minutosInt + ", costoMinutosInt=" + costoMinutosInt + '}';
    }
    
    
    
}
