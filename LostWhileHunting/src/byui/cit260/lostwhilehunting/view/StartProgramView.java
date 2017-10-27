/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.lostwhilehunting.view;

import byui.cit260.lostwhilehunting.control.GameControl;
import byui.cit260.lostwhilehunting.model.Player;
import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class StartProgramView {

    private String promptMessage;
    
    public StartProgramView() {
        
        this.promptMessage = "\nPlease enter your name: ";
        //display the banner when view is created
        this.displayBanner();
    }

    private void displayBanner() {
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

    public void displayStartProgramView() {
        
        boolean done = false; //set flag to not done
        do {
            //Prompt for and get players name
            String playersName = this.getPlayersName();
            if(playersName.toUpperCase().equals("Q")) //user wants to quit
              return; //exit the game
          
            //do the requested action and display the next view
            done = this.doAction(playersName);
          
      }while (!done);   
         
    }
    
    private String getPlayersName() {
        Scanner keyboard = new Scanner(System.in);
        String value = "";
        boolean valid = false;
        
        while (!valid) {
            System.out.println("\n" + this.promptMessage);
            
            value = keyboard.nextLine();
            value = value.trim();
            
            if (value.length() < 1) {
                System.out.println("\nInvalid value: value can not be blank");
                continue;
            }
            
            break; // end the loop
        }
        
        return value;  // return the value entered
    }

    private boolean doAction(String playersName) {
        if (playersName.length() < 2) {
            System.out.println("\nInvalid player's name: "
                + "The name must be greater than one character in length.");
            return false;
        }
        
        // call createPlayer() control function
        Player player = GameControl.createPlayer(playersName);
        
        if (player == null) {
            System.out.println("\nError creating the player.");
            return false;
        }
        
        this.displayNextView(player);
        return true;
        
    }

    private void displayNextView(Player player) {
        System.out.println("\n ======================================"
                            + "\n Welcome to the game " + player.getName() 
                            + "."
                            + "\n We hope you have a lot of fun!"
                            + "\n ======================================");
        
        // Create MainMenuView object
        MainMenuView mainMenuView = new MainMenuView();
        
        // Display the main menu view
        mainMenuView.displayMainMenuView();
    }
    
}