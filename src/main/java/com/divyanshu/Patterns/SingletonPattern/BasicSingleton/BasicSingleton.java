package com.divyanshu.Patterns.SingletonPattern.BasicSingleton;

public class BasicSingleton {

    //Step 1: create private static instance
    private static BasicSingleton instance;

    // eager initialization: application will create the instance at the start of application
    // say if application needs the instance as soon as it starts, then we can use eager initialization
    // good for database connection pool, thread pool, etc. where we want to create the instance at the start of application
    // private static BasicSingleton instance = new BasicSingleton();

    //Step 2: private Constructor to prevent instantiation
    // there is a way to break singleton pattern by using reflection API
    private BasicSingleton(){
        // prevent instantiation using reflection API
        if(instance != null){
            throw new RuntimeException("Use getInstance() method to create, cannot create instance using reflection API");
        }

        System.out.println("BasicSingleton instance created");
    }

    // deserialization can also break singleton pattern, we can use readResolve() method to prevent it
    protected Object readResolve(){
        return getInstance();
    }

    // cloning can also break singleton pattern, we can override clone() method to prevent it
    @Override
    protected Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException("Cloning of this singleton is not allowed");
    }

    //Step 3: public static method to get the instance
    public static BasicSingleton getInstance() {
        //lazy initialization: application will create the instance only when it is requested for the first time
        // say if request cam after 1 hour of application start, then instance will be created after 1 hour of application start
        // good for logging, caching, notification, etc. where we don't want to create the instance at the start of application

        //for multi-threaded environment, we can use synchronized keyword to make it thread-safe
        if(instance == null){
            // thread-safe way to create the instance
            synchronized (BasicSingleton.class) {
                // double check locking to avoid multiple threads creating multiple instances
                if(instance == null) {
                    instance = new BasicSingleton();
                }
            }
        }
        return instance;
    }

    //Step 4: public method to demonstrate functionality
    public void showMessage() {
        System.out.println("Hello from BasicSingleton!");
        System.out.println("Instance hashcode: " + this.hashCode());
    }
}
