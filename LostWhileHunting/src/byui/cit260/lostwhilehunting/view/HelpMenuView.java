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
public class HelpMenuView extends View implements Serializable{
    
    MainMenuView mainmenu = new MainMenuView();
    private String menu;
    public HelpMenuView() {
        super("\n"
                + "\n----------------------------------------"
                + "\n| Help Menu                            |"
                + "\n----------------------------------------"
                + "\nG - What is the goal of the game?"
                + "\nM - How to move"
                + "\nC - Chance system explained"
                + "\nI - Items explained"
                + "\nP - Player strengths and weaknesses"
                + "\nQ - Return go Main Menu"
                + "\n----------------------------------------");
    }
    
    @Override
    public boolean doAction(String choice) {
       
        choice = choice.toUpperCase(); // convert choice to upper case
        
        switch (choice) {
            case "G": 
                this.goalOfTheGame();
                break;
            case "M":
                this.howToMove();
                break;
            case "C":
                this.chanceSystemExplained();
                break;
            case "I": 
                this.itemsExplained();
                break;
            case "P": 
                this.playerStrengthsAndWeaknesses();
                break;
            default:
                this.console.println("\n*** Invalid selection *** Try again");
                break;
        }
        
        return false;
    }

    private void goalOfTheGame() {
        this.console.println("\n----------------------------------------" 
                           + "\nThe goal of the game is to pass by all "
                           + "\nthe obstacles you face and to reunite "
                           + "\nwith your group.");
    }

    private void howToMove() {
        this.console.println("\n----------------------------------------"
                           + "\nTo move, you must select M from the Game"
                           + "\nMenu.  You will then be moved to the next"
                           + "\nlocation.  You move along a pre-determined"
                           + "\npath, so you do not get to choose which "
                           + "\ndirection to move.");
        
    }

    private void chanceSystemExplained() {
        this.console.println("\n----------------------------------------"
                           + "\nThere is an element of chance with each "
                           + "\nobstacle you encounter. However, there "
                           + "\nare things that you can do to increase "
                           + "\nyour chances of success. Having items "
                           + "\nequipped will help you. Also each "
                           + "\ncharacter has a talent for either fight, "
                           + "\nflight or evade which will also increase "
                           + "\nthe chance of success.");
    }

    private void itemsExplained() {
        this.console.println("\n----------------------------------------"
                           + "\nThere are several times that you can "
                           + "\nfind during the game.  They are rifle, "
                           + "\nbullets, meat, map, knife, and extra "
                           + "\nlife. All of them will increase your "
                           + "\nchance of succeeding against an "
                           + "\nobstacle. However, meat can also heal "
                           + "\nyou when you become injured and an "
                           + "\nextra life can restore full health when "
                           + "\nyou die.");
    }

    private void playerStrengthsAndWeaknesses() {
        this.console.println("\n----------------------------------------"
                           + "\nEach player has a specific strength to "
                           + "\neither fight an obstacle, flee the "
                           + "\nobstacle, or evade the obstacle. "
                           + "\nExperiment with the different actions "
                           + "\nand see if you can find which strength "
                           + "\nyour character has.");
    }

    
}
