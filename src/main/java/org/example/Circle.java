package org.example;

import com.googlecode.lanterna.terminal.Terminal;

import java.util.ArrayList;
import java.util.Random;

public class Circle {


    public final char circle = 'O';
    private Position position;
    private Terminal terminal;



    public Circle(Position position) {
        this.position = position;

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




    //Check how many circles, if they should have disappeared or if game over
    private void checkCircles(){



    }





    //Gå igenom alla cirklar, vi vill kolla positioner
   /* public void updateCircles() {
        for (Circle c : circles) {


        }

    }*/



    }





