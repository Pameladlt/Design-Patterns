/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mayab.patrones.factoryMethod;

/**
 *
 * @author Y700
 */
public class IsocelesCreator extends TrianguloCreator {
    
      public Triangulo createTriangulo(String tipo) {
        if(tipo.equals("isoceles"))
        {
            return new Isoceles();  
        }
          
        else return null;
    }
    
}
