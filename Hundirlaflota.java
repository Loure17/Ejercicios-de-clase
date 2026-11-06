public class Hundirlaflota {

    public static int[] coordenadasCPU() {

        char[] columnas = { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J' };
        int[] filas = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

        int columnaAleatoria = (int) (Math.random() * columnas.length);
        int filaAleatoria = (int) (Math.random() * filas.length);

        int direccion = (int) (Math.random() * 4) + 1;

        int expansionColumna = columnaAleatoria;
        int expansionFila = filaAleatoria;

        if (direccion == 1) {

            if (columnaAleatoria != 9) {
                expansionColumna += 1;
            } else {
                expansionColumna -= 1;
            }

        } else if (direccion == 2) {

            if (columnaAleatoria != 0) {
                expansionColumna -= 1;
            } else {
                expansionColumna += 1;
            }

        } else if (direccion == 3) {

            if (filaAleatoria != 9) {
                expansionFila += 1;
            } else {
                expansionFila -= 1;
            }

        } else if (direccion == 4) {

            if (filaAleatoria != 0) {
                expansionFila -= 1;
            } else {
                expansionFila += 1;
            }
        }

        int[] resultado = { columnaAleatoria, filaAleatoria, expansionColumna, expansionFila };

        return resultado;
    }

    public static void dibujarTableroCPU(int[] coordenadas) {

    char[] columnas = { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J' };

    // Imprimir cabecera de números (columnas)
    System.out.print("   ");

    for (int i = 1; i <= 10; i++) {
        System.out.print(i + "  ");
    }

    System.out.println();

    // Imprimir las filas (letras)
    for (int j = 0; j < columnas.length; j++) {

        System.out.print(columnas[j] + "  ");

        for (int columna = 0; columna < 10; columna++) {

            if ((columna == coordenadas[0] && j == coordenadas[1])
                    || (columna == coordenadas[2] && j == coordenadas[3])) {

                System.out.print("[] ");

            } else {

                System.out.print(".  ");
            }
        }

        System.out.println();
    }
}


    public static void tableroUser() {

    }

    public static void disparoCPU() {

        char[] columnas = { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J' };
        int[] filas = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

        int columnaAleatoria = (int) (Math.random() * columnas.length);
        int filaAleatoria = (int) (Math.random() * filas.length);

        int[] disparo = { columnaAleatoria, filaAleatoria };

    }

    public static void main(String[] args) {
        dibujarTableroCPU(coordenadasCPU());
    }

}