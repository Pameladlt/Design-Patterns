
package com.mayab.patrones.dao;


public class daoController {
    
    public static void main(String[] args) {
         
         Dao student = DAOFactory.getUserDAO("student");
         Dao teacher = DAOFactory.getUserDAO("teacher");
         Dao director = DAOFactory.getUserDAO("MongoDB");
         
      try{   
         for (User s : director.getAll()) {
            s.print();
        }
      }catch(NullPointerException e) {
        System.out.println(e);
}
      
      //print all students
      for (User s : student.getAll()) {
         s.print();
      }

        System.out.println("- - - - - - -");
    //print all teachers
      for (User t : teacher.getAll()) {
         t.print();
      }
      System.out.println("- - - - - - -");
      System.out.println("Update student");
      //update student
      User s =student.getAll().get(0);
      s.setName("Michael");
      student.updateUser(s);

      System.out.println("- - - - - - -");
      System.out.println("get student update");
      //get the student
      s = student.getUser(0);
      s.print();
      
      
     }
    
}
