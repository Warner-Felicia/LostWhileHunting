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
import byui.cit260.lostwhilehunting.exceptions.ItemControlException;
import byui.cit260.lostwhilehunting.exceptions.LocationsControlException;
import byui.cit260.lostwhilehunting.exceptions.QuestionsAndSceneControlException;
import byui.cit260.lostwhilehunting.model.Items;
import byui.cit260.lostwhilehunting.model.Location;
import byui.cit260.lostwhilehunting.model.QuestionType;
import byui.cit260.lostwhilehunting.model.Questions;
import byui.cit260.lostwhilehunting.model.RegularSceneType;
import byui.cit260.lostwhilehunting.model.SceneType;
import byui.cit260.lostwhilehunting.view.ErrorView;
import java.io.PrintWriter;
import java.io.Serializable;
import java.util.logging.Level;
import java.util.logging.Logger;
import lostwhilehunting.LostWhileHunting;

public class QuestionsAndSceneControl implements Serializable{
    
    ItemControl itemcontrol = new ItemControl();
    Items items = new Items();
    PrintWriter console = LostWhileHunting.getOutFile();
    
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
                try {
                    //moveToNextLocation();
                    LocationsControl.incrementLocation();
                } catch (LocationsControlException ex) {
                    Logger.getLogger(QuestionsAndSceneControl.class.getName()).log(Level.SEVERE, null, ex);
                }
                    this.console.println();
                    //Display “You lost” + item1
                    this.console.println("You lost "+item1);
                try {
                    //item1 = generateItemFromItems(): String
                    item1 = itemcontrol.generateItemFromItems();
                } catch (ItemControlException ex) {
                    ErrorView.display(this.getClass().getName(), ex.getMessage());
                }
                    //Set item1
                    items.setItem1(item1);
                    this.console.println();
                    //Display: hero + " Success  with a Random number of "+randomizerNum+ " Number of items: "+ itemsEquipped + " SuccessFailureBoundary of: " + successFailureBoundary)
                    this.console.println(hero + " Success  with a Random number of "+randomizerNum+ " Number of items: "+ itemsEquipped + " SuccessFailureBoundary of: " + successFailureBoundary);
                    //Display Item1 status
                    this.console.println("Item1 status: "+ item1 );
                    returnNumber = 1;
                }else{
                    // do nothing
                    GameControl.assignInjuryOnFail();
                    this.console.println();
                    this.console.println("You lost "+item1);
                    item1 = "";
                    items.setItem1(item1);
                    this.console.println(hero + " Failure  with a Random number of "+randomizerNum+ " Number of items: "+ itemsEquipped + " SuccessFailureBoundary of: " + successFailureBoundary);
                    this.console.println("Item1 status: "+ item1 );
                    returnNumber = 0;
                }
                        
        }else if(hero.equals("")){
            throw new QuestionsAndSceneControlException("No hero selected.");
            
        }else{
                
            successFailureBoundary = successFailureBoundary + (itemsEquipped * 10);   
            
        
                if(randomizerNum <= successFailureBoundary){
                try {
                    //moveToNextLocation();
                    LocationsControl.incrementLocation();
                } catch (LocationsControlException ex) {
                    Logger.getLogger(QuestionsAndSceneControl.class.getName()).log(Level.SEVERE, null, ex);
                }
                    this.console.println();
                    this.console.println("You lost "+item1);
                try {
                    item1 = itemcontrol.generateItemFromItems();
                } catch (ItemControlException ex) {
                   ErrorView.display(this.getClass().getName(), ex.getMessage());
                }
                    items.setItem1(item1);
                    this.console.println();
                    this.console.println();
                    this.console.println(hero + " Success  with a Random number of "+randomizerNum+ " Number of items: "+ itemsEquipped + " SuccessFailureBoundary of: " + successFailureBoundary);
                    this.console.println("Item1 status :"+ item1 );
                    returnNumber = 1;
                }else{
                    // do nothing
                    GameControl.assignInjuryOnFail();
                    this.console.println();
                    this.console.println("You lost "+item1);
                    item1 = "";
                    items.setItem1(item1);
                    this.console.println();
                    this.console.println();
                    this.console.println(hero + " Failure  with a Random number of "+randomizerNum+ " Number of items: "+ itemsEquipped + " SuccessFailureBoundary of: " + successFailureBoundary);
                    this.console.println("Item1 status: "+ item1 );
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
            try {
                //moveToNextLocation();
                LocationsControl.incrementLocation();
            } catch (LocationsControlException ex) {
                Logger.getLogger(QuestionsAndSceneControl.class.getName()).log(Level.SEVERE, null, ex);
            }
            this.console.println();
            this.console.println("You lost "+item1);
            this.console.println();
            this.console.println(hero + " Success  with a Random number of "+randomizerNum+ " Number of items: "+ itemsEquipped + " SuccessFailureBoundary of: " + successFailureBoundary);
            try {
                item1 = itemcontrol.generateItemFromItems();
            } catch (ItemControlException ex) {
                this.console.println(ex.getMessage());
            }
            items.setItem1(item1);
            this.console.println("Item1 status: "+ item1 );
            returnNumber = 1;
        }
        else{
            // do nothing
            GameControl.assignInjuryOnFail();
            this.console.println();
            this.console.println("You lost "+item1);
            this.console.println();
            item1 = "";
            items.setItem1(item1);
            this.console.println(hero + " Failure  with a Random number of "+randomizerNum+ " Number of items: "+ itemsEquipped + " SuccessFailureBoundary of: " + successFailureBoundary);
            this.console.println("Item1 status: none");
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
            try {
                //moveToNextLocation();
                LocationsControl.incrementLocation();
            } catch (LocationsControlException ex) {
                Logger.getLogger(QuestionsAndSceneControl.class.getName()).log(Level.SEVERE, null, ex);
            }
            this.console.println();
            this.console.println("You lost "+item1);
            this.console.println();
            this.console.println(hero + " Success  with a Random number of "+randomizerNum+ " Number of items: "+ itemsEquipped + " SuccessFailureBoundary of: " + successFailureBoundary);
            try {
                item1 = itemcontrol.generateItemFromItems();
            } catch (ItemControlException ex) {
                this.console.println(ex.getMessage());
            }
            items.setItem1(item1);
            this.console.println("Item1 status: "+ item1 );
            returnNumber = 1;
        }
        else{
            // do nothing
            GameControl.assignInjuryOnFail();
            this.console.println();
            this.console.println("You lost "+item1);
            item1 = "";
            items.setItem1(item1);
            this.console.println(hero + " Failure  with a Random number of "+randomizerNum+ " Number of items: "+ itemsEquipped + " SuccessFailureBoundary of: " + successFailureBoundary);
            this.console.println("Item1 status: none");
            returnNumber = 0;
        }
        
        return returnNumber;                        
    }
    
    public static RegularSceneType[] createScenes() {
        RegularSceneType[] scenesContainer = new RegularSceneType[10];
        QuestionsAndSceneControl questionsandscenecontrol = new QuestionsAndSceneControl();
        
        RegularSceneType startingArea = new RegularSceneType();
        startingArea.setNameOfScene("Starting Area");
        startingArea.setDescription("\n"
                                   +"\n---------------------------------------------"
                                   + "\n You wake up in a small cave, its time to go|"
                                   + "\n--------------------------------------------");
        startingArea.setSafe(true);
        startingArea.setSymbol("SA");
        startingArea.setQuestion("\n---------------------------------------"
                    + "\n Will you trust the Scenario suggested"
                    + "\n---------------------------------------"
                    + "\n"
                    + "\n Y. Yes"
                    + "\n N. No"
                    + "\n Q. Return to Game Menu"
                    + "\n"
                    + "\n---------------------------------------"
                    + "\n Choose Wisely!");
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
        coolStream.setQuestion("\n---------------------------------------"
                    + "\n Will you trust the Scenario suggested"
                    + "\n---------------------------------------"
                    + "\n"
                    + "\n Y. Yes"
                    + "\n N. No"
                    + "\n Q. Return to Game Menu"
                    + "\n"
                    + "\n---------------------------------------"
                    + "\n Choose Wisely!");
        scenesContainer[SceneType.coolStream.ordinal()] = coolStream;
        
        RegularSceneType cave = new RegularSceneType();
        cave.setNameOfScene("Cave");
        cave.setDescription("\n"
                           +"\n----------------------------------------------"
                           + "\n You found a cave, its dark, quiet and murky"
                           + "\n Will you Rest?"
                           + "\n---------------------------------------------");
        cave.setSafe(true);
        cave.setSymbol("C");
        cave.setQuestion("\n---------------------------------------"
                    + "\n Will you trust the Scenario suggested"
                    + "\n---------------------------------------"
                    + "\n"
                    + "\n Y. Yes"
                    + "\n N. No"
                    + "\n Q. Return to Game Menu"
                    + "\n"
                    + "\n---------------------------------------"
                    + "\n Choose Wisely!");
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
        deepCavern.setQuestion("\n---------------------------------------"
                    + "\n Will you trust the Scenario suggested"
                    + "\n---------------------------------------"
                    + "\n"
                    + "\n Y. Yes"
                    + "\n N. No"
                    + "\n Q. Return to Game Menu"
                    + "\n"
                    + "\n---------------------------------------"
                    + "\n Choose Wisely!");
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
        greatRiver.setQuestion("\n---------------------------------------"
                    + "\n Will you trust the Scenario suggested"
                    + "\n---------------------------------------"
                    + "\n"
                    + "\n Y. Yes"
                    + "\n N. No"
                    + "\n Q. Return to Game Menu"
                    + "\n"
                    + "\n---------------------------------------"
                    + "\n Choose Wisely!");
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
        smallTown.setQuestion("\n---------------------------------------"
                    + "\n Will you trust the Scenario suggested"
                    + "\n---------------------------------------"
                    + "\n"
                    + "\n Y. Yes"
                    + "\n N. No"
                    + "\n Q. Return to Game Menu"
                    + "\n"
                    + "\n---------------------------------------"
                    + "\n Choose Wisely!");
        scenesContainer[SceneType.smallTown.ordinal()] = smallTown;
        
        RegularSceneType goal = new RegularSceneType();
        goal.setNameOfScene("Goal");
        goal.setDescription("\n"
                                   +"\n-----------------THE END-----------------------------"
                                   + "\n You have made it to the end, and rejoined the trail"
                                   + "\n Congrats and we hope you enjoyed the game "
                                   + "\n----------------------------------------------------");
        goal.setSafe(false);
        goal.setSymbol("G");
        goal.setQuestion("\n---------------------------------------"
                    + "\n Will you trust the Scenario suggested"
                    + "\n---------------------------------------"
                    + "\n"
                    + "\n Y. Yes"
                    + "\n N. No"
                    + "\n Q. Return to Game Menu"
                    + "\n"
                    + "\n---------------------------------------"
                    + "\n Choose Wisely!");
        scenesContainer[SceneType.goal.ordinal()] = goal;
        
        RegularSceneType minor1 = new RegularSceneType();
        minor1.setNameOfScene("Minor 1");
        minor1.setDescription("\n"
                             +"\n-------------------------------------------------"
                             + "\n A "+GameControl.minor1()+" approaches, it looks hungry."
                             + "\n-------------------------------------------------");
        minor1.setSafe(false);
        minor1.setSymbol("*1");
        minor1.setQuestion("\n---------------------------------------"
                    + "\n What will you do?"
                    + "\n---------------------------------------"
                    + "\n"
                    + "\n 3. Fight"
                    + "\n 4. Flight"
                    + "\n 5. Evade"
                    + "\n Q. Return to Game Menu"
                    + "\n"
                    + "\n---------------------------------------"
                    + "\n Choose Wisely!");
        scenesContainer[SceneType.minor1.ordinal()] = minor1;
        
        RegularSceneType minor2 = new RegularSceneType();
        minor2.setNameOfScene("Minor 2");
        minor2.setDescription("\n"
                             +"\n-------------------------------------------------"
                             + "\n A "+GameControl.minor2()+" is sniffing around, it sees you."
                             + "\n-------------------------------------------------");
        minor2.setSafe(false);
        minor2.setSymbol("*2");
        minor2.setQuestion("\n---------------------------------------"
                    + "\n What will you do?"
                    + "\n---------------------------------------"
                    + "\n"
                    + "\n 3. Fight"
                    + "\n 4. Flight"
                    + "\n 5. Evade"
                    + "\n Q. Return to Game Menu"
                    + "\n"
                    + "\n---------------------------------------"
                    + "\n Choose Wisely!");
        scenesContainer[SceneType.minor2.ordinal()] = minor2;
        
        RegularSceneType minor3 = new RegularSceneType();
        minor3.setNameOfScene("Minor 3");
        minor3.setDescription("\n"
                             +"\n--------------------------------------------------------------------"
                             + "\n A dangerous "+GameControl.minor3()+" approaches, you may be killed."
                             + "\n-------------------------------------------------------------------");
        minor3.setSafe(false);
        minor3.setSymbol("*3");
        minor3.setQuestion("\n---------------------------------------"
                    + "\n What will you do?"
                    + "\n---------------------------------------"
                    + "\n"
                    + "\n 3. Fight"
                    + "\n 4. Flight"
                    + "\n 5. Evade"
                    + "\n Q. Return to Game Menu"
                    + "\n"
                    + "\n---------------------------------------"
                    + "\n Choose Wisely!");
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
        question3.setAnswer("Player's choice");
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
    
    public String checkSceneQuestionChoiceAndReturnQuestion() {
        Location[][] location = LostWhileHunting.getCurrentGame().getMap().getLocation(); 
        String question="Cannot load";
        
        for (Location[] rowCheck : location) {
                for (Location surePassCheck : rowCheck) {
                    if (surePassCheck.isVisited() == false) {
                        question=surePassCheck.getScenes().getQuestion();
                        
                        return question;
                    }
                }
                }  
        
        return question;        
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
                try {
                    //moveToNextLocation();
                    LocationsControl.incrementLocation();
                } catch (LocationsControlException ex) {
                    Logger.getLogger(QuestionsAndSceneControl.class.getName()).log(Level.SEVERE, null, ex);
                }
                    this.console.println();
                    //Display “You lost” + item1
                    this.console.println("Brave choice you found two items");
                try {
                    //generate Item 1
                    itemcontrol.generateItemFromItems();
                } catch (ItemControlException ex) {
                    ErrorView.display(this.getClass().getName(), ex.getMessage());
                }
                try {
                    //generate Item 2
                    itemcontrol.generateItemFromItems();
                } catch (ItemControlException ex) {
                    ErrorView.display(this.getClass().getName(), ex.getMessage());
                }
                    this.console.println();
                    //Display: You are one step closer to victory with that awesome choice. Good luck!
                    this.console.println(hero + " You are one step closer to victory with that awesome choice. Good luck!");
                    
                    returnNumber = 1;
                }else{
                    // do nothing
                    GameControl.assignInjuryOnFail();
                    this.console.println();
                    this.console.println("You made the wrong choice, you get nothing. Better luck next time.");
                    item1 = "";
                    items.setItem1(item1);
                    this.console.println(hero + "You also lost an item sadly :( ");
                    this.console.println("Item1 status: "+ item1 );
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
                try {
                    //moveToNextLocation();
                    LocationsControl.incrementLocation();
                } catch (LocationsControlException ex) {
                    Logger.getLogger(QuestionsAndSceneControl.class.getName()).log(Level.SEVERE, null, ex);
                }
                    this.console.println();
                    //Display “You lost” + item1
                    this.console.println("Good choice but you get nothing, no risk no reward");
                   
                    this.console.println();
                    //Display: You are one step closer to victory with that awesome choice. Good luck!
                    this.console.println(hero + " You are one step closer to victory with that lucky choice. Good luck!");
                    
                    returnNumber = 1;
                }else{
                    // do nothing
                    GameControl.assignInjuryOnFail();
                    this.console.println();
                    this.console.println("You made the wrong choice, a risk is sometimes necessary for success.");
                    item1 = "";
                    items.setItem1(item1);
                    this.console.println(hero + "You also lost an item sadly :( ");
                    this.console.println("Item1 status: "+ item1 );
                    returnNumber = 0;
                }
        
        }
        return returnNumber;      
                 
    }

    public boolean getMessage() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
