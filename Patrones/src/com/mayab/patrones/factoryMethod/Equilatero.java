
package com.mayab.patrones.factoryMethod;


public class Equilatero extends Triangulo {
    
    Equilatero()
    {
        nombre = "Equilatero";
    }
    
    public void area(){
        System.out.println("Area equilatero = 40cm2");
    }
    
    public void perimetro(){
        System.out.println("Perimetro equilatero = 100cm");
    }

   
    
}
