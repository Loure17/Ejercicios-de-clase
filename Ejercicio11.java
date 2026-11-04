import java.io.File;
import java.io.PrintWriter;
import java.util.*;

public class Ejercicio11 {

    public static void main(String[] args) throws Exception {// Añadir formteoD

        File archivoEntrada = new File("numeros.txt");
        Scanner lector = new Scanner(archivoEntrada);

        PrintWriter f = new PrintWriter("archivo11.txt");

        while (lector.hasNextInt()) {
            int n = lector.nextInt();

            if (n < 10) {

                
                f.printf("Nº     %2d.   El factorial es: %8d, Coseno: %6f\n", n, (int) Ejercicio10.factorial(n),
                        Ejercicio10.aproxTaylor(n));
            }

        }

        f.close();
        lector.close();
    }

}
