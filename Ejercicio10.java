import java.util.*;

public class Ejercicio10 {

    /**
     * Calcula el factorial del numero  
     * 
     * @param n nº escogido  
     * @return devuelve el resultado
     */
    public static double factorial(int n) {
        double resultado = 1;

        for (int i = 1; i <= n; i++) {

            resultado *= i;

        }

        return resultado;
    }

    /**
     * Calcula coseno la aproximación de taylor
     * 
     * @param ang nº (ángulo)
     */

    public static double aproxTaylor(double ang) { 

        double cos;

        double termino1 = Ejercicio6.potencia(ang, 2) / factorial(2);
        double termino2 = Ejercicio6.potencia(ang, 4) / factorial(4);
        double termino3 = Ejercicio6.potencia(ang, 6) / factorial(6);

        cos = 1 - termino1 + termino2 - termino3;

        return cos;

    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce un ángulo:");
        double ang = teclado.nextDouble();

        // convierte los grados que introduce el usuario a radianes para que el
        // ordenador lo entienda y opere bien
        double anguloRadianes = Math.toRadians(ang);

        aproxTaylor(anguloRadianes);

        System.out.printf("cos(%4.1f) = %9.5f", ang, aproxTaylor(anguloRadianes));

        System.out.println();

        for (double i = 0.1; i <= 1; i += 0.1) {
            double radians = Math.toRadians(i);
            System.out.printf("cos(%4.1f) = %9.5f%n", i, aproxTaylor(radians));

        }
        teclado.close();

    }

}
