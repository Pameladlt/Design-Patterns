
package com.mayab.patrones.factoryMethod;


public abstract class Triangulo {
    
    double ladoA;
    double ladoB;
    double ladoC;
    String nombre;
    
    public abstract void area();
    public abstract void perimetro();


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
    
}
