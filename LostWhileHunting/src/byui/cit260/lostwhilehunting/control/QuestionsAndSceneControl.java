/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.lostwhilehunting.control;

/**
 *
 * @author Group
 */
import byui.cit260.lostwhilehunting.control.ItemControl;
import byui.cit260.lostwhilehunting.model.Items;
import byui.cit260.lostwhilehunting.model.RegularSceneType;
import byui.cit260.lostwhilehunting.model.SceneType;

public class QuestionsAndSceneControl {
    
    ItemControl itemcontrol = new ItemControl();
    Items items = new Items();
    
    public double loadCombatActions(String hero, String item1, String item2, String item3){
        
        //Variables
        int itemsEquipped = 0;
        int locationIncrement = 0;
        int regularSceneTypeAmount = 0;
        double randomizerNum = 0;
        double successFailureBoundary = 50;
        double classBonus = 0;
        double returnNumber = 0;
        
        
        // loop to count items
        if(item1 != ""){
            itemsEquipped = itemsEquipped + 1;
        }
        if(item2 != ""){
            itemsEquipped = itemsEquipped + 1;
        }
        if(item3 != ""){
            itemsEquipped = itemsEquipped + 1;
        }
        
        randomizerNum = Math.floor(Math.random()*100);
        
        //IF (hero = “BurlyMan”) THEN
        if(hero.equals("BurlyMan")){
            //classBonus = classBonus + 10
            classBonus=classBonus+10;
            //successFailureBoundary = successFailureBoundary + (itemsEquipped * 10) +  classsBonus
            successFailureBoundary = successFailureBoundary + (itemsEquipped * 10) + classBonus;   
            
                //IF (randomizerNumber <= successFailureBoundary)
                if(randomizerNum <= successFailureBoundary){
                    //moveToNextLocation();
                    System.out.println();
                    //Display “You lost” + item1
                    System.out.println("You lost "+item1);
                    //item1 = generateItemFromItems(): String
                    item1 = itemcontrol.generateItemFromItems();
                    //Set item1
                    items.setItem1(item1);
                    System.out.println();
                    //Display: hero + " Success  with a Random number of "+randomizerNum+ " Number of items: "+ itemsEquipped + " SuccessFailureBoundary of: " + successFailureBoundary)
                    System.out.println(hero + " Success  with a Random number of "+randomizerNum+ " Number of items: "+ itemsEquipped + " SuccessFailureBoundary of: " + successFailureBoundary);
                    //Display Item1 status
                    System.out.println("Item1 status: "+ item1 );
                    returnNumber = 1;
                }else{
                    // do nothing
                    GameControl.assignInjuryOnFail();
                    System.out.println();
                    System.out.println("You lost "+item1);
                    item1 = "";
                    items.setItem1(item1);
                    System.out.println(hero + " Failure  with a Random number of "+randomizerNum+ " Number of items: "+ itemsEquipped + " SuccessFailureBoundary of: " + successFailureBoundary);
                    System.out.println("Item1 status: "+ item1 );
                    returnNumber = 0;
                }
                        
        }else if(hero.equals("")){
            System.out.println();
            System.out.println("No hero detected ");
            returnNumber = 99999;
        }else{
                
            successFailureBoundary = successFailureBoundary + (itemsEquipped * 10);   
            
        
                if(randomizerNum <= successFailureBoundary){
                    //moveToNextLocation();
                    System.out.println();
                    System.out.println("You lost "+item1);
                    item1 = itemcontrol.generateItemFromItems();
                    items.setItem1(item1);
                    System.out.println();
                    System.out.println();
                    System.out.println(hero + " Success  with a Random number of "+randomizerNum+ " Number of items: "+ itemsEquipped + " SuccessFailureBoundary of: " + successFailureBoundary);
                    System.out.println("Item1 status :"+ item1 );
                    returnNumber = 1;
                }else{
                    // do nothing
                    GameControl.assignInjuryOnFail();
                    System.out.println();
                    System.out.println("You lost "+item1);
                    item1 = "";
                    items.setItem1(item1);
                    System.out.println();
                    System.out.println();
                    System.out.println(hero + " Failure  with a Random number of "+randomizerNum+ " Number of items: "+ itemsEquipped + " SuccessFailureBoundary of: " + successFailureBoundary);
                    System.out.println("Item1 status: "+ item1 );
                    returnNumber = 0;
                }
                
        
        }
        return returnNumber;
        
       
        
                 
    }
    
    public double loadFlightActions(String hero, String item1, String item2, String item3){
        
        //Variables
        int itemsEquipped = 0;
        int locationIncrement = 0;
        int regularSceneTypeAmount = 0;
        double randomizerNum = 0;
        double successFailureBoundary = 50;
        double classBonus = 0;
        double returnNumber = 0;
        
        if(item1 != ""){
            itemsEquipped = itemsEquipped + 1;
        }
        if(item2 != ""){
            itemsEquipped = itemsEquipped + 1;
        }
        if(item3 != ""){
            itemsEquipped = itemsEquipped + 1;
        }
        
        randomizerNum = Math.floor(Math.random()*100);
        
        if(hero.equals("YoungTopshot")){
            classBonus=classBonus+10;
        }
        
        else if(hero.equals("")){
            System.out.println();
            System.out.println("No hero detected ");
            returnNumber = 99999;
            return returnNumber;
        }
        successFailureBoundary = successFailureBoundary + (itemsEquipped * 10) + classBonus;   
            
        if(randomizerNum <= successFailureBoundary){
             //moveToNextLocation();
            System.out.println();
            System.out.println("You lost "+item1);
            System.out.println();
            System.out.println(hero + " Success  with a Random number of "+randomizerNum+ " Number of items: "+ itemsEquipped + " SuccessFailureBoundary of: " + successFailureBoundary);
            item1 = itemcontrol.generateItemFromItems();
            items.setItem1(item1);
            System.out.println("Item1 status: "+ item1 );
            returnNumber = 1;
        }
        else{
            // do nothing
            GameControl.assignInjuryOnFail();
            System.out.println();
            System.out.println("You lost "+item1);
            System.out.println();
            item1 = "";
            items.setItem1(item1);
            System.out.println(hero + " Failure  with a Random number of "+randomizerNum+ " Number of items: "+ itemsEquipped + " SuccessFailureBoundary of: " + successFailureBoundary);
            System.out.println("Item1 status: none");
            returnNumber = 0;
        }
        
        return returnNumber;                        
    }
    
    public double loadEvadeActions(String hero, String item1, String item2, String item3){
        
        //Variables
        int itemsEquipped = 0;
        int locationIncrement = 0;
        int regularSceneTypeAmount = 0;
        double randomizerNum = 0;
        double successFailureBoundary = 50;
        double classBonus = 0;
        double returnNumber = 0;
        
        if(item1 != ""){
            itemsEquipped = itemsEquipped + 1;
        }
        if(item2 != ""){
            itemsEquipped = itemsEquipped + 1;
        }
        if(item3 != ""){
            itemsEquipped = itemsEquipped + 1;
        }
        
        randomizerNum = Math.floor(Math.random()*100);
        
        if(hero.equals("Spinster")){
            classBonus=classBonus+10;
        }
        
        else if(hero.equals("")){
            System.out.println();
            System.out.println("No hero detected ");
            returnNumber = 99999;
            return returnNumber;
        }
        successFailureBoundary = successFailureBoundary + (itemsEquipped * 10) + classBonus;   
            
        if(randomizerNum <= successFailureBoundary){
             //moveToNextLocation();
            System.out.println();
            System.out.println("You lost "+item1);
            System.out.println();
            System.out.println(hero + " Success  with a Random number of "+randomizerNum+ " Number of items: "+ itemsEquipped + " SuccessFailureBoundary of: " + successFailureBoundary);
            item1 = itemcontrol.generateItemFromItems();
            items.setItem1(item1);
            System.out.println("Item1 status: "+ item1 );
            returnNumber = 1;
        }
        else{
            // do nothing
            GameControl.assignInjuryOnFail();
            System.out.println();
            System.out.println("You lost "+item1);
            item1 = "";
            items.setItem1(item1);
            System.out.println(hero + " Failure  with a Random number of "+randomizerNum+ " Number of items: "+ itemsEquipped + " SuccessFailureBoundary of: " + successFailureBoundary);
            System.out.println("Item1 status: none");
            returnNumber = 0;
        }
        
        return returnNumber;                        
    }
    
    public static RegularSceneType[] createScenes() {
        RegularSceneType[] scenesContainer = new RegularSceneType[10];
        
        RegularSceneType startingArea = new RegularSceneType();
        startingArea.setNameOfScene("Starting Area");
        startingArea.setDescription("This is where the player will start.");
        startingArea.setSafe(true);
        scenesContainer[SceneType.startingArea.ordinal()] = startingArea;
        
        RegularSceneType coolStream = new RegularSceneType();
        coolStream.setNameOfScene("Cool Stream");
        coolStream.setDescription("The player can be refreshed here.");
        coolStream.setSafe(true);
        scenesContainer[SceneType.coolStream.ordinal()] = coolStream;
        
        RegularSceneType cave = new RegularSceneType();
        cave.setNameOfScene("Cave");
        cave.setDescription("Player can rest in this location");
        cave.setSafe(true);
        scenesContainer[SceneType.cave.ordinal()] = cave;
        
        RegularSceneType deepCavern = new RegularSceneType();
        deepCavern.setNameOfScene("Deep Caverns");
        deepCavern.setDescription("The player has to be careful in this location.");
        deepCavern.setSafe(false);
        scenesContainer[SceneType.deepCaverns.ordinal()] = deepCavern;
        
        RegularSceneType greatRiver = new RegularSceneType();
        greatRiver.setNameOfScene("Great River");
        greatRiver.setDescription("Danger.  Player must beware.");
        greatRiver.setSafe(false);
        scenesContainer[SceneType.greatRiver.ordinal()] = greatRiver;
        
        RegularSceneType smallTown = new RegularSceneType();
        smallTown.setNameOfScene("Small Town");
        smallTown.setDescription("The player can trade items they have for other items.");
        smallTown.setSafe(true);
        scenesContainer[SceneType.smallTown.ordinal()] = smallTown;
        
        RegularSceneType goal = new RegularSceneType();
        goal.setNameOfScene("Goal");
        goal.setDescription("player is successful, the game is complete.");
        goal.setSafe(false);
        scenesContainer[SceneType.goal.ordinal()] = goal;
        
        RegularSceneType minor1 = new RegularSceneType();
        minor1.setNameOfScene("Minor 1");
        minor1.setDescription("The player can encounter Coyote or Wolf.");
        minor1.setSafe(false);
        scenesContainer[SceneType.minor1.ordinal()] = minor1;
        
        RegularSceneType minor2 = new RegularSceneType();
        minor2.setNameOfScene("Minor 2");
        minor2.setDescription("The player can encounter wolf or beer.");
        minor2.setSafe(false);
        scenesContainer[SceneType.minor2.ordinal()] = minor2;
        
        RegularSceneType minor3 = new RegularSceneType();
        minor3.setNameOfScene("Minor 3");
        minor3.setDescription("The player may encounter beer or muggers.");
        minor3.setSafe(false);
        scenesContainer[SceneType.minor3.ordinal()] = minor3;
        
        return scenesContainer;
         
    }
        
    

    public void checkSceneQuestionChoiceAndReturnNewScene() {
        
        
        
    }
    
}
