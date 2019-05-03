
package com.mayab.patrones.factoryMethod;


public class FactoryMethodController {
    
     public static void main(String[] args) 
    {
        TrianguloCreator isoceles = new IsocelesCreator();
        TrianguloCreator equilatero = new EquilateroCreator();
        TrianguloCreator escaleno = new EscalenoCreator();
        
       
        isoceles.Calcular("isoceles");
        equilatero.Calcular("equilatero");
        escaleno.Calcular("escaleno");
    }
    
}
