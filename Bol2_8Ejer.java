import java.util.Scanner;

public class Bol2_8Ejer {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        String sí = "sí";
        String no = "no";
        double n1;
        double n2;
        double n3;
        String eleccion = "";

        do {

            System.out.print("Introduce el primer número: ");
            n1 = teclado.nextDouble();

            System.out.print("Introduce el segundo número: ");
            n2 = teclado.nextDouble();

            System.out.print("Introduce el tercer número: ");
            n3 = teclado.nextDouble();

            if (n1 >= n2) {

                if (n1 >= n3) {
                    System.out.println("El mayor es: " + n1);
                } else {
                    System.out.println("El mayor es: " + n3);
                }
            } else {

                if (n2 >= n3) {
                    System.out.println("El mayor es: " + n2);
                } else {
                    System.out.println("El mayor es: " + n3);
                }
            }

            teclado.nextLine();

            System.out.println("Deseas repetir el programa: (si/no)");
            eleccion = teclado.nextLine();

        } while (eleccion.equalsIgnoreCase("si"));

        teclado.close();

    }
}
