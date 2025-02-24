package modelo;

import java.util.PriorityQueue;

public class GestorTareas {
    private PriorityQueue<Tarea> colaTareas;

    public GestorTareas() {
        this.colaTareas = new PriorityQueue<>();
    }

    public void agregarTarea(String descripcion, String prioridad) {
        Tarea nuevaTarea = new Tarea(descripcion, prioridad);
        colaTareas.offer(nuevaTarea);
    }

    public Tarea procesarTarea() {
        return colaTareas.poll();
    }

    public void mostrarTareas() {
        for (Tarea tarea : colaTareas) {
            System.out.println(tarea);
        }
    }
}