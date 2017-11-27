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
import java.util.Scanner;
import lostwhilehunting.LostWhileHunting;

/**
 *
 * @author Trevon Morris
 */
public class EndGameView extends View{
    
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
                System.out.println("\n*** Invalid selection *** Try again");
                break;
        }
        
        return true;
    }
@Override
    public String getInput() {
       Scanner keyboard = new Scanner(System.in);
        String value = "";
        boolean valid = false;
        
        while (!valid) {
            System.out.println("\n" + this.menu);
            
            value = keyboard.nextLine();
            value = value.trim();
            
            if (value.length() < 1) {
                System.out.println("Please make a selection");
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
    

