
package com.mayab.patrones.observer;


public interface Observable {
    
    public String getEstado();
    
    public void remove(Pasajero pasajero);
    
    public void add(Pasajero pasajero);
    
    public void notifyO();
    
}
