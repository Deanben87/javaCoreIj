package com.syntax.class26;

import java.util.ArrayList;

public class Demo1 {
    public static void main(String[] args) {
        String name="Aladdin";
        String name2="Dean";
        String name3="Amine";
        /*int size=10;
        String [] arr=new String[size];*/
        String [] names={"Aladdin","Dean","Amine"};
        System.out.println(names.length);

        names=new String[4];
        names[0]="Aladdine";
        names[1]="Dean";
        names[2]="Amine";
        names[3]="Zola";
        System.out.println(names.length);

        ArrayList<String>syntaxStudents=new ArrayList<>();
        System.out.println(syntaxStudents.size());
        syntaxStudents.add("Dean");
        System.out.println(syntaxStudents.size());
        syntaxStudents.add("Dean james bon");
        syntaxStudents.add(" ivan 007");
        System.out.println(syntaxStudents.size());

        ArrayList<Integer>number=new ArrayList<>();

        for(int i=1; i<10; i=i+2){
            number.add(i);
        }
        System.out.println(number);
    }
}
