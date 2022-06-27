package com.syntax.class16;

public class GoogleEmployees {

    String name;
    double salary;
    static int noOfEmployees;
    static String companyName="Google";

    void displayEmployeeInfo(){
        System.out.println("Name "+name+" "+" Salary "+salary+" Company Name "+companyName+" total of Employees "+noOfEmployees);
    }

    public static void main(String[] args) {
        GoogleEmployees emp1=new GoogleEmployees();
        emp1.name="Dean";
        emp1.salary=250000;
        emp1.noOfEmployees=1;
        emp1.displayEmployeeInfo();

        GoogleEmployees emp2=new GoogleEmployees();
        emp2.name="Amine";
        emp2.salary=200000;
        emp2.noOfEmployees=2;
        emp2.displayEmployeeInfo();



    }

}
