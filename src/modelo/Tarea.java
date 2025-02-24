package modelo;

import java.util.PriorityQueue;

public class Tarea implements Comparable<Tarea> {
    private String descripcion;
    private int prioridad; // 1 = Alta, 2 = Media, 3 = Baja

    public Tarea(String descripcion, String prioridad) {
        this.descripcion = descripcion;
        this.prioridad = asignarPrioridad(prioridad);
    }

    private int asignarPrioridad(String prioridad) {
        return switch (prioridad.toLowerCase()) {
            case "alta" -> 1;
            case "media" -> 2;
            default -> 3;
        };
    }

    public String getDescripcion() {
        return descripcion;
    }

    public int getPrioridad() {
        return prioridad;
    }

    @Override
    public int compareTo(Tarea otra) {
        return Integer.compare(this.prioridad, otra.prioridad);
    }

    @Override
    public String toString() {
        return "[Prioridad: " + prioridad + "] " + descripcion;
    }
}
