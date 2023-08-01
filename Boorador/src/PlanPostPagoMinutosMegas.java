public class PlanPostPagoMinutosMegas extends PlanMovil{
    private int minutos;
    private double costoMinutos;
    private int megas;
    private double costoPorGiga;

    public PlanPostPagoMinutosMegas(int minutos, double costoMinutos, int megas, double costoPorGiga, String tipoPlan, PlanMovil planmovil) {
        super(tipoPlan, planmovil);
        this.minutos = minutos;
        this.costoMinutos = costoMinutos;
        this.megas = megas;
        this.costoPorGiga = costoPorGiga;
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

    public double getCostoPorGiga() {
        return costoPorGiga;
    }

    public void setCostoPorGiga(double costoPorGiga) {
        this.costoPorGiga = costoPorGiga;
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
