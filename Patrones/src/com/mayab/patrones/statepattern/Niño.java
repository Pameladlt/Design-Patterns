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
public class Niño {
    
    private int edad;
    private Niño_est estado;
    
    //Constructor
    public Niño (int edad)
    {
        this.setEdad(edad);
             
    }
    
    
    //Acciones 
    
        public void setEdad(int edad)
    {
        this.edad = edad;
        
          if(edad == 1 )
        {
            estado = new niño_un_año();
        }
          if(edad == 10 )
        {
            estado = new niño_diez_años();
        }
          else
          {
              estado = new niño_un_año();
          }
    }
    
    public void jugar()
    {
        estado.jugar();
    }
    
    public void comer()        
    {
        estado.comer();
    }
    
    

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
