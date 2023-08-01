package CONTROLADOR;

import MODELO.Cliente;
import java.util.ArrayList;

public class ControladorClientes {
    private ArrayList<Cliente> listaCliente;
    
    public ControladorClientes(){
        listaCliente = new ArrayList<>();
    }
    public void agregarCliente(Cliente cliente){
        listaCliente.add(cliente);
    }
    public Cliente buscarClientePorCedula (String cedula){
        for (Cliente clienteAux : listaCliente) {
            if (clienteAux.getCedula().equals(cedula)) {
                return clienteAux;
            }
        }
        return null;
    }
    public void actualizarCliente(Cliente cliente){
        for (int i = 0; i < listaCliente.size(); i++) {
            if (listaCliente.get(i).getCedula().equals(cliente.getCedula())) {
                listaCliente.set(i, cliente);
                break;
            }            
        }
    }
    public void eliminarCliente(String cedula){
        for (int i = 0; i < listaCliente.size(); i++) {
            if (listaCliente.get(i).getCedula().equals(cedula)) {
                listaCliente.remove(i);
                break;
            }
        }
    }
    public ArrayList<Cliente> getTodosLosClientes(){
        return listaCliente;
    }
}
