package org.example;

public class Position {

    public int x;
    public int y;

    public Position(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

        /*


    Position oldPosition = new Position(player.x, player.y);
                switch (keyStroke.getKeyType()) {
        case ArrowDown:
            player.y += 2;
            break;
        case ArrowUp:
            player.y -= 2;
            break;
        case ArrowRight:
            player.x += 2;
            break;
        case ArrowLeft:
            player.x -= 2;
            break;
    }*/

}
