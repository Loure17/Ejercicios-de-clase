import java.util.*;

public class Bol2_4Ejer {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        // Petición número entero
        System.out.print("Introduce un número entero: ");
        int entero = teclado.nextInt();

        // Petición número real
        System.out.print("Introduce un número real: ");
        double real = teclado.nextDouble();

        System.out.println("\n--- Conversiones ---");
        // decimal
        System.out.println("Decimal: " + entero);

        // octal
        System.out.printf("Octal: %05o%n", entero); 

        // Hexadecimal
        System.out.printf("Hexadecimal: %X%n", entero);

        final int lunes = 1;
        final int martes = 2;
        final int miercoles = 3;
        final int jueves = 4;               
        final int viernes = 5;        
        final int sabado = 6;
        final int domingo = 7;
        //switch 
        switch (entero) {
            case 1: 
                System.out.println("El día de la semana correspondiente es: Lunes");
                break;
            case 2:
                System.out.println("El día de la semana correspondiente es: Martes");
                break;
            case 3:
                System.out.println("El día de la semana correspondiente es: Miércoles");
                break;
            case 4:
                System.out.println("El día de la semana correspondiente es: Jueves");
                break;
            case 5:
                System.out.println("El día de la semana correspondiente es: Viernes");
                break;
            case 6:
                System.out.println("El día de la semana correspondiente es: Sábado");
                break;
            case 7:
                System.out.println("El día de la semana correspondiente es: Domingo");
                break;
            default:
                System.out.println("El número introducido no corresponde a ningún día (debe ser de 1 a 7).");
                break;
        }
        
        teclado.close();
    }
}
