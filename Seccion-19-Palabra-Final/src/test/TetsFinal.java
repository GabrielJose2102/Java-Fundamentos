package test;

import domain.Persona;

public class TetsFinal {

    public static void main(String[] args) {
        //Como la palabra final esta esta con la variable no se puede cambiar el valor
        final int miVariable = 10;
        System.out.println("miVariable = " + miVariable);
        //miVatiable = 5;

        //como esta variable esta marcada como final no se puede modificar
        //Persona.MI_CONSTANTE = 5;
        System.out.println("Mi constante: " + Persona.MI_CONSTANTE);
        
        final Persona persona1 = new Persona();
        //persona1 = new Persona();
        persona1.setNombre("Juan");
        System.out.println("persona1 nombre: " + persona1.getNombre());
        persona1.setNombre("Carlos");
        System.out.println("persona1 nombre: " + persona1.getNombre());
    }
}
