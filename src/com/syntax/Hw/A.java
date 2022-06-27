package com.syntax.Hw;
public class A {
    int x=0;
    int y=1;
}
class B extends A{
    int z=2;
    void printValues1(){
        System.out.println("The value of x is "+x);
    }
    void printValues2(){
        System.out.println("The value of y is "+y);
    }
}
class C extends B{
    void printValues3(){
        System.out.println("The value of  is "+z);
    }
}
class test{
    public static void main(String[] args) {
     B b=new B();
     b.printValues1();
     C c=new C();
     c.printValues3();


    }
}

