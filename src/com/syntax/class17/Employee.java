package com.syntax.class17;

public class Employee {

    public String name;
    public static String Manager="Ben";
    private int salary;
    String department;

   private void printSalary(){
       System.out.println("Salary "+salary);

   }

   public static void printManager(){
       System.out.println(Manager);
   }
    void printDepartment(){
        System.out.println("Depertment "+department);

    }
    public void printName(){
        System.out.println(name);
    }

    public static void main(String[] args) {
        Employee emp=new Employee();
        emp.name="Dean";
        emp.department="IT Destroyer";
        emp.salary=150000;
        emp.printName();
        emp.printDepartment();
        emp.printSalary();

    }

}
