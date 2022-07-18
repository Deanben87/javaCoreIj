package com.syntax.class28;

public class ListDemo {
    public static void main(String[] args) {
        Object [] arr ={"Dean",10.2,"Name"};//bad programing

        for(Object obj:arr){
           // System.out.println(obj.length());
            //instanceof is check if variable contains a specific type of object
            if(obj instanceof String)
            System.out.println(((String)obj).length());
        }
    }
}
