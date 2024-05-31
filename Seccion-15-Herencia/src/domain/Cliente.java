package domain;

import java.time.LocalDateTime;
import java.util.Date;

public class Cliente extends Persona {

    private int idCliente;
    private static int contadorCliente;
    private boolean vip;
    private LocalDateTime fechaRegistro;

    public Cliente(LocalDateTime fechaRegistro, boolean vip, String nombre, char genero, int edad, String direccion) {
        super(nombre, genero, edad, direccion);
        this.idCliente = ++Cliente.contadorCliente;
        this.fechaRegistro = fechaRegistro;
        this.vip = vip;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public boolean isVip() {
        return vip;
    }

    public void setVip(boolean vip) {
        this.vip = vip;
    }

    public LocalDateTime getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(LocalDateTime fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Cliente{idCliente= ").append(idCliente);
        sb.append(", vip= ").append(vip);
        sb.append(", fechaRegistro= ").append(fechaRegistro);
        sb.append(",  ").append(super.toString());
        sb.append('}');
        return sb.toString();
    }

}
