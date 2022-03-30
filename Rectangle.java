package com.company;

public class Rectangle {
    int width;
    int height;

    Rectangle(){
        System.out.println("Cóntructer Invoked...");
        width=10;
        height=10;
    }
    Rectangle(int wid,int heig){
        System.out.println("Parameterized Constructer");
        width=wid;
        height=heig;
    }
    void displayDimensios(){
        System.out.println("Width: " + width);
        System.out.println("Width: " + height);
    }
}
