package com.syntax.class15;

public class VaribalesDemo2 {

    int num=10;//whenever you have to share some info in more than one methods
    /* of a class use instance variables */

    void method1(){
        int num2=20;
        System.out.println(num);
    }
    void method2(){
       // System.out.println(num2);
        System.out.println(num);
    }

}
