package com.syntax.Hw;

public class task3 {

    private void print(){
        System.out.println("Empty");
    }
    private void print(String brand ){
        System.out.println("method with str para "+brand);
    }

    private void print(double weight ,int num ) {
        System.out.println("method with double and int para " + weight + num);
    }


    }

class task3Tester extends task3{
    public static void main(String[] args) {
      //task3.print();
      //task3.print("nike");
      //task3.print(2.66,55);
    }
}
