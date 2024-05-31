
import java.util.Scanner;

public class SistemaDeCalificaciones {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        var calificacion = 0;
        String Resultado = "Valor desconmocido.";

        System.out.println("Ingresa la calificacion");
        calificacion = Integer.parseInt(entrada.nextLine());

        if (calificacion == 9 || calificacion == 10) {

            Resultado = "A";
            System.out.println("calificacion: " + calificacion + " = " + Resultado);

        } else if (calificacion == 8) {

            Resultado = "B";
            System.out.println("calificacion: " + calificacion + " = " + Resultado);

        } else if (calificacion == 7) {

            Resultado = "C";
            System.out.println("calificacion: " + calificacion + " = " + Resultado);

        } else if (calificacion == 6) {

            Resultado = "D";
            System.out.println("calificacion: " + calificacion + " = " + Resultado);

        } else if (calificacion >= 0 && calificacion < 6) {

            Resultado = "F";
            System.out.println("calificacion: " + calificacion + " = " + Resultado);

        } else {

            System.out.println("Resultado = " + Resultado);
        }
    }

}
