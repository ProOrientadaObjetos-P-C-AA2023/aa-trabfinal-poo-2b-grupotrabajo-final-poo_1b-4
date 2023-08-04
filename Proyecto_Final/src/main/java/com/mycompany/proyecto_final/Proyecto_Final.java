package com.mycompany.proyecto_final;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Proyecto_Final {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        // Solicitar datos del cliente
        System.out.println("Ingrese los datos del cliente:");
        System.out.print("Nombres:      ADICIONAL: Cliente o Estudiante: ");
        String nombres = scanner.nextLine();

        System.out.print("Cédula/Pasaporte: ");
        String cedula = scanner.nextLine();

        System.out.print("Ciudad: ");
        String ciudad = scanner.nextLine();

        System.out.print("Marca del celular: ");
        String marca = scanner.nextLine();

        System.out.print("Modelo del celular: ");
        String modelo = scanner.nextLine();

        System.out.print("Número de celular: ");
        String numeroCelular = scanner.nextLine();

        System.out.print("Pago mensual: ");
        double pagoMensual = Double.parseDouble(scanner.nextLine());

        System.out.println("Ingrese el correo: ");
        String correo = scanner.nextLine();

        System.out.println("Ingrese la direccion: ");
        String dir = scanner.nextLine();

        // Crear cliente con los datos ingresados
        Cliente clientes = new Cliente(nombres, cedula, ciudad, marca, modelo, numeroCelular, pagoMensual, correo, dir);
        
        int opcion;
        do {
            System.out.println("\n===PLANES DE PAGO===");
            System.out.println("1. PlanPostPagoMinutosMegasEconomico");
            System.out.println("2. PlanPostPagoMinutos");
            System.out.println("3. PlanPostPagoMegas");
            System.out.println("4. PlanPostPagoMinutosMegas");
            System.out.println("5. Eliminar PLAN");
            System.out.println("6. GENERAR FACTURA");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("\nIngrese los datos del plan PostPagoMinutosMegasEconomico:");

                    System.out.print("Minutos: ");
                    double minutos = scanner.nextDouble();

                    System.out.print("Costo por minutos: ");
                    double costoMin = scanner.nextDouble();

                    System.out.print("Megas en gigas: ");
                    double megas = scanner.nextDouble();

                    System.out.print("Costo por cada giga: ");
                    double costoMeg = scanner.nextDouble();

                    PlanPostPagoMinutosMegasEconomico planEconomico = new PlanPostPagoMinutosMegasEconomico(minutos, costoMin, megas, costoMeg);
                    planEconomico.calcularCosto();
                    // Asignar el plan PostPagoMinutosMegasEconomico al cliente
                    clientes.agregarPlan1(planEconomico);
                    break;

                case 2:
                    System.out.println("\nIngrese los datos del plan PostPagoMinutos:");

                    System.out.print("Minutos nacionales: ");
                    double minutosNac = scanner.nextDouble();

                    System.out.print("Costo por minuto nacional: ");
                    double costoNac = scanner.nextDouble();

                    System.out.print("Minutos internacionales: ");
                    double minIn = scanner.nextDouble();

                    System.out.print("Costo por minuto internacional: ");
                    double costoIn = scanner.nextDouble();

                    PlanPostPagoMinutos planMinutos = new PlanPostPagoMinutos(minutosNac, costoNac, minIn, costoIn);
                    planMinutos.calcularCosto();
                    // Asignar el plan PostPagoMinutos al cliente
                    clientes.agregarPlan2(planMinutos);
                    break;

                case 3:
                    System.out.println("\nIngrese los datos del plan PostPagoMegas:");

                    System.out.print("Megas en gigas: ");
                    double megass = scanner.nextDouble();

                    System.out.print("Costo por cada giga: ");
                    double costoMegass = scanner.nextDouble();

                    System.out.print("Tarifa base: ");
                    double tarifa = scanner.nextDouble();

                    PlanPostPagoMegas planMegas = new PlanPostPagoMegas(tarifa, megass, costoMegass);
                    planMegas.calcularCosto();
                    // Asignar el plan PostPagoMegas al cliente
                    clientes.agregarPlan3(planMegas);
                    break;

                case 4:
                    System.out.println("\nIngrese los datos del plan PostPagoMinutosMegas:");

                    System.out.print("Minutos: ");
                    double minutoss = scanner.nextDouble();

                    System.out.print("Costo por minutos: ");
                    double costoMinn = scanner.nextDouble();

                    System.out.print("Megas en gigas: ");
                    double megasGig = scanner.nextDouble();

                    System.out.print("Costo por cada giga: ");
                    double costo = scanner.nextDouble();

                    PlanPostPagoMinutosMegas planMinutosMegas = new PlanPostPagoMinutosMegas(minutoss, costoMinn, megasGig, costo);
                    planMinutosMegas.calcularCosto();
                    // Asignar el plan PostPagoMinutosMegas al cliente
                    clientes.agregarPlan4(planMinutosMegas);
                    break;


                case 5:
                    System.out.println("\nEligir el plan a eliminar:");
                    System.out.println("1. PlanPostPagoMinutosMegasEconomico");
                    System.out.println("2. PlanPostPagoMinutos");
                    System.out.println("3. PlanPostPagoMegas");
                    System.out.println("4. PlanPostPagoMinutosMegas");
                    int opcionEliminar = scanner.nextInt();

                    switch (opcionEliminar) {
                        case 1:
                            System.out.println("Eliminando plan PlanPostPagoMinutosMegasEconomico...");
                            clientes.eliminarPlan(clientes.plan1);
                            break;
                        case 2:
                            System.out.println("Eliminando plan PlanPostPagoMinutos...");
                            clientes.eliminarPlan(clientes.plan2);
                            break;
                        case 3:
                            System.out.println("Eliminando plan PlanPostPagoMegas...");
                            clientes.eliminarPlan(clientes.plan3);
                            break;
                        case 4:
                            System.out.println("Eliminando plan PlanPostPagoMinutosMegas...");
                            clientes.eliminarPlan(clientes.plan4);
                            break;
                        default:
                            System.out.println("Opción inválida.");
                    }
                    break;

                case 6:
                    System.out.println("Generando factura...");
                    System.out.println(clientes.toString());
                    generarFactura(clientes);
                    break;

                case 0:
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("Opción inválida.");
            }
        } while (opcion != 0);

    }

    public static void generarFactura(Cliente cliente) {
        String nombreArchivo = "factura_" + cliente.getNombres() + ".csv";

        try {
            FileWriter fileWriter = new FileWriter(nombreArchivo);
            // Escribir datos del cliente en la factura
            try (PrintWriter printWriter = new PrintWriter(fileWriter)) {
                // Escribir datos del cliente en la factura
                printWriter.println("Nombre: " + cliente.getNombres());
                printWriter.println("Cédula/Pasaporte: " + cliente.getCeduPas());
                printWriter.println("Ciudad: " + cliente.getCiudad());
                printWriter.println("Marca del celular: " + cliente.getMarca());
                printWriter.println("Modelo del celular: " + cliente.getModelo());
                printWriter.println("Número de celular: " + cliente.getNumero());
                printWriter.println("Pago mensual: " + cliente.getPagoMensual());
                printWriter.println("Correo: " + cliente.getCorreo());
                printWriter.println("Dirección: " + cliente.getDireccion());

                // Escribir detalles de los planes
                if (cliente.plan1 != null) {
                    printWriter.println("Plan 1: " + cliente.plan1);
                }
                if (cliente.plan2 != null) {
                    printWriter.println("Plan 2: " + cliente.plan2);
                }
                if (cliente.plan3 != null) {
                    printWriter.println("Plan 3: " + cliente.plan3);
                }
                if (cliente.plan4 != null) {
                    printWriter.println("Plan 4: " + cliente.plan4);
                }

                // TOTAL A PAGAR
                double totalPagar = 0.0;
                if (cliente.plan1 != null) {
                    totalPagar += cliente.plan1.pagoFinal;
                }
                if (cliente.plan2 != null) {
                    totalPagar += cliente.plan2.pagoFinal;
                }
                if (cliente.plan3 != null) {
                    totalPagar += cliente.plan3.pagoFinal;
                }
                if (cliente.plan4 != null) {
                    totalPagar += cliente.plan4.pagoFinal;
                }

                printWriter.println("Total a pagar: " + totalPagar);
            }
            System.out.println("Factura generada correctamente.");

        } catch (IOException e) {
            System.err.println("Error al generar la factura.");
            e.printStackTrace();
        }
    }
}
