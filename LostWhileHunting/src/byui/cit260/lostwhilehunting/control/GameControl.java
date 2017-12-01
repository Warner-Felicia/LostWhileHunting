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
import byui.cit260.lostwhilehunting.model.Map;
import byui.cit260.lostwhilehunting.model.Player;
import byui.cit260.lostwhilehunting.view.ErrorView;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import lostwhilehunting.LostWhileHunting;


/**
 *
 * @author Group
 */
public class GameControl implements Serializable{

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
        int extraLifeAmount = LostWhileHunting.getCurrentGame().getItems().get(ItemType.extraLife.ordinal()).getQuantityInStock();
        int meatAmount = LostWhileHunting.getCurrentGame().getItems().get(ItemType.meat.ordinal()).getQuantityInStock();
        
        heal = Player.getInjuryTracker();
        if(Player.getHealthStatus()=="Dead"){
            if(extraLifeAmount > 0){
                heal=0;
                Player.setInjuryTracker(heal);
                life=extraLifeAmount;
                life--;
                LostWhileHunting.getCurrentGame().getItems().get(ItemType.extraLife.ordinal()).setQuantityInStock(life);
            }else{
                LostWhileHunting.getOutFile().println("You have no Extra Life");
            }
        }else if(Player.getHealthStatus() != "Healthy" && Player.getHealthStatus() != "Dead"){
            if(meatAmount > 0){
                heal--;
                Player.setInjuryTracker(heal);
                meat=meatAmount;
                meat--;
                LostWhileHunting.getCurrentGame().getItems().get(ItemType.meat.ordinal()).setQuantityInStock(meat);
            }else{
                LostWhileHunting.getOutFile().println("You have no Meat left");
            }
        }else{
            LostWhileHunting.getOutFile().println("Your neither dead or injured");
        }
    }
    
    public static void checkPlayerStatus(){
        Player.getHealthStatus();
        
    }
    
    public static void checkIfActorIsInjuredDeadOrAlive(int injury) {
               
        switch(injury){
            case 0:
                Player.setHealthStatus("Healthy");
                LostWhileHunting.getOutFile().println("You are: "+Player.getHealthStatus());
                break;
            case 1:
                Player.setHealthStatus("Injured");
                LostWhileHunting.getOutFile().println("You are: "+Player.getHealthStatus());
                break;
            case 2:
                Player.setHealthStatus("Critical");
                LostWhileHunting.getOutFile().println("You are in : "+Player.getHealthStatus()+" condition.");
                break;
            case 3:
                Player.setHealthStatus("Dead");
                LostWhileHunting.getOutFile().println("You are: "+Player.getHealthStatus());
                break;
            default:
                LostWhileHunting.getOutFile().println("You are in an unknown state");    
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
        Player.setHealthStatus("Healthy");
        Player.setInjuryTracker(0);
        
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
        int randomNum = (int) (Math.random()*3);
        LostWhileHunting.getOutFile().println("Minor load: "+ randomNum);
        
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
        
        //brackets around the Math.Random sections
        int randomNum = (int) (Math.random()*3);
        
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
        int randomNum = (int) (Math.random()*3);
        
        if(randomNum == 1){
            actor = Actors.Bear.getName();
        }else if(randomNum == 2){
            actor = Actors.Thieves.getName();
        }else{
            actor = Actors.Wolf.getName();
        }
        
        return actor;
    }
    
    public static void saveGame(Game game, String filePath) 
            throws GameControlException{
            
        try (FileOutputStream fops = new FileOutputStream(filePath)) {
            
            ObjectOutputStream output = new ObjectOutputStream(fops);
            
            output.writeObject(game);
            output.flush();
        }
        catch (Exception e) {
            LostWhileHunting.getOutFile().println("Exception: " + e.toString() +
                                    "\nCause: " + e.getCause() +
                                    "\nMessage " +e.getMessage());
        }
        
       

    }

    public static void getSavedGame(String filePath) 
            throws GameControlException{
        
        Game game = null;
        
        try (FileInputStream fips = new FileInputStream(filePath)) {
            ObjectInputStream input = new ObjectInputStream(fips);
            
            game = (Game) input.readObject();
        }
        catch (Exception e) {
            throw new GameControlException(e.getMessage());
        }
        
        LostWhileHunting.setCurrentGame(game);
    }
    
}
