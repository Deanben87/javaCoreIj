package com.syntax.class20;

public class Vehicle {
    int engineHP;
    String make;
    String model;
    String color;
}
class Car extends Vehicle{
    String steringType;
    boolean autoPilot;
    int noOfWindows;
}
class BMW extends Car{
    int TopSpeed;
    void printBsicInfo(){
        engineHP=500;
        System.out.println(engineHP);
    }


}