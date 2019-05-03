
package com.mayab.patrones.proxy;


public class ProxyFile implements File {
    
    private FileController File;
    private User user;
    
    //Constructor
    public ProxyFile(User user){
        FileController filecontroller = new FileController();
        this.File = filecontroller;
        this.user = user;
    }
    
    //Setter and Getter
      public FileController getFile() {
        return File;
    }

    public void setFile(FileController file) {
        this.File = file;
    }

    //Abstract Methods
    public String Delete() {
        if(user.getType() == true)
            return File.Delete();
        else
            return "Permission Denied";
    }

    
    public String Write() {
        return File.Write();
    }

    
    public String Read() {
        return File.Read();
    }

  

    
    
}
