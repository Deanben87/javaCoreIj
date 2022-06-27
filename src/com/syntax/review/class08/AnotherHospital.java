package com.syntax.review.class08;

public class AnotherHospital {
    public static void main(String[] args) {

        Doctor doc=new Doctor("Sherlock","Holmes","Magic",10);

        //access method to test visibility

        doc.printInfo();//access to public
        doc.treat("Samantha");//access to default
        doc.work();//access to protected

        //class name.methode --when is static  static
        Doctor.study("GW");//access to public but this methode is because is static




    }
}
