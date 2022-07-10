package com.syntax.Hw;

import java.util.ArrayList;

public class arrayList03 {
    public static void main(String[] args) {
        ArrayList<String> drinks = new ArrayList<>();
        drinks.add("coke");
        drinks.add("pepsi");
        drinks.add("sprint");
        drinks.add("drPepper");
        System.out.println(drinks);

        for (int i = 0; i < drinks.size(); i++) {
            if (drinks.get(i).contains("a") || drinks.get(i).contains("e")) {
                drinks.remove(i);
                drinks.add(i,"water");
            }
            }
        System.out.println(drinks);
        }
    }
