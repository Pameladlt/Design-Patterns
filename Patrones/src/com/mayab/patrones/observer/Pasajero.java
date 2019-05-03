
package com.mayab.patrones.observer;

public class Pasajero implements Observer {
    
    public String nombre;
    public String vuelo;
    
    //Constructor
    
    public Pasajero(String nombre, String vuelo){
        this.nombre = nombre;
        this.vuelo = vuelo;
    }
    
    
    //Getter and Setter
        public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getVuelo() {
        return vuelo;
    }

    public void setVuelo(String vuelo) {
        this.vuelo = vuelo;
    }
    
    //Metodos
    
   public void update(String sala, String salida, String estado) {
		alert(sala,salida,estado);
	}
	
	public void alert(String sala, String salida, String estado) {
		System.out.println(this.nombre +" sala: " + sala 
			+ " salida:  " + salida + " estado: " + estado);
	}



    
}
