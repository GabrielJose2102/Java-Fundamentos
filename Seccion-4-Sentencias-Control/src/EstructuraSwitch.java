
public class EstructuraSwitch {

    public static void main(String[] args) {

        var numero = 4;
        var numerotexto = "Valor desconocido";

        switch (numero) {
            case 1:
                numerotexto = "Numero uno";
                break;

            case 2:
                numerotexto = "Numero dos";
                break;

            case 3:
                numerotexto = "Numero tres";
                break;

            case 4:
                numerotexto = "Numero cuatro";
                break;

            default:
                numerotexto = "Caso no encontrado";
        }

        System.out.println("numerotexto = " + numerotexto);
    }

}
