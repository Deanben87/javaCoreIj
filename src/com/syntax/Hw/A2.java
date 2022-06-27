package com.syntax.Hw;

public class A2 {

    public static void printF(){
        System.out.println("Static method");
    }
}

class B2 extends A2{
    public static void main(String[] args) {
        B2 b=new B2();
        b.printF();


    }
}