package com.syntax.class28;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class SetDemo5 {
    public static void main(String[] args) {

        LinkedHashSet<String> fruit=new LinkedHashSet<>();
        fruit.add("mango");
        fruit.add("Apple");
        fruit.add("Kiwi");
        fruit.add("Orange");
        fruit.add("Banana");
        fruit.add("Orange");
        System.out.println(fruit);

        Iterator<String> iterator=fruit.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        for(String frt:fruit){
            System.out.println(frt);
        }
    }
}

