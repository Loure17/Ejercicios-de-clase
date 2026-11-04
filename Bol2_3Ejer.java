import java.util.*;

public class Bol2_3Ejer {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);

        //Petición entero
        System.out.println("Introduce un número entero: ");
        int numero = teclado.nextInt(); 

        //creo variable
        int acumuladorSuma = 0;

        //contador
        if (numero > 0) {
           
            for (int i = 1; i <= numero; i++) {
                acumuladorSuma = acumuladorSuma + i;
            }
            
            
            System.out.println("La suma de los números es: " + acumuladorSuma);
        }

        
        teclado.close();
    } 
} 
