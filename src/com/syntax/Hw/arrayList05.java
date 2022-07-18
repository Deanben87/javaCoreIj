package com.syntax.Hw;

import java.util.ArrayList;

public class arrayList05 {
    public static void main(String[] args) {
        ArrayList<Integer> evenNum=new ArrayList<>();

        for(int i=1; i<=500; i++) {
            evenNum.add(i);
        }
        System.out.println(evenNum);

        for(int i=0; i<evenNum.size();i++) {

        if(evenNum.get(i)%5==0){
            evenNum.remove(i);
        }
        }
        System.out.println(evenNum);




    }
}
