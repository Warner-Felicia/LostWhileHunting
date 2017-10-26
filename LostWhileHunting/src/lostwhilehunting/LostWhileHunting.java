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
import byui.cit260.lostwhilehunting.control.QuestionsAndSceneControl;
import byui.cit260.lostwhilehunting.control.ItemControl;
import byui.cit260.lostwhilehunting.model.Game;
import byui.cit260.lostwhilehunting.view.StartProgramView;

/**
 *
 * @author All group members
 */
public class LostWhileHunting {

    /**
     * @param args the command line arguments
     */
    private static Game currentGame = null;
    private static Player player = null;
    
    public static void main(String[] args) {
        
        StartProgramView startProgramView = new StartProgramView();
        startProgramView.displayStartProgramView();
        
        
        
              
       /* Player playerOne = new Player();
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
        
              
       System.out.println("");
       System.out.println("Item COntrol and Items Class details ------------"); 
       
       
       Items.setItem1("Rifle");
       Items.setItem2("Bullets");
       Items.setItem3("Map");
       
       System.out.println("item 1 has equipped: "+Items.getItem1());
       System.out.println("item 2 has equipped: "+Items.getItem2());
       System.out.println("item 3 has equipped: "+Items.getItem3());
       
       ItemControl itemcontrol = new ItemControl();
       
       itemcontrol.generateItemFromItems();
       itemcontrol.generateItemFromItems();
       itemcontrol.generateItemFromItems();
       itemcontrol.generateItemFromItems();
       itemcontrol.generateItemFromItems();
       itemcontrol.generateItemFromItems();
       itemcontrol.generateItemFromItems();
       itemcontrol.generateItemFromItems();
       itemcontrol.generateItemFromItems();
       itemcontrol.generateItemFromItems();
       itemcontrol.generateItemFromItems();
       itemcontrol.generateItemFromItems();
       
       System.out.println("item 1 has equipped: "+Items.getItem1());
        System.out.println("");
       System.out.println("items Meat quantity: "+Items.getMeatQuantity());
        System.out.println("");
       System.out.println("items Rifle quantity: "+Items.getRifleQuantity());
       System.out.println("");
       System.out.println("items bullet quantity: "+Items.getBulletsQuantity());
        System.out.println("");
       System.out.println("items Map quantity: "+Items.getMapQuantity());
        System.out.println("");
       System.out.println("items Knife quantity: "+Items.getKnifeQuantity());
        System.out.println("");
       System.out.println("items ExtraLife quantity: "+Items.getExtraLifeQuantity());
        
       System.out.println("");
       System.out.println("Scene Resource Amount ------------");
       
       System.out.println("");
        ResourceSceneAmount resourceSceneAmount = new ResourceSceneAmount();
        
        resourceSceneAmount.setAmount(2);
        
        System.out.println(resourceSceneAmount.toString());
        
        System.out.println("");
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
        
        QuestionsAndSceneControl questionsandscenecontrol = new QuestionsAndSceneControl();
        
        questionsandscenecontrol.loadCombatActions("BurlyMan","Gun","Bullets","Knife");
        questionsandscenecontrol.loadFlightActions("TopShotYoungster","Gun","Bullets","Knife");
        questionsandscenecontrol.loadEvadeActions("Spinster","Gun","Bullets","Knife");*/
    }

    public static Game getCurrentGame() {
        return currentGame;
    }

    public static void setCurrentGame(Game currentGame) {
        LostWhileHunting.currentGame = currentGame;
    }

    public static Player getPlayer() {
        return player;
    }
    
    public static void setPlayer(Player player) {
        LostWhileHunting.player = player;
    }
    
    
    
}
