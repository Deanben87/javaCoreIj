package com.syntax.class16;
public class Students {
    String name;
    int ID;
    static   int numberOfStudents=0;

    public static void main(String[] args) {
        Students s1=new Students();
        s1.name="Dean";
        s1.ID=001;
       numberOfStudents =numberOfStudents+1;

        Students s2=new Students();
        s2.name="Amine";
        s2.ID=002;
        numberOfStudents =numberOfStudents+1;

        Students s3=new Students();
        s3.name="Jack";
        s3.ID=003;
        numberOfStudents =numberOfStudents+1;

        System.out.println("The number of students is "+numberOfStudents);




    }


}