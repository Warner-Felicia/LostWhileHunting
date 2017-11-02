/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.lostwhilehunting.view;

import byui.cit260.lostwhilehunting.control.GameControl;
import byui.cit260.lostwhilehunting.control.QuestionsAndSceneControl;
import byui.cit260.lostwhilehunting.model.Items;
import byui.cit260.lostwhilehunting.model.Game;
import java.util.Scanner;

/**
 *
 * @author Sony
 */
public class CombatMenuView {
    
    Game game = new Game();
    QuestionsAndSceneControl questionsandscenecontrol = new QuestionsAndSceneControl();    
    private final String menu;
    
    public CombatMenuView() {
        
        this.menu = "\n"
                    + "\n---------------------------------------"
                    + "\n What will you do?"
                    + "\n---------------------------------------"
                    + "\n"
                    + "\n A. Fight"
                    + "\n B. Flight"
                    + "\n C. Evade"
                    + "\n Q. Return to Game Menu"
                    + "\n"
                    + "\n---------------------------------------"
                    + "\n Choose Wisely!";              
    }
    
    public void displayCombatMenuView() {
             boolean done = false; // set flag to not done
        do {
            // promt for and get players name
            String CombatMenuOption = this.getCombatMenuOption();
            if (CombatMenuOption.toUpperCase().equals("Q")) // user wants to quit
                return; // exit the game
            
            // do the requested action and display the next view
            done = this.doAction(CombatMenuOption);
        } while (!done);
    }

    private boolean doAction(String choice) {
        choice = choice.toUpperCase(); // Convert choice to uppercase
        
         switch (choice) {
            case "A": 
                this.fight();
                break;
            case "B":
                this.flight();
                break;
            case "C":
                this.evade();
                break;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;
        }
        
        return false;
    }

    private String getCombatMenuOption() {
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

    private void fight() {
       questionsandscenecontrol.loadCombatActions(game.getHeroClass(), Items.getItem1(), Items.getItem2(), Items.getItem3());
    }

    private void flight() {
        questionsandscenecontrol.loadFlightActions(game.getHeroClass(), Items.getItem1(), Items.getItem2(), Items.getItem3());
    }

    private void evade() {
        questionsandscenecontrol.loadEvadeActions(game.getHeroClass(), Items.getItem1(), Items.getItem2(), Items.getItem3());
    }

    

    }
    

