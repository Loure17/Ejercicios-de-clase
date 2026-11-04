import java.util.*;

public class Bol2_16Ejer {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Cuantos asteriscos deseas dibujar? ");
        int n = teclado.nextInt();

        teclado.nextLine();

        for (int i = 0; i <= n; i++) {
            System.out.print("*");
        }

        System.out.println();


        System.out.println("Desea dibujar la lista en diagonal hacia la izquierda o haia la derecha? ");
        String d = teclado.nextLine();

        if (d.equalsIgnoreCase("derecha")) {

           for (int i = 0; i < n; i++) {
                

                for (int j = 0; j < i; j++) {
                    System.out.print(" ");
                }
                

                System.out.println("*");
            }

        } else if (d.equalsIgnoreCase("izquierda")){
            for (int i = n; i > 0; i--){

                for (int j = 0; j < i; j++){
                    System.out.print(" ");
                }
                System.out.println("*");
            }
        } 

        

        teclado.close();

    }

}
