import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.*;

public class Ejercicio13 {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String repetir;

        System.out.print("Introduce tu nombre: ");
        String nombre = sc.nextLine();

        do {
            int caras ;
            do {
                System.out.print("\n¿Cuántas caras quieres que tengan los dados?: ");
                caras = sc.nextInt();
                sc.nextLine();

                if (caras <= 0) {
                    System.out.println("Error: El número de caras debe ser mayor que 0. Inténtalo de nuevo.");
                }
            }while (caras <= 0);

            System.out.println("Introduce 3 números distintos entre 1 y " + caras);

            int num1 = pedirNumeroValido(sc, "Número 1: ", caras);

            int num2;
            do {
                num2 = pedirNumeroValido(sc, "Número 2: ", caras);
                if (num2 == num1) {
                    System.out.println("Error!! Este número ya lo pusiste.");
                }
            } while (num2 == num1);

            int num3;
            do {
                num3 = pedirNumeroValido(sc, "Número 3: ", caras);
                if (num3 == num1 || num3 == num2) {
                    System.out.println("Error!! Este número ya lo pusiste.");
                }
            } while (num3 == num1 || num3 == num2);

            int dado1 = lanzarDado(caras);
            int dado2;

            do {
                dado2 = lanzarDado(caras);
            } while (dado2 == dado1);

            System.out.printf("Resultado de los dados: %d y %d\n", dado1, dado2);

            int aciertos = calcularAciertos(num1, num2, num3, dado1, dado2);
            System.out.printf("Has tenido %d acierto(s)\n", aciertos);

            guardarRecord(nombre, caras, aciertos);

            System.out.print("\nQuieres jugar otra vez? (si/no): ");
            repetir = sc.nextLine();

        } while (repetir.equalsIgnoreCase("si"));

        mostrarArchivoRecords();
        sc.close();
    }

    /**
     * Pide un número y valida que esté dentro del rango del dado.
     *
     * @param mensaje Texto indicativo para el usuario
     * @param caras   cuantas caras tiene el dado
     * @return El número válido introducido
     */
    public static int pedirNumeroValido(Scanner sc, String mensaje, int caras) {
        int num;
        do {
            System.out.print(mensaje);
            num = sc.nextInt();
            if (num < 1 || num > caras) {
                System.out.print("introduce un número válido entre 1 y  " + caras + ". ");
            }
        } while (num < 1 || num > caras);
        return num;
    }

    /**
     * Genera un número aleatorio simulando la cara de un dado.
     *
     * @param caras Cantidad de caras del dado
     * @return Número entero aleatorio entre 1 y caras
     */
    public static int lanzarDado(int caras) {
        return (int) (Math.random() * caras + 1);
    }

    /**
     * Calcula los aciertos del usuario comparando sus números con los dados.
     *
     * @param n1 Primer número del usuario
     * @param n2 Segundo número del usuario
     * @param n3 Tercer número del usuario
     * @param d1 Resultado del dado 1
     * @param d2 Resultado del dado 2
     * @return Cantidad de aciertos
     */
    public static int calcularAciertos(int n1, int n2, int n3, int d1, int d2) {
        int aciertos = 0;
        if (n1 == d1 || n1 == d2)
            aciertos++;
        if (n2 == d1 || n2 == d2)
            aciertos++;
        if (n3 == d1 || n3 == d2)
            aciertos++;
        return aciertos;
    }

    /**
     * Guarda una nueva línea en el archivo de récords
     *
     * @param nombre   Nombre del jugador
     * @param caras    Cantidad de caras
     * @param aciertos nº de aciertos obtenidos
     */
    public static void guardarRecord(String nombre, int caras, int aciertos) throws Exception {

        PrintWriter f = new PrintWriter(new FileWriter("records.txt", true));

        f.printf("%s, de %4d caras, obtuvo %4d acierto(s)\n", nombre, caras, aciertos);

        f.close();
    }

    /**
     * Lee y muestra el archivo de registros
     */
    public static void mostrarArchivoRecords() throws Exception {

        File archivo = new File("records.txt");

        if (archivo.exists()) {
            Scanner f = new Scanner(archivo);
            String linea;

            while (f.hasNext()) {
                linea = f.nextLine();
                System.out.println(linea);
            }
            f.close();
        } else {
            System.out.println("No hay registros guardados");
        }
    }
}
