/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.lostwhilehunting.view;

import byui.cit260.lostwhilehunting.control.QuestionsAndSceneControl;
import byui.cit260.lostwhilehunting.exceptions.QuestionsAndSceneControlException;
import byui.cit260.lostwhilehunting.model.Items;
import byui.cit260.lostwhilehunting.model.Game;
import java.io.IOException;
import java.io.Serializable;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import lostwhilehunting.LostWhileHunting;

/**
 *
 * @author Trevon Morris
 */
public class EndGameView extends View implements Serializable{
    
    GameMenuView gamemenu = new GameMenuView();
    Game game = new Game();
    QuestionsAndSceneControl questionsandscenecontrol = new QuestionsAndSceneControl();    
    private final String menu;
    
    public EndGameView() {
        
       this.menu = "\n"
                    + "\n*->  Your trials in the wild is over   <-*"
                    + "\n******************************************"
                    + "\n*  Congratulations on a successful win!  *"
                    + "\n******************************************"
                    + "\n*  Rejoin the Oregon Trail in confidence *"
                    + "\n*Thank you for playing Lost While Hunting*"
                    + "\n******************************************"
                    + "\nR. Return to Main Menu"
                    + "\nQ. Exit the Game"
                    + "\n---------------------------------------";              
    }
    
    public void displayEndGameView() {
             boolean done = false; // set flag to not done
        do {
            // promt for and get players name
            String CombatMenuOption = this.getInput();
            if (CombatMenuOption.toUpperCase().equals("Q")) // user wants to quit
                System.exit(0); // exit the game
            
            // do the requested action and display the next view
            done = this.doAction(CombatMenuOption);
        } while (!done);
    }
@Override
    public boolean doAction(String choice) {
        choice = choice.toUpperCase(); // Convert choice to uppercase
        
         switch (choice) {
            case "R": 
                this.yes();
                break;
            default:
                this.console.println("\n*** Invalid selection *** Try again");
                break;
        }
        
        return true;
    }
@Override
    public String getInput() {
       
        String value = "";
        boolean valid = false;
        
        while (!valid) {
            this.console.println("\n" + this.menu);
            
            try {
                value = this.keyboard.readLine();
                value = value.trim();
            } catch (IOException ex) {
                ErrorView.display(this.getClass().getName(), "Error reading "
                        + "from keyboard.");
            }
            
            if (value.length() < 1) {
                this.console.println("Please make a selection");
                continue;
            }
            
            break;
        }    
        
        return value;
    }

    private void yes() {
       
        MainMenuView leave = new MainMenuView();
        leave.display();
    }

    

    }
    

