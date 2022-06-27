package com.syntax.class20;

public class SuperDemo {
    public static void main(String[] args) {
        Chair chair=new Chair();
        chair.printColor();
    }
}
class Wood{
    String color="Bleu";
}
class Furniture extends Wood{
    String name="Table";
    String color="Black";//if we comment this ww will gwt belu
 }
class Chair extends Furniture{
    String color="grey";
    void printColor(){
        String color="White";
        System.out.println(color);
        System.out.println(this.color);
        System.out.println(super.color);

    }
}
//always local variables are prederred