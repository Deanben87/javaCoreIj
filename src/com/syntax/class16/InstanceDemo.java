package com.syntax.class16;

public class InstanceDemo {

    String str="instance";
    void changeInstanceValue(){
        str="Captain Marvel";
    }

    void printIstanceValue(){
        System.out.println(str);
    }

    public static void main(String[] args) {
        InstanceDemo id = new InstanceDemo();
        System.out.println(id.str); // prints the value of str which is instance
        id.printIstanceValue(); // method once simple prints the value of str which is still instance
        id.changeInstanceValue(); //this methode changes the instance variable value which will be captian marvel
        id.printIstanceValue();//method once simple print the value of str which is now instance captin marvel
    }
}
