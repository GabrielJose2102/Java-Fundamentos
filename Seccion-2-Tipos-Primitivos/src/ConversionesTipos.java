
import java.util.Scanner;

public class ConversionesTipos {

    public static void main(String[] args) {

        //Convertir tipo String a un tipo int
        //Interger.ParseInt
        String edad = "20";
        int ConvertirEdad = Integer.parseInt(edad);

        System.out.println("Sin convertir = " + (edad + 1));
        System.out.println("Convertir Edad = " + (ConvertirEdad + 1));

        //Convertir a tipo Double
        //Double.ParseDouble
        double ConvertirDouble = Double.parseDouble(edad);
        System.out.println("ConvertirDouble = " + ConvertirDouble);

        //Pedir un valor
        int ConvertirEdad2;
        Scanner consola = new Scanner(System.in);

        System.out.println("Proporciona tu edad");
        ConvertirEdad2 = Integer.parseInt(consola.nextLine());

        System.out.println("ConvertirEdad2 = " + ConvertirEdad2);

        String EdadTexto = String.valueOf(ConvertirEdad2);
        System.out.println("EdadTexto = " + EdadTexto);

        String caracter = "Hola";
        char caracterChar = caracter.charAt(0);
        System.out.println("caracterChar = " + caracterChar);

        System.out.println("Proporciona un caracter: ");
        caracter = consola.nextLine();
        char caracter2 = caracter.charAt(0);
        System.out.println("caracter2 = " + caracter2);

    }

}
