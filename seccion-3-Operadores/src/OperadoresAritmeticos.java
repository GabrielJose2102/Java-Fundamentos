
public class OperadoresAritmeticos {

    public static void main(String[] args) {

        int a = 3, b = 2;
        
        //Operadores aritmeticos

        int resultado = a + b;
        System.out.println("resultado suma = " + resultado);

        resultado = a - b;
        System.out.println("resultado resta = " + resultado);

        resultado = a * b;
        System.out.println("resultado multiplicacion = " + resultado);

        resultado = a / b;
        System.out.println("resultado division = " + resultado);

        resultado = a % b;
        System.out.println("resultado modulo= " + resultado);

        //Es para saber si un numero es par o impar
        if (a % 2 == 0) {
            System.out.println("Es numero par");

        } else {
            System.out.println("Es numero impar");
        }

    }

}
