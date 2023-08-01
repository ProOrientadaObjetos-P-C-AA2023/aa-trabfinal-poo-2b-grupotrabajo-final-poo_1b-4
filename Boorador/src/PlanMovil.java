public abstract class PlanMovil {
    protected String tipoPlan;
    protected PlanMovil planmovil;

    public PlanMovil(String tipoPlan, PlanMovil planmovil) {
        this.tipoPlan = tipoPlan;
        this.planmovil = planmovil;
    }
        
    
    public abstract double calcularCostoTotal();
    
}
