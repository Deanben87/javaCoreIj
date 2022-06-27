package com.syntax.review.class08;

public class Doctor {
   public String firstName, lastName;
   protected String speciality;
     int experience;
    private double salary;

    static String hospital;

    Doctor(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    Doctor(String firstName, String lastName, String speciality, int experience) {
        this(firstName, lastName);
        this.speciality = speciality;
        this.experience = experience;
    }

    public void printInfo() {
        System.out.println("Doctor name is : " + firstName + " " + lastName + " and speciality is : " + speciality);
    }

   protected void work() {
        System.out.println("Doctor " + lastName + " works at " + hospital);

    }

    void treat(String patientName){
        this.printInfo();
        System.out.println( "treats patient name "+patientName);
    }
    private void getPaid(){
        System.out.println("Doctor "+lastName+" gets paid "+salary);
    }

    //static members can work only with static variables
    static void study(String university){
        //printInfo(); CE:non-static method printInfo() cannot be referenced from a static context
        System.out.println("Doctor studied at "+university+" and now works at "+hospital);
    }
}
