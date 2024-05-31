package clases;

public class PruebaPersona {

    public static void main(String[] args) {

        //Objeto 1
        Persona persona1 = new Persona();
        persona1.nombre = "Juan";
        persona1.apellido = "Perez";
        persona1.desplegarInformacion();
        persona1.trabajar();
        System.out.println("");
        
        
        //Objeto 2
        Persona persona2 = new Persona();
        persona2.desplegarInformacion();
        persona2.nombre = "Karla";
        persona2.apellido = "Lara";
        persona2.desplegarInformacion();
        persona2.comer();
        System.out.println("");
        
        
        //Objeto 3
        Persona persona3 = new Persona();
        persona3.nombre = "Jose";
        persona3.apellido = "Torrez";
        persona3.desplegarInformacion();
        persona3.descansar();
        System.out.println("");
        
        
        
        System.out.println("persona1 = " + persona1);
        System.out.println("persona2 = " + persona2);
        System.out.println("persona3 = " + persona3);
    }

}
