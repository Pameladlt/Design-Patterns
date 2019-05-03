
package com.mayab.patrones.singleton;

public class Singleton {
    
    private static Singleton instance = new Singleton();
    private Singleton() { }
    
    public static Singleton getInstance() {
            return Singleton.instance;
    }
}
