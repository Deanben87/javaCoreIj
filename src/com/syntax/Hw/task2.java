package com.syntax.Hw;

public class task2 {

static void method(){
    System.out.println("Empty");
}
static void method(String breed){
        System.out.println("this method has String parameter "+breed );
}
static void method(int num){
    System.out.println("This method has int parameter "+num);
}

    public static void main(String[] args) {
        task2.method();
        task2.method("pitbull");
        task2.method(35);
    }


}
