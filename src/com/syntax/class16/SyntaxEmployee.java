package com.syntax.class16;

public class SyntaxEmployee {
    int empID;
    double salary;
    static String CEO="Sumair";



    public static void main(String[] args) {
        SyntaxEmployee syn=new SyntaxEmployee();
        syn.empID=101;
        syn.salary=142000;
        SyntaxEmployee syn1=new SyntaxEmployee();
        syn1.empID=102;
        syn1.salary=123000;

            System.out.println( "ID number "+syn.empID+" the owner is "+CEO);


            System.out.println( "ID number "+syn1.empID+" the owner is "+CEO);
        }
    }

