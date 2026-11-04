import java.util.*;

public class Bol2_5Ejer {

    public static void main(String[] args) { 

        Scanner teclado = new Scanner(System.in);

        int eleccion;
        double celsius;
        double resultado;

        boolean continuar = true;

        do {
            // peticion de opcion
            System.out.println("Elige una de las tres opciones:");
            System.out.println("1. Convertir a Farenheit");
            System.out.println("2. Convertir a Kelvin");
            System.out.println("3. Salir");
            eleccion = teclado.nextInt();

            switch (eleccion) {
                case 1:
                    System.out.println("Introduce los Celsisus: ");
                    celsius = teclado.nextDouble();
                    resultado = 1.8 * celsius + 32;
                    System.out.printf("Grados Farenheit: %.2f%n", resultado);// Revisar 2 decimles
                    break;

                case 2:
                    System.out.println("Introduce los Celsisus: ");
                    celsius = teclado.nextDouble();
                    resultado = celsius + 273.15;
                    System.out.printf("Grados Kelvin: %2f%n", resultado);
                    break;

                case 3:
                    continuar = false;
                    break;
            }
        } while (continuar);

        teclado.close();

    }

}
