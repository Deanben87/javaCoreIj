package com.syntax.class24;

public class DataBaseTester {
    public static void main(String[] args) {
        DataBase [] dataBases={new Informix(),new MySOLServer()};

        for(DataBase dataBase:dataBases){
            dataBase.open();
            dataBase.readData();
            dataBase.writeData();
            dataBase.closeTheDataBase();
        }
    }
}
