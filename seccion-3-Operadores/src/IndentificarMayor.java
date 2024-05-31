
import java.util.Scanner;

public class IndentificarMayor {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int numero_Uno, numero_Dos;

        System.out.println("Dame un numero: ");
        numero_Uno = Integer.parseInt(entrada.nextLine());

        System.out.println("Dame otro numero: ");
        numero_Dos = Integer.parseInt(entrada.nextLine());

        if (numero_Uno > numero_Dos) {
            System.out.print("El mayor es: ");
            System.out.println("numero_Uno = " + numero_Uno);

        } else if (numero_Uno < numero_Dos) {
            System.out.print("El mayor es: ");
            System.out.println("numero_Dos = " + numero_Dos);
        } else {
            System.out.println("Son iguales");
        }

    }

}
