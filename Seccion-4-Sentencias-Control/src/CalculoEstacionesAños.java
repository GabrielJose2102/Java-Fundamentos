
import java.util.Scanner;

public class CalculoEstacionesAños {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        var mes = 0;
        String estacion = "Estacion desconocida";

        System.out.println("Ingresa el numero del mes: ");
        mes = Integer.parseInt(entrada.nextLine());

        if (mes == 1 || mes == 2 || mes == 12) {
            estacion = "Invierno";

        } else if (mes == 3 || mes == 4 || mes == 5) {
            estacion = "Primavera";

        } else if (mes == 6 || mes == 7 || mes == 8) {
            estacion = "Verano";

        } else if (mes == 9 || mes == 10 || mes == 11) {
            estacion = "Otoño";
        }

        System.out.println("estacion = " + estacion);
    }

}
