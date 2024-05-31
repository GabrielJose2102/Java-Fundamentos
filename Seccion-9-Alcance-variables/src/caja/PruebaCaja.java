
package caja;

/**
 *
 * @author Gabriel
 */
public class PruebaCaja {
    public static void main(String[] args) {
        
        int medidaAncho = 3;
        int medidaAlto = 2;
        int medidaProf = 6;
        
        //Usando constructor vacio
        Caja caja = new Caja();
        caja.ancho = medidaAncho;
        caja.alto = medidaAlto;
        caja.profundo = medidaProf;
        int resultado = caja.calcularVolumen();
        
        System.out.println("resultado = " + resultado);
        
        
        //Usando constructor con variables inicializadas
        Caja caja2 = new Caja(2, 4, 6);
        System.out.println("El resultado es: " + caja2.calcularVolumen());
        
        
    }
    
}
