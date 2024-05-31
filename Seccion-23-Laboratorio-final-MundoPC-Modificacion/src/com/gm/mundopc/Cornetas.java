package com.gm.mundopc;

public class Cornetas extends DispositivoSalida {

    private final int idCornetas;
    private static int contadorCornetas;

    public Cornetas(String tipoEntrada, String marca) {
        super(tipoEntrada, marca);
        this.idCornetas = ++Cornetas.contadorCornetas;
    }

    @Override
    public String toString() {
        return "Cornetas{" + " idCornetas= " + idCornetas + ", " + super.toString() + '}';
    }

}
