package com.company;

public class Reactangle {
    private int width;
    private int height;

    public Reactangle(){
        System.out.println("Constructor Invoked...");
        width=10;
        height=10;
    }
    public Reactangle (int wid, int heig){
        System.out.println("Parameterized Constructor Invoked...");
        width=wid;
        height=heig;
    }

    public  void displayDimensions(){
        System.out.println("Width: "+width);
        System.out.println("Width: "+height);
    }
}
