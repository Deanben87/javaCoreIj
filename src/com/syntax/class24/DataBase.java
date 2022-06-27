package com.syntax.class24;

public abstract class DataBase {

    abstract void open();
    abstract void readData();
    abstract boolean writeData();
    public void closeTheDataBase(){
        System.out.println("Terminate the connection to close it");
    }
}

class Informix extends DataBase{

    @Override
    void open() {
        System.out.println("Opening the Informix data");
    }

    @Override
    void readData() {
        System.out.println("Reading the data from the Informix");
    }

    @Override
    boolean writeData() {
        System.out.println("Data written successfully");
        return true;
    }
}

class MySOLServer extends DataBase {
    @Override
    void open() {
        System.out.println("Opening the MySOLServer data");
    }

    @Override
    void readData() {
        System.out.println("Reading the data from the MySOLServer");
    }

    @Override
    boolean writeData() {
        System.out.println("Data written successfully");
        return true;
    }

}