
import java.util.*;

public class Ejercicio9 {

    /**
     * calcula el area de la figura que se pida
     * 
     * @param base         base de la figura
     * @param altura       altura de la figura
     * @param esRectangulo indica si es rectangulo o no
     * @return  area de la figura
     */
    public static double calcularArea(double base, double altura, boolean esRectangulo) {
        if (esRectangulo) {
            return base * altura;
        } else {
            return (base * altura) / 2;
        }
    }

    /**
     * Calcula el area del círculo
     * 
     * @param radio radio del circulo
     * @return area del círculo
     */
    public static double calcularAreaCirculo(double radio) {
        double areaCirculo = Math.PI * Math.pow(radio, 2);
        return areaCirculo;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {

            System.out.println();
            System.out.println("1. Área de un triángulo");
            System.out.println("2. Área de un rectángulo");
            System.out.println("3. Área de un cuadrado");
            System.out.println("4. Área de un círculo");
            System.out.println("5. Salir");
            System.out.print("Elige una opción: ");

            opcion = scanner.nextInt();

            switch (opcion) { 
                case 1:
                    System.out.print("Ingrese la base: ");
                    double baseT = scanner.nextDouble();
                    System.out.print("Ingrese la altura: ");
                    double alturaT = scanner.nextDouble();

                    double areaTriangulo = calcularArea(baseT, alturaT, false);
                    System.out.printf("El área del triángulo es: %.1f%n", areaTriangulo);
                    break;

                case 2:
                    System.out.print("Ingrese la base: ");
                    double baseR = scanner.nextDouble();
                    System.out.print("Ingrese la altura: ");
                    double alturaR = scanner.nextDouble();

                    double areaRectangulo = calcularArea(baseR, alturaR, true);
                    System.out.printf("El área del rectángulo es: %.1f%n", areaRectangulo);
                    break;

                case 3:
                    System.out.print("Ingrese el lado: ");
                    double lado = scanner.nextDouble();

                    double areaCuadrado = calcularArea(lado, lado, true);
                    System.out.printf("El área del cuadrado es: %.1f%n", areaCuadrado);
                    break;

                case 4: 
                    System.out.print("Ingrese el radio: ");
                    double radio = scanner.nextDouble();
                    calcularAreaCirculo(radio);
                    System.out.printf("El área del círculo es: %.4f%n", calcularAreaCirculo(radio));
                    break;

                case 5:

                    break;

                default:
                    System.out.println("Opción no válida. Inténtalo de nuevo.");
            }

        } while (opcion != 5);

        scanner.close();
    }
}
