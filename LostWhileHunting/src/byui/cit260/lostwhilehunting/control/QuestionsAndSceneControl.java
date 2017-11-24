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
import byui.cit260.lostwhilehunting.exceptions.QuestionsAndSceneControlException;
import byui.cit260.lostwhilehunting.model.Actors;
import byui.cit260.lostwhilehunting.model.Items;
import byui.cit260.lostwhilehunting.model.Location;
import byui.cit260.lostwhilehunting.model.Player;
import byui.cit260.lostwhilehunting.model.QuestionType;
import byui.cit260.lostwhilehunting.model.Questions;
import byui.cit260.lostwhilehunting.model.RegularSceneType;
import byui.cit260.lostwhilehunting.model.SceneQuestions;
import byui.cit260.lostwhilehunting.model.SceneType;
import lostwhilehunting.LostWhileHunting;

public class QuestionsAndSceneControl {
    
    ItemControl itemcontrol = new ItemControl();
    Items items = new Items();
    
    public double loadCombatActions(String hero, String item1, String item2, String item3) throws QuestionsAndSceneControlException{
        
     
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
            throw new QuestionsAndSceneControlException("No hero selected.");
            
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
    
    public double loadFlightActions(String hero, String item1, String item2, String item3)
        throws QuestionsAndSceneControlException{
        
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
            throw new QuestionsAndSceneControlException("No hero selected.");
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
    
    public double loadEvadeActions(String hero, String item1, String item2, String item3)
        throws QuestionsAndSceneControlException{
        
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
            throw new QuestionsAndSceneControlException("No hero selected.");
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
        startingArea.setDescription("\n"
                                   +"\n---------------------------------------------"
                                   + "\n You wake up in a small cave, its time to go|"
                                   + "\n--------------------------------------------");
        startingArea.setSafe(true);
        startingArea.setSymbol("SA");
        scenesContainer[SceneType.startingArea.ordinal()] = startingArea;
        
        RegularSceneType coolStream = new RegularSceneType();
        coolStream.setNameOfScene("Cool Stream");
        coolStream.setDescription("\n"
                                   +"\n-------------------------------------------------------"
                                   + "\n You found a cool steam, it looks refreshing and clean"
                                   + "\n Will you Drink?"
                                   + "\n------------------------------------------------------");
        coolStream.setSafe(true);
        coolStream.setSymbol("CS");
        scenesContainer[SceneType.coolStream.ordinal()] = coolStream;
        
        RegularSceneType cave = new RegularSceneType();
        cave.setNameOfScene("Cave");
        cave.setDescription("\n"
                           +"\n----------------------------------------------"
                           + "\n You found a cave, its dark, quiet and murky"
                           + "\n Will you Rest?"
                           + "\n---------------------------------------------");
        cave.setSafe(true);
        cave.setSymbol(" C");
        scenesContainer[SceneType.cave.ordinal()] = cave;
        
        RegularSceneType deepCavern = new RegularSceneType();
        deepCavern.setNameOfScene("Deep Caverns");
        deepCavern.setDescription("\n"
                                   +"\n-----------------------------------------------------------------"
                                   + "\n The cavern before you is deep, but has a grip on the other side"
                                   + "\n Will you make a jump for it?|"
                                   + "\n----------------------------------------------------------------");
        deepCavern.setSafe(false);
        deepCavern.setSymbol("DC");
        scenesContainer[SceneType.deepCaverns.ordinal()] = deepCavern;
        
        RegularSceneType greatRiver = new RegularSceneType();
        greatRiver.setNameOfScene("Great River");
        greatRiver.setDescription("\n"
                                  +"\n-------------------------------------------------------"
                                  + "\n The river is running fast, but you see a net and fishes."
                                  + "\n Will you grab the net and try to catch the fishes while crossing?"
                                  + "\n--------------------------------------------");
        greatRiver.setSafe(false);
        greatRiver.setSymbol("GR");
        scenesContainer[SceneType.greatRiver.ordinal()] = greatRiver;
        
        RegularSceneType smallTown = new RegularSceneType();
        smallTown.setNameOfScene("Small Town");
        smallTown.setDescription("\n"
                                   +"\n--------------------------------------------------"
                                   + "\n You found a small town, you can trade items here"
                                   + "\n Choose the trade option below and start trading."
                                   + "\n-------------------------------------------------");
        smallTown.setSafe(true);
        smallTown.setSymbol("ST");
        scenesContainer[SceneType.smallTown.ordinal()] = smallTown;
        
        RegularSceneType goal = new RegularSceneType();
        goal.setNameOfScene("Goal");
        goal.setDescription("\n"
                                   +"\n-----------------THE END-----------------------------"
                                   + "\n You have made it to the end, and rejoined the trail"
                                   + "\n Congrats and we hope you enjoyed the game "
                                   + "\n----------------------------------------------------");
        goal.setSafe(false);
        goal.setSymbol(" G");
        scenesContainer[SceneType.goal.ordinal()] = goal;
        
        RegularSceneType minor1 = new RegularSceneType();
        minor1.setNameOfScene("Minor 1");
        minor1.setDescription("\n"
                             +"\n-------------------------------------------------"
                             + "\n A "+GameControl.minor1()+" approaches, it looks hungry."
                             + "\n-------------------------------------------------");
        minor1.setSafe(false);
        minor1.setSymbol("*1");
        scenesContainer[SceneType.minor1.ordinal()] = minor1;
        
        RegularSceneType minor2 = new RegularSceneType();
        minor2.setNameOfScene("Minor 2");
        minor2.setDescription("\n"
                             +"\n-------------------------------------------------"
                             + "\n A "+GameControl.minor2()+" is sniffing around, it sees you."
                             + "\n-------------------------------------------------");
        minor2.setSafe(false);
        minor2.setSymbol("*2");
        scenesContainer[SceneType.minor2.ordinal()] = minor2;
        
        RegularSceneType minor3 = new RegularSceneType();
        minor3.setNameOfScene("Minor 3");
        minor3.setDescription("\n"
                             +"\n--------------------------------------------------------------------"
                             + "\n A dangerous "+GameControl.minor3()+" approaches, you may be killed."
                             + "\n-------------------------------------------------------------------");
        minor3.setSafe(false);
        minor3.setSymbol("*3");
        scenesContainer[SceneType.minor3.ordinal()] = minor3;
        
        return scenesContainer;
         
    }
    
    public static Questions[] createQuestions() {
      
        Questions[] questionsContainer = new Questions[3];
     
        Questions question1 = new Questions();
        question1.setQuestion("What will you do?");
        question1.setAnswer("Player's choice");
        questionsContainer[QuestionType.question1.ordinal()] = question1;
        
        Questions question2 = new Questions();
        question2.setQuestion("Will you run?");
        question2.setAnswer("Player's choice");
        questionsContainer[QuestionType.question2.ordinal()] = question2;
        
        Questions question3 = new Questions();
        question3.setQuestion("Will you stand and fight?");
        question3.setAnswer("Player's choie");
        questionsContainer[QuestionType.question3.ordinal()] = question3;
      
        return questionsContainer;
    }
        
    public String checkSceneQuestionChoiceAndReturnNewScene() {
        Location[][] location = LostWhileHunting.getCurrentGame().getMap().getLocation(); 
        String scene="Cannot load";
        
        for (Location[] rowCheck : location) {
                for (Location surePassCheck : rowCheck) {
                    if (surePassCheck.isVisited() == false) {
                        scene=surePassCheck.getScenes().getDescription();
                        
                        return scene;
                    }
                }
                }  
        
        return scene;        
    }
    
    /* Everything below here is for the major scene questions*/
    
    public double majorSceneYes(String hero, String item1, String item2, String item3)
        throws QuestionsAndSceneControlException{
        
        //Variables
        int itemsEquipped = 0;
        int locationIncrement = 0;
        int regularSceneTypeAmount = 0;
        double randomizerNum = 0;
        double successFailureBoundary = 50;
        double classBonus = 0;
        double returnNumber = 0;
        
        if (hero == null) 
            throw new QuestionsAndSceneControlException("No hero selected.");
    
        
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
        if(hero != null){
            //classBonus = classBonus + 10
            classBonus=classBonus+10;
            //successFailureBoundary = successFailureBoundary + (itemsEquipped * 10) +  classsBonus
            successFailureBoundary = successFailureBoundary + (itemsEquipped * 10) + classBonus;   
            
                //IF (randomizerNumber <= successFailureBoundary)
                if(randomizerNum <= successFailureBoundary){
                    //moveToNextLocation();
                    System.out.println();
                    //Display “You lost” + item1
                    System.out.println("Brave choice you found two items");
                    //generate Item 1
                    itemcontrol.generateItemFromItems();
                    //generate Item 2
                    itemcontrol.generateItemFromItems();
                    System.out.println();
                    //Display: You are one step closer to victory with that awesome choice. Good luck!
                    System.out.println(hero + " You are one step closer to victory with that awesome choice. Good luck!");
                    
                    returnNumber = 1;
                }else{
                    // do nothing
                    GameControl.assignInjuryOnFail();
                    System.out.println();
                    System.out.println("You made the wrong choice, you get nothing. Better luck next time.");
                    item1 = "";
                    items.setItem1(item1);
                    System.out.println(hero + "You also lost an item sadly :( ");
                    System.out.println("Item1 status: "+ item1 );
                    returnNumber = 0;
                }
        
        }
        return returnNumber;      
                 
    }
    
    public double majorSceneNo(String hero, String item1, String item2, String item3)
        throws QuestionsAndSceneControlException{
        
        //Variables
        int itemsEquipped = 0;
        int locationIncrement = 0;
        int regularSceneTypeAmount = 0;
        double randomizerNum = 0;
        double successFailureBoundary = 50;
        double classBonus = 0;
        double returnNumber = 0;
        
        if (hero == null) 
            throw new QuestionsAndSceneControlException("No hero selected.");
        
        
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
        if(hero != null){
            //classBonus = classBonus + 10
            classBonus=classBonus+10;
            //successFailureBoundary = successFailureBoundary + (itemsEquipped * 10) +  classsBonus
            successFailureBoundary = successFailureBoundary + (itemsEquipped * 10) + classBonus;   
            
                //IF (randomizerNumber <= successFailureBoundary)
                if(randomizerNum <= successFailureBoundary){
                    //moveToNextLocation();
                    System.out.println();
                    //Display “You lost” + item1
                    System.out.println("Good choice but you get nothing, no risk no reward");
                   
                    System.out.println();
                    //Display: You are one step closer to victory with that awesome choice. Good luck!
                    System.out.println(hero + " You are one step closer to victory with that lucky choice. Good luck!");
                    
                    returnNumber = 1;
                }else{
                    // do nothing
                    GameControl.assignInjuryOnFail();
                    System.out.println();
                    System.out.println("You made the wrong choice, a risk is sometimes necessary for success.");
                    item1 = "";
                    items.setItem1(item1);
                    System.out.println(hero + "You also lost an item sadly :( ");
                    System.out.println("Item1 status: "+ item1 );
                    returnNumber = 0;
                }
        
        }
        return returnNumber;      
                 
    }

    public boolean getMessage() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
