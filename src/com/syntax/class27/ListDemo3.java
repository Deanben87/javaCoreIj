package com.syntax.class27;

import java.util.ArrayList;
import java.util.List;

public class ListDemo3 {
    public static void main(String[] args) {
        List<String> legends= new ArrayList<>();//recommended
        legends.add("Dean");
        legends.add("Zola");
        legends.add("Amine");
        legends.add("Ben");
        legends.add("Meriem");
        legends.add("Meriem");
        legends.add("Zola");
        legends.add("Meriem");


        System.out.println(legends.get(4));
        System.out.println(legends.get(2));
        System.out.println(legends);

        legends.set(0,"Hamid Jan");//replace an index
        System.out.println(legends);
        System.out.println(legends.indexOf("Meriem"));//

        System.out.println(legends.lastIndexOf("Meriem"));

        System.out.println(legends.subList(0,3));//3-0=3 //limitation


    }
}
