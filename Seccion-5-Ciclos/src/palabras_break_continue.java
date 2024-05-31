
public class palabras_break_continue {
    
    public static void main(String[] args) {
        
        //break : se usa para interrunpir los ciclos los ciclos
        
        
        for (int contador = 0; contador < 3; contador++) {
            
            if (contador % 2 == 0) {
                
                System.out.println("contador = " + contador);
                break;
            }
            
        }
        
        for (int contador = 0; contador < 3; contador++) {
            if (contador % 2 != 0) {
                continue;// Ir a la siguiente iteracion
                
            }
            System.out.println("contador = " + contador);
            
        }
    }
    
}
