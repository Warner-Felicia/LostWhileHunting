/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.lostwhilehunting.view;

import byui.cit260.lostwhilehunting.control.GameControl;
import byui.cit260.lostwhilehunting.exceptions.GameControlException;
import byui.cit260.lostwhilehunting.model.Player;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Serializable;
import java.util.Scanner;
import lostwhilehunting.LostWhileHunting;

/**
 *
 * @author Trevon Morris
 */
public class StartProgramView implements Serializable{
    
    private String displayMessage;
    private PrintWriter console = LostWhileHunting.getOutFile();
    
    public StartProgramView() {
        
        this.displayMessage = ("\nPlease enter your name: ");
        //display the banner when view is created
        this.displayBanner();
    }

    public void displayBanner() {
        System.out.println("\n******************************************************"
                            +"\n*                                                    *"
                            +"\n*         Welcome to Lost While Hunting              *"
                            +"\n*                                                    *"
                            +"\n* This game is a text based role-playing game.  In   *"
                            +"\n* this game, you will be taking on the role of one   *"
                            +"\n* of three characters. The purpose of the game is to *"
                            +"\n* is to reunite with your group on the Oregon trail. *"
                            +"\n*                                                    *"
                            +"\n* The game includes several landmarks, and along the *"
                            +"\n* way you will make decisions that will have         *"
                            +"\n* consequences for the other characters.              *"
                            +"\n*                                                    *"
                            +"\n*                 Good Luck!                         *"            
                            +"\n******************************************************");
    }

    public void display() {
        
        String playersName;
        boolean done = false; //set flag to not done
        do {
            //Prompt for and get players name
            try {
                playersName = this.getPlayersName();
            } catch (GameControlException gce) {
                ErrorView.display(this.getClass().getName(), gce.getMessage());
                continue;
            }
            
            if(playersName.toUpperCase().equals("Q")) //user wants to quit
              return; //exit the game
          
            //do the requested action and display the next view
            try {
                done = this.doAction(playersName);
            }
            catch (GameControlException gce) {
                ErrorView.display(this.getClass().getName(), gce.getMessage());
            }
          
      }while (!done);   
         
    }
    
    public String getPlayersName() throws GameControlException{
        BufferedReader keyboard = LostWhileHunting.getInFile();
        String value = "";
        boolean valid = false;
        
        while (!valid) {
            System.out.println("\n" + this.displayMessage);
            
            try {
                value = keyboard.readLine();
                value = value.trim();
            
                if (value.length() < 1) {
                    throw new GameControlException("The player's name cannot be"
                        + " blank.");
                }
            
                break; 
            }
            catch (IOException ex) {
                ErrorView.display(this.getClass().getName(), "Error reading from keyboard.");

            }
        
        }    
        return value;  // return the value entered
    }

    public boolean doAction(String playersName) throws GameControlException{
        if (playersName.length() < 2) {
            System.out.println("\nInvalid player's name: "
                + "The name must be greater than one character in length.");
            return false;
        }
        
        // call createPlayer() control function
        Player player = GameControl.createPlayer(playersName);
        
        if (player == null) {
            throw new GameControlException("Error creating player.");
            
        }
        
        this.displayNextView(player);
        return true;
        
    }

    public void displayNextView(Player player) {
        System.out.println("\n ======================================"
                          + "\n Welcome to the game " + player.getName() 
                          + "."
                          + "\n We hope you have a lot of fun!"
                          + "\n ======================================");
        
        // Create MainMenuView object
        MainMenuView mainMenuView = new MainMenuView();
        
        // Display the main menu view
        mainMenuView.display();
    }
    
}
