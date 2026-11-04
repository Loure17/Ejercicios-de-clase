import java.util.*;

public class avanzados18 {

    public static void main(String[] args) throws InterruptedException {

        Scanner teclado = new Scanner(System.in);

        String respuesta = "si";

        while (respuesta.equalsIgnoreCase("si")) {

            System.out.println("Elige un caballo entre el 1 y el 4");
            int miCaballo = teclado.nextInt();

            System.out.println("Has elegido el caballo " + miCaballo);
            System.out.println("SUERTE!!!");
            System.out.println();

            int meta = 20;

            int caballo1 = 0, caballo2 = 0, caballo3 = 0, caballo4 = 0;

            while (caballo1 < meta && caballo2 < meta && caballo3 < meta && caballo4 < meta) {

                caballo1 += (int) (Math.random() * 4) + 1;
                caballo2 += (int) (Math.random() * 4) + 1;
                caballo3 += (int) (Math.random() * 4) + 1;
                caballo4 += (int) (Math.random() * 4) + 1;

                if (caballo1 > meta)
                    caballo1 = meta;

                if (caballo2 > meta)
                    caballo2 = meta;

                if (caballo3 > meta)
                    caballo3 = meta;

                if (caballo4 > meta)
                    caballo4 = meta;

                System.out.println(" ".repeat(caballo1) + "[1]");
                System.out.println();

                System.out.println(" ".repeat(caballo2) + "[2]");
                System.out.println();

                System.out.println(" ".repeat(caballo3) + "[3]");
                System.out.println();

                System.out.println(" ".repeat(caballo4) + "[4]");
                System.out.println("\n=======================\n");

                Thread.sleep(1000);
            }

            int ganador;

            if (caballo1 == meta) {
                ganador = 1;
            } else if (caballo2 == meta) {
                ganador = 2;
            } else if (caballo3 == meta) {
                ganador = 3;
            } else {
                ganador = 4;
            }

            if (ganador == miCaballo) {
                System.out.println("¡¡¡GANASTE!!!");
            } else {
                System.out.println("Has perdido. Ganó el caballo " + ganador);
            }

            System.out.println();
            System.out.print("¿Quieres jugar otra vez? (si/no): ");

            teclado.nextLine();
            respuesta = teclado.nextLine();

            System.out.println();
        }

        System.out.println("¡Gracias por jugar!");

        teclado.close();
    }
}