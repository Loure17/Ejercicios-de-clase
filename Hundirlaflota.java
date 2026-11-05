public class Hundirlaflota {

    /**
     * Crea unas coordenadas random para el barco de la CPU
     *
     * @return devuelve las dos posiciones del barco
     */
    public static int[][] coordenadasCPU() {

        char[] columnas = { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J' };
        int[] filas = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

        // COORDENADA RANDOM
        // el .lenght indica la cantidad de elementos dentro del array
        int columnaAleatoria = (int) (Math.random() * columnas.length);
        int filaAleatoria = (int) (Math.random() * filas.length);

        // DIRECCION RANDOM
        // 1 = HORIZONTAL
        // 2 = VERTICAL

        int direccion = (int) (Math.random() * 2) + 1;

        // SEGUNDA COORDENADA

        int segundaColumna = columnaAleatoria;
        int segundaFila = filaAleatoria;

        // SE EXPANDE EN HORIZONTAL
        if (direccion == 1) {

            if (segundaColumna != 9) {
                segundaColumna++;
            } else {
                segundaColumna--;
            }

            // SE EXPANDE EN VERTICAL
        } else if (direccion == 2) {

            if (segundaFila != 9) {
                segundaFila++;
            } else {
                segundaFila--;
            }
        }

        // GUARDAMOS LAS DOS COORDENADAS

        int[][] resultado = {
                { columnaAleatoria, filaAleatoria },
                { segundaColumna, segundaFila }
        };

        return resultado;
    }

    public static void main(String[] args) {

        char[] columnas = { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J' };

        int[][] coordenadas = coordenadasCPU();

        // DIBUJAR TABLERO

        System.out.print("    ");

        for (int i = 0; i < 10; i++) {
            System.out.print(" " + (i + 1) + "  ");
        }

        System.out.println();

        for (int fila = 0; fila < 10; fila++) {

            System.out.print(" " + columnas[fila] + "  ");

            for (int columna = 0; columna < 10; columna++) {

                if ((fila == coordenadas[0][0] && columna == coordenadas[0][1])
                        || (fila == coordenadas[1][0] && columna == coordenadas[1][1])) {

                    System.out.print(" [] ");

                } else {
                    System.out.print("  . ");
                }
            }

            System.out.println();
        }

    }
}
