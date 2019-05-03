
package com.mayab.patrones.singleton;


public class User {
     
  
    public static boolean logged;
    public static String Nombre;
    public static String Apellido;

    private static User instance = new User(Nombre, Apellido);
     
    public User(String Nombre, String Apellido) {
        this.Nombre = Nombre;
        this.Apellido = Apellido;
    }
 
     public static User getInstance() {
        return User.instance;
    }
   
     public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        User.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        User.Apellido = Apellido;
    }
     
    
     public boolean DoLogin(){
         logged = true;
         return logged;
    }
    
        public boolean Logout(){
          logged = false;
          return logged;
    }
        
        public void setLogged (boolean log) {
        this.logged = log;
    }
        
        public boolean isLogged() {
          if(this.logged==true){
              System.out.println("Sesión iniciada");
        } 
          else{
              System.out.println("Sesión cerrada");
          }
        return this.logged;
    }
}
