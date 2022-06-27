package com.syntax.class20;

public class BirdTester {
    public static void main(String[] args) {
        parrot parrot=new parrot("parrot","Black",10,.5);
        parrot.printInfo();

        sparrow sparrow=new sparrow("jack Sparrow","White",10,.5);
        sparrow.printInfo();
    }
}
