Gestor de Tareas

Este es un programa en Java que permite gestionar tareas con diferentes niveles de prioridad. Los usuarios pueden agregar nuevas tareas, procesar la tarea más urgente y visualizar la lista de tareas pendientes.

Cabe resaltar que la estructura del código ha sido implementado bajo el uso de colas prioritarias, y utilizando técnicas de POO para llevar un orden claro sobre las clases programadas.

Características

    *   Permite agregar tareas con tres niveles de prioridad: Alta, Media y Baja.

    *   Procesa las tareas en orden de urgencia (Alta > Media > Baja).

    *   Muestra la lista de tareas pendientes con su prioridad.

    *   Maneja errores en la entrada de datos.

Requisitos

   *   Para ejecutar el programa, es necesario tener instalado:

   *   Java 8 o superior

   *   NetBeans, Eclipse, Visual Studio o cualquier otro IDE compatible con Java

Instalación y Ejecución

   *   Clonar este repositorio o descargar el código fuente.

   *   Abrir el proyecto en un IDE compatible.

   *   Compilar y ejecutar el programa.

Uso

Al ejecutar el programa, se mostrará el siguiente menú:

=================================
        GESTOR DE TAREAS        
=================================

1. Agregar nueva tarea
2. Procesar tarea más urgente
3. Mostrar lista de tareas
4. Salir

=================================
Seleccione una opción:

Opciones disponibles:

Opción 1: Permite ingresar una nueva tarea y establecer su prioridad.

Opción 2: Procesa la tarea más urgente (prioridad más alta primero).

Opción 3: Muestra la lista de tareas pendientes.

Opción 4: Sale del programa.

Ejemplo de Uso

Agregar una tarea:

Seleccione una opción: 1
Ingrese la tarea: Limpiar casa
Prioridad (Alta / Media / Baja): Media
Tarea agregada con éxito.

Mostrar lista de tareas:

Seleccione una opción: 3

TAREAS PENDIENTES
---------------------------------
[Prioridad: 2] Limpiar casa
---------------------------------

Procesar tarea:

Seleccione una opción: 2
Tarea procesada: [Prioridad: 2] Limpiar casa

Errores y Validaciones

Si el usuario ingresa una opción no válida, el programa mostrará un mensaje de error y solicitará un nuevo ingreso.

Si se intenta procesar una tarea cuando no hay tareas pendientes, se mostrará un mensaje indicando que no hay tareas disponibles.

Autor

Desarrollado por José Gabriel Morales Galindo, estudiante en Ingeniería en Sistemas, como parte de un ejercicio de programación en Java.

Licencia

Este proyecto es de código abierto y puede ser utilizado libremente para fines educativos.

