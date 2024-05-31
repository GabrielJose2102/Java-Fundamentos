package mundopc;

import com.gm.mundopc.*;

public class MundoPC {
    public static void main(String[] args) {
        Monitor monitorHP = new Monitor("HP", 13.0);
        Teclado tecladoHP = new Teclado("bluetooh", "Hp");
        Raton ratonHP = new Raton("bluetooth", "HP");
        Computadora computadoraHP = new Computadora("Computadora HP", monitorHP, tecladoHP, ratonHP);
        
        Monitor monitorGamer = new Monitor("Gamer", 34.0);
        Teclado tecladoGamer = new Teclado("bluetooh", "Gamer");
        Raton ratonGamer = new Raton("bluetooth", "Gamer");
        Computadora computadoraGamer= new Computadora("Computadora Gamer", monitorGamer, tecladoGamer, ratonGamer);
        
        Orden orden1 = new Orden();
        orden1.agregarCoputadora(computadoraHP);
        orden1.agregarCoputadora(computadoraGamer);
        
        orden1.mostrarOrden();
    }
}
