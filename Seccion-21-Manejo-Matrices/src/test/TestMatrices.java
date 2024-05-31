package test;

import domain.Persona;

public class TestMatrices {

    public static void main(String[] args) {
        int edades[][] = new int[3][2];
        System.out.println("edades = " + edades);

        edades[0][0] = 5;
        edades[0][1] = 7;
        edades[1][0] = 8;
        edades[1][1] = 4;
        edades[2][0] = 3;
        edades[2][1] = 1;

        System.out.println("edades 0-0 = " + edades[0][0]);
        System.out.println("edades 0-1 = " + edades[0][1]);
        System.out.println("edades 1-0 = " + edades[1][0]);
        System.out.println("edades 1-1 = " + edades[1][1]);
        System.out.println("edades 2-0 = " + edades[2][0]);
        System.out.println("edades 1-1 = " + edades[2][1]);

        for (int filas = 0; filas < edades.length; filas++) {
            for (int columnas = 0; columnas < edades[filas].length; columnas++) {
                System.out.println("edades " + filas + "-" + columnas + ": " + edades[filas][columnas]);

            }

        }

        String frutas[][] = {{"Naranja", "Limon"}, {"Fresa", "Zarzamora"}};
        imprimir(frutas);

        Persona personas[][] = new Persona[3][2];
        personas[0][0] = new Persona("Juan");
        personas[0][1] = new Persona("Karla");
        personas[1][0] = new Persona("Gabriel");
        personas[1][1] = new Persona("Jose");
        personas[2][0] = new Persona("Ana");
        personas[2][1] = new Persona("Daniel");

        imprimir(personas);

    }

    public static void imprimir(Object matriz[][]) {
        for (int filas = 0; filas < matriz.length; filas++) {
            for (int columnas = 0; columnas < matriz[filas].length; columnas++) {
                System.out.println(" matriz " + filas + "-" + columnas + ": " + matriz[filas][columnas]);

            }

        }

    }
}
