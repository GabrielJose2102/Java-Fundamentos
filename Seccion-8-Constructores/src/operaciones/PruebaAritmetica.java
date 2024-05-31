package operaciones;

public class PruebaAritmetica {

    public static void main(String[] args) {

        //Valiables locales
        var a = 10;
        var b = 20;
        miMetodo();

        Aritmetica aritmetica1 = new Aritmetica();
        System.out.println("Areitica1 a: " + aritmetica1.a);
        System.out.println("Areitica1 b: " + aritmetica1.b);

        Aritmetica aritmetica2 = new Aritmetica(5, 8);
        System.out.println("Areitica2 a: " + aritmetica2.a);
        System.out.println("Areitica2 b: " + aritmetica2.b);

        //aritmetica1 = null;
        //System.gc();
    }

    public static void miMetodo() {
        //la variable que se declaro dentro de otro metodo esta fuera del alcance de este metodo 

        System.out.println("otro metodo");
    }
}
