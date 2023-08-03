package com.mycompany.proyecto_final;

public class Cliente {

    public String nombres;
    public String ceduPas;
    public String ciudad;
    public String marca;
    public String modelo;
    public String numero;
    public double pagoMensual;
    public String correo;
    public String direccion;
    public PlanPostPagoMinutosMegasEconomico plan1;
    public PlanPostPagoMinutos plan2;
    public PlanPostPagoMegas plan3;

    public Cliente(String nombres, String ceduPas, String ciudad, String marca, String modelo, String numero, double pagoMensual, String correo, String direccion) {
        this.nombres = nombres;
        this.ceduPas = ceduPas;
        this.ciudad = ciudad;
        this.marca = marca;
        this.modelo = modelo;
        this.numero = numero;
        this.pagoMensual = pagoMensual;
        this.correo = correo;
        this.direccion = direccion;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public void setCeduPas(String ceduPas) {
        this.ceduPas = ceduPas;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public void setPagoMensual(double pagoMensual) {
        this.pagoMensual = pagoMensual;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getNombres() {
        return nombres;
    }

    public String getCeduPas() {
        return ceduPas;
    }

    public String getCiudad() {
        return ciudad;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String getNumero() {
        return numero;
    }

    public double getPagoMensual() {
        return pagoMensual;
    }

    public String getCorreo() {
        return correo;
    }

    public String getDireccion() {
        return direccion;
    }

    public void agregarPlan1(PlanPostPagoMinutosMegasEconomico plan) {
        if (plan1 == null) {
            plan1 = plan;
        } else if (plan2 == null) {
            plan2 = plan;
        } else {
            System.out.println("El cliente ya tiene asignados 2 tipos de planes.");
        }
    }

    public void agregarPlan2(PlanPostPagoMinutos plan) {
        if (plan2 == null) {
            plan2 = plan;
        } else {
            System.out.println("El cliente ya tiene asignados 2 tipos de planes.");
        }
    }

    public void agregarPlan3(PlanPostPagoMegas plan) {
        if (plan3 == null) {
            plan3 = plan;
        } else {
            System.out.println("El cliente ya tiene asignado un tipo de plan.");
        }
    }

    public void eliminarPlan(PlanPostPagoMinutosMegasEconomico plan) {
        if (plan1 == plan) {
            plan1 = null;
        } else if (plan2 == plan) {
            plan2 = null;
        } else {
            System.out.println("El cliente no tiene asignado este tipo de plan.");
        }
    }

    public void eliminarPlan(PlanPostPagoMinutos plan) {
        if (plan2 == plan) {
            plan2 = null;
        } else {
            System.out.println("El cliente no tiene asignado este tipo de plan.");
        }
    }

    public void eliminarPlan(PlanPostPagoMegas plan) {
        if (plan3 == plan) {
            plan3 = null;
        } else {
            System.out.println("El cliente no tiene asignado este tipo de plan.");
        }
    }

    @Override
    public String toString() {
        return "Cliente{" + "nombres=" + nombres + ", ceduPas=" + ceduPas + ", ciudad=" + ciudad + ", marca=" + marca + ", modelo=" + modelo + ", numero=" + numero + ", pagoMensual=" + pagoMensual + ", correo=" + correo + ", direccion=" + direccion + '}';
    }

}
