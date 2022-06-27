package com.syntax.review.class08;

public class Hospital {
    public static void main(String[] args) {

        Doctor doc=new Doctor("Jane","Smith");
        System.out.println(doc.firstName);
        System.out.println(doc.lastName);
        Doctor.hospital="UCSF";

        doc.printInfo();
        doc.work();

        System.out.println("changing calue of static variable");
        //creating another doctor
        Doctor doctor=new Doctor("Joe", "Doe","cardiologyst",10);
        doctor.printInfo();
        doctor.work();

        System.out.println("changing value of instance variable");
        //changing value of static variable
        Doctor.hospital="George Washington";
        doc.work();
        doctor.work();

        doc.lastName="Obama";
        doc.printInfo();
        doctor.printInfo();
        doc.hospital ="Mayo Clinic";

        System.out.println("                                                          ");
        doc.work();
        doctor.work();

        doctor.treat("Dean");

        //accessing static method
        Doctor.study("GTU");




    }
}
