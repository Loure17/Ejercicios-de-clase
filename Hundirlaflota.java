public class Hundirlaflota {

    /**
     * Crea unas coordenadas random para el barco de la CPU
     * 
     * @return devuelve la posicion en fila y columna
     */
    public static int[] cordendasCPU() {
        char[] columnas = { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J' };
        int[] filas = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

        // COORDENADA RANDOM

        // el lenght le indica cuantos elementos hay dentro del array
        int columnaAleatoria = (int) (Math.random() * columnas.length);
        int filaAleatoria = (int) (Math.random() * filas.length);

        // direccion random
        int direccion = (int) (Math.random() * 4) + 1;

        // EXPANSIÖN DE LA COORDENADA RANDOM

        // SE EXPANDE EN VERTICAL
        // vertical y se expande hacia abajo. A no ser que esté en la casilla tope
        if (direccion == 1) {
            if (columnaAleatoria != columnas[9]) {
                columnaAleatoria += columnas[+1];
            } else {
                columnaAleatoria += columnas[-1];
            }
            // vertical y se expande hacia arriba. A no ser que esté en el tope de la tabla
        } else if (direccion == 2) {
            if (columnaAleatoria != columnas[0]) {
                columnaAleatoria += columnas[-1];
            }
        }

        int[] resultado = { columnaAleatoria, filaAleatoria };

        return resultado;

    }

    public static void main(String[] args) {

    }

}
