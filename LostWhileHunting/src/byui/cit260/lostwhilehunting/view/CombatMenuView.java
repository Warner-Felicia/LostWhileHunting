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

/**
 *
 * @author Sony
 */
public class CombatMenuView {
    
    GameMenuView gamemenu = new GameMenuView();
    Game game = new Game();
    QuestionsAndSceneControl questionsandscenecontrol = new QuestionsAndSceneControl();    
    private final String menu;
    
    public CombatMenuView() {
        
        this.menu = "\n"
                    + "\nA Minor Scene is loaded"+ questionsandscenecontrol.checkSceneQuestionChoiceAndReturnNewScene() + ""
                    + "\n---------------------------------------"
                    + "\n What will you do?"
                    + "\n---------------------------------------"
                    + "\n"
                    + "\n 3. Fight"
                    + "\n 4. Flight"
                    + "\n 5. Evade"
                    + "\n Q. Return to Game Menu"
                    + "\n"
                    + "\n---------------------------------------"
                    + "\n Choose Wisely!";              
    }
    
    public void displayCombatMenuView() {
        int value = 0;
             boolean done = false; // set flag to not done
        do {
            // promt for and get players name
            try{
            value = this.getInput();
            }catch(NumberFormatException nf){
                System.out.println("You typed a wrong value!" + "\nPlease type one of the values next to the option you want to choose. ");
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
                System.out.println("\n*** Invalid selection *** Try again");
                break;
        }
        
        return true;
    }

    public int getInput() {
       Scanner keyboard = new Scanner(System.in);
       int value = 0;
        String inputValue;
        boolean valid = false;
        
        while (!valid) {
            System.out.println("\n" + this.menu);
            
            inputValue = keyboard.nextLine();
            
            if (inputValue.length() < 1) {
                System.out.println("Please make a selection");
                continue;
            }
           if (inputValue.toUpperCase().equals("Q"))
                gamemenu.display();
            
            value = Integer.parseInt(inputValue);
              
            break;
        }    
        
        return value;
    }

    private void fight() {
       try {
           questionsandscenecontrol.loadCombatActions(game.getHeroClass(), Items.getItem1(), Items.getItem2(), Items.getItem3());
       } catch (QuestionsAndSceneControlException qa) {
           System.out.println(qa.getMessage());
       }
       gamemenu.display();
    }

    private void flight() {
        try {
            questionsandscenecontrol.loadFlightActions(game.getHeroClass(), Items.getItem1(), Items.getItem2(), Items.getItem3());
        } catch (QuestionsAndSceneControlException qa) {
           System.out.println(qa.getMessage());
       } 
        gamemenu.display();
    }

    private void evade() {
        try {
            questionsandscenecontrol.loadEvadeActions(game.getHeroClass(), Items.getItem1(), Items.getItem2(), Items.getItem3());
        } catch (QuestionsAndSceneControlException qa) {
           System.out.println(qa.getMessage());
       }
        gamemenu.display();
    }

    

    }
    

