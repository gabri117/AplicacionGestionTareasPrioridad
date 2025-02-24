//Paquete al que pertenece la clase
package modelo;

// Importación de la clase PriorityQueue de la biblioteca estándar de Java.
import java.util.PriorityQueue;

public class GestorTareas {
    private PriorityQueue<Tarea> colaTareas; // Declaración de la case que gestionará la cola de tareas

    // Constructor de la clase
    public GestorTareas() {
        this.colaTareas = new PriorityQueue<>(); // Inicialización de la cola de tareas
    }

    // Método que agrega una tarea a la cola de tareas
    public void agregarTarea(String descripcion, String prioridad) {
        Tarea nuevaTarea = new Tarea(descripcion, prioridad); // Creación de una nueva tarea
        colaTareas.offer(nuevaTarea); // Agrega la tarea a la cola de tareas
    }

    // Método que procesa la tarea más urgente
    public Tarea procesarTarea() {
        return colaTareas.poll(); // Extrae y elimina la tarea más urgente de la cola de tareas
    }

    // Método que muestra las tareas pendientes
    public void mostrarTareas() {
        if (colaTareas.isEmpty()) {
            System.out.println("No hay tareas pendientes.");
            return;
        }
        for (Tarea tarea : colaTareas) {
            System.out.println(tarea);
        }
    }
}