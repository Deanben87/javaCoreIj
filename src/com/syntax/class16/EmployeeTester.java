package com.syntax.class16;

import com.syntax.class17.Employee;

public class EmployeeTester {

    public static void main(String[] args) {
        Employee employee=new Employee();
        employee.name="Zola";
        //employee.salary=125200;we can`t access it becuase its private
        //employee.department="IT";because we can`t access default
        System.out.println(Employee.Manager);
        Employee.printManager();
        //Static fields and mthods can also be accedded
        //by just writing the name of the  class

    }
}
