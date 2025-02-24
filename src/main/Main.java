package main;

import java.util.Scanner;

import modelo.GestorTareas;
import modelo.Tarea;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GestorTareas gestor = new GestorTareas();
        int opcion;

        do {
            System.out.println("\nMenú:");
            System.out.println("1. Agregar nueva tarea");
            System.out.println("2. Procesar tarea más urgente");
            System.out.println("3. Mostrar lista de tareas");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir nueva línea

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese la tarea: ");
                    String descripcion = scanner.nextLine();
                    System.out.print("Ingrese la prioridad (Alta, Media, Baja): ");
                    String prioridad = scanner.nextLine();
                    gestor.agregarTarea(descripcion, prioridad);
                    break;
                case 2:
                    Tarea tareaProcesada = gestor.procesarTarea();
                    if (tareaProcesada != null) {
                        System.out.println("Tarea procesada: " + tareaProcesada);
                    } else {
                        System.out.println("No hay tareas pendientes.");
                    }
                    break;
                case 3:
                    System.out.println("Tareas pendientes:");
                    gestor.mostrarTareas();
                    break;
                case 4:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        } while (opcion != 4);

        scanner.close();
    }
}
