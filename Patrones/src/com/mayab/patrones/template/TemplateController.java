
package com.mayab.patrones.template;

public class TemplateController {
    
    
     public static void main(String[] args){
    
        Catalogo pamela = new Persona("Pamela","Montes de Ame",20);
        Catalogo LenovoY700 = new Product(4452234,25000);
        
        System.out.println("Persona Update Method");
        pamela.update(1);  
        System.out.println("Product Update Method");
        LenovoY700.update(100);
        LenovoY700.update(9);
        
        
        
        

    }
}
