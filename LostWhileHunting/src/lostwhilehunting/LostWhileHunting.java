/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lostwhilehunting;

import byui.cit260.lostwhilehunting.model.Actors;
import byui.cit260.lostwhilehunting.model.Player;
import byui.cit260.lostwhilehunting.model.Map;
import byui.cit260.lostwhilehunting.model.Location;
import byui.cit260.lostwhilehunting.model.Items;
import byui.cit260.lostwhilehunting.model.ResourceSceneAmount;

/**
 *
 * @author All group members
 */
public class LostWhileHunting {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Player playerOne = new Player();
        playerOne.setName("Fred Flintstone");
        playerOne.setNumberOfSurePasses(4);
        
        System.out.println(playerOne.toString());
        
        System.out.println(Actors.Spinster.toString());
        System.out.println(Actors.TopshotYoungster.toString());
        System.out.println(Actors.BurlyMan.toString());
        System.out.println(Actors.Coyote.toString());
        System.out.println(Actors.Wolf.toString());
        System.out.println(Actors.SmallWolf.toString());
        System.out.println(Actors.Bear.toString());
        System.out.println(Actors.Thieves.toString());
        
        Location playerLocation = new Location();
        playerLocation.setColumn(3);
        playerLocation.setRow(3);
        playerLocation.setVisited(true);
        playerLocation.setAttribute("Calm");
        
        System.out.println("");
        System.out.println("Location Class details ------------");
        
        System.out.println("Player COlumn Location: "+playerLocation.getColumn());
        System.out.println("Player Row Location: "+playerLocation.getRow());
        System.out.println("Player Location Visited: "+playerLocation.isVisited());
        System.out.println("Player Location Attribute: "+playerLocation.getAttribute());
        
        System.out.println("");
        System.out.println("Map Class details ------------");
        
        System.out.println(Map.Start.toString());
        System.out.println(Map.Stream.toString());
        System.out.println(Map.Cave.toString());
        System.out.println(Map.Caverns.toString());
        System.out.println(Map.River.toString());
        System.out.println(Map.Town.toString());
        System.out.println(Map.Goal.toString());
        
        Items itemOne = new Items();
        
        itemOne.setType("weapon");
        itemOne.setQuantityInStock(3);
        itemOne.setStatus("equipped");
        
        System.out.println(itemOne.toString());
        
        ResourceSceneAmount resourceSceneAmount = new ResourceSceneAmount();
        
        resourceSceneAmount.setAmount(2);
        
        System.out.println(resourceSceneAmount.toString());
        
        
    }
    
    
    
}
