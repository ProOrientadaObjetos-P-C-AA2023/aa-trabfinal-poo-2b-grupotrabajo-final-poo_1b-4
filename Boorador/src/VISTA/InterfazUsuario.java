package VISTA;

import CONTROLADOR.ControladorClientes;
import CONTROLADOR.ControladorPlanes;
import MODELO.Cliente;
import MODELO.*;
import java.util.Scanner;

public class InterfazUsuario {
    private ControladorClientes controladorClientes;
    private ControladorPlanes controladorPLan;
    private Scanner scanner;
    
    public InterfazUsuario(){
        controladorClientes = new ControladorClientes();
        controladorPLan = new ControladorPlanes();
        scanner = new Scanner(System.in);
    }
    public void mostrarPrincipal(){
        int opcion;
        do{
            System.out.println("========== MENÚ PRINCIPAL ==========");
            System.out.println(" AGREGAR   CLIENTE    [1]");
            System.out.println("  BUSCAR   CLIENTE    [2]");
            System.out.println("ACTUALIZAR CLIENTE    [3]");
            System.out.println(" ELIMINAR  CLIENTE    [4]");
            System.out.println(" AGREGAR    PLAN      [5]");
            System.out.println("  BUSCAR    PLAN      [6]");
            System.out.println("ACTUALIZAR  PLAN      [7]");
            System.out.println(" ELIMINAR   PLAN      [8]");
            System.out.println(" GENERAR   FACTURA    [9]");
            System.out.println(" SALIDA DEL PROGRAMA  [0]");
            System.out.print("INGRESE LA OPCION DESEADA☻: ");
            opcion = scanner.nextInt();
            switch (opcion) {
                case 1:
                    agregarCliente();
                    break;
                case 2:
                    buscarCliente();
                    break;
                case 3:
                    actualizarCliente();
                    break;
                case 4:
                    eliminarCliente();
                    break;
                case 5:
                    agregarPlan();
                    break;
                case 6:
                    buscarPlan();
                    break;
                case 7:
                    actualizarPlan();
                    break;
                case 8:
                    eliminarPlan();
                    break;
                case 9:
                    generarFactura();
                    break;
                case 0:
                    System.out.println("¡HASTA LUEGO!");
                    break;
                default:
                        System.out.println("OPCIÓN INGRESADA INCORRECTA. SELECCIONE LA CORRECTA PROPUESTA EN EL MENU");
                    break;
                }
        }while (opcion != 0);
    }

    private void agregarCliente() {
        System.out.println("=== AGREGAR CLIENTE ===");
        System.out.println("Ingrese los nombres del cliente:");
        String nombres = scanner.next();
        System.out.println("Ingrese la cédula del cliente:");
        String cedula = scanner.next();
        System.out.println("Ingrese la ciudad del cliente:");
        String ciudad = scanner.next();
        System.out.println("Ingrese la marca del celular:");
        String marca = scanner.next();
        System.out.println("Ingrese el modelo del celular:");
        String modelo = scanner.next();
        System.out.println("Ingrese el número de celular:");
        String numeroCelular = scanner.next();
        System.out.println("Ingrese el pago mensual:");
        double pagoMensual = scanner.nextDouble();

    Cliente nuevoCliente = new Cliente(nombres, cedula, ciudad, marca, modelo, numeroCelular, pagoMensual, modelo, modelo, true, modelo);
        controladorClientes.agregarCliente(nuevoCliente);
        System.out.println("Cliente agregado correctamente.");
    }

    private void buscarCliente() {
        System.out.println("=== BUSCAR CLIENTE ===");
        System.out.println("Ingrese la cédula del cliente que desea buscar:");
        String cedula = scanner.next();
        Cliente clienteEncontrado = controladorClientes.buscarClientePorCedula(cedula);
        if (clienteEncontrado != null) {
            System.out.println("Cliente encontrado:");
            System.out.println("Nombres: " + clienteEncontrado.getNombre());
            System.out.println("Cédula: " + clienteEncontrado.getCedula());
            System.out.println("Ciudad: " + clienteEncontrado.getCiudad());
            System.out.println("Marca del celular: " + clienteEncontrado.getMarca());
            System.out.println("Modelo del celular: " + clienteEncontrado.getModelo());
            System.out.println("Número de celular: " + clienteEncontrado.getNumeroCelular());
            System.out.println("Pago mensual: " + clienteEncontrado.getPagoMensual());
        } else {
            System.out.println("Cliente no encontrado.");
        }
    }
    private void actualizarCliente() {
        System.out.println("=== ACTUALIZAR CLIENTE ===");
        System.out.println("Ingrese la cédula del cliente que desea actualizar:");
        String cedula = scanner.next();
        Cliente clienteEncontrado = controladorClientes.buscarClientePorCedula(cedula);
        if (clienteEncontrado != null) {
            System.out.println("Ingrese los nuevos nombres del cliente:");
            String nuevosNombres = scanner.next();
            System.out.println("Ingrese la nueva ciudad del cliente:");
            String nuevaCiudad = scanner.next();
            
            clienteEncontrado.setNombre(nuevosNombres);
            clienteEncontrado.setCiudad(nuevaCiudad);

            controladorClientes.actualizarCliente(clienteEncontrado);
            System.out.println("Cliente actualizado correctamente.");
        } else {
            System.out.println("Cliente no encontrado.");
        }
    }
    private void eliminarCliente() {
        System.out.println("==ELIMINAR CLIENTE==");
        System.out.println("Ingrese la cédula del cliente que desea eliminar:");
        String cedula = scanner.next();
        controladorClientes.eliminarCliente(cedula);
        System.out.println("Cliente eliminado correctamente.");
    }

    private void agregarPlan() {
        System.out.println("Ingrese los datos del plan:");

        System.out.print("Nombre: ");
        String nombre = scanner.nextLine();

        System.out.print("Descripción: ");
        String descripcion = scanner.nextLine();

        System.out.print("Precio: ");
        double precio = scanner.nextDouble();

        Plan nuevoPlan = new Plan(nombre, descripcion, precio);
        planes.add(nuevoPlan);

        System.out.println("¡Plan agregado correctamente!");
    }    
}

    
