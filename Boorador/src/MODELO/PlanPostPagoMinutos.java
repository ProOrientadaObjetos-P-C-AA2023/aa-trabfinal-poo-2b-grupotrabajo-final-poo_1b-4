package MODELO;
public class PlanPostPagoMinutos extends Cliente{
    private int minutosNacionales;
    private double costoMinutoNacional;
    private int minutosInternacional;
    private double costoMinutoInternacional;

    public PlanPostPagoMinutos(int minutosNacionales, double costoMinutoNacional, int minutosInternacional, double costoMinutoInternacional, String nombre, String cedula, String ciudad, String marca, String modelo, String numeroCelular, double pagoMensual, String direccion, String correoElectronico, boolean esEstudiante, String fechaNacimineto) {
        super(nombre, cedula, ciudad, marca, modelo, numeroCelular, pagoMensual, direccion, correoElectronico, esEstudiante, fechaNacimineto);
        this.minutosNacionales = minutosNacionales;
        this.costoMinutoNacional = costoMinutoNacional;
        this.minutosInternacional = minutosInternacional;
        this.costoMinutoInternacional = costoMinutoInternacional;
    }
    

    public int getMinutosNacionales() {
        return minutosNacionales;
    }

    public void setMinutosNacionales(int minutosNacionales) {
        this.minutosNacionales = minutosNacionales;
    }

    public double getCostoMinutoNacional() {
        return costoMinutoNacional;
    }

    public void setCostoMinutoNacional(double costoMinutoNacional) {
        this.costoMinutoNacional = costoMinutoNacional;
    }

    public int getMinutosInternacional() {
        return minutosInternacional;
    }

    public void setMinutosInternacional(int minutosInternacional) {
        this.minutosInternacional = minutosInternacional;
    }

    public double getCostoMinutoInternacional() {
        return costoMinutoInternacional;
    }

    public void setCostoMinutoInternacional(double costoMinutoInternacional) {
        this.costoMinutoInternacional = costoMinutoInternacional;
    }
    
}
