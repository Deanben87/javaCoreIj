package com.syntax.class17;

public class Task1 {

    /*Create a Class called SyntaxEmployee:
Create three  variables  empID , salary and set the CEO to “Sumair”
Create two objects of the class SyntaxEmployee
Set the value of eID, salary for each of the objects
Print out the eID , salary and  CEO for each of the objects

     */
    String empId;
    int salary;
//whenever we are sure that two objects of class can have different values for
    //a variable or if we have to share that variable between two or more methods of that
    //class we should always go with instance variables
    static String CEO="Sumair";

    public static void main(String[] args) {
        Task1 task1=new Task1();
        task1.empId="123";
        task1.salary=200000;

        Task1 task2=new Task1();
        task2.empId="124";
        task2.salary=250000;
        System.out.println(task1.empId);
        System.out.println(task1.salary);
        System.out.println(task2.empId);
        System.out.println(task2.salary);




    }


}
