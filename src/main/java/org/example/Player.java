package org.example;

public class Player {

    public final char PLAYER_CHARACTER = '☺';
    private Position position;
    private int score;

    public Player(){
        position = new Position(13, 13);
        score = 0;

    }
    public int getX(){
        return position.x;
    }

    public int getY(){
        return position.y;
    }

    public void moveLeft() {
        position.setX(getX()-2);

    }

    public void moveRight() {
        position.setX(getX()+2);
    }




/*
    //Has player caught any apples?
                for (Position monster : monsters) {
        if (monster.x == player.x && monster.y == player.y) {
            continueReadingInput = false;
            terminal.bell(); // primitive death sound!
            System.out.println("Game Over!");
        }
    }
*/

/*
    // Handle monsters
                for (Position monster : monsters) {
        terminal.setCursorPosition(monster.x, monster.y);
        terminal.putCharacter(' ');

        if (player.x > monster.x) {
            monster.x++;
        }
        else if (player.x < monster.x) {
            monster.x--;
        }
        if (player.y > monster.y) {
            monster.y++;
        }
        else if (player.y < monster.y) {
            monster.y--;
        }

        terminal.setCursorPosition(monster.x, monster.y);
        terminal.putCharacter('X');
    }

          */


}
