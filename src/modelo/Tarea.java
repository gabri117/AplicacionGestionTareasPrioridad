//Paquete al que pertenece la clase
package modelo;

//Clase que representa una tarea
public class Tarea implements Comparable<Tarea> {
    private String descripcion; // Descripción de la tarea
    private int prioridad; // 1 = Alta, 2 = Media, 3 = Baja

    // Constructor de la clase
    public Tarea(String descripcion, String prioridad) {
        this.descripcion = descripcion;
        this.prioridad = asignarPrioridad(prioridad);
    }

    // Método que asigna un valor numérico a la prioridad de la tarea
    private int asignarPrioridad(String prioridad) {
        return switch (prioridad.toLowerCase()) {
            case "alta" -> 1; // Si la prioridad es alta, asigna el valor 1
            case "media" -> 2; // Si la prioridad es media, asigna el valor 2
            case "baja" -> 3; // Si la prioridad es baja, asigna el valor 3
            default -> 4; // Por si hay error en la entrada
        };
    }

    // Método que retorna la descripción de la tarea
    public String getDescripcion() {
        return descripcion;
    }

    // Método que retorna la prioridad de la tarea
    public int getPrioridad() {
        return prioridad;
    }

    // Método que compara dos tareas por prioridad
    @Override
    public int compareTo(Tarea otra) {
        return Integer.compare(this.prioridad, otra.prioridad); // Compara las prioridades de las tareas
    }

    // Método que retorna la representación en cadena de la tarea
    @Override
    public String toString() {
        return "[Prioridad: " + prioridad + "] " + descripcion; // Retorna la prioridad y la descripción de la tarea
    }
}
