/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.lostwhilehunting.control;

import byui.cit260.lostwhilehunting.model.Player;
import static javafx.application.Platform.exit;
import lostwhilehunting.LostWhileHunting;

/**
 *
 * @author Group
 */
public class GameControl {
    
    
    
    public static void checkContinueAndLoadMainMenu(){
        
    }
    
    public static void loadMainMenu(){
        
    }
    
    public static void startGame(){
        
    }
    
    public static void exitGame(){
        
        exit();
        
    }
    
    public static void saveGameToFile(){
        
    }
    
    public static void selectHeroAction(){
        
    }
    
    public static void storePlayerName(){
        
    }
    
    public static void checkPlayerStatus(){
        System.out.println("\n *** checkPlayerStatus() function called");
    }
    
    public static void endGameWithCredits(){
        
    }
    
    public static void tiePlayerNameToHero(){
        
        
    }
    
    public static void checkIfActorIsInjuredDeadOrAlive(){
        
    }

    public static Player createPlayer(String name) {
        if (name == null) {
            return null;
        }
        
        Player player = new Player();
        player.setName(name);
        
        LostWhileHunting.setPlayer(player); // save the player
        
        return player;
    }

    public static void createNewGame(Player player) {
        System.out.println("\n*** createNewGame function called ***");
    }
    
}
