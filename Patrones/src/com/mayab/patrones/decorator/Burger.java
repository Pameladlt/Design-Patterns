
package com.mayab.patrones.decorator;


public abstract class Burger {
    
     public String description = "Classic Burger";
    
    public String getDescription(){
        return this.description;
    }
    
    public abstract double cost();
    
}
