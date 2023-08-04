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
    public PlanPostPagoMinutosMegas plan4;
    public int numeroPLanesAsignados = 0; 

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
    //MÉTODOS PARA AGREGAR AL CLIENTE MÁXIMO 2 PLANES
    public void agregarPlan1(PlanPostPagoMinutosMegasEconomico plan) {
        if (plan1 == null) {
            plan1 = plan;
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
    
    public void agregarPlan4(PlanPostPagoMinutosMegas plan) {
        if (plan4 == null) {
            plan4 = plan;
        } else {
            System.out.println("El cliente ya tiene asignado un tipo de plan.");
        }
    }
    //MÉTODOS PARA ELIMINA PLANES SI EL CLIENTE TINE MAXIMO 2 PLANES 
    public void eliminarPlan(PlanPostPagoMinutosMegasEconomico plan) {
        if (plan1 == plan) {
            plan1 = null;
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
    
    public void eliminarPlan(PlanPostPagoMinutosMegas plan) {
        if (plan4 != null) {
            plan4 = null;
        } else {
            System.out.println("El cliente no tiene asignado el plan PlanPostPagoMinutosMegas.");
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Cliente: ").append(nombres).append(" , Cédula/Pasaporte: ").append(ceduPas);
        sb.append(" , Ciudad: ").append(ciudad).append(", Marca del Celular: ").append(marca);
        sb.append(" , Modelo del Celular:").append(modelo).append(" , Número de Celular:").append(numero);
        sb.append(" , Pago Mensual").append(pagoMensual).append(" , Correo:").append(correo);
        sb.append(" , Direccion:").append(direccion);
        
        //PLANES DEL CLIENTE
        sb.append("\n Planes Asignados:");
        if (plan1 != null) {
            sb.append("\n Plan PostPagoMinutosMegasEconomicos: ").append(plan1);
        }
        if (plan2 != null) {
            sb.append("\n Plan PostPagoMinutos: ").append(plan2);
        }
        if (plan3 != null) {
            sb.append("\n Plan PostPagoMegas: ").append(plan3);
        }
        if (plan4 != null) {
            sb.append("\n Plan PostPagoMinutosMegas: ").append(plan4);
        }
        return sb.toString();
    }

}
