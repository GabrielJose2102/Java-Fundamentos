package clases;

public class Persona {

    //Atributos de la clase
    String nombre;
    String apellido;

    public void desplegarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + apellido);
    }
    
    public void trabajar() {
        System.out.println(nombre + " Esta trabajando...");
    }
    
    public void comer() {
        System.out.println(nombre + " Esta comiendo...");
    }
    
    public void descansar() {
        System.out.println(nombre + " Esta descansando...");
    }

}
