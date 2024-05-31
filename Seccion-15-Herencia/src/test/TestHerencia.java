package test;

import domain.Cliente;
import domain.Empleado;
import java.time.*;

public class TestHerencia {

    public static void main(String[] args) {
        Empleado empleado1 = new Empleado("Juan", 5000.0);
        System.out.println("empleado1 = " + empleado1);

        LocalDateTime fecha = LocalDateTime.now();
        Cliente cliente1 = new Cliente(fecha, true, "Gabriel", 'M', 21, "Av Vargas");
        System.out.println("cliente1 = " + cliente1);

    }

}
