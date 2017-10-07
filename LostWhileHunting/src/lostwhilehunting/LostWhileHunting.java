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
import byui.cit260.lostwhilehunting.model.Questions;
import byui.cit260.lostwhilehunting.model.RegularSceneType;
import byui.cit260.lostwhilehunting.model.ResourceSceneAmount;
import byui.cit260.lostwhilehunting.model.SceneQuestions;

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
        
        System.out.println(Items.Rifle.toString());
        System.out.println(Items.Bullets.toString());
        System.out.println(Items.SharpKnife.toString());
        System.out.println(Items.MeatFromAnimals.toString());
        System.out.println(Items.AnOldMap.toString());
        System.out.println(Items.ExtraLife.toString());
        
        ResourceSceneAmount resourceSceneAmount = new ResourceSceneAmount();
        
        resourceSceneAmount.setAmount(2);
        
        System.out.println(resourceSceneAmount.toString());
        
        // The test for classes Questions, SceneQuestions, RegularSceneType
        Questions questionPlayer = new Questions();
        
        questionPlayer.setQuestion("Do you want to rest or continue?");
        questionPlayer.setAnswer("Rest");
        System.out.println(questionPlayer.toString());
        
        
        SceneQuestions scenePlayerOne = new SceneQuestions();
        
        scenePlayerOne.setFightAnswer("Yes");
        scenePlayerOne.setFlightAnswer("No");
        scenePlayerOne.setEvadeAnswer("Yes");
        scenePlayerOne.setItemReward(23.50);
        scenePlayerOne.setStatusUpdate("Health: good");
        System.out.println(scenePlayerOne.toString());
        
        
        RegularSceneType regularScenePOne = new RegularSceneType();
        
        regularScenePOne.setNameOfScene("Desert");
        regularScenePOne.setDescription("Here is the description");
        regularScenePOne.setSafe("Not Safe");
        System.out.println(regularScenePOne.toString());
        
        
        
    }
    
    
    
}
