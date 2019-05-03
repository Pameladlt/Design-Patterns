/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mayab.patrones.template;

/**
 *
 * @author Y700
 */
public class Product extends Catalogo {
    
    private int codigo;
    private int precio;
    
    public Product(int codigo,int precio){
        this.codigo = codigo;
        this.precio = precio;
    }
    
    @Override
    public boolean validate(int a) {
                if(a > 90)
            return true;
        else
            return false;
    }
    
    @Override
    public void read() {
        System.out.println("codigo: " + this.codigo);
        System.out.println("Precio: " + this.precio);
    }

    @Override
    public void save(int a) {
        this.precio = a;
    }
    
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int co) {
        this.codigo = co;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
}
