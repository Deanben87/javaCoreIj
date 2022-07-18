package com.syntax.class27;

import java.util.ArrayList;
import java.util.List;

public class ListDemo2 {
    public static void main(String[] args) {
        List<String> legends= new ArrayList<>();//recommended
        legends.add("Dean");
        legends.add("Zola");
        legends.add("Amine");
        legends.add("Ben");
        legends.add("Meriem");

        ArrayList<String> moreStudents= new ArrayList<>();
        moreStudents.add("Rezki");
        moreStudents.add("Kenza");

        ArrayList<String> allStudents= new ArrayList<>();
        allStudents.addAll(legends);
        allStudents.addAll(moreStudents);
        System.out.println(allStudents);
       allStudents.removeAll(legends);//opposite to addAll method
        System.out.println(allStudents);
        allStudents.clear();
        System.out.println(allStudents);

    }
}
