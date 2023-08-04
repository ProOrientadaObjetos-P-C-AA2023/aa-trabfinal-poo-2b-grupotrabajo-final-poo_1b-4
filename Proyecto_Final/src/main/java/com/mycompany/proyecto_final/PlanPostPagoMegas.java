package com.mycompany.proyecto_final;
public class PlanPostPagoMegas extends PlanesMoviles {
    public double tarifaBase;

    public PlanPostPagoMegas(double tarifaBase, double megasExpresadosGigas, double costoGiga) {
        super(megasExpresadosGigas, costoGiga);
        this.tarifaBase = tarifaBase;
    }

    public double getTarifaBase() {
        return tarifaBase;
    }

    public void setTarifaBase(double tarifaBase) {
        this.tarifaBase = tarifaBase;
    }

    @Override
    public void calcularCosto() {
        this.pagoFinal = (this.megasExpresadosGigas / 1024) * this.costoGiga;
    }

    @Override
    public String toString() {
        return "PlanPostPagoMegas{" + "tarifaBase=" + tarifaBase + '}' + super.toString();
    }    
}
