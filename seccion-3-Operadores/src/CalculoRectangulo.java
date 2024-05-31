
import java.util.Scanner;

public class CalculoRectangulo {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int base, altura, area = 0, perimetro = 0;

        System.out.println("Ingresa la medida de la base");
        base = entrada.nextInt();

        System.out.println("Ingres la medida de la altura");
        altura = entrada.nextInt();

        area = base * altura;
        perimetro = (base += base) + (altura += altura);

        System.out.println("base = " + base);
        System.out.println("altura = " + altura);

        System.out.println("El area del rectangulo es: " + area + "cm^2");

        System.out.println("El perimetrodel rectagulo es: " + perimetro + "cm");
    }

}
