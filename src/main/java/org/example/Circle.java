package org.example;

import java.util.ArrayList;
import java.util.Random;

public class Circle {
    public final char circle = 'O';
    private Position position;
    private ArrayList<Circle> circles;
    private Random rand;

    //Constructor här
    public Circle() {
        position = new Position(0, 0);
    }

    public int getX() {
        return position.x;
    }

    public int getY() {
        return position.y;
    }

    //METOD: kolla om äpplet blir fångad, eller ramlar i marken (och ska då försvinna)
    public void fallingCircle() {
        position.setY(getY() + 3);
        for (int y = 0; y < 81; y++) {
            terminal.setCirclePosition(5, row); // go to position(column, row)
            terminal.putCharacter('O');
        }
    }


    //METOD som loopar och genererar fler äpplen hela tiden
    public char generateCircle() {
        rand = new Random();
        return circle;
    }


    //

}
