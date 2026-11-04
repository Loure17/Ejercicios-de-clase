import java.util.*;

public class Bol2_10Ejer {
    
    public static void main(String[] args) {
        
    Scanner teclado = new Scanner(System.in);

    System.out.println("Introduce un número: ");
    int n1 = teclado.nextInt();

    System.out.println("Introduce otro número: ");
    int n2 = teclado.nextInt();

    int temporal = n1;
    n1 = n2;
    n2 = temporal;

    System.out.println("Primer número: " + n1);
    System.out.println("Segundo número: " + n2);

    teclado.close();

    }
}
