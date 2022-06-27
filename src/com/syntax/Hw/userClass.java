package com.syntax.Hw;

public class userClass {
    String name;
    int mobileNumber;
    String userAdress;
    userClass(String name, int mobileNumber,String userAdress) {
        this.name = name;
        this.mobileNumber = mobileNumber;
        this.userAdress=userAdress;
    }
    void printUser(){
        System.out.println("Name "+name+" Mobile num "+mobileNumber+" Adress "+userAdress);
    }
}
class userInfo extends userClass {
    userInfo(String name, int mobileNumber, String userAdress) {
        super(name, mobileNumber, userAdress);
    }
    public static void main(String[] args) {
        userInfo userInfo=new userInfo("Dean", 3474885, "10716 s Ave C");
       userInfo.printUser();

    }
}


