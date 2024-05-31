package caja;

public class Caja {

    int ancho, alto, profundo;

    public Caja() {

        System.out.println("Consructor vacio en ejecucion");
    }

    public Caja(int ancho, int alto, int profundo) {
        this.ancho = ancho;
        this.alto = alto;
        this.profundo = profundo;
    }

    public int calcularVolumen() {
        var volumen = ancho * alto * profundo;
        return volumen;
        
    }

}
