public class PlanPostPagoMinutoMegaEconomico extends PlanMovil{
    private int minutos;
    private double costoMinutos;
    private int megas;
    private double costoPorGigas;
    private double porcentajeDescuento;

    public PlanPostPagoMinutoMegaEconomico(int minutos, double costoMinutos, int megas, double costoPorGigas, double porcentajeDescuento, String tipoPlan, PlanMovil planmovil) {
        super(tipoPlan, planmovil);
        this.minutos = minutos;
        this.costoMinutos = costoMinutos;
        this.megas = megas;
        this.costoPorGigas = costoPorGigas;
        this.porcentajeDescuento = porcentajeDescuento;
    }

    public int getMinutos() {
        return minutos;
    }

    public void setMinutos(int minutos) {
        this.minutos = minutos;
    }

    public double getCostoMinutos() {
        return costoMinutos;
    }

    public void setCostoMinutos(double costoMinutos) {
        this.costoMinutos = costoMinutos;
    }

    public int getMegas() {
        return megas;
    }

    public void setMegas(int megas) {
        this.megas = megas;
    }

    public double getCostoPorGigas() {
        return costoPorGigas;
    }

    public void setCostoPorGigas(double costoPorGigas) {
        this.costoPorGigas = costoPorGigas;
    }

    public double getPorcentajeDescuento() {
        return porcentajeDescuento;
    }

    public void setPorcentajeDescuento(double porcentajeDescuento) {
        this.porcentajeDescuento = porcentajeDescuento;
    }

    public String getTipoPlan() {
        return tipoPlan;
    }

    public void setTipoPlan(String tipoPlan) {
        this.tipoPlan = tipoPlan;
    }

    public PlanMovil getPlanmovil() {
        return planmovil;
    }

    public void setPlanmovil(PlanMovil planmovil) {
        this.planmovil = planmovil;
    }
    
    @Override
    public double calcularCostoTotal() {
        return 0;        
    }
}
