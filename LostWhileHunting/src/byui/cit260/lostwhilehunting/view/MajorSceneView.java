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
 * @author Sony
 */
public class MajorSceneView extends View{
    
    GameMenuView gamemenu = new GameMenuView();
    Game game = new Game();
    QuestionsAndSceneControl questionsandscenecontrol = new QuestionsAndSceneControl();    
    private final String menu;
    
    public MajorSceneView() {
        
       this.menu = "\n"
                    + "\nA Major Scene is loaded"+ questionsandscenecontrol.checkSceneQuestionChoiceAndReturnNewScene() + ""
                    + "\n---------------------------------------"
                    + "\n Will you trust the Scenario suggested"
                    + "\n---------------------------------------"
                    + "\n"
                    + "\n Y. Yes"
                    + "\n N. No"
                    + "\n Q. Return to Game Menu"
                    + "\n"
                    + "\n---------------------------------------"
                    + "\n Choose Wisely!";              
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
       try {questionsandscenecontrol.majorSceneYes(game.getHeroClass(), Items.getItem1(), Items.getItem2(), Items.getItem3());}
       catch (QuestionsAndSceneControlException qa) {
           System.out.println(qa.getMessage());
       }
        gamemenu.display();
    }
    
    private void no() {
       try {questionsandscenecontrol.majorSceneNo(game.getHeroClass(), Items.getItem1(), Items.getItem2(), Items.getItem3());}
       catch (QuestionsAndSceneControlException qa) {
           System.out.println(qa.getMessage());
       }
        gamemenu.display();
    }

    

    }
    
