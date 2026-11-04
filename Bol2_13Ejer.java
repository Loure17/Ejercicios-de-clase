import java.util.*;

public class Bol2_13Ejer {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce un número: ");
        int n = teclado.nextInt();

        int sumaPares = 0;
        int sumaImpares = 0;
        int sumaPares2 = 0;
        int sumaImpares2 = 0;

        for (int i = 0; i <= n; i++) {
            if (i % 2 == 0) {
                sumaPares += i;
            }
        }

        System.out.println("La suma es: " + sumaPares);

        System.out.println("Introduce un número: ");
        n = teclado.nextInt();

        for (int i = 0; i <= n; i++) {
            if (i % 2 != 0) {
                sumaImpares += i;
            }
        }

        System.out.println("La suma es: " + sumaImpares);

        System.out.println("Introduce un número: ");
        n = teclado.nextInt();

        for (int i = 0; i <= n; i++) {
            if (i % 2 == 0) {
                sumaPares2 += i;
            } else {
                sumaImpares2 += i;
            }
        }

        System.out.println("La suma de los pares es: " + sumaPares2);
        System.out.println("La suma de los impares es: " + sumaImpares2);

        teclado.close();
        
    }

}
