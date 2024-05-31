package test;

import dominio.Persona;

public class PersonaPrueba {

    public static void main(String[] args) {

        Persona persona1 = new Persona("Juan", 5000.00, false);
        System.out.println("Persona1" + persona1);//se puede ejecutar el motodo toString automatico si llamarlo.
        System.out.println("persona1 nombre:" + persona1.getNombre());
        persona1.setNombre("juan carlos");
        //persona1.Nombre = "Juan Carlos";
        //System.out.println("nombre:" + persona1.nombre);
        System.out.println("persona1 nombre:" + persona1.getNombre());
//        System.out.println("Sueldo:" + persona1.getSueldo());
//        System.out.println("eliminado:" + persona1.isEliminado());
        System.out.println("Persona1" + persona1.toString());
        
        System.out.println("");
//        
        Persona persona2 = new Persona("Ana", 35000.500, false);
        System.out.println("persona2 nombre:" + persona2.getNombre());
//        persona2.setNombre("Maria");
//        System.out.println("Nombre" + persona2.getNombre());
        System.out.println("Sueldo:" + persona2.getSueldo());
        System.out.println("eliminado:" + persona2.isEliminado());
        System.out.println("Persona1" + persona2.toString());

    }

}
