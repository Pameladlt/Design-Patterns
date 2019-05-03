/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mayab.patrones.statepattern;

/**
 *
 * @author Y700
 */
public class prueba {
    
    public static void main(String[]args)
    {
        Niño niño = new Niño(1);
        System.out.println("Un niño de 1 año hace lo siguiente:");
        niño.comer();
        niño.jugar();
        System.out.println("");
        System.out.println("");
        System.out.println("Aplicamos el patron state: Niño 1 a Niño 10 años ");
        System.out.println("");
        System.out.println("");
        niño.setEdad(10);
        niño.comer();
        niño.jugar();

        
        
    }
    
}
