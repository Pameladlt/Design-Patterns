
package com.mayab.patrones.adapter;

public class NewPersonAdapter implements OldPerson {
    
     NewPerson newp;
    
    public NewPersonAdapter(NewPerson newp){
        this.newp = newp;
    }
    
    public String name() {
        
        String input = newp.name();

        int i = input.indexOf(' ');
        String word = input.substring(0, i);
        return word;
    }

   
    public String lastName() {
        String fullName = newp.name();
        String name = fullName.split(" ")[fullName.split(" ").length-1];
        return name;
    }

    
    public String Birthday() {
        return newp.age();
    }
    
}
