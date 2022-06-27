package com.syntax.class15;

public class VariablesDemo1 {

    String nameVariables; //instance variable
    static int num=5;//static variable

    void printName(){
        String name="Local";//local vairable
        System.out.println(name);
    }

    public static void main(String[] args) {
        VariablesDemo1 v=new VariablesDemo1();
        v.printName();
        System.out.println(VariablesDemo1.num);

    }
}
