
package com.mayab.patrones.adapter;


public class Millenial implements NewPerson {
    
    String fullname;
    String date;
    
    public Millenial(){
        this.fullname = "Pamela delatorre";
        this.date = "30/03/1998";
    }
    
    public Millenial(String name, String date){
        this.fullname = name;
        this.date = date;
    }
    
    public String name() {
        return this.fullname;
    }

    
    public String age() {
        return this.date;
    }
}
