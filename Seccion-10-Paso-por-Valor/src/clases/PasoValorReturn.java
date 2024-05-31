package clases;

public class PasoValorReturn {
    public static void main(String[] args) {
        int x = 10;
        System.out.println("Valor inicial de la variable = " + x);

        x = cambioValor(x);
        System.out.println("x nuevo valor despues de ejecutar el metodo = " + x);
    }

    public static int cambioValor(int arg1) {
        System.out.println("valor al recibir arg1 = " + arg1);
         return arg1 = 15;
    }
}
