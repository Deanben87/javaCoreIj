package com.syntax.Hw;

import java.util.ArrayList;

public class arrayList01 {

    public static void main(String[] args) {

        ArrayList<String>names = new ArrayList<>();
        names.add("Dean");
        names.add("Brenda");
        names.add("Zola");
        names.add("Amine");
        names.add("Rezki");
        System.out.println("Array list is empty : "+names.isEmpty());
        System.out.println("Zola name exist in the arrayList : "+names.contains("Zola"));
        System.out.println(names.size());
        System.out.println(names);
        //or
        for(int i=0; i< names.size();i++){
            System.out.println(names.get(i)+" ");
        }


    }

}
