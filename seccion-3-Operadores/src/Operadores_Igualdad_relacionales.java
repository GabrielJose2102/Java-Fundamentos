
public class Operadores_Igualdad_relacionales {

    public static void main(String[] args) {

        int a = 3;
        int b = 2;

        boolean c = (a == b);
        System.out.println("c = " + c);

        boolean d = a != b;
        System.out.println("d = " + d);

        String cadena = "Hola";
        String cadena2 = "Adios";
        boolean e = cadena == cadena2;//compara referencias de objetos
        System.out.println("e = " + e);

        boolean f = cadena.equals(cadena2);//comparamos comtenido de cadenas
        System.out.println("f = " + f);
        boolean f2 = cadena.equals(cadena);
        System.out.println("f2 = " + f2);

        //operadores relacionales
        boolean g = a > b;//mayor que >
        System.out.println("g = " + g);
        boolean g2 = a >= b;//mayor o igual >=
        System.out.println("g2 = " + g2);

        if (a % 2 == 0) {
            System.out.println("Es numero par");
        } else {
            System.out.println("Es numero impar");
        }

        int edad = 10;
        int adulto = 18;

        if (edad >= adulto) {
            System.out.println("Es un adulto");
        } else {
            System.out.println("Es menor de edad");
        }
        
        

    }

}
