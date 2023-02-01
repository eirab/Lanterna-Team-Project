package org.example;

import com.googlecode.lanterna.input.KeyStroke;
import com.googlecode.lanterna.terminal.Terminal;

import javax.swing.*;
import java.io.IOException;

public class Game {

    private Screen screen;
    private Terminal terminal;
    private Player player;

    public Game() throws IOException {

    }


    public void pollKeystroke() throws IOException {

        boolean continueReadingInput = true;
        while(continueReadingInput){
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


    }}

    public void handleKeyStroke(KeyStroke key) throws IOException {
        switch(key.getKeyType()){
            case ArrowLeft:
                player.moveLeft();
                break;
            case Escape:

                terminal.close();
                System.out.println("quit");
                break;

            case ArrowRight: player.moveRight();
            break;
        }
    }


    public void setPlayer(Player player){
        this.player = player;
    }

    public void setTerminal(Terminal terminal) {
                this.terminal = terminal;
    }

    public void setScreen(Screen screen) {
                this.screen = screen;
    }
}
