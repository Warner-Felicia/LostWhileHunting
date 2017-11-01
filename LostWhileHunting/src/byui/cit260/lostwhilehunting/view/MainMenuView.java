/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.lostwhilehunting.view;

import byui.cit260.lostwhilehunting.control.GameControl;
import java.util.Scanner;
import lostwhilehunting.LostWhileHunting;

/**
 *
 * @author New User
 */
public class MainMenuView {
    
    private String menu;

    public MainMenuView() {
        this.menu = "\n"
                    + "\n----------------------------------------"
                    + "\n| Main Menu                            |"
                    + "\n----------------------------------------"
                    + "\nN - Start A New Game"
                    + "\nC - Continue A Saved Game"
                    + "\nH - Help Menu"
                    + "\nS - Save game"
                    + "\nQ - Quit"
                    + "\n----------------------------------------";
    }
    void displayMainMenuView() {
        
        boolean done = false; // set flag to not done
        do {
            // promt for and get players name
            String menuOption = this.getMenuOption();
            if (menuOption.toUpperCase().equals("Q")) // user wants to quit
                return; // exit the game
            
            // do the requested action and display the next view
            done = this.doAction(menuOption);
        } while (!done);
    }

    private String getMenuOption() {
       Scanner keyboard = new Scanner(System.in);
        String value = "";
        boolean valid = false;
        
        while (!valid) {
            System.out.println("\n" + this.menu);
            
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

    private boolean doAction(String choice) {
       
        choice = choice.toUpperCase(); // convert choice to upper case
        
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
                System.out.println("\n*** Invalid selection *** Try again");
                break;
        }
        
        return true;
    }

    private void startNewGame() {
        GameControl.createNewGame(LostWhileHunting.getPlayer());
        
        //display the select a character menu
        SelectACharacterView selectACharacterView = new SelectACharacterView();
        selectACharacterView.displaySelectACharacterMenu();
    }

    private void startExistingGame() {
        System.out.println("*** startExistingGame function called ***");
    }

    private void displayHelpMenu() {
        // Create HelpMenuView object
        HelpMenuView helpMenuView = new HelpMenuView();
        
        // Display the main menu view
        helpMenuView.displayHelpMenuView();
    }

    private void saveGame() {
        System.out.println("** saveGame function called ***");
    }
    
    
}
