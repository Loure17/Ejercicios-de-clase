import java.util.*;

public class Bol2_9Ejer {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("¿Cuántos números quieres introducir? ");
        int cantidad = teclado.nextInt();

        System.out.print("Introduce un número: ");
        int maximo = teclado.nextInt();

        for (int i = 1; i < cantidad; i++) {
            System.out.print("Introduce un número: ");
            int numero = teclado.nextInt();

            if (numero > maximo) {
                maximo = numero;
            }
        }

        System.out.println("El número máximo es: " + maximo);

        teclado.close();
    }
}

