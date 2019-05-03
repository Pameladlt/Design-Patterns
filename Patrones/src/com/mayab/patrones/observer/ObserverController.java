
package com.mayab.patrones.observer;

import java.lang.reflect.Array;

public class ObserverController {
    
     public static void main(String[] args) 
    {
        Vuelo miami = new Vuelo("Sala 24", "B4", "Fortlaudere,Miami", "Abordando");
        
        Pasajero pamela = new Pasajero("Pamela","412" );
        Pasajero renata = new Pasajero("Renata","412");
        Pasajero tony = new Pasajero("tony","412" );
        Pasajero emilio = new Pasajero("emilio","412");
        
        miami.add(pamela);
        miami.add(renata);
        miami.add(tony);
        miami.add(emilio);
       
    
        System.out.println("Eliminando a pasajero Renata");
       
        miami.remove(renata);
        
        System.out.println("Cambiando estado de vuelo ");
        miami.setEstado("Cerrado");
        System.out.println(miami.getEstado());
        
        
    }
    
    
}
