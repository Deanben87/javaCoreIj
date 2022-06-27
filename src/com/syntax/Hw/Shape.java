package com.syntax.Hw;

public class Shape {
    int radius;
    Shape(int radius){
        this.radius=radius;
    }
}
class Circle extends Shape {
    Circle(int radius) {
        super(radius);
    }
    double calculate() {
        double area=(radius*radius)*Math.PI;
return area;
    }
    public static void main(String[] args) {
        Circle circle=new Circle(35);
        System.out.println(circle.calculate());

    }
}