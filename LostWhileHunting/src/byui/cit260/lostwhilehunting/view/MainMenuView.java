/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.lostwhilehunting.view;

import byui.cit260.lostwhilehunting.control.GameControl;
import byui.cit260.lostwhilehunting.exceptions.GameControlException;
import java.util.Scanner;
import lostwhilehunting.LostWhileHunting;

/**
 *
 * @author New User
 */
public class MainMenuView extends View{
    
    public MainMenuView() {
        super("\n"
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
       
        choice = choice.toUpperCase(); // convert choice to upper case
        
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
                System.out.println("\n*** Invalid selection *** Try again");
                break;
        }
        
        return false;
    }

    // Felicia fix
    private void startNewGame() {
        try {
            GameControl.createNewGame(LostWhileHunting.getPlayer());
        } catch (GameControlException gce) {
            System.out.println(gce.getMessage());
        }
        
        //display the select a character menu
        SelectACharacterView selectACharacterView = new SelectACharacterView();
        selectACharacterView.display();
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

    
    /*public double getDoubleNumber() {
        double number = null;

         while (number == null) {
            String value = this.getInput();
            value = value.trim().toUpperCase();

            if (value.equals("Q"))
                break;
            
            number = Double.parseDouble(value);

    return number;
}*/
    
    
}
