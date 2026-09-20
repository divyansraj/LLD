package com.divyanshu.Patterns.SingletonPattern.EnumSingleton;
// enums in java are inherently singletons and they are the best way to implement singleton pattern in java

// enums are thread safe
// enums are also serializable
// enums are also reflection safe
enum Singleton{
    INSTANCE;
    public void doSomething() {
        System.out.println("Hello from Enum Singleton");
        System.out.println("Hashcode of Enum Singleton: " + this.hashCode());
    }

}
public class EnumSingleton {
    public static void main(String[] args) {
        Singleton s1 = Singleton.INSTANCE;
        Singleton s2 = Singleton.INSTANCE;
        System.out.println("Hashcode of s1: " + s1.hashCode());
        System.out.println("Hashcode of s2: " + s2.hashCode());
        System.out.println("Are s1 and s2 the same object? " + (s1 == s2));
    }
}
