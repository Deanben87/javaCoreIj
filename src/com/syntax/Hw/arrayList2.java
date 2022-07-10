package com.syntax.Hw;

import java.util.ArrayList;

public class arrayList2 {
    public static void main(String[] args) {
        ArrayList<String> cars =new ArrayList<>();
        cars.add("Audi");
        cars.add("Benz");
        cars.add("Toyota");
        cars.add("Bmw");

        System.out.println(cars);

        for(int i=0; i<cars.size();i++){
            System.out.println(cars.get(i));
        }
        for(String car:cars){
            System.out.println(car);
        }
        System.out.println(cars.clone());



    }
}
