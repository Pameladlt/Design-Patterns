/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mayab.patrones.proxy;

/**
 *
 * @author Y700
 */
public class TestProxy {
    
    
    public static void main(String[] args) {
    
    User pamela = new User("Pamela",false);
    User renata = new User("Renata", true);
    
    System.out.println("Usuario: Pamela - Tipo: False");
    ProxyFile file = new ProxyFile(pamela);
    
    System.out.println(file.Write());
    System.out.println(file.Read());
    System.out.println(file.Delete());
    System.out.println("");
    System.out.println("");
    System.out.println("Usuario: Renata - Tipo: True");
    ProxyFile file2 = new ProxyFile(renata);
    
    System.out.println(file2.Write());
    System.out.println(file2.Read());
    System.out.println(file2.Delete());
    
    }
    
}
