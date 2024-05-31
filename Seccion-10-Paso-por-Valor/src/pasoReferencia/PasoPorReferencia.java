package pasoReferencia;

import persona.Persona;

public class PasoPorReferencia {

    public static void main(String[] args) {
        Persona persona1 = new Persona();

        persona1.nombre = "Gabriel";
        persona1.apellido = "Torrealba";

        System.out.println("nombre : " + persona1.nombre);
        System.out.println("apellido : " + persona1.apellido);
        System.out.println("");
        
        persona1.desplegarInformacion();
        
        System.out.println("Nuevo valor de los atributos");
        System.out.println("");
        
        cambiarValor(persona1);
        System.out.println("nombre : " + persona1.nombre);
        System.out.println("apellido : " + persona1.apellido);
        System.out.println("");
        
        persona1.desplegarInformacion();
    }
    
    public static void cambiarValor(Persona persona) {
        persona.nombre = "Jose";
        persona.apellido = "Luque";
    }
}
