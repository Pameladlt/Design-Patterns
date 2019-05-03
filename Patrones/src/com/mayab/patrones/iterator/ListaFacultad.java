/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mayab.patrones.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Queue;


public class ListaFacultad {
    
    public static void main(String[] args) {
        
         Informatica informatica = new Informatica();
         industrial industrial = new industrial();
         mecatronica mecatronica = new mecatronica();
         civil civil = new civil();
            
 
        
        System.out.println("Informatica");
        System.out.println("");
        Iterator student = informatica.createIterator();
        print(student);
           System.out.println("");
           System.out.println("");
        
        System.out.println("Industrial");
           System.out.println("");
        student = industrial.createIterator();
        print(student);
           System.out.println("");
           System.out.println("");
        
        System.out.println("Mecatronica");
           System.out.println("");
        
        student = mecatronica.createIterator();
        print(student);
           System.out.println("");
              System.out.println("");
        
        System.out.println("Civil");
           System.out.println("");
        student = civil.createIterator();
        print(student);
           System.out.println("");
              System.out.println("");
        
     }
     
     private static void print(Iterator i) {
		while (i.hasNext()) {
			String estudiantelist = (String)i.next();
			System.out.println(estudiantelist);

		}
	}
}
