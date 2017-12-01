/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.lostwhilehunting.view;

import byui.cit260.lostwhilehunting.model.Game;
import java.io.Serializable;
import java.util.Scanner;
import lostwhilehunting.LostWhileHunting;


/**
 *
 * @author New User
 */
public class SelectACharacterView extends View implements Serializable{
    
    Game game = LostWhileHunting.getCurrentGame();
        
    public SelectACharacterView() {
        super("\n"
                + "\n----------------------------------------"
                + "\n| Please Select a Character            |"
                + "\n----------------------------------------"
                + "\nB - Burly Man"
                + "\n     Butch"
                + "\n     A super strong farmer, known to have won many fights"
                + "\nT - Topshot Youngster"
                + "\n     Timmy"
                + "\n     A young teen taught by his father how to shoot from a distance"
                + "\nS - Spinster"
                + "\n     Sue"
                + "\n     A sweet lady very good at hunting with traps"
                + "\nQ - Return to previous menu"
                + "\n----------------------------------------");
    }

    @Override
    public boolean doAction(String choice) {
        
        choice = choice.toUpperCase();
        String hero;
        String heroName;
        String heroType;

        switch (choice) {
            case "B":
                hero = "BurlyMan";
                heroName = "Butch";
                heroType = "Burly Man"; //used in welcome message 
                break;
            case "T":
                hero = "TopShotYoungster";
                heroName = "Timmy";
                heroType = "Topshot Youngster"; //used in welcome message
                break;
            case "S":
                hero = "Spinster";
                heroName = "Sue";
                heroType = "Spinster"; //used in welcome message
                break;
            default:
                this.console.println("You must choose a character from the list.");
                return false;
        }
        
        game = LostWhileHunting.getCurrentGame();
        game.setHeroClass(hero);
        LostWhileHunting.setCurrentGame(game);
        
        // Display welcome message and GameMenu view
        this.console.println("\n ======================================"
                          + "\n You have chosen to be the " + heroType + "."
                          + "\n Your name in the game will be " + heroName + "."
                          + "\n"
                          + "\n " + heroName + ","
                          + "\n You have been given certain strengths."
                          + "\n Good luck discovering them."
                          + "\n ======================================");
        GameMenuView gameMenuView = new GameMenuView();
        gameMenuView.display();
        return true;
        
        }
}

