package MODELO;
public class PlanPostPagoMinutosMegasEconomico extends Cliente{
    private int minutos;
    private double costoMinutos;
    private double megaEnGigas;
    private double costoPorGigas;
    private double porcentajeDescuento;

    public PlanPostPagoMinutosMegasEconomico(int minutos, double costoMinutos, double megaEnGigas, double costoPorGigas, double porcentajeDescuento, String nombre, String cedula, String ciudad, String marca, String modelo, String numeroCelular, double pagoMensual, String direccion, String correoElectronico, boolean esEstudiante, String fechaNacimineto) {
        super(nombre, cedula, ciudad, marca, modelo, numeroCelular, pagoMensual, direccion, correoElectronico, esEstudiante, fechaNacimineto);
        this.minutos = minutos;
        this.costoMinutos = costoMinutos;
        this.megaEnGigas = megaEnGigas;
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

    public double getPorcentajeDescuento() {
        return porcentajeDescuento;
    }

    public void setPorcentajeDescuento(double porcentajeDescuento) {
        this.porcentajeDescuento = porcentajeDescuento;
    }
    
    
}
