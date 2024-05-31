package test;

import domain.Persona;

public class TestArregloObject {

    public static void main(String[] args) {
        Persona persona[] = new Persona[2];
        
        persona[0] = new Persona("Juan");
        persona[1] = new Persona("Karla");
        
        System.out.println("persona 0 = " + persona[0]);
        System.out.println("persona 1 = " + persona[1]);
        
        for(int i = 0; i < persona.length; i++){
            System.out.println("persona = "+ i+ " =" + persona[i]);
        }
        
        //Declaracion e inicializacion de elementos en los arreglios con sintaxis resumida
        String frutas[] = {"Naranja", "Plateado", "Uva"};
        for (int i = 0; i < frutas.length; i++) {
            System.out.println("frutas = " + frutas[i]);
        }
    }

}
