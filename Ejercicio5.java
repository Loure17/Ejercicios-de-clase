import java.io.File;
import java.io.PrintWriter;
import java.util.*;

public class Ejercicio5 {

    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);

        int anioActual = 2026;

        System.out.println("Introduce un año: ");
        int anioUsuario = teclado.nextInt();

        File archivo = new File("anios_bisiestos.txt");

        PrintWriter escritor = new PrintWriter(archivo);

        if (Ejercicio4.bisiesto(anioUsuario)) {
            escritor.println(anioUsuario + " Es bisiesto.");
        } else {
            escritor.println(anioUsuario + " No es bisiesto.");
        }

        for (int i = anioUsuario+1; i <= anioActual; i++) {
            if (Ejercicio4.bisiesto(i)) {
                escritor.printf("%6d, ", i);
            }
        }

        escritor.close();

        Scanner lectorArchivo = new Scanner(archivo);

        if (lectorArchivo.hasNextLine()) {
            lectorArchivo.nextLine();
        }

        while (lectorArchivo.hasNextInt()) {
            int anioBisiesto = lectorArchivo.nextInt();
            System.out.printf("%6d, ", anioBisiesto);
        }

        lectorArchivo.close();
        teclado.close();
    }
}