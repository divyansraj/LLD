package com.divyanshu.Patterns.SingletonPattern.BasicSingleton;

public class Main {
    public static void main(String[] args) {

        System.out.println("Making first call to getInstance() method");
        BasicSingleton instance1 = BasicSingleton.getInstance();
        System.out.println("Instance 1 hashcode: " + instance1.hashCode());

        System.out.println("Making second call to getInstance() method");
        BasicSingleton instance2 = BasicSingleton.getInstance();
        System.out.println("Instance 2 hashcode: " + instance2.hashCode());

    }
}
