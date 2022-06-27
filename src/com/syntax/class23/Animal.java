package com.syntax.class23;

public class Animal {//public final class Animal {
    public Animal() {
        System.out.println("Parent");
    }

    void eat(){
        System.out.println("All the animals eat");
    }
}

class Panda extends Animal{
    //no other class can inherit from animal class because it is declared final
    final double G=9.8;

    void eat() {
       // G=10;
        System.out.println("All the animals eat");
    }
        Panda(){
            System.out.println("Child");
        }
}

class Tester{
    public static void main(String[] args) {
        new Panda();
    }
}