//El ejemplo que viene a continuacion esta basado en el tipo de programacion 
//go - you

//No es recomendable usar porque puede roper la logica del programa 
//Solo es par tener conocimiento de ello.

public class Label_Etiqueta {
    
    public static void main(String[] args) {
        
        inicio1: 
        for (int contador1 = 3; contador1 < 15; contador1++) {
            if (contador1 % 2 != 0) {
                continue inicio1;// Ir a la siguiente iteracion
                
            }
            System.out.println("contador1 = " + contador1);
            
        }
        
        inicio2: 
        for (int contador2 = 3; contador2 < 15; contador2++) {
            if (contador2 % 2 == 0) {
                break inicio2;// Ir a la siguiente iteracion
                
            }
            System.out.println("contador2 = " + contador2);
            
        }
        
        /* Se pone la etiqueta despues de la palabra break o continue para indicar 
            hacia donde se debe ir despues de la pausa o interruccion.*/
        
    
        
    }
    
}
