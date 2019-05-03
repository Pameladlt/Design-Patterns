/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mayab.patrones.template;


public class Persona extends Catalogo {
    
    
    private String name;
    private String address;
    private int age;
    
    public Persona(String name, String address, int age){
        this.name = name;
        this.address = address;
        this.age = age;
    }

    @Override
    public boolean validate(int a) {
        if(a > 21)
            return true;
        else
            return false;
    }
    
    public void read() {
        System.out.println("Leyendo datos...");
        System.out.println("Nombre: " + this.name);
            System.out.println("Direccion : " + this.address);
                System.out.println("Edad: " + this.age);
                
    }

    public void save(int a) {
        this.age = a;
    }
    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    

    
}
