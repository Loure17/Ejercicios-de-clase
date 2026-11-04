import java.util.*;

public class Ejercicio8 {

    /**
     * Comprueba si es un número primo
     * 
     * @param n nº a comprobar
     * @return true si es primo, false si no lo es
     */
    public static boolean numeroPrimo(int n) {
        if (n <= 1) {
            return false;
        }

        int i = n;
        while (i > 2) {
            i--;

            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce un número entero: ");
        int n = teclado.nextInt();

        for (int j = n; j >= 2; j--) {
            if (numeroPrimo(j)) {
                System.out.println(j);
            }
        }

        teclado.close();
    }
}
