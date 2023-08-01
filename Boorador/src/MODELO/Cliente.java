package MODELO;
public class Cliente {
    private String nombre;
    private String cedula;
    private String ciudad;
    private String marca;
    private String modelo;
    private String numeroCelular;
    private double pagoMensual;
    private String direccion;
    private String correoElectronico;
    private boolean esEstudiante;
    private String fechaNacimineto;

    public Cliente(String nombre, String cedula, String ciudad, String marca, String modelo, String numeroCelular, double pagoMensual, String direccion, String correoElectronico, boolean esEstudiante, String fechaNacimineto) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.ciudad = ciudad;
        this.marca = marca;
        this.modelo = modelo;
        this.numeroCelular = numeroCelular;
        this.pagoMensual = pagoMensual;
        this.direccion = direccion;
        this.correoElectronico = correoElectronico;
        this.esEstudiante = esEstudiante;
        this.fechaNacimineto = fechaNacimineto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getNumeroCelular() {
        return numeroCelular;
    }

    public void setNumeroCelular(String numeroCelular) {
        this.numeroCelular = numeroCelular;
    }

    public double getPagoMensual() {
        return pagoMensual;
    }

    public void setPagoMensual(double pagoMensual) {
        this.pagoMensual = pagoMensual;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public boolean isEsEstudiante() {
        return esEstudiante;
    }

    public void setEsEstudiante(boolean esEstudiante) {
        this.esEstudiante = esEstudiante;
    }

    public String getFechaNacimineto() {
        return fechaNacimineto;
    }

    public void setFechaNacimineto(String fechaNacimineto) {
        this.fechaNacimineto = fechaNacimineto;
    }
    
}
