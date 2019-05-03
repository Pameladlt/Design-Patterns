
package com.mayab.patrones.dao;

public class DAOFactory {
    

  public static Dao getUserDAO(String type){ 
        if (type.equalsIgnoreCase("student")){
            System.out.println("Here goes the methods to preparation to the database");
            return new StudentDaoImpl();
        }else if(type.equalsIgnoreCase("teacher")){
            System.out.println("Here goes the methods to preparation to the other database");
            return new TeacherDaoImpl();
        }else
            return null;
        
        
        
        
        
    }
    
}
