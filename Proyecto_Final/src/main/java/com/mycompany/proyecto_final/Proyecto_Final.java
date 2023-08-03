package com.mycompany.proyecto_final;

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
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = Integer.parseInt(scanner.nextLine());

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


                    PlanPostPagoMinutosMegasEconomico planEconomico = new PlanPostPagoMinutosMegasEconomico(minutos,costoMin,megas,costoMeg);

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
                    
                    PlanPostPagoMinutos planMinutos = new PlanPostPagoMinutos(minutosNac,costoNac,minIn,costoIn);
                    // Asignar el plan PostPagoMinutos al cliente
                    clientes.agregarPlan2(planMinutos);
                    break;

                case 3:
                    System.out.println("\nIngrese los datos del plan PostPagoMegas:");
                    PlanPostPagoMegas planMegas = new PlanPostPagoMegas();
                    System.out.print("Megas en gigas: ");
                    planMegas.setMegasEnGigas(Double.parseDouble(scanner.nextLine()));

                    System.out.print("Costo por cada giga: ");
                    planMegas.setCostoPorGigas(Double.parseDouble(scanner.nextLine()));

                    System.out.print("Tarifa base: ");
                    planMegas.setTarifaBase(Double.parseDouble(scanner.nextLine()));

                    // Asignar el plan PostPagoMegas al cliente
                    cliente1.agregarPlan(planMegas);
                    break;

                case 4:
                    System.out.println("\nIngrese los datos del plan PostPagoMinutosMegas:");
                    PlanPostPagoMinutosMegas planMinutosMegas = new PlanPostPagoMinutosMegas();
                    System.out.print("Minutos: ");
                    planMinutosMegas.setMinutos(Integer.parseInt(scanner.nextLine()));

                    System.out.print("Costo por minutos: ");
                    planMinutosMegas.setCostoMinutos(Double.parseDouble(scanner.nextLine()));

                    System.out.print("Megas en gigas: ");
                    planMinutosMegas.setMegasEnGigas(Double.parseDouble(scanner.nextLine()));

                    System.out.print("Costo por cada giga: ");
                    planMinutosMegas.setCostoPorGigas(Double.parseDouble(scanner.nextLine()));

                    // Asignar el plan PostPagoMinutosMegas al cliente
                    cliente1.agregarPlan(planMinutosMegas);
                    break;

                case 5:
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("Opción inválida.");
            }
        } while (opcion != 5);

    }
}
