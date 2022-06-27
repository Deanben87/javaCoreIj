package com.syntax.class17;


import com.syntax.class16.Dog;


public class Tester {
    public static void main(String[] args) {
        /*
        if classe exist inside the same package
        they are imported automatically
         */

        Employee employee=new Employee();
        employee.name="Mike";
        //employee.salary=125000;because its private in Employees class
        employee.department="IT Saver";

        //employee.printSalary();private we can`t access it
        employee.printDepartment();
        employee.printName();
        Dog dog=new Dog();

    }
}
