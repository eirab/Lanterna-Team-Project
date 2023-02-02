package org.example;

import com.googlecode.lanterna.TerminalSize;
import com.googlecode.lanterna.terminal.DefaultTerminalFactory;
import com.googlecode.lanterna.terminal.Terminal;

import javax.swing.*;
import java.io.IOException;
import java.util.ArrayList;

public class Screen {

    private DefaultTerminalFactory terminalFactory;
    private Terminal terminal;
    private TerminalSize terminalSize;

    public Screen() {

        try {
            terminalFactory = new DefaultTerminalFactory();
            terminal = terminalFactory.createTerminal();
            terminal.setCursorVisible(false);
            terminalSize = new TerminalSize(50, 50);
        } catch (IOException e) {
            System.out.println("Failed to initialise terminal");
        }
    }


    public void putChar(char c) {


    }

    public int getRows(){
        return terminalSize.getRows();
    }

    public int getColumns(){
        return terminalSize.getColumns();
    }

    //Draws player based on its position
    public void drawPlayer(Player player) throws IOException {
        terminal.setCursorPosition(player.getX(), player.getY());
        terminal.putCharacter(player.PLAYER_CHARACTER);
        terminal.flush();
    }

    public void drawCircles(ArrayList<Circle> circles) throws IOException {
        for (Circle circ: circles
             ) { terminal.setCursorPosition(circ.getX(), circ.getY());
            terminal.putCharacter(circ.circle);
            terminal.flush();

        }


    }
    public void clearOldPosition(Player player) throws IOException {
        terminal.setCursorPosition(player.getX(), player.getY());
        terminal.putCharacter(' ');
        terminal.flush();

    }

    public void clearOldPosition(Circle... circles) throws IOException {
        for (Circle circle: circles
             ) { terminal.setCursorPosition(circle.getX(), circle.getY());
            terminal.putCharacter(' ');
            terminal.flush();

        }




    }

    public Terminal getTerminal() {
        return terminal;
    }

    public void drawCircle(Circle circle) throws IOException {
        terminal.setCursorPosition(circle.getX(), circle.getY());
        terminal.flush();
    }













/*
                // Draw player
                terminal.setCursorPosition(oldPosition.x, oldPosition.y);
                terminal.putCharacter(' ');
                terminal.setCursorPosition(player.x, player.y);
                terminal.putCharacter(playerCharacter);








                terminal.flush();*/
}
