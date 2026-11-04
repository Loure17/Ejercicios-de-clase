import java.util.*;

public class Ejercicio4 {

    /**
     * comprueba si el año es bisiesto
     * 
     * @param anio el año qwue introduce el usuario
     * @return
     */
   public static boolean bisiesto(int anio) { 
        if (anio % 400 == 0) {
            return true;
        } else if (anio % 100 == 0) {
            return false;
        } else if (anio % 4 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int añoUsuario;
        do {
            System.out.println("Introduce un año: ");
            añoUsuario = teclado.nextInt();

            if (añoUsuario != 0) {

                if (bisiesto(añoUsuario)) { 
                    System.out.println("El año " + añoUsuario + " es bisiesto");
                } else {
                    System.out.println("El año " + añoUsuario + " no es bisiesto");
                }
            } else {
            }

        } while (añoUsuario != 0);

        teclado.close();

    }
}