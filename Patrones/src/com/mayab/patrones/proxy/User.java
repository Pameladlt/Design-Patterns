/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mayab.patrones.proxy;

public class User {
       
    private String name;
    private boolean type;
    
    //Constructor
    
    public User (String name, boolean type){
        this.name = name;
        this.type = type;
    }

    //Getter an Setter

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean getType() {
        return type;
    }

    public void setType(boolean type) {
        this.type = type;
    }
 
    
}
