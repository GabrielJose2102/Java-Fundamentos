package com.gm.mundopc;

public class Computadora {

    private final int idComputadora;
    private String nombre;
    private Monitor monitor;
    private Teclado teclado;
    private Raton raton;
    private Cornetas cornetas;
    private static int contadorComputadoras;

    private Computadora() {
        this.idComputadora = ++Computadora.contadorComputadoras;
    }

    public Computadora(String nombre, Monitor monitor, Teclado teclado, Raton raton, Cornetas cornetas) {
        this();
        this.nombre = nombre;
        this.monitor = monitor;
        this.teclado = teclado;
        this.raton = raton;
        this.cornetas = cornetas;
    }

    public int getIdComputadora() {
        return this.idComputadora;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Monitor getMonitor() {
        return this.monitor;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }

    public Teclado getTeclado() {
        return this.teclado;
    }

    public void setTeclado(Teclado teclado) {
        this.teclado = teclado;
    }

    public Raton getRaton() {
        return this.raton;
    }

    public void setRaton(Raton raton) {
        this.raton = raton;
    }

    public Cornetas getCornetas() {
        return cornetas;
    }

    public void setCornetas(Cornetas cornetas) {
        this.cornetas = cornetas;
    }

    @Override
    public String toString() {
        return "Computadora{" + "idComputadora= " + idComputadora + ", nombre= " + nombre + ", monitor= " + monitor + ", teclado= " + teclado + ", raton= " + raton + ", cornetas= " + cornetas + '}';
    }
    

    
    
    

}
