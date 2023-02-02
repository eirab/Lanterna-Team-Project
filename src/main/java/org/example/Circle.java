package org.example;

import java.util.ArrayList;
import java.util.Random;

public class Circle {

    private static final int N_CIRCLES_START = 4;
    public final char circle = 'O';
    private Position position;
    private ArrayList<Circle> circles;



    //Constructor här
    public Circle() {



    }

    public Circle(Position position) {
        this.position = position;

    }

    public ArrayList<Circle> initialiseCircles() {
        ArrayList<Circle> startCircles = null;
        for(int i = 0; i < N_CIRCLES_START; i++ ){
            Position position = new Position(getRandomXPosition(), 0);
            Circle circle  = new Circle(position);
            startCircles.add(circle);
        }
        this.circles = startCircles;
    }

    public int getX() {
        return position.x;
    }

    public int getY() {
        return position.y;
    }


    private int getRandomXPosition(){
        Random x = new Random(80);
        return x.nextInt();
    }



    //Has a circle touched the ground?
    //Check if y == 0
    private boolean isGameOver(){

    }

    //Check how many circles, if they should have disappeared or if game over
    private void checkCircles(){
        isGameOver();


    }





    //Gå igenom alla cirklar
    public void updateCircles() {





    }




}
