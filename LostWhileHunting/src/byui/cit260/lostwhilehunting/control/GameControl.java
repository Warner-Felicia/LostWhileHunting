/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.lostwhilehunting.control;

import byui.cit260.lostwhilehunting.exceptions.GameControlException;
import byui.cit260.lostwhilehunting.model.Actors;
import byui.cit260.lostwhilehunting.model.Game;
import byui.cit260.lostwhilehunting.model.InventoryItem;
import byui.cit260.lostwhilehunting.model.ItemType;
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
            if(LostWhileHunting.getCurrentGame().getItems().get(ItemType.extraLife.ordinal()).getQuantityInStock() > 0){
                heal=0;
                Player.setInjuryTracker(heal);
                life=LostWhileHunting.getCurrentGame().getItems().get(ItemType.extraLife.ordinal()).getQuantityInStock();
                life--;
                LostWhileHunting.getCurrentGame().getItems().get(ItemType.extraLife.ordinal()).setQuantityInStock(life);
            }else{
                System.out.println("You have no Extra Life");
            }
        }else if(Player.getHealthStatus() != "Healthy" && Player.getHealthStatus() != "Dead"){
            if(LostWhileHunting.getCurrentGame().getItems().get(ItemType.meat.ordinal()).getQuantityInStock() > 0){
                heal--;
                Player.setInjuryTracker(heal);
                meat=LostWhileHunting.getCurrentGame().getItems().get(ItemType.meat.ordinal()).getQuantityInStock();
                meat--;
                LostWhileHunting.getCurrentGame().getItems().get(ItemType.meat.ordinal()).setQuantityInStock(meat);
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
    
    public static void checkIfActorIsInjuredDeadOrAlive(int injury) {
               
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
    
    public static Player createPlayer(String name) throws GameControlException{
        if (name == null) {
            throw new GameControlException("Player must have a name.");
        }
        
        Player player = new Player();
        player.setName(name);
        
        LostWhileHunting.setPlayer(player); // save the player
        
        return player;
    }

    public static void createNewGame(Player player) throws GameControlException{
        
        if(player == null) 
            throw new GameControlException("Player name not passed to" 
                    + "createNewGame function");
        
        Game game = new Game();
        game.setPlayer(player);
        
        LostWhileHunting.setCurrentGame(game);
        
        ArrayList<InventoryItem> items = InventoryItem.createItem();
        game.setItems(items);
        LostWhileHunting.setCurrentGame(game);
        
        Map map = LocationsControl.createMap(3, 9, items);
        
        if (map == null){
            throw new GameControlException ("Error in creating map object in "
                    + "createNewGame function.");
        }else {
            game.setMap(map);
            LostWhileHunting.setCurrentGame(game);
        }
        
        
    }
    
    public static String minor1(){
        String actor;
        int randomNum = (int) Math.random()*3;
        System.out.println("Minor load: "+ randomNum);
        
        if(randomNum == 1){
            actor = Actors.Coyote.getName();
        }else if(randomNum == 2){
            actor = Actors.SmallWolf.getName();
        }else{
            actor = Actors.Wolf.getName();
        }
        
        return actor;
    } 
    
    public static String minor2(){
        String actor;
        int randomNum = (int) Math.random()*3;
        
        if(randomNum == 1){
            actor = Actors.Bear.getName();
        }else if(randomNum == 2){
            actor = Actors.SmallWolf.getName();
        }else{
            actor = Actors.Wolf.getName();
        }
        
        return actor;
    } 
    
    public static String minor3(){
        String actor;
        int randomNum = (int) Math.random()*3;
        
        if(randomNum == 1){
            actor = Actors.Bear.getName();
        }else if(randomNum == 2){
            actor = Actors.Thieves.getName();
        }else{
            actor = Actors.Wolf.getName();
        }
        
        return actor;
    } 
    
}
