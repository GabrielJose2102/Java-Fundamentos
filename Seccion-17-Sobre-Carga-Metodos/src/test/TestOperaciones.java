package test;

import operaciones.Operaciones;

public class TestOperaciones {

    public static void main(String[] args) {
        
        int resultado = Operaciones.sumar(5, 3);
        System.out.println("resultado = " + resultado);

        double resultado2 = Operaciones.sumar(2.0, 3);
        System.out.println("resultado2 = " + resultado2);

        double resulado3 = Operaciones.sumar(3, 5L);
        System.out.println("resulado3 = " + resulado3);
    }

}
