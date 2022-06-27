package com.syntax.Hw;

public class AreaCalculator {

    static void area(double l,double w){
        double area = l* w;
        System.out.println("The area of the rectangle is : "+area);
    }
    static  void area(double w){
        double area = Math.pow(w, 2);
        System.out.println("The area of the rectangle is : "+area);
    }
    static  void area(double w,double l,double d) {
        double area = 2 * (l * w + l * d + w * d);
        System.out.println("The area of the box is : " + area);
    }
}
class AreaCalculatorTester {
    public static void main(String[] args) {
        AreaCalculator.area(2);
        AreaCalculator.area(2,5);
        AreaCalculator.area(2,5,6);
    }
}
