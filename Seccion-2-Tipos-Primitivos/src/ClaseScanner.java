
import java.util.Scanner;

public class ClaseScanner {

    public static void main(String[] args) {

        //Scanner para introducir datos del teclado
        
        System.out.println("Escribe un nombre: ");

        Scanner consola = new Scanner(System.in);
        String nombre = consola.nextLine();

        System.out.println("nombre = " + nombre);

        System.out.println("Escribe el titulo: ");
        String titulo = consola.nextLine();

        System.out.println("Usuario = " + titulo + " " + nombre);
    }

}
