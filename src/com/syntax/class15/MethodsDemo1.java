package com.syntax.class15;

public class MethodsDemo1 {

    void method1(){
        System.out.println("I can print statement in void type method");
        int num=0;
        //return 0,"balla"; because void mean not data wil be returned from this method
    }

    public static void main(String[] args) {
        MethodsDemo1 methodsDemo1=new MethodsDemo1();
        //int x=methodsDemo1.method1();method with void return type can`t be assigned to
        //variables
    }
}
