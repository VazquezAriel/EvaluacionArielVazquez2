# Validación de Movimiento del Alfil en Ajedrez

Este programa, implementado en Java 11, determina la corrección de un movimiento de un alfil en un tablero de ajedrez. En una sola jugada, el alfil puede moverse en diagonal a cualquier punto del tablero, tomando como base el punto de partida. El programa recibe como entrada las posiciones de partida y final del alfil y verifica si el movimiento es correcto.

## Estructura del Proyecto

La estructura del código se divide en tres clases:

1. **Main**: Clase principal que contiene el método `main` para ejecutar el programa.

2. **InputData**: Clase encargada de manejar la entrada de datos, obteniendo las posiciones de partida y final.

3. **Process**: Clase responsable de validar el movimiento del alfil en el tablero de ajedrez.

## Instrucciones para Compilar y Ejecutar

Para compilar el programa, utiliza el siguiente comando en la terminal:

```bash
javac Main.java
java Main
