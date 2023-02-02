package org.example;

public class Player {


    public final char PLAYER_CHARACTER = '☺';
    private Position positionplayer;
    private int score;

    public Player(int x, int y) {
        positionplayer = new Position(x, y);
        score = 0;

    }

    public int getX() {
        return positionplayer.x;
    }

    public int getY() {
        return positionplayer.y;
    }

    public void moveLeft() {
        positionplayer.setX(getX() - 2);

    }

    public void moveRight() {
        positionplayer.setX(getX() + 2);
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
