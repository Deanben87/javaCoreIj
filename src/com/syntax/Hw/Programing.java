package com.syntax.Hw;

public class Programing {


    public Programing() {
        System.out.println("I love programing language ");
    }
    public Programing(String name) {
        System.out.println("I love " +name);
    }
}
class ProgrammingTester{
    public static void main(String[] args) {
        Programing pro=new Programing();
        Programing pro2=new Programing("Java");
    }
}