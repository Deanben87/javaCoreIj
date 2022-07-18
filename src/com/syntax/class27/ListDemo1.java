package com.syntax.class27;

import java.util.ArrayList;
import java.util.List;

public class ListDemo1 {
    public static void main(String[] args) {
        ///we can store the object of class inside a variable of type parent class
        //interface if that class implements that interface
        List<String> legends= new ArrayList<>();
        legends.add("Dean");
        legends.add("Zola");
        legends.add("Amine");
        legends.add("Ben");
        System.out.println( legends.isEmpty());
        System.out.println(legends.size());
        System.out.println(legends.contains("jack"));
        System.out.println(legends.contains("Dean"));//will return true
        Object [] arr= legends.toArray();
        System.out.println(arr[0]);
        legends.remove("Ben");

        List<String> someStudents = new ArrayList<>();
        someStudents.add("Abdul");
        someStudents.add("Ben");
        System.out.println(legends.containsAll(someStudents));


    }
}
