
package com.mayab.patrones.singleton;


public class UserController {
    
    public static void main(String[] args) {
        
        
       User user = User.getInstance();
       
       System.out.println("Login");
        System.out.println(user.DoLogin());
       System.out.println("Logout");
        System.out.println(user.Logout());
    
       
    }
}
