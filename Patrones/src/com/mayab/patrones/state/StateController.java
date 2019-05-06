package com.mayab.patrones.state;

public class StateController {
    public static void main(String[] args) {
        Semaforo objSemaforo = new Semaforo();
        objSemaforo.mostrar();
        
        objSemaforo.setEstado( new EstadoAmarillo() );
        objSemaforo.mostrar();
        
        objSemaforo.setEstado( new EstadoRojo() );
        objSemaforo.mostrar();
    }
}
