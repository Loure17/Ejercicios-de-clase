import java.util.*;

public class Ejercicio3 {

    /**
     * pide un numero y comprueba si es positivo
     * @param teclado
     * @return devuelve el dato
     */
    public static double pedirDato(Scanner teclado) {
        double dato;    
        
        do {
            System.out.print("Introduce un numero real positivo: ");
            dato = teclado.nextDouble();

            if (dato <= 0) {
                System.out.println("Error: El número introducido no es positivo.");
            }
        } while (dato <= 0);

        return dato;
    }

    /**
     * calcula el area de un cilindro
     * @param radio resio del cilindro
     * @param altura altura del cilindro
     * @return devuelve la superficie
     */
    public static double superficieCilindro(double radio, double altura) {
        double superficie = 2 * Math.PI * radio * altura;
        return superficie;
    }

    /**
     * muestra  un mensaje y un dato con 3 decimales
     * @param mensaje el el lo que pone en el print
     * @param valor dato numerico a mostrar
     */
    public static void mostrarDato(String mensaje, double valor) {
        System.out.printf("%s %.3f%n", mensaje, valor);
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        double radio;
        double altura;
        double resultadoSuperficie;

        System.out.println("Introduce el radio:");
        radio = pedirDato(teclado);

        System.out.println("Introduce la altura:");
        altura = pedirDato(teclado);

        resultadoSuperficie = superficieCilindro(radio, altura);

        mostrarDato("La superficie del cilindro es:", resultadoSuperficie);

        teclado.close();
    }
}