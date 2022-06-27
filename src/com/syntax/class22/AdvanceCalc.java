package com.syntax.class22;

public class AdvanceCalc {
  /*  void sum(int num1, int num2){
        System.out.println(num1+num2);
    }
    void sum(int num1, int num2, int num3){
        System.out.println(num1+num2+num3);
    }
    void sum(int num1, int num2, int num3,int num4){
        System.out.println(num1+num2+num3+num4);
    }*/

   static void sum(int...arr){//VAr args is the name ( ...)
       //System.out.println(arr[0]);
       int sum=0;
       for (int j : arr) {
           //System.out.println(arr[i]);
           sum += j;
       }
       System.out.println("Sum of all the parameter values is : "+sum);
    }
static void printName(String ...names){//i can only call static method in static main
 for(String name:names){
     System.out.println(name);

 }
}
    public static void main(String[] args) {
        sum(2,2,3,4,10);
        //printName("Dean","Amine","Zola");

        int age=10;
        String name;
        if(age>18){
            name="Time to go work";
        }else{
            name="Enjoy no work";
        }
        System.out.println(name);

        //Second method of IF condition

        String name2=age>18?"Time to go work":"Enjoy no work";
        System.out.println(name2);
// nested if else
        String name3=age>18? age>10?"Time to go work":"Enjoy no work":"Enjoy no work";// (:)ternary operator
        System.out.println(name3);






    }
}
