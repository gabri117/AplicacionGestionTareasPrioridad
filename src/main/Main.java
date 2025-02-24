//Paquete al que pertenece la clase
package main;

// Importación de las clases Scanner y InputMismatchException de la biblioteca estándar de Java
import java.util.InputMismatchException;
import java.util.Scanner;

// Importación de las clases GestorTareas y Tarea del paquete modelo previamente programadas
import modelo.GestorTareas;
import modelo.Tarea;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        GestorTareas gestor = new GestorTareas(); // Creación de un objeto de la clase GestorTareas
        int opcion; // Variable que almacena la opción seleccionada por el usuario

        // Menú de opciones
        do {
            System.out.println("\nMenú:");
            System.out.println("1. Agregar nueva tarea");
            System.out.println("2. Procesar tarea más urgente");
            System.out.println("3. Mostrar lista de tareas");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");
            System.out.print("--------------------------------\n"); //Agregado para separar el menú de las opciones
            opcion = scanner.nextInt();
            
            try{
                scanner.nextLine(); // Consumir nueva línea

                switch (opcion) {
                    case 1:
                        System.out.print("Ingrese la tarea: "); // Solicitar la descripción de la tarea
                        String descripcion = scanner.nextLine();
                        System.out.print("Ingrese la prioridad (Alta, Media, Baja): "); // Solicitar la prioridad de la tarea
                        String prioridad = scanner.nextLine();
                        gestor.agregarTarea(descripcion, prioridad); // Agregar una nueva tarea
                        break;
                    case 2:
                        Tarea tareaProcesada = gestor.procesarTarea(); // Procesar la tarea más urgente
                        if (tareaProcesada != null) { // Si hay tareas pendientes
                            System.out.println("Tarea procesada: " + tareaProcesada);
                        } else {
                            System.out.println("No hay tareas pendientes."); // Si no hay tareas pendientes
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
                } //Fin del switch
            } catch(InputMismatchException e){
                System.out.println("Debe ingresar un número entero.");
                scanner.nextLine(); // Consumir nueva línea
                opcion=0; // Reiniciar la opción para continuar el ciclo
            }
            
        } while (opcion != 4);

        scanner.close();
    }
}
