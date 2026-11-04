import java.util.*;

public class Ejercicio6 {

    /**
     * Hace el resultado de la potencia
     * 
     * @param a numero (base)
     * @param n potencia del numero (exponente)
     * @return resultado de la potencia
     */
    public static double potencia(double a, int n) {
        if (n == 0) {
            return 1.0;
        }

        double resultado = 1.0;

        if (n > 0) {
            for (int i = 0; i < n; i++) {
                resultado *= a;
            }
            return resultado;
        } else {
            
            for (int j = 0; j > n; j--) {
                resultado *= a;
            }
          
            return 1.0 / resultado;
        }
    }

    /**
     * Muestra las n primeras potencias de un número a
     * @param a numero (base)
     * @param n numero (cantidd de exponentes)
     */
  
    public static void mostrarPotencias(double a, int n) {
        System.out.print("Las " + n + " primeras potencias de " + a + " son: ");
        for (int i = 0; i < n; i++) {
            double valor = potencia(a, i);

            // Mostramos como entero si no tiene decimales para que quede más limpio
            if (valor == (int) valor) {
                System.out.print((int) valor);
            } else {
                System.out.print(valor);
            }

            if (i < n - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }

    /**
     * Suma de la progresión geométrica: 1 + x + x^2 + x^3 + ... + x^n
     * @param x numero (base)
     * @param n numero (exponente maximo)
     * @return devuelve el resultado del acumulador suma
     */
    

    public static double sumaProgresion(double x, int n) {
        double suma = 0;
        for (int i = 0; i <= n; i++) {
            suma += potencia(x, i); 
        }
        return suma;
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce un número (base a): ");
        double a = teclado.nextDouble();

        System.out.print("Introduce la potencia (exponente n): ");
        int n = teclado.nextInt();

        double resultadoPotencia = potencia(a, n);
        System.out.println("El resultado de la potencia es: " + resultadoPotencia);
        System.out.println();

        mostrarPotencias(2, 4);

        double resultadoSuma = sumaProgresion(2, 4);
        System.out.println("Suma de la progresión geométrica (x=2, n=4): " + (int) resultadoSuma);

        teclado.close();
    }
}