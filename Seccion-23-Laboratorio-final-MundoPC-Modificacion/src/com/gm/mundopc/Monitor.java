package com.gm.mundopc;

public class Monitor extends DispositivoSalida {

    private final int idMonitores;
    private Double tamanio;
    private static int contadorMonitores;

    public Monitor(String tipoEntrada, String marca, double tamanio) {
        super(tipoEntrada, marca);
        this.idMonitores = ++Monitor.contadorMonitores;
        this.tamanio = tamanio;
    }

    @Override
    public String toString() {
        return "Monitor{" + "idMonitores= " + idMonitores + ", tamanio= " + tamanio + ", " + super.toString() + '}';
    }

}
