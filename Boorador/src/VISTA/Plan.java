package VISTA;

import MODELO.Cliente;

public class Plan extends Cliente{
        private int minutos;
    private double costoMinutos;
    private double megaEnGigas;
    private double costoPorGigas;
    private double porcentajeDescuento;

    // Constructor para el Plan PostPagoMinutosMegasEconomico
    public Plan(int minutos, double costoMinutos, double megaEnGigas, double costoPorGigas, double porcentajeDescuento, String nombre, String cedula, String ciudad, String marca, String modelo, String numeroCelular, double pagoMensual, String direccion, String correoElectronico, boolean esEstudiante, String fechaNacimiento) {
        super(nombre, cedula, ciudad, marca, modelo, numeroCelular, pagoMensual, direccion, correoElectronico, esEstudiante, fechaNacimiento);
        this.minutos = minutos;
        this.costoMinutos = costoMinutos;
        this.megaEnGigas = megaEnGigas;
        this.costoPorGigas = costoPorGigas;
        this.porcentajeDescuento = porcentajeDescuento;
    }

    // Constructor para el Plan PostPagoMinutos
    public Plan(int minutosNacionales, double costoMinutoNacional, int minutosInternacional, double costoMinutoInternacional, String nombre, String cedula, String ciudad, String marca, String modelo, String numeroCelular, double pagoMensual, String direccion, String correoElectronico, boolean esEstudiante, String fechaNacimiento) {
        super(nombre, cedula, ciudad, marca, modelo, numeroCelular, pagoMensual, direccion, correoElectronico, esEstudiante, fechaNacimiento);
        this.minutos = minutosNacionales;
        this.costoMinutos = costoMinutoNacional;
        this.megaEnGigas = minutosInternacional;
        this.costoPorGigas = costoMinutoInternacional;
    }

    // Constructor para el Plan PostPagoMegas
    public Plan(double megaEnGigas, double costoPorGigas, double tarifaBase, String nombre, String cedula, String ciudad, String marca, String modelo, String numeroCelular, double pagoMensual, String direccion, String correoElectronico, boolean esEstudiante, String fechaNacimiento) {
        super(nombre, cedula, ciudad, marca, modelo, numeroCelular, pagoMensual, direccion, correoElectronico, esEstudiante, fechaNacimiento);
        this.megaEnGigas = megaEnGigas;
        this.costoPorGigas = costoPorGigas;
        this.porcentajeDescuento = tarifaBase;
    }

    // Constructor para el Plan PostPagoMinutosMegas
    public Plan(int minutos, double costoMinutos, double megaEnGigas, double costoPorGigas, String nombre, String cedula, String ciudad, String marca, String modelo, String numeroCelular, double pagoMensual, String direccion, String correoElectronico, boolean esEstudiante, String fechaNacimiento) {
        super(nombre, cedula, ciudad, marca, modelo, numeroCelular, pagoMensual, direccion, correoElectronico, esEstudiante, fechaNacimiento);
        this.minutos = minutos;
        this.costoMinutos = costoMinutos;
        this.megaEnGigas = megaEnGigas;
        this.costoPorGigas = costoPorGigas;
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
