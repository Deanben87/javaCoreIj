package com.syntax.class23;

public class PloyMorphismDemo1 {

    void doSomething(String name){
        System.out.println("downloading a movie from the internet "+name);
    }
    void doSomething(int num) {
        System.out.println("calculating the text based on new rules");
    }
}

class PolyTest{

    public static void main(String[] args) {
        PloyMorphismDemo1 p=new PloyMorphismDemo1();
        p.doSomething("");

    }
}
