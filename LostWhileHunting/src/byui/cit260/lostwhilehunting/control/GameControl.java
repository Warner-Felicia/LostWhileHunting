/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.lostwhilehunting.control;

import byui.cit260.lostwhilehunting.model.Game;
import byui.cit260.lostwhilehunting.model.InventoryItem;
import byui.cit260.lostwhilehunting.model.Items;
import byui.cit260.lostwhilehunting.model.Map;
import byui.cit260.lostwhilehunting.model.Player;
import java.util.ArrayList;
import static javafx.application.Platform.exit;
import lostwhilehunting.LostWhileHunting;

/**
 *
 * @author Group
 */
public class GameControl {
    
    Player p = new Player();
    
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
    
    public static void assignInjuryOnFail(){
       int injure = 0;
       injure = Player.getInjuryTracker();
       
       injure++;
       Player.setInjuryTracker(injure);
       GameControl.checkIfActorIsInjuredDeadOrAlive(injure);
        
    }
    
    public static void healPlayerwithMeatOrLife(){
        int heal;
        int life;
        int meat;
        
        heal = Player.getInjuryTracker();
        if(Player.getHealthStatus()=="Dead"){
            if(Items.getExtraLifeQuantity() > 0){
                heal=0;
                Player.setInjuryTracker(heal);
                life=Items.getExtraLifeQuantity();
                life--;
                Items.setExtraLifeQuantity(life);
            }else{
                System.out.println("You have no Extra Life");
            }
        }else if(Player.getHealthStatus() != "Healthy" && Player.getHealthStatus() != "Dead"){
            if(Items.getMeatQuantity() > 0){
                heal--;
                Player.setInjuryTracker(heal);
                meat=Items.getMeatQuantity();
                meat--;
                Items.setMeatQuantity(meat);
            }else{
                System.out.println("You have no Meat left");
            }
        }else{
            System.out.println("Your neither dead or injured");
        }
    }
    
    public static void checkPlayerStatus(){
        Player.getHealthStatus();
        
    }
    
    public static void endGameWithCredits(){
        
    }
    
    public static void tiePlayerNameToHero(){
        
        
    }
    
    public static void checkIfActorIsInjuredDeadOrAlive(int injury){
        
        switch(injury){
            case 0:
                Player.setHealthStatus("Healthy");
                System.out.println("You are: "+Player.getHealthStatus());
                break;
            case 1:
                Player.setHealthStatus("Injured");
                System.out.println("You are: "+Player.getHealthStatus());
                break;
            case 2:
                Player.setHealthStatus("Critical");
                System.out.println("You are: "+Player.getHealthStatus());
                break;
            case 3:
                Player.setHealthStatus("Dead");
                System.out.println("You are: "+Player.getHealthStatus());
                break;
            default:
                System.out.println("You are in an unknown state");    
                break;
        }
    }

    // Felicia fix
    
    public static Player createPlayer(String name) {
        if (name == null) {
            return null;
        }
        
        Player player = new Player();
        player.setName(name);
        
        LostWhileHunting.setPlayer(player); // save the player
        
        return player;
    }

    public static int createNewGame(Player player) {
        
        if(player == null) 
            return -1;
        
        Game game = new Game();
        game.setPlayer(player);
        
        LostWhileHunting.setCurrentGame(game);
        
        ArrayList<InventoryItem> items = InventoryItem.createItem();
        game.setItems(items);
        LostWhileHunting.setCurrentGame(game);
        
        Map map = LocationsControl.createMap(0, 0);
        
        if (map == null){
            return -1;
        }else {
            game.setMap(map);
            LostWhileHunting.setCurrentGame(game);
            return 1;
        }
        
        
    }
    
}
