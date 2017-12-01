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
import java.io.PrintWriter;
import java.io.Serializable;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import lostwhilehunting.LostWhileHunting;

/**
 *
 * @author Sony
 */
public class MajorSceneView extends View implements Serializable{
    
    GameMenuView gamemenu = new GameMenuView();
    Game game = LostWhileHunting.getCurrentGame();
    QuestionsAndSceneControl questionsandscenecontrol = new QuestionsAndSceneControl();    
    private final String menu;
    private PrintWriter console = LostWhileHunting.getOutFile();
    
    public MajorSceneView() {
        
       this.menu = "\n"
                    + "\nA Major Scene is loaded"+ questionsandscenecontrol.checkSceneQuestionChoiceAndReturnNewScene() + ""
                    + questionsandscenecontrol.checkSceneQuestionChoiceAndReturnQuestion();              
    }
    
    public void displayMajorSceneView() {
             boolean done = false; // set flag to not done
        do {
            // promt for and get players name
            String CombatMenuOption = this.getInput();
            if (CombatMenuOption.toUpperCase().equals("Q")) // user wants to quit
                gamemenu.display(); // exit the game
            
            // do the requested action and display the next view
            done = this.doAction(CombatMenuOption);
        } while (!done);
    }
@Override
    public boolean doAction(String choice) {
        choice = choice.toUpperCase(); // Convert choice to uppercase
        
         switch (choice) {
            case "Y": 
                this.yes();
                break;
            case "N":
                this.no();
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
                this.console.println("Error reading from keyboard.");
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
       try {questionsandscenecontrol.majorSceneYes(game.getHeroClass(), Items.getItem1(), Items.getItem2(), Items.getItem3());}
       catch (QuestionsAndSceneControlException qa) {
           ErrorView.display(this.getClass().getName(), qa.getMessage());
       }
        gamemenu.display();
    }
    
    private void no() {
       try {questionsandscenecontrol.majorSceneNo(game.getHeroClass(), Items.getItem1(), Items.getItem2(), Items.getItem3());}
       catch (QuestionsAndSceneControlException qa) {
           ErrorView.display(this.getClass().getName(), qa.getMessage());
       }
        gamemenu.display();
    }

    

    }
    

