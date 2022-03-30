package com.company;

public class TestCircle {
    public static void main(String[] args){// Program entry point
        // declare and Construct an instance of the Circle classcalled c1
        Circle c1 = new Circle();
        System.out.println("The radius is: " + c1.getRadius());
        System.out.println("The color is: " + c1.getColor());
        System.out.printf("The area is: %.2f%n", c1.getArea());

        //declare and Construct another instance of the Circle class called c2
        Circle c2 = new Circle(2.0);
        System.out.println("The radius is: " + c2.getRadius());
        System.out.println("The color is: " + c2.getColor());
        System.out.printf("The area is: %.2f%n", c2.getArea());

        Circle c3 = new Circle(3.0,"red");
        System.out.println("The radius is: " + c3.getRadius());
        System.out.println("The color is: " + c3.getColor());
        System.out.printf("The area is: %.2f%n", c3.getArea());
    }
}
