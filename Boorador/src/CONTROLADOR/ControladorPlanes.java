package CONTROLADOR;

import MODELO.*;
import java.util.ArrayList;

public class ControladorPlanes {
    private ArrayList<PlanPostPagoMinutosMegasEconomico> listaPlanesMinutosMegasEconomico;
    private ArrayList<PlanPostPagoMinutos> listaPlaneMinutos;
    private ArrayList<PlanPostPagoMegas> listaPlanesMegas;
    private ArrayList<PlanPostPagoMinutosMegas> listaPlanesMinutosMegas;
    
    public ControladorPlanes(){
        listaPlanesMinutosMegasEconomico = new ArrayList<>();
        listaPlaneMinutos = new ArrayList<>();
        listaPlanesMegas = new ArrayList<>();
        listaPlanesMinutosMegas = new ArrayList<>();
    }
    public void agregarPlanMinutosMegasEconomico(PlanPostPagoMinutosMegasEconomico plan){
        listaPlanesMinutosMegasEconomico.add(plan);
    }
    
    public PlanPostPagoMinutosMegasEconomico buscarPlanMinutosMegasEconomico(String nombre){
        for(PlanPostPagoMinutosMegasEconomico planAux: listaPlanesMinutosMegasEconomico){
            if (planAux.getNombre().equals(nombre)) {
                return planAux;
            }
        }
        return null;
    }
    public void actualizarPlanMinutosMegasEconomico(PlanPostPagoMinutosMegasEconomico plan){
        for (int i = 0; i < listaPlanesMinutosMegasEconomico.size(); i++) {
            if (listaPlanesMinutosMegasEconomico.get(i).getNombre().equals(plan.getNombre())) {
                listaPlanesMinutosMegasEconomico.set(i, plan);
                break;
            }
        }
    }
    public void eliminarPlanMinutosMegasEconomico(String nombre){
        for (int i = 0; i < listaPlanesMinutosMegasEconomico.size(); i++) {
            if (listaPlanesMinutosMegasEconomico.get(i).getNombre().equals(nombre)) {
                listaPlanesMinutosMegasEconomico.remove(i);
                break;
            }
        }
    }
    public void agregarlistaPlaneMinutos(PlanPostPagoMinutos plan){
        listaPlaneMinutos.add(plan);
    }
    
    public PlanPostPagoMinutos buscarPlanPostPagoMinutos(String nombre){
        for(PlanPostPagoMinutos planAux: listaPlaneMinutos){
            if (planAux.getNombre().equals(nombre)) {
                return planAux;
            }
        }
        return null;
    }
    public void actualizarPlanPostPagoMinutos(PlanPostPagoMinutos plan){
        for (int i = 0; i < listaPlaneMinutos.size(); i++) {
            if (listaPlaneMinutos.get(i).getNombre().equals(plan.getNombre())) {
                listaPlaneMinutos.set(i, plan);
                break;
            }
        }
    }
    public void eliminarPlanPostPagoMinutos(String nombre){
        for (int i = 0; i < listaPlaneMinutos.size(); i++) {
            if (listaPlaneMinutos.get(i).getNombre().equals(nombre)) {
                listaPlaneMinutos.remove(i);
                break;
            }
        }
    }
    public void agregarPlanPostPagoMegas(PlanPostPagoMegas plan){
        listaPlanesMegas.add(plan);
    }    
    public PlanPostPagoMegas buscarPlanPostPagoMegas(String nombre){
        for(PlanPostPagoMegas planAux: listaPlanesMegas){
            if (planAux.getNombre().equals(nombre)) {
                return planAux;
            }
        }
        return null;
    }
    public void actualizarPlanPostPagoMegas(PlanPostPagoMegas plan){
        for (int i = 0; i < listaPlanesMegas.size(); i++) {
            if (listaPlanesMegas.get(i).getNombre().equals(plan.getNombre())) {
                listaPlanesMegas.set(i, plan);
                break;
            }
        }
    }
    public void eliminarPlanPostPagoMegas(String nombre){
        for (int i = 0; i < listaPlanesMegas.size(); i++) {
            if (listaPlanesMegas.get(i).getNombre().equals(nombre)) {
                listaPlanesMegas.remove(i);
                break;
            }
        }
    }
    public void agregarPlanPostPagoMinutosMegas(PlanPostPagoMinutosMegas plan){
        listaPlanesMinutosMegas.add(plan);
    }
    
    public PlanPostPagoMinutosMegas buscarPlanPostPagoMinutosMegas(String nombre){
        for(PlanPostPagoMinutosMegas planAux: listaPlanesMinutosMegas){
            if (planAux.getNombre().equals(nombre)) {
                return planAux;
            }
        }
        return null;
    }
    public void actualizarPlanPostPagoMinutosMegas(PlanPostPagoMinutosMegas plan){
        for (int i = 0; i < listaPlanesMinutosMegas.size(); i++) {
            if (listaPlanesMinutosMegas.get(i).getNombre().equals(plan.getNombre())) {
                listaPlanesMinutosMegas.set(i, plan);
                break;
            }
        }
    }
    public void eliminarPlanPostPagoMinutosMegas(String nombre){
        for (int i = 0; i < listaPlanesMinutosMegas.size(); i++) {
            if (listaPlanesMinutosMegas.get(i).getNombre().equals(nombre)) {
                listaPlanesMinutosMegas.remove(i);
                break;
            }
        }
    }
}