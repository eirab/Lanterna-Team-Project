package org.example;

import javax.swing.*;
import java.io.IOException;

/**
 * The only purpose of this class is to initialise the game.
 */
public class Main {

    public static void main(String[] args) throws IOException {


        Game game = new Game();
        Screen screen = new Screen();
        Player player = new Player();
        Circle circle = new Circle();
        game.setCircle(circle);
        game.setScreen(screen);
        game.setTerminal(screen.getTerminal());
        game.setPlayer(player);
        game.pollKeystroke();


    }
}