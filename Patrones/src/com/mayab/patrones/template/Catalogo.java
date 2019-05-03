/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mayab.patrones.template;


public abstract class Catalogo {
    
    final public void update(int num){
        
        read();
        if(validate(num))
            save(num);
        else
            error();
    }
    
    public abstract void read();
    
    public abstract boolean validate(int num);
    
    public abstract void save(int num);
    
    public void error(){
        System.out.println("Fallo");
    }
}
