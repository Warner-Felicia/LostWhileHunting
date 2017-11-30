/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.lostwhilehunting.view;

import byui.cit260.lostwhilehunting.exceptions.GameControlException;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import lostwhilehunting.LostWhileHunting;

/**
 *
 * @author New User
 */
public abstract class View implements ViewInterface{
    
    protected String displayMessage;
    
    protected final BufferedReader keyboard = LostWhileHunting.getInFile();
    protected final PrintWriter console = LostWhileHunting.getOutFile();
    
    public View() {
        
    }
    
    public View(String message) {
        this.displayMessage = message;
    }
    
    @Override
    public void display() {
        
        boolean done = false; // set flag to not done
        do {
            // promt for and get players name
            String value = this.getInput();
            if (value.toUpperCase().equals("Q")) // user wants to quit
                return; // exit the game
            
            // do the requested action and display the next view
            done = this.doAction(value);
            
        } 
        while (!done);
    }
    
    @Override
    public String getInput() {
       
        String value = null;
        boolean valid = false;
        
        while (!valid) {
            this.console.println("\n" + this.displayMessage);
            
            try {
                value = keyboard.readLine();
                value = value.trim();
            } catch (IOException ex) {
                ErrorView.display(this.getClass().getName(), "Error reading from keyboard.");
            }
            
            
            if (value.length() < 1) {
                this.console.println("\nInvalid value: value can not be blank");
                continue;
            }
            
            break; // end the loop
        }
        
        return value;  // return the value entered
    }
}
