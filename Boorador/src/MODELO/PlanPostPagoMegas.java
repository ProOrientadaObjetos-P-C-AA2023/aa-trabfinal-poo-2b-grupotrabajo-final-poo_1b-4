package MODELO;
public class PlanPostPagoMegas extends Cliente{
    private double megaEnGigas;
    private double costoPorGigas;
    private double tarifaBase;

    public PlanPostPagoMegas(double megaEnGigas, double costoPorGigas, double tarifaBase, String nombre, String cedula, String ciudad, String marca, String modelo, String numeroCelular, double pagoMensual, String direccion, String correoElectronico, boolean esEstudiante, String fechaNacimineto) {
        super(nombre, cedula, ciudad, marca, modelo, numeroCelular, pagoMensual, direccion, correoElectronico, esEstudiante, fechaNacimineto);
        this.megaEnGigas = megaEnGigas;
        this.costoPorGigas = costoPorGigas;
        this.tarifaBase = tarifaBase;
    }
    

    public double getMegaEnGigas() {
        return megaEnGigas;
    }

    public void setMegaEnGigas(double megaEnGigas) {
        this.megaEnGigas = megaEnGigas;
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
    
    
}
