public class Ejercicio14 {

    public static void main(String[] args) {

        int sumaJugador = tirada();
        int resultadoJugador = comprobacion(sumaJugador);

        int puntosJugador = 0;

        if (resultadoJugador == 0) {
            System.out.println("HAS GANADO!!");
            return;
        } else if (resultadoJugador == -1) {
            System.out.println("HAS PERDIDO!!  (Gana la CPU)");
            return;
        } else {
            puntosJugador = resultadoJugador;
            System.out.printf("Has obtenido %d puntos.\n", puntosJugador);
        }

        int sumaCPU = tirada();
        int resultadoCPU = comprobacion(sumaCPU);

        int puntosCPU = 0;

        if (resultadoCPU == 0) {
            System.out.println("La CPU ha sacado 7 u 11 en la primera tirada. GANA LA CPU!");
        } else if (resultadoCPU == -1) {
            System.out.println("¡Craps para la CPU! Ha sacado 2, 3 o 12. ¡GANA EL JUGADOR!");
        } else {
            puntosCPU = resultadoCPU;
            System.out.printf("La CPU ha obtenido una puntuación de %d puntos.\n", puntosCPU);

            if (puntosJugador > puntosCPU) {
                System.out.printf("GANASTE!! Tu puntuación (%d) es mayor que la de la CPU (%d). \n", puntosJugador,
                        puntosCPU);
            } else if (puntosCPU > puntosJugador) {
                System.out.printf("PERDISTE!! La puntuación de la CPU (%d) es mayor que la tuya (%d).\n", puntosCPU,
                        puntosJugador);
            } else {
                System.out.printf("HABEIS EMPATADO!! Ambos obtuvieron %d puntos.\n", puntosJugador);
            }
        }
    }

    /**
     * Hace la tirada de dos dados 
     */
    public static int tirada() {
        int dado1 = (int) (Math.random() * 6) + 1;
        int dado2 = (int) (Math.random() * 6) + 1;
        int suma = dado1 + dado2;

        System.out.printf("Lanzamiento: Dado 1 = %d  Dado 2 = %d  Suma = %d\n", dado1, dado2, suma);
        return suma;
    }

    /**
     * Comprueba el resultado de la suma según las reglas de Craps.
     */
    public static int comprobacion(int suma) {
        if (suma == 7 || suma == 11) {
            return 0;
        } else if (suma == 2 || suma == 3 || suma == 12) {
            return -1;
        } else {
            return suma;
        }
    }

    public static void juegos() {
        int resultados;
        int vez = 0;
        while (vez <= 1000000) {
        vez += 1;
        resultados = tirada();

        }

    }
}
