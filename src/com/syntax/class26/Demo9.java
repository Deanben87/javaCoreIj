package com.syntax.class26;

import java.util.ArrayList;

public class Demo9 {
    public static void main(String[] args) {
       Integer number=10;
        System.out.println(Integer.MAX_VALUE);
        int num= Integer.parseInt("20");//if a number is present in the form of string using this will converted to int
        System.out.println(num);
        System.out.println(Integer.MIN_VALUE);

        int number1=15;
        ArrayList<Integer> numbers=new ArrayList<>();
        numbers.add(number1);//auto boxing
        System.out.println("numbers = " + numbers);
        int number3=numbers.get(0).intValue();// unboxing
        number3=numbers.get(0);//auto unboxing
        new Integer(15);//auto boxing



    }
}
