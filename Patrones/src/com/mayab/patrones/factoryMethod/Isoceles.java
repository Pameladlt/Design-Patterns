
package com.mayab.patrones.factoryMethod;


public class Isoceles extends Triangulo {
    
     Isoceles() {
       nombre = "isoceles";
    }
   
     @Override
       public void area(){
        System.out.println("Area Isoceles = 20cm2");
    }
     @Override
    public void perimetro(){
        System.out.println("Perimetro Isoceles = 70cm");
    }
    
}
