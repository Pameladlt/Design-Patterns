/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mayab.patrones.iterator;

import java.util.Arrays;
import java.util.Iterator;

public class mecatronica {
    
     private String nombre;
    private String[] estudiante = new String[5];
    
    public mecatronica(){
        estudiante[0] = "Manuel";
        estudiante[1] = "Luisa";
        estudiante[2] = "Alan";
        estudiante[3] = "Emilio";
        estudiante[4] = "Juan carlos";
    }


    public Iterator createIterator() {
        return Arrays.asList(estudiante).iterator();
    }
    
    public String[] getArrayList(){
        return estudiante;
    }
    
}
