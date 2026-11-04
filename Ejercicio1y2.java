import java.io.File;
import java.io.PrintWriter;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ejercicio1y2 {

    /**
     * Codifica un método que deje en pantalla n líneas en blanco.
     * 
     * @param n Cantidad de líneas en blanco
     */
    public static void lineas(int n) {
        for (int i = 0; i < n; i++) {
            System.out.println();
        }
    }

    /**
     * Devuelve true si el parámetro es número par y false si no lo es.
     * 
     * @param n Nº a comprobar
     * @return true si es par, false si impar
     */
    public static boolean par(int n) {
        return n % 2 == 0;
    }

    /**
     * Devuelve 'P' si el número es positivo o cero y 'N' si es negativo.
     * Implementado con operador ternario.
     * 
     * @param n Número entero
     * @return 'P' o 'N'
     */
    public static char letra(int n) {
        return n >= 0 ? 'P' : 'N';
    }

    public static void main(String[] args) throws Exception {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce tu nombre: ");
        String nombre = teclado.nextLine();

        System.out.println(nombre);

        lineas(10);

        System.out.print("Introduce un número: ");
        int numero = teclado.nextInt();

        String paridad = "";
        String signo = "";

        if (par(numero)) {
            System.out.println("El número es par");
            paridad = "par";
        } else {
            System.out.println("El número es impar");
            paridad = "impar";
        }

        if (letra(numero) == 'P') {
            System.out.println("El número es positivo o cero");
            signo = "positivo";
        } else {
            System.out.println("El número es negativo");
            signo = "negativo";
        }

        String fraseFinal = "El numero es " + paridad + " y " + signo;

        File archivo = new File("datos_usuario.txt");

        PrintWriter escritor = new PrintWriter(archivo);
        escritor.println(nombre);
        escritor.println(numero);
        escritor.println(fraseFinal);
        escritor.close();


        teclado.close();
    }
}