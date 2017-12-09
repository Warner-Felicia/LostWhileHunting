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
import java.io.Serializable;
import java.util.Scanner;
import lostwhilehunting.LostWhileHunting;

/**
 *
 * @author New User
 */
public class MainMenuView extends View implements Serializable{
    
    String menu;
    private PrintWriter console = LostWhileHunting.getOutFile();
    
    public MainMenuView() {
        super ("\n"
                + "\n----------------------------------------"
                + "\n| Main Menu                            |"
                + "\n----------------------------------------"
                + "\nN - Start A New Game"
                + "\nC - Continue A Saved Game"
                + "\nH - Help Menu"
                + "\nS - Save game"
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

        choice = choice.toUpperCase();
        
        switch (choice) {
            case "N": // create and start a new game
                this.startNewGame();
                break;
            case "C": // get and start an existing game
                this.startExistingGame();
               break;
            case "H": // display the help menu
                this.displayHelpMenu();
                break;
            case "S": // save the current game
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
        this.console.println("\n\nEnter the file path for file where the "
                + "game is saved.");
        
        String filePath = this.getInput();
        
        try {
            GameControl.getSavedGame(filePath);
        } catch (Exception ex) {
            ErrorView.display("MainMenuView", ex.getMessage());
        }
        
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.display();
    }

    private void displayHelpMenu() {
        // Create HelpMenuView object
        HelpMenuView helpMenuView = new HelpMenuView();
        
        // Display the main menu view
        helpMenuView.display();
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
