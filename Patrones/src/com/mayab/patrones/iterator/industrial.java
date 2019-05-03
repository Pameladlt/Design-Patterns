/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mayab.patrones.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class industrial {
    
    private String nombre;
    private List<String> estudiante = new ArrayList();
    
    public industrial(){
       estudiante.add("Luis");
         estudiante.add("Alerto");
          estudiante.add("Juan");
    }


    public Iterator createIterator() {
        return estudiante.iterator();
    }
    
    public List getArrayList(){
        return estudiante;
    }
    
    public void addItem(String x){
        estudiante.add(x);
    }
    
}
