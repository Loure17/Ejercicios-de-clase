import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Ejercicio7 { 

    /**
     * Carga el contenido de un archivo de texto.
     * 
     * @param archivo nombre del archivo
     * @return contenido completo del archivo
     */
    public static String loadFile(String archivo) throws Exception {
       
        File file = new File(archivo);

        if (!file.exists()) {
            return "";
        }

        Scanner f = new Scanner(file);
        String contenido = "";
        String linea;

        while (f.hasNext()) {
            linea = f.nextLine();
            contenido = contenido + linea + "\n";
        }

        f.close();
        return contenido;
    }

    /**
     * Añade texto leyendo primero el contenido y sobrescribiendo.
     * 
     * @param archivo nombre del archivo
     * @param texto   texto que se quiere añadir
     */
    public static void appendFile(String archivo, String texto) throws Exception {
        String contenido = loadFile(archivo);
        contenido = contenido + texto;

        PrintWriter f = new PrintWriter(archivo);
        f.print(contenido);
        f.close();
    }

    /**
     * Añade datos de forma directa al final mediante append.
     * 
     * @param archivo nombre del archivo
     * @param texto texto que se quiere añadir
     */
    public static void appendFile2(String archivo, String texto) throws IOException { 
        PrintWriter f = new PrintWriter(new FileWriter(archivo, true));
        f.println(texto);
        f.close();
    }

    public static void main(String[] args) throws Exception {
        String archivo = "datos_usuario.txt";

        appendFile(archivo, "Este es el texto que se añade al final");

        appendFile2(archivo, "Añadimos texto al final con append directo");

        System.out.println(loadFile(archivo));
    }
}
