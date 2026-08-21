package com.divyanshu.DependencyInversion.DIP_Violiotion;

public class DIP_Violiotion {

    public static void main(String[] args) {
        sqlDB sqlDB = new sqlDB();
        nosqlDB nosqlDB = new nosqlDB();
        application app = new application(sqlDB, nosqlDB);
        app.saveData("Hello World");
    }
}

class application {

    private final sqlDB sqlDB;
    private final nosqlDB nosqlDB;

    public application(sqlDB sqlDB, nosqlDB nosqlDB) {
        this.sqlDB = sqlDB;
        this.nosqlDB = nosqlDB;
    }

    public void saveData(String data) {
        sqlDB.save(data);
        nosqlDB.save(data);
    }
}

class sqlDB {
    public void save(String data) {
        System.out.println("Saved to database: " + data);
    }
}
class nosqlDB {
    public void save(String data) {
        System.out.println("Saved to NoSQL database: " + data);
    }
}

