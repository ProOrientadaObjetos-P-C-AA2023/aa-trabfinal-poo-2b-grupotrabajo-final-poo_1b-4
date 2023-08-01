public class PlanPostPagoMegas extends PlanMovil{
    private int megas;
    private double costoPorGigas;
    private double tarifaBase;

    public PlanPostPagoMegas(int megas, double costoPorGigas, double tarifaBase, String tipoPlan, PlanMovil planmovil) {
        super(tipoPlan, planmovil);
        this.megas = megas;
        this.costoPorGigas = costoPorGigas;
        this.tarifaBase = tarifaBase;
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

    public double getTarifaBase() {
        return tarifaBase;
    }

    public void setTarifaBase(double tarifaBase) {
        this.tarifaBase = tarifaBase;
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
