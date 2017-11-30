/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.lostwhilehunting.view;

import byui.cit260.lostwhilehunting.control.GameControl;
import byui.cit260.lostwhilehunting.exceptions.GameControlException;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import lostwhilehunting.LostWhileHunting;

/**
 *
 * @author New User
 */
public class MainMenuView extends View{
    
    String menu;
    private PrintWriter console = LostWhileHunting.getOutFile();
    
    public MainMenuView() {
        super ("\n"
                + "\n----------------------------------------"
                + "\n| Main Menu                            |"
                + "\n----------------------------------------"
                + "\n1 - Start A New Game"
                + "\n2 - Continue A Saved Game"
                + "\n3 - Help Menu"
                + "\n4 - Save game"
                + "\nQ - Quit"
                + "\n----------------------------------------");
    }
    
    @Override
    public void display() {
        boolean done = false; // set flag to not done
        do {
            // promt for and get players name
            String value = this.getInput();
            if (value.toUpperCase().equals("Q")) // user wants to quit
                System.exit(0); // exit the game
            
            // do the requested action and display the next view
            done = this.doAction(value);
        } 
        while (!done);
    } 
    
    
    @Override    
    public boolean doAction(String choice) {
       
        switch (choice) {
            case "1": // create and start a new game
                this.startNewGame();
                break;
            case "2": // get and start an existing game
                this.startExistingGame();
               break;
            case "3": // display the help menu
                this.displayHelpMenu();
                break;
            case "4": // save the current game
                this.saveGame();
                break;
            default:
                this.console.println("\n*** Invalid selection *** Try again");
                break;
        }
        
        return false;
    }

    // Felicia fix
    private void startNewGame() {
        try {
            GameControl.createNewGame(LostWhileHunting.getPlayer());
        } catch (GameControlException gce) {
            this.console.println(gce.getMessage());
        }
        
        //display the select a character menu
        SelectACharacterView selectACharacterView = new SelectACharacterView();
        selectACharacterView.display();
    }

    private void startExistingGame() {
        this.console.println("*** startExistingGame function called ***");
    }

    private void displayHelpMenu() {
        // Create HelpMenuView object
        HelpMenuView helpMenuView = new HelpMenuView();
        
        // Display the main menu view
        helpMenuView.displayHelpMenuView();
    }

    private void saveGame() {
        this.console.println("\n\nEnter the file path for the file where "
                + "the game will be saved.");
        String filePath = this.getInput();
        
        try {
            GameControl.saveGame(LostWhileHunting.getCurrentGame(), filePath);
        }
        catch (GameControlException ex) {
            ErrorView.display("MainMenuView", ex.getMessage());
        }
    }
  
}
