package com.syntax.class22;

public class Parent {
    String name;
    void getMarried(){
        System.out.println("Hey Dean we have found a g for you");
    }
}

class Dean extends Parent{
    void getMarried(){
        super.getMarried();//we can do that too
        System.out.println("I want to try on T first ");
    }

    public static void main(String[] args) {
        Dean dean=new Dean();
        dean.getMarried();

    }
}
