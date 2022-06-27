package com.syntax.class16;

import com.syntax.class17.Employee;

import java.util.Scanner;

public class Tester {

    public static void main(String[] args) {
        AccessModifiersDemo1 ac=new AccessModifiersDemo1();
       // System.out.println(ac.password);error becuase its private
        String str=new String();//we dont see any imoprt because this class
        //is present inside the java.lang
        //all the class insid java.lang package are imported by default for
        System.out.println(ac.ssn);
        System.out.println(ac.name);
        Employee emp=new Employee();
        Scanner scan=new Scanner (System.in);
    }
}
