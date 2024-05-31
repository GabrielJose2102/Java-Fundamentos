
import java.util.Scanner;


public class CalculoEstacionesSwitch {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        
        int mes = 0;
        String estacion = "Estacion desconocida";
        
        System.out.println("Ingresa el numero de mes:");
        mes = Integer.parseInt(entrada.nextLine());

        switch (mes) {
            case 1:
            case 2:
            case 12:
                estacion = "Invierno";
                break;
            case 3:
            case 4:
            case 5:
                estacion = "Primavera";
                break;
            case 6:
            case 7:
            case 8:
                estacion = "Verano";
                break;
            case 9:
            case 10:
            case 11:
                estacion = "otoño";
                break;

        }
        System.out.println("estacion = " + estacion);

    }

}