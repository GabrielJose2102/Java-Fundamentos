
import java.util.Scanner;

public class InformacionLibro {

    public static void main(String[] args) {
        Scanner Informacion = new Scanner(System.in);

        System.out.println("Propociona el titulo: ");
        String titulo = Informacion.nextLine();

        System.out.println("Proporciona el auto: ");
        String autor = Informacion.nextLine();

        System.out.println(titulo + " fue escrito por " + autor);

    }

}
