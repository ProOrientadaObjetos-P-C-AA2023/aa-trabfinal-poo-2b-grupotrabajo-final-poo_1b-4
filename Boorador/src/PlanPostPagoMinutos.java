public class PlanPostPagoMinutos extends PlanMovil{
    private int minutosNacionales;
    private double costoMinutosNacionales;
    private int minutosInternacionales;
    private double costoMinutosInternacional;

    public PlanPostPagoMinutos(int minutosNacionales, double costoMinutosNacionales, int minutosInternacionales, double costoMinutosInternacional, String tipoPlan, PlanMovil planmovil) {
        super(tipoPlan, planmovil);
        this.minutosNacionales = minutosNacionales;
        this.costoMinutosNacionales = costoMinutosNacionales;
        this.minutosInternacionales = minutosInternacionales;
        this.costoMinutosInternacional = costoMinutosInternacional;
    }

    public int getMinutosNacionales() {
        return minutosNacionales;
    }

    public void setMinutosNacionales(int minutosNacionales) {
        this.minutosNacionales = minutosNacionales;
    }

    public double getCostoMinutosNacionales() {
        return costoMinutosNacionales;
    }

    public void setCostoMinutosNacionales(double costoMinutosNacionales) {
        this.costoMinutosNacionales = costoMinutosNacionales;
    }

    public int getMinutosInternacionales() {
        return minutosInternacionales;
    }

    public void setMinutosInternacionales(int minutosInternacionales) {
        this.minutosInternacionales = minutosInternacionales;
    }

    public double getCostoMinutosInternacional() {
        return costoMinutosInternacional;
    }

    public void setCostoMinutosInternacional(double costoMinutosInternacional) {
        this.costoMinutosInternacional = costoMinutosInternacional;
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
