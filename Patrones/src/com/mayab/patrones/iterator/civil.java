/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mayab.patrones.iterator;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class civil {
    
    private String nombre;
    private Queue<String> estudiante = new LinkedList<>(); 
    
    public civil(){
        estudiante.add("Maria Jose");
         estudiante.add("Jose");
          estudiante.add("Kiko");
    }


    public Iterator createIterator() {
        return estudiante.iterator();
    }
    
    public Queue getArrayList(){
        return estudiante;
    }
    
}
