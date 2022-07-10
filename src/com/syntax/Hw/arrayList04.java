package com.syntax.Hw;

import java.util.ArrayList;

public class arrayList04 {
    public static void main(String[] args) {
        ArrayList<String> words=new ArrayList<>();
        words.add("catch");
        words.add("level");
        words.add("eye");
        System.out.println(words);

        for(int i=0; i<words.size();i++){
            if(words.get(i).endsWith("e")){
                words.remove(i);
            }
        }
        System.out.println(words);
    }
}
