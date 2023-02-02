package org.example;

import com.googlecode.lanterna.input.KeyStroke;
import com.googlecode.lanterna.terminal.Terminal;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

public class Game {

    private static final int N_START_CIRCLES = 4;
    private Screen screen;
    private Terminal terminal;
    private Player player;

    private ArrayList<Circle> circles;

    public Game() throws IOException {
        screen = new Screen();
        setTerminal(screen.getTerminal());
        player = new Player(screen.getColumns()/2, screen.getRows() );

       circles = initialiseCircles();
       screen.drawCircles(circles);
      pollKeystroke();

    }


    private ArrayList<Circle> initialiseCircles(){
        ArrayList<Circle> circList = new ArrayList<>();
        for (int i = 0; i < N_START_CIRCLES; i++) {
            Position position = new Position(getRandomX(), i);
            Circle circle = new Circle(position);
            circList.add(circle);
        }

    return circList;

    }

    private int getRandomX(){
        Random x = new Random();
        return x.nextInt(screen.getColumns());
    }




    public void pollKeystroke() throws IOException {

        boolean continueReadingInput = true;
        while (continueReadingInput) {
            screen.drawPlayer(player);

            KeyStroke keyStroke = null;
            do {
                try {
                    Thread.sleep(5); // might throw InterruptedException
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                keyStroke = terminal.pollInput();

            } while (keyStroke == null);

            handleKeyStroke(keyStroke);
            terminal.flush();


        }
    }

    public void handleKeyStroke(KeyStroke key) throws IOException {
        switch (key.getKeyType()) {
            case ArrowLeft:
                screen.clearOldPosition(player);
                player.moveLeft();
                break;
            case Escape:

                terminal.close();
                System.out.println("quit");
                break;

            case ArrowRight:
                screen.clearOldPosition(player);
                player.moveRight();
                break;
        }
    }





    public void setPlayer(Player player) {
        this.player = player;
    }

    public void setTerminal(Terminal terminal) {
        this.terminal = terminal;
    }

    public void setScreen(Screen screen) {
        this.screen = screen;
    }
}
