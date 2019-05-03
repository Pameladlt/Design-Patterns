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
public class FileController implements File {
    
   private String name;
    
    public FileController(){
        this.name = "FileName";
    }
    
       
    public String Read() {
        return "Reading...";
    }
    
    public String Delete() {
        return "Deleting...";
    }

    
    public String Write() {
        return "Writing...";
    }

 
}
