package com.syntax.review.class07;

public class B13String {

    //best practice is to always try to  make all of your instance variable as private
    private String str;
    public B13String(String str) {
        int number;
        //this.number; error as there is no instance variable number
        this.str = str;
    }
    //write a methode that can tell me how many times a chracter is being
    //repeated in string
    public int countChars(char c) {
        int counter = 0;


        for (char cha : str.toCharArray()) {
            if (cha == c) {
                counter++;
            }
            System.out.println();
        }
        return counter;
    }

    public void printChars(char c){
        int counter=0;
        for(int i=0; i<str.length(); i++){
           if(str.charAt(i)==c){
               counter++;
           }
        }
        System.out.println(c+" has appeared " +counter+ " inside thsi string");
    }



}