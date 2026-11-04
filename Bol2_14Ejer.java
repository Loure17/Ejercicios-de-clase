import java.util.*;

public class Bol2_14Ejer {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        boolean continuar = true;

        do {

            int n;

            do {
                System.out.println();
                System.out.println("Jugador 1: Introduce un númro entre 1 y 100");
                n = teclado.nextInt();
            } while (n < 1 || n > 100);

            for (int espacio = 0; espacio <= 100; espacio++) {
                System.out.println();
            }

            int n2;
            int j = 5;

            System.out.println("Jugador 2: Adivina el número");
            System.out.println("Te quedan 5 intentos");
            n2 = teclado.nextInt();

            boolean partida = true;

            do {

                if (n == n2) {
                    System.out.println("GANASTE!!!");
                    partida = false;

                } else if (n2 < 1 || n2 > 100) {
                    System.out.println("Adivina el número");
                    System.out.println("Te quedan" + j + " intentos");
                    n2 = teclado.nextInt();

                } else if (n2 < n) {
                    System.out.println("EL número a adivinar es mayor que " + n2);
                    j--;
                    System.out.println("Te quedan " + j + " intentos");
                    System.out.println("Adivina el número");
                    n2 = teclado.nextInt();
                } else if (n2 > n) {
                    System.out.println("El número a adivinar es menor que" + n2);
                    j--;
                    System.out.println("Te quedan " + j + " intentos");
                    System.out.println("Adivina el número");
                    n2 = teclado.nextInt();
                }
            }

            while (partida && j > 0);

            teclado.nextLine();

            System.out.println("Jugador 1: Desea jugar otra partida? ");
            String j1 = teclado.nextLine();

            System.out.println();

            System.out.println("Jugador 2: Desea jugar otra partida? ");
            String j2 = teclado.nextLine();

            if (j1.equalsIgnoreCase("si") && j2.equalsIgnoreCase("si")) {

                continuar = true;
            } else {

                continuar = false;
            }

        } while (continuar);

        teclado.close();

    }

}
