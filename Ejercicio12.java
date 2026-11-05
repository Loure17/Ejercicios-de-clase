
import java.util.*;

public class Ejercicio12 {

    /**
     * Da un resultado aleatorio del partido
     * 
     * @return devuelve el resultado del partido
     */
    public static String quiniela() {
        

        int opcion = (int) (Math.random() * 3);

        switch (opcion) {
            case 0:
                return "1";
            case 1:
                return "X";
            case 2:
                return "2";
            default:
                return "";
        }
    }

    /**
     * Da un resultado basado en probabilidad del partido
     * 
     * @return devuelve el resultado del partido
     */
    public static String quinielaPonderada() {

        int opcion2 = (int) (Math.random() * 100) + 1;

        if (opcion2 <= 60) {
            return "1";
        } else if (opcion2 > 60 && opcion2 < 85) {
            return "X";
        } else {
            return "2";
        }

    }

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Elige una opción: ");
        System.out.println("1. Quiniela normal");
        System.out.println("2. Quiniela ponderada");

        int n = teclado.nextInt();

        switch (n) {
            case 1:
                for (int i = 1; i <= 14; i++) {
                    String resultado = quiniela();

                    System.out.printf("Partido %2d: %s%n", i, resultado);
                }
                break;

            case 2:
                for (int i = 1; i <= 14; i++) {
                    String resultado2 = quinielaPonderada();

                    System.out.printf("Partido %2d: %s%n", i, resultado2);
                }
                break;

        }

        teclado.close();
    }
}
