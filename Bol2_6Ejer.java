import java.util.*;

public class Bol2_6Ejer {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int opcion;
        double numero;
        double resultado;
        int n1;
        int n2;

        boolean continuar = true;

        do {

            System.out.println("Elige que tipo de operación quieres hacer");
            System.out.println("1) Cuadrado de un número");
            System.out.println("2) Inverso de un número");
            System.out.println("3) Raíz cuadrada de un número");
            System.out.println("4) Operación AND a nivel de bit entre dos enteros");
            System.out.println("5) Operación OR a nivel de bit entre dos enteros");
            System.out.println("6) Salir");
            opcion = teclado.nextInt();

            switch (opcion) {

                case 1:
                    System.out.println("Introduce un número real: ");
                    numero = teclado.nextDouble();
                    resultado = numero * numero;
                    System.out.printf("Resultado: %.2f%n", resultado);
                    System.out.println();
                    break;

                case 2:

                    System.out.println("Introduce un número real: ");
                    numero = teclado.nextDouble();
                    while (numero == 0) {
                        System.out.println("Introduce un número real: ");
                        numero = teclado.nextDouble();
                    }
                    resultado = 1 / numero;// Math.pow(numero, -1);
                    System.out.printf("Resultado: %.4f%n", resultado);
                    System.out.println();
                    break;

                case 3:
                    System.out.println("Introduce un número real: ");
                    numero = teclado.nextDouble();
                    while (numero < 0) {
                        System.out.println("Introduce un número real: ");
                        numero = teclado.nextDouble();
                    }
                    resultado = Math.sqrt(numero);
                    System.out.printf("Resultado: %.3f%n", resultado);
                    System.out.println();
                    break;

                case 4:

                    System.out.println("Introduce un número entero: ");
                    n1 = teclado.nextInt();

                    System.out.println("Introduce otro número entero: ");
                    n2 = teclado.nextInt();

                    resultado = n1 & n2;
                    System.out.printf("Resultado: %X%n", (int) resultado);
                    System.out.println();
                    break;

                case 5:

                    System.out.println("Introduce un número entero: ");
                    n1 = teclado.nextInt();

                    System.out.println("Introduce otro número entero: ");
                    n2 = teclado.nextInt();
                    resultado = n1 | n2;
                    System.out.printf("Resultado: %X%n", (int) resultado);
                    System.out.println();
                    break;

                case 6:
                    continuar = false;
                    break;

            }

        } while (continuar);

        teclado.close();

    }

}
