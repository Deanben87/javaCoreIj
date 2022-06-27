package com.syntax.class21;

public class MethodOverLoading3 {
    void method(){
        System.out.println("1");
    }
    void method(String name){
        System.out.println("2");
    }
    void method(String name,int num){
        System.out.println("3");
    }

    void method(int num2,int num){
        System.out.println("4");
    }
    void method(int num, String name){
        System.out.println("5");
    }

    public static void main(String[] args) {
        MethodOverLoading3 method = new MethodOverLoading3();
        method.method("Dean",50);
    }



}
