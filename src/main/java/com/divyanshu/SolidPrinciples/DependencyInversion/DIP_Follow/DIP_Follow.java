package com.divyanshu.SolidPrinciples.DependencyInversion.DIP_Follow;
// Dependency Inversion Principle states that high-level modules should not
// depend on low-level modules. Both should depend on abstractions
// (e.g., interfaces). Abstractions should not depend on details.
// Details (concrete implementations) should depend on abstractions.
public class DIP_Follow {
    public static void main(String[] args) {
        repository sqlRepo = new sqlDB();
        application app1 = new application(sqlRepo);
        app1.saveName("John");

        repository noSqlRepo = new nosqlDB();
        application app2 = new application(noSqlRepo);
        app2.saveName("Jane");
    }
}

class sqlDB implements repository{
    @Override
    public void save(String name) {
        System.out.println("Saved to database: "+name);
    }
}

class nosqlDB implements repository{
    @Override
    public void save(String name) {
        System.out.println("Saved to NoSQL database: "+name);
    }
}

interface repository{
    void save(String name);
}
class application{
    private final repository _repository;

    application(repository repository) {
        _repository = repository;
    }

    public void saveName(String Name){
        _repository.save(Name);
    }
}

