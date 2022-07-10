package com.syntax.class26;

import java.util.ArrayList;

public class Demo4 {
    public static void main(String[] args) {
        ArrayList<String> names=new ArrayList<>();
        names.add("Dean");
        names.add("Jazz");
        names.add("Pop");
        names.add("Rai");
        System.out.println(names);
        names.remove("Jazz");
        System.out.println(names);
        names.remove(2);
        System.out.println(names);

    }
}
