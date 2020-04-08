package com.DesignPatterns.Creational.Singleton;

public class DbSingletonDemo {
    public static void main(String[] args) {
        DbSingleton instance = DbSingleton.getInstance();
        System.out.println(instance);

        //DbSingleton secondInstance = new DbSingleton(); //can't new another one - private constructor
        DbSingleton secondInstance = DbSingleton.getInstance(); //still get same object reference when use this method
        System.out.println(secondInstance);
    }
}
