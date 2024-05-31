
import java.util.Scanner;

public class TiendaDeLibros {

    public static void main(String[] args) {

        String nombre = "";
        int id = 0;
        double precio;
        boolean envioGratuito = true;

        Scanner datos = new Scanner(System.in);

        System.out.println("Proporciona el nombre del libro: ");
        nombre = datos.nextLine();

        System.out.println("Proporciona el ID del libro: ");
        id = datos.nextInt();

        System.out.println("Proporciona el precio del libro: ");
        precio = datos.nextDouble();

        if (envioGratuito) {

            System.out.println("EL libro " + nombre + " con un costo de: " + precio + "$ se le enviara sin cobro de envio");

        } else {
            System.out.println("EL libro " + nombre + "con un costo de: " + precio + "$ + mas el costo de envio de 20$");
        }

    }

}
