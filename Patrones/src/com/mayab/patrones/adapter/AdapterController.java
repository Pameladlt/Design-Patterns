
package com.mayab.patrones.adapter;

public class AdapterController {
    
    
        public static void main(String[] args) {
        
        OldPerson oldperson = new BabyBoomer();
        NewPerson newperson = new Millenial();
        OldPerson oldperson2 = new NewPersonAdapter(newperson);
        
        System.out.println("Persona Nueva");
        System.out.println(newperson.name());
        System.out.println(newperson.age());
        System.out.println("");
        System.out.println("");
        System.out.println("Persona Vieja");
        Adapter(oldperson);
        System.out.println("");
        System.out.println("");
        System.out.println("Persona Nueva Adapter");
        Adapter(oldperson2);
        
    }
    
    static void Adapter(OldPerson old){
        System.out.println(old.name());
        System.out.println(old.lastName());
        System.out.println(old.Birthday());
    }
    
}


