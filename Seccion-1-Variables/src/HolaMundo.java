
public class HolaMundo {

    public static void main(String args[]) {

        //Imprimir contenido de varible en pantalla
        //Definimos la variable
        int miVariableEntero = 10;

        System.out.println("Hola Mundo Desde Java");
        System.out.println(miVariableEntero);

        //Modificamos el valor de la variable
        miVariableEntero = 5;
        System.out.println(miVariableEntero);

        //Definimos la cadena de la  variable String
        String miVariableCadena = "Saludos";
        System.out.println(miVariableCadena);

        //Modificamos la variable
        miVariableCadena = "Adios";
        System.out.println(miVariableCadena);

        //Como definimos una variable
        //Valores permitidos en nombre de una variable 
        //Caracteres especiale permitidos estos dos ( _ $)
        int miVariableEntera = 2;
        int MiVariableEntera = 2;
        int _miVariableEntera = 2;
        int $miVariableEntera = 2;

        //int ávarible = 2; No se recomienda
        //int #miVariableEntera = 2; No se permite usar caracteres especiales.
        //Concatenacion de variables.
        String nombre = "Juan";
        String titulo = "Ingeniero";

        String union = titulo + " " + nombre; // Se realiza la suma de las cadenas y sae añadio un espacion.

        int i = 3;
        int j = 4;

        System.out.println(union);
        System.out.println(i + j); //Se realiza la usma de numeros.
        System.out.println(i + j + union); //Evaliacion de izq a der, realiza suma
        System.out.println(union + i + j); //contexto cdena, todo es una cadena
        System.out.println(union + (i + j)); // Uso de parentesis modifica la prioridad de la evaluacion.

        //Caracteres especiales
        String nombre2 = "Karla";

        System.out.println("nueva linea: \n" + nombre2);
        System.out.println("tabulador: \t" + nombre2);
        System.out.println("retroceso: \b\b" + nombre2);
        System.out.println("Comillas simples: \'" + nombre2 + "\'");
        System.out.println("Comilla doble: \"" + nombre2 + "\"");

    }

}
