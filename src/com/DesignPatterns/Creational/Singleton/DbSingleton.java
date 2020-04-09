package com.DesignPatterns.Creational.Singleton;

public class DbSingleton {
    private static volatile DbSingleton instance = null; //will remain a singleton through any changes in the jvm
    private DbSingleton() {
        if(instance != null) { //ensure no-one uses reflection on our code
            throw new RuntimeException("Use getInstance() method to create");
        }
    }
    //if the whole method is synchronised, it will have a performance cost
    public static DbSingleton getInstance() {
        if(instance == null) {
            synchronized (DbSingleton.class) {
                if(instance == null) {
                    instance = new DbSingleton();
                }
            }
        }
        return instance;
    }

}
