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
import java.io.BufferedReader;
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
public class CombatMenuView implements Serializable{
    
    GameMenuView gamemenu = new GameMenuView();
    Game game = LostWhileHunting.getCurrentGame();
    QuestionsAndSceneControl questionsandscenecontrol = new QuestionsAndSceneControl();    
    private final String menu;
    private PrintWriter console = LostWhileHunting.getOutFile();
    
    public CombatMenuView() {
        
        this.menu = "\n"
                    + "\nA Minor Scene is loaded"+ questionsandscenecontrol.checkSceneQuestionChoiceAndReturnNewScene() + ""
                    + questionsandscenecontrol.checkSceneQuestionChoiceAndReturnQuestion();
    }
    
    public void displayCombatMenuView() {
        int value = 0;
             boolean done = false; // set flag to not done
        do {
            // promt for and get players name
            try{
            value = this.getInput();
            }catch(NumberFormatException nf){
                this.console.println("You typed a wrong value!" + "\nPlease type one of the values next to the option you want to choose. ");
            }
            // do the requested action and display the next view
            done = this.doAction(value);
        } while (!done);
    }
    public boolean doAction(int choice) {
        
        
        switch (choice) {
            case 3: 
                this.fight();
                break;
            case 4:
                this.flight();
                break;
            case 5:
                this.evade();
                break;
            default:
                this.console.println("\n*** Invalid selection *** Try again");
                break;
        }
        
        return true;
    }

    public int getInput() {
       BufferedReader keyboard = LostWhileHunting.getInFile();
       int value = 0;
        String inputValue;
        boolean valid = false;
        
        while (!valid) {
            this.console.println("\n" + this.menu);
            
           try {
               inputValue = keyboard.readLine();
               
               if (inputValue.length() < 1) {
                this.console.println("Please make a selection");
                continue;
                }
                if (inputValue.toUpperCase().equals("Q"))
                gamemenu.display();
            
                value = Integer.parseInt(inputValue);
              
                break;
           } catch (IOException ex) {
               ErrorView.display(this.getClass().getName(), "Error reading from keyboard.");
           }
        }    
        
        return value;
    }

    private void fight() {
       try {
           questionsandscenecontrol.loadCombatActions(game.getHeroClass(), Items.getItem1(), Items.getItem2(), Items.getItem3());
       } catch (QuestionsAndSceneControlException qa) {
           ErrorView.display(this.getClass().getName(), qa.getMessage());
       }
       gamemenu.display();
    }

    private void flight() {
        try {
            questionsandscenecontrol.loadFlightActions(game.getHeroClass(), Items.getItem1(), Items.getItem2(), Items.getItem3());
        } catch (QuestionsAndSceneControlException qa) {
           ErrorView.display(this.getClass().getName(), qa.getMessage());
       } 
        gamemenu.display();
    }

    private void evade() {
        try {
            questionsandscenecontrol.loadEvadeActions(game.getHeroClass(), Items.getItem1(), Items.getItem2(), Items.getItem3());
        } catch (QuestionsAndSceneControlException qa) {
           ErrorView.display(this.getClass().getName(), qa.getMessage());
       }
        gamemenu.display();
    }

    

    }
    

