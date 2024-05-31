package test;

import domain.Persona;

public class PersonaPrueba {

    public static void main(String[] args) {

        Persona persona1 = new Persona("Juan");
        System.out.println("persona1 = " + persona1);
        
        Persona persona2 = new Persona("Karla");
        System.out.println("persona2 = " + persona2);
        
        //Se usa el nombre de la clase para demostrar que es estatico el metodo
        PersonaPrueba.Imprimir(persona1);
        PersonaPrueba.Imprimir(persona2);
    }
    
    //Para usar metodos dentro de un metodo estatico que se encuentra dentro de la misma clase tambien debe ser estatico
    public static void Imprimir(Persona persona){
        System.out.println("persona = " + persona);
    }

}
