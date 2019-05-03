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
public abstract class TrianguloCreator {
    
    public abstract Triangulo createTriangulo(String tipo);
    
    public Triangulo Calcular(String tipo){
        
        Triangulo triangulo = createTriangulo(tipo);
        
        triangulo.area();
        triangulo.perimetro();
        
        return triangulo;
    }
}
