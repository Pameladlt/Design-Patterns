
package com.mayab.patrones.observer;


public class Vuelo implements Observable{
    
    
    public String sala;
    public String salida;
    public String destino;
    public String estado;
    public Pasajero[] pasajero= new Pasajero[15];

    public Vuelo(String sala, String salida, String destino, String estado) {
        this.sala = sala;
        this.salida = salida;
        this.destino = destino;
        this.estado = estado;
    }

    public String getSala() {
        return sala;
    }

    public void setSala(String sala) {
        this.sala = sala;
    }

    public String getSalida() {
        return salida;
    }

    public void setSalida(String salida) {
        this.salida = salida;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Pasajero[] getPasajero() {
        return pasajero;
    }

    public void setPasajero(Pasajero[] pasajero) {
        this.pasajero = pasajero;
    }
 
      public void notifyO(){
        System.out.println("Done");
    }
     
      
          public void remove(Pasajero pasajero){
        System.out.println("Observer Deleted");
    }
          
    public void add(Pasajero pasajeron){
        for (int i = 0; i < 15; i++) {
            pasajero[i]=pasajeron;
        }
    }

    

    
  

    
    
    
    
    
    
    
}