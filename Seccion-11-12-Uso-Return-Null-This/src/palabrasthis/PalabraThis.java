package palabrasthis;

public class PalabraThis {

    public static void main(String[] args) {
        Persona persona = new Persona("Juan", "Perez");
        System.out.println("persona = " + persona);
        System.out.println("persona nombre:" + persona.nombre);
        System.out.println("persona nombre:" + persona.apellido);
    }
}

class Persona {

    String nombre;
    String apellido;

    Persona(String nombre, String apellido) {
        //super(); llamada al constructor de la clase padre (object)
        this.nombre = nombre;
        this.apellido = apellido;
        System.out.println("Objeto persona usando this: " + this);
        // Imprimir imprimir = new Imprimir();
        new Imprimir().Imprimir(this);
    }
}

class Imprimir {
    
    public Imprimir(){
        super();//El constructor de la clase object (padre) para reservar memoria
    }

    public void Imprimir(Persona persona) {
        System.out.println("Persona desde imprimir: " + persona);
        System.out.println("Impresion del object actual(this)" + this);
        
    }
}
