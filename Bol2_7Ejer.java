import java.util.*;

public class Bol2_7Ejer {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        double acumuladorSuma = 0;
        int contador = 0;
        double n;

        do {

            System.out.print("Introduce un número: ");
            n = teclado.nextDouble();

            if (n != 0) {

                acumuladorSuma = acumuladorSuma + n;
                contador++;
            }

        } while (n != 0);

        if (contador > 0) {
            double media = acumuladorSuma / contador;

            System.out.println();

            System.out.printf("Media: %.2f%n", media);
        } else {
            System.out.println("No se introdujeron números para calcular la media.");
        }

        teclado.close();
    }
}
