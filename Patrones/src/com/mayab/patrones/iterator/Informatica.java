/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mayab.patrones.iterator;

import java.util.ArrayList;
import java.util.Iterator;


public class Informatica implements Facultad{
    
    private String nombre;
    private ArrayList<String> estudiante = new ArrayList();
    
    public Informatica(){
           estudiante.add("Maria Jose");
         estudiante.add("Jesus");
          estudiante.add("Lucio");
    }


    public Iterator createIterator() {
        return estudiante.iterator();
    }
    
    public ArrayList getArrayList(){
        return estudiante;
    }
    
    public void addItem(String x){
        estudiante.add(x);
    }
    
}
