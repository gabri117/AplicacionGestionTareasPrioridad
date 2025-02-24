//Paquete al que pertenece la clase
package main;

// Importación de las clases Scanner y InputMismatchException de la biblioteca estándar de Java
import java.util.InputMismatchException;
import java.util.Scanner;

// Importación de las clases GestorTareas y Tarea del paquete modelo previamente programadas
import modelo.GestorTareas;
import modelo.Tarea;
import utilidades.Colores;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GestorTareas gestor = new GestorTareas(); // Creación de un objeto de la clase GestorTareas
        int opcion = 0; // Variable que almacena la opción seleccionada por el usuario

        // Menú de opciones
        do {
            try {
                System.out.println(Colores.CYAN + "\n=================================" + Colores.RESET);
                System.out.println(Colores.WHITE_BOLD + "        GESTOR DE TAREAS        " + Colores.RESET);
                System.out.println(Colores.CYAN + "=================================\n" + Colores.RESET);

                System.out.println(Colores.GREEN + "1. Agregar nueva tarea" + Colores.RESET);
                System.out.println(Colores.YELLOW + "2. Procesar tarea más urgente" + Colores.RESET);
                System.out.println(Colores.BLUE + "3. Mostrar lista de tareas" + Colores.RESET);
                System.out.println(Colores.RED + "4. Salir" + Colores.RESET);
                System.out.println(Colores.CYAN + "\n=================================" + Colores.RESET);
                System.out.print("Seleccione una opción: ");

                if (!scanner.hasNextInt()) { // Validar entrada numérica
                    System.out.println(Colores.RED + "Error: Debe ingresar un número." + Colores.RESET);
                    scanner.next(); // Consumir entrada incorrecta
                    continue; // Volver a mostrar el menú
                }

                opcion = scanner.nextInt();
                scanner.nextLine(); // Consumir nueva línea

                switch (opcion) {
                    case 1:
                        System.out.print(Colores.BLUE + "Ingrese la tarea: " + Colores.RESET);
                        String descripcion = scanner.nextLine().trim();

                        // Validar prioridad
                        String prioridad;
                        while (true) {
                            System.out.print(Colores.YELLOW + "Prioridad (Alta / Media / Baja): " + Colores.RESET);
                            prioridad = scanner.nextLine().trim().toLowerCase();

                            if (prioridad.equals("alta") || prioridad.equals("media") || prioridad.equals("baja")) {
                                prioridad = prioridad.substring(0, 1).toUpperCase() + prioridad.substring(1);
                                break;
                            }
                            System.out
                                    .println(Colores.RED + "Error: Ingrese 'Alta', 'Media' o 'Baja'." + Colores.RESET);
                        }

                        gestor.agregarTarea(descripcion, prioridad);
                        System.out.println(Colores.GREEN + "Tarea agregada con éxito." + Colores.RESET);
                        break;

                    case 2:
                        Tarea tareaProcesada = gestor.procesarTarea();
                        if (tareaProcesada != null) {
                            System.out.println(Colores.GREEN + "Tarea procesada: " + tareaProcesada + Colores.RESET);
                        } else {
                            System.out.println(Colores.RED + "No hay tareas pendientes." + Colores.RESET);
                        }
                        break;

                    case 3:
                        System.out.println(Colores.MAGENTA + "\nTAREAS PENDIENTES" + Colores.RESET);
                        System.out.println(Colores.CYAN + "---------------------------------" + Colores.RESET);
                        gestor.mostrarTareas();
                        System.out.println(Colores.CYAN + "---------------------------------\n" + Colores.RESET);
                        break;

                    case 4:
                        System.out.println(Colores.RED + "Saliendo del programa... Hasta luego." + Colores.RESET);
                        break;

                    default:
                        System.out.println(Colores.RED + "Error: Opción no válida. Intente de nuevo." + Colores.RESET);
                }
            } catch (InputMismatchException e) {
                System.out.println(Colores.RED + "Error: Debe ingresar un número válido." + Colores.RESET);
                scanner.nextLine(); // Consumir entrada incorrecta
            }

        } while (opcion != 4);

        scanner.close();
    }
}
