package mundopc;

import com.gm.mundopc.*;

public class MundoPC {
    public static void main(String[] args) {
        Monitor monitorLenovo = new Monitor("Cable HDMI", "Lenovo", 19);
        Teclado tecladoHP = new Teclado("bluetooh", "Hp");
        Raton ratonHP = new Raton("bluetooth", "HP");
        Cornetas cornetaVit = new Cornetas("USB", "Vit");
        Computadora computadoraHP = new Computadora("Computadora HP", monitorLenovo, tecladoHP, ratonHP, cornetaVit);
        
        Monitor monitorGamer = new Monitor("Cable HDMI", "HP", 15);
        Teclado tecladoGamer = new Teclado("bluetooh", "Gamer");
        Raton ratonGamer = new Raton("bluetooth", "Gamer");
        Cornetas cornetaLenovo = new Cornetas("USB", "Lenovo");
        Computadora computadoraGamer= new Computadora("Computadora Gamer", monitorGamer, tecladoHP, ratonGamer, cornetaLenovo);
        
        Orden orden1 = new Orden();
        orden1.agregarCoputadora(computadoraHP);
        orden1.agregarCoputadora(computadoraGamer);
        
        orden1.mostrarOrden();
    }
}
