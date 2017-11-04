/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.lostwhilehunting.view;

import java.util.Scanner;

/**
 *
 * @author New User
 */
public class HelpMenuView {
    
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
    void displayHelpMenuView() {
        
        boolean done = false; // set flag to not done
        do {
            // promt for and get players name
            String helpMenuOption = this.getHelpMenuOption();
            if (helpMenuOption.toUpperCase().equals("Q")) // user wants to quit
                mainmenu.displayMainMenuView(); // exit the game
            
            // do the requested action and display the next view
            done = this.doAction(helpMenuOption);
        } while (!done);
    }

    private String getHelpMenuOption() {
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
                System.out.println("\n*** Invalid selection *** Try again");
                break;
        }
        
        return false;
    }

    private void goalOfTheGame() {
        System.out.println("\n goalOfTheGame() function called");
    }

    private void howToMove() {
        System.out.println("\n howToMove() function called");
    }

    private void chanceSystemExplained() {
        System.out.println("\n chanceSystemExplained() function called");
    }

    private void toolsExplained() {
        System.out.println("\n toolsExplained() function called");
    }

    private void playerStrengthsAndWeaknesses() {
        System.out.println("\n playerStrengthsAndWeaknesses() function called");
    }

    
}
