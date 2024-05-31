
public class OperadorTernario {

    public static void main(String[] args) {
        
        //Operador Ternario
        var resultado = (10 > 2) ? "verdadero" : "falso";
        System.out.println("resultado = " + resultado);
        
        
        //Condicional if-else
        var resultado2 = (10 > 12);
        if (resultado2) {
            System.out.println("Verdadero");

        } else {
            System.out.println("falso");
        }

        
        //Operador Ternario
        var numero = 9;
        var resultado3 = (numero % 2 == 0) ? "par" : "impar";
        System.out.println("resultado3 = " + resultado3);

        
        //Condicional if-else
        numero = 12;
        var resultado4 = (numero % 2 == 0);
        if (resultado4) {
            System.out.println("par");

        } else {
            System.out.println("impar");
        }
    }
}
