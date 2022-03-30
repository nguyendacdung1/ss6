package com.company;

public class TestSoccerPlayer {
    public static void main(String[] args) {
        SoccerPlayer dung = new SoccerPlayer();
        dung.run();
        System.out.println("The name is: " + dung.name);
        System.out.println("The number is: " + dung.number);
        System.out.println("The x is: " + dung.x);
        System.out.println("The y is: " + dung.y);

        dung.jump();
        System.out.println("The name is: " + dung.name);
        System.out.println("The number is: " + dung.number);
        System.out.println("The x is: " + dung.x);
        System.out.println("The y is: " + dung.y);
    }

}
