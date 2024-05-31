
public class OPeradores_Condicionales {

    public static void main(String[] args) {

        int a = 10;
        int valorMinimo = 0;
        int valorMaximo = 10;

        boolean resultado = a >= valorMinimo && a <= valorMaximo;

        if (resultado) {
            System.out.println("Dentro de rango");
        } else {
            System.out.println("Fuera de rango");
        }

        boolean vacaciones = true;
        boolean diaDescanso = false;
        
        if (vacaciones || diaDescanso) {
            System.out.println("Padre puede asistir al juego del hijo");
        } else {
            System.out.println("El padre esta ocupado");
        }
    }

}
