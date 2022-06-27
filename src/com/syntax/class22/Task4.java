package com.syntax.class22;

public class Task4 {
/*Create 1 class with a private method that has 3 overloaded forms.
 Then call each overloaded method with specific arguments and observe result.
 */

    static void sayHello(){
        System.out.println("Hello Batch 13");
    }
    static void sayHello(String msg){
        System.out.println(msg);
    }
    static void sayHello(String msg,int times){
       for(int i=0;i<times;i++){
           System.out.println(msg);
       }
    }

    public static void main(String[] args) {
        sayHello();
        sayHello("Hola");
        sayHello("Hola",2);
    }

}
