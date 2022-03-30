package com.company;

public class SoccerPlayer {
    String name;
    int number;
    int x;
    int y;

    public SoccerPlayer(){
        name = "dung";
        x=0;
        y=0;
        number=0;
    }

    public void run(){
        name="rank";
        number=21;
        x=1;
        y=1;
    }
    public void jump(){
        name="silver";
        number=20;
        x=2;
        y=4;
    }
    public void kickBall(){
        name="gol";
        number=10;
        x=2;
        y=5;
    }
}
