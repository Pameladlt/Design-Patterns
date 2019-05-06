package com.mayab.patrones.state;

public class EstadoRojo extends EstadoSemaforo {
    public EstadoRojo() { }
    
    @Override
     public void mostrar() {
        System.out.println("Luz rojo");
    }
}
