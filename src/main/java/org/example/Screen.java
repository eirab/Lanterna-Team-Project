package org.example;

import com.googlecode.lanterna.terminal.DefaultTerminalFactory;
import com.googlecode.lanterna.terminal.Terminal;

import javax.swing.*;
import java.io.IOException;

public class Screen {

    private DefaultTerminalFactory terminalFactory;
    private Terminal terminal;
    public Screen(){

        try {
            terminalFactory = new DefaultTerminalFactory();
            terminal = terminalFactory.createTerminal();
            terminal.setCursorVisible(false);
        } catch(IOException e){
            System.out.println("Failed to initialise terminal");
        }
    }


    public void putChar(char c){


    }

    public void drawPlayer(Player player) throws IOException {
        terminal.setCursorPosition(player.getX(), player.getY());
        terminal.putCharacter(' ');
        terminal.putCharacter(player.PLAYER_CHARACTER);
        terminal.flush();
    }

    public Terminal getTerminal(){
        return terminal;}











/*
                // Draw player
                terminal.setCursorPosition(oldPosition.x, oldPosition.y);
                terminal.putCharacter(' ');
                terminal.setCursorPosition(player.x, player.y);
                terminal.putCharacter(playerCharacter);








                terminal.flush();*/
            }
