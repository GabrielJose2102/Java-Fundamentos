
public class PruebasCicloLabel {

    public static void main(String[] args) {

        ciclo:
        for (int i = 1; i <= 10; i++) {
            
            ciclo2:
            for (int j = 0; j < 10; j++) {
                System.out.println("vultas: " + j);
                if (j == 5) {
                    break ciclo2;
                }
            }
            System.out.println("Carreras: " + i);
        }
    }
}
