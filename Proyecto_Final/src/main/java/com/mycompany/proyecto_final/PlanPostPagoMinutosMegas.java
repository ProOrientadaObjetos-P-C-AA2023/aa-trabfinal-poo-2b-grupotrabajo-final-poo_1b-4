package com.mycompany.proyecto_final;
public class PlanPostPagoMinutosMegas extends PlanesMoviles{ 

    public PlanPostPagoMinutosMegas(double minutos, double costoMinutos, double megasExpresadosGigas, double costoGiga) {
        super(minutos, costoMinutos, megasExpresadosGigas, costoGiga);
    }

    @Override
    public void calcularCosto() {
        this.pagoFinal = this.costoMinutos * this.minutos + ((this.megasExpresadosGigas / 1024) * this.costoGiga);
    }

    @Override
    public String toString() {
        return "PlanPostPagoMinutosMegas{" + '}';
    }
    
    
    
}
