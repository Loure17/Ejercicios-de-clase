import java.util.*;

public class Bol2_15Ejer {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce un número: ");
        int n = teclado.nextInt();

        int operacion = 1;

        for (int i = n; i > 0; i--) {
            operacion *= i;
        }

        System.out.println("El factorial de " + n + " es: " + operacion);
        System.out.println();

        operacion = 1;
        int i = 0;

        do {
            i++;
            operacion *= i;
        } while (i < n);

        System.out.println(operacion);
        System.out.println();

        operacion = 1;
        i = 0;

        while (i < n) {
            i++;
            operacion *= i;

        }

        System.out.println(operacion);
        System.out.println();

        teclado.close();
    }
}
