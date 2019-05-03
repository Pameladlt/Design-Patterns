
package com.mayab.patrones.adapter;


public class BabyBoomer implements OldPerson {
    
    String name;
    String lastName;
    String date;
    
    //Constructores 
    
    public BabyBoomer(){
        this.name = "Chabelo";
        this.lastName = "Martin";
        this.date = "30/03/1940";
    }
    
    public BabyBoomer(String name,String lastname, String date){
        this.name = name;
        this.lastName = lastname;
        this.date = date;
    }
    
    @Override
    public String name() {
        return this.name;
    }

    
    @Override
    public String lastName() {
        return this.lastName;
    }

   
    @Override
    public String Birthday() {
        return this.date;
    }
    
    
}
