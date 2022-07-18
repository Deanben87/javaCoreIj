package com.syntax.class28;

import java.util.ArrayList;
import java.util.Iterator;

public class Task2 {
    /*
Create an arrayList of cars and retrieve all the values using 3 different ways
 */
    public static void main(String[] args) {

        ArrayList<String> cars = new ArrayList<>();
        cars.add("Bmw");
        cars.add("Togg");
        cars.add("Audi");
        cars.add("Toyota");

        for (String car : cars) {
            System.out.println(car);//best way to print things
        }
        for (int i = 0; i < cars.size(); i++) {
            System.out.println(cars.get(i));
        }

        System.out.println(cars);


        Iterator<String> iterator = cars.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }


    }
}



