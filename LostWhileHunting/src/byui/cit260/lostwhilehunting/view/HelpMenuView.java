/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.lostwhilehunting.view;

import byui.cit260.lostwhilehunting.control.LocationsControl;
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
public class HelpMenuView implements Serializable{
    
    MainMenuView mainmenu = new MainMenuView();
    private String menu;
    public HelpMenuView() {
        this.menu = "\n"
                    + "\n----------------------------------------"
                    + "\n| Help Menu                            |"
                    + "\n----------------------------------------"
                    + "\n1 - What is the goal of the game?"
                    + "\n2 - How to move"
                    + "\n3 - Chance system explained"
                    + "\n4 - Tools explained"
                    + "\n5 - Player strengths and weaknesses"
                    + "\nQ - Quit"
                    + "\n----------------------------------------";
    }
    private PrintWriter console = LostWhileHunting.getOutFile();
    void displayHelpMenuView() {
        
        boolean done = false; // set flag to not done
        do {
            // promt for and get players name
            String helpMenuOption = this.getHelpMenuOption();
            if (helpMenuOption.toUpperCase().equals("Q")) // user wants to quit
                return; // exit the game
            
            // do the requested action and display the next view
            done = this.doAction(helpMenuOption);
        } while (!done);
    }

    private String getHelpMenuOption() {
        BufferedReader keyboard = LostWhileHunting.getInFile();
        String value = "";
        boolean valid = false;
        
        while (!valid) {
            this.console.println("\n" + this.menu);
            
            try {
                value = keyboard.readLine();
            
                value = value.trim();
            
                if (value.length() < 1) {
                    this.console.println("\nInvalid value: value can not be blank");
                    continue;
                }
            
                break;
            }
            catch (IOException ex) {
                ErrorView.display(this.getClass().getName(), "Error reading from keyboard.");
            }
        }
        
        return value;  // return the value entered
    }

    private boolean doAction(String choice) {
       
        choice = choice.toUpperCase(); // convert choice to upper case
        
        switch (choice) {
            case "1": 
                this.goalOfTheGame();
                break;
            case "2":
                this.howToMove();
                break;
            case "3":
                this.chanceSystemExplained();
                break;
            case "4": 
                this.toolsExplained();
                break;
            case "5": 
                this.playerStrengthsAndWeaknesses();
                break;
            default:
                this.console.println("\n*** Invalid selection *** Try again");
                break;
        }
        
        return true;
    }

    private void goalOfTheGame() {
        this.console.println("\n goalOfTheGame() function called");
    }

    private void howToMove() {
        this.console.println("\n howToMove() function called");
    }

    private void chanceSystemExplained() {
        this.console.println("\n chanceSystemExplained() function called");
    }

    private void toolsExplained() {
        this.console.println("\n toolsExplained() function called");
    }

    private void playerStrengthsAndWeaknesses() {
        this.console.println("\n playerStrengthsAndWeaknesses() function called");
    }

    
}
