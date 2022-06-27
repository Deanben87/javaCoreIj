package com.syntax.Hw;

public class Student {
    public static void main(String[] args) {
        Student [] students={new SyntaxStudent(),new CollegeStudent()};
       for(Student s:students){
          s.attendance();
          s.practiceJava();
          s.homeWork();
        }
       SyntaxStudent s=new SyntaxStudent();
       s.listen();
    }

    void attendance(){
        System.out.println("Student need to attended all the classes ");
    }
    void practiceJava(){
        System.out.println("Student need a lot of practice to get better at java ");
    }

    void homeWork(){
        System.out.println("Student need to do their home work");
    }
}
class SyntaxStudent extends Student{

    @Override
    void attendance() {
        System.out.println("Syntax student need to attended all the classes ");
    }

    @Override
    void practiceJava() {
        System.out.println("Syntax student need a lot of practice to get better at java ");
    }

    @Override
    void homeWork() {
        System.out.println("Syntax student Student need to do their home work ");
    }

    void listen(){
        System.out.println("Student need to listen to Asghar");

    }
}
class CollegeStudent extends Student {

    @Override
    void attendance() {
        System.out.println(" College student need to attended all the classes ");
    }

    @Override
    void homeWork() {
        System.out.println("College student Student need to do their home work ");
    }
}

