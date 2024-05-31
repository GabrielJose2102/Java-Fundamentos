
public class SentenciaIF_ELse {

    public static void main(String[] args) {

        var condicion = true;

        if (condicion) {
            System.out.println("Verdadera");

        } else {
            System.out.println("Falsa");
        }

        var numero = 3;
        var numeroTexto = "Numero desconocido";

        if (numero == 1) {
            numeroTexto = "Numero uno";

        } else if (numero == 2) {
            numeroTexto = "Numero dos";
        } else if (numero == 3) {
            numeroTexto = "numero tres";
        } else if (numero == 4) {
            numeroTexto = "Numero cuatro";
        } else {
            numeroTexto = "Numero desconocido";
        }
        System.out.println("numeroTexto = " + numeroTexto);
    }

}
