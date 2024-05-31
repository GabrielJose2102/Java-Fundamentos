package clases;

public class PasoValor {

    public static void main(String[] args) {

        int x = 10;
        System.out.println("Valor inicial de la variable = " + x);

        cambioValor(x);
        System.out.println("finalizo el metodo x nuevo valor = " + x);
    }

    public static void cambioValor(int arg1) {
        System.out.println("valor al recibir arg1 = " + arg1);
        arg1 = 15;
        System.out.println("valor de arg1 solo mientras se ejecuta el metodo= " + arg1);
    }

}
