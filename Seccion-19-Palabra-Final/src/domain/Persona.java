package domain;

//Como la clase tiene la palabra final no se puede heredar ni modificar esta clase 
public final class Persona {
    public final static int MI_CONSTANTE = 1;
    
    public String nombre;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
    
    //Si es el metodo el que tiene la palabra final no se puede modificar  
    public /*final*/ void Imprimir(){
        System.out.println("Metodo Imprimir");
    }
}
