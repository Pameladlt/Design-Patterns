
package com.mayab.patrones.decorator;

public class DecoratorController {
    
      public static void main(String[] args){
          
        System.out.println("Classic Angus Burger ");
        Burger burger = new Angus();
        System.out.println(burger.getDescription() + " $" + burger.cost()+ "USD");
 
        System.out.println("Classic Angus Burger with Guacamole ");
        Burger burgerGuacamole = new Angus();
        burgerGuacamole = new Guacamole(burgerGuacamole);
        System.out.println(burgerGuacamole.getDescription() + " $" + burgerGuacamole.cost()+ "USD");
 
        
        
    }
    
}
