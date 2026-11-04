import java.util.*;

public class Bol2_1Ejer {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        // Petición de dos enteros
        System.out.println("Introduce un número entero: ");
        int numero1 = teclado.nextInt();

        System.out.println("Introduce otro número entero: ");
        int numero2 = teclado.nextInt();

        // Indica qué número es mayor
        if (numero1 > numero2) {
            System.out.println(numero1 + " > " + numero2);
        } else if (numero1 < numero2) {
            System.out.println(numero1 + " < " + numero2);
        } else {
            System.out.println(numero1 + " = " + numero2);
        }

        // Indica el signo del número 1
        if (numero1 > 0) {
            System.out.println(numero1 + " es positivo");
        } else if (numero1 < 0) {
            System.out.println(numero1 + " es negativo");
        } else {
            System.out.println(numero1 + " es cero");
        }

        // Indica la paridad del segundo número
        if (numero2 % 2 == 0) {
            System.out.println(numero2 + " es par");
        } else {
            System.out.println(numero2 + " es impar");
        }

        // Indica si el primero está entre 1 y 10
        if (numero1 >= 1 && numero1 <= 10) {
            System.out.println("El primer número está entre 1 y 10");
        }

        // Indica si el segundo número no está entre 1 y 10
        if (numero2 < 1 || numero2 > 10) {
            System.out.println("El segundo número no está entre 1 y 10");
        }

        // Indica si son múltiplos
        if (numero2 != 0 && numero1 % numero2 == 0) {
            System.out.println("El primer número es múltiplo del segundo");
        } else if (numero1 != 0 && numero2 % numero1 == 0) {
            System.out.println("El segundo número es múltiplo del primero");
        } else {
            System.out.println("No son múltiplos entre sí");
        }

        teclado.close();
    }
}
