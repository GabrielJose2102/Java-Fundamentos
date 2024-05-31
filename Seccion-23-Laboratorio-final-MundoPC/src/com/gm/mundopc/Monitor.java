package com.gm.mundopc;

public class Monitor {
    
   private final int idMonitores;
   private String marca;
   private Double tamanio;
   private static int contadorMonitores;

   private Monitor(){
       this.idMonitores = ++Monitor.contadorMonitores;
   }
   
   public Monitor(String marca, Double tamanio){
       this();
       this.marca = marca;
       this.tamanio = tamanio;
   }

    public int getIdMonitores() {
        return this.idMonitores;
    }

    public String getMarca() {
        return this.marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Double getTamanio() {
        return this.tamanio;
    }

    public void setTamanio(Double tamanio) {
        this.tamanio = tamanio;
    }

    @Override
    public String toString() {
        return "Monitor{" + "idMonitores=" + idMonitores + ", marca=" + marca + ", tamanio=" + tamanio + '}';
    }
    
    
   
   
}
