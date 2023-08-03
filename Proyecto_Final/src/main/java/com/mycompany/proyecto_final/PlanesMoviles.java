package com.mycompany.proyecto_final;
public abstract class PlanesMoviles {
    public double minutos;
    public double costoMinutos;
    public double megasExpresadosGigas;
    public double costoGiga;
    public double pagoFinal;

    public PlanesMoviles(double minutos, double costoMinutos, double megasExpresadosGigas, double costoGiga) {
        this.minutos = minutos;
        this.costoMinutos = costoMinutos;
        this.megasExpresadosGigas = megasExpresadosGigas;
        this.costoGiga = costoGiga;
    }

    public PlanesMoviles(double megasExpresadosGigas, double costoGiga) {
        this.megasExpresadosGigas = megasExpresadosGigas;
        this.costoGiga = costoGiga;
    }
    
    

    public double getMinutos() {
        return minutos;
    }

    public void setMinutos(double minutos) {
        this.minutos = minutos;
    }

    public double getCostoMinutos() {
        return costoMinutos;
    }

    public void setCostoMinutos(double costoMinutos) {
        this.costoMinutos = costoMinutos;
    }

    public double getMegasExpresadosGigas() {
        return megasExpresadosGigas;
    }

    public void setMegasExpresadosGigas(double megasExpresadosGigas) {
        this.megasExpresadosGigas = megasExpresadosGigas;
    }

    public double getCostoGiga() {
        return costoGiga;
    }

    public void setCostoGiga(double costoGiga) {
        this.costoGiga = costoGiga;
    }

    public double getDescuento() {
        return pagoFinal;
    }

    public void setDescuento(double pagoFinal) {
        this.pagoFinal = pagoFinal;
    }
    
    public abstract void calcularCosto();

    @Override
    public String toString() {
        return "PlanesMoviles{" + "minutos=" + minutos + ", costoMinutos=" + costoMinutos + ", megasExpresadosGigas=" + megasExpresadosGigas + ", costoGiga=" + costoGiga + ", pagoFinal=" + pagoFinal + '}';
    }
    
    
    
}
