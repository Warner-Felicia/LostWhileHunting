package byui.cit260.lostwhilehunting.view;

import byui.cit260.lostwhilehunting.control.GameControl;
import byui.cit260.lostwhilehunting.control.ItemControl;
import byui.cit260.lostwhilehunting.control.LocationsControl;
import byui.cit260.lostwhilehunting.exceptions.ItemControlException;
import byui.cit260.lostwhilehunting.exceptions.LocationsControlException;
import byui.cit260.lostwhilehunting.model.Game;
import byui.cit260.lostwhilehunting.model.ItemType;
import static byui.cit260.lostwhilehunting.model.ItemType.map;
import byui.cit260.lostwhilehunting.model.Location;
import byui.cit260.lostwhilehunting.model.Map;
import byui.cit260.lostwhilehunting.model.Player;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Comparator;
import java.util.logging.Level;
import java.util.logging.Logger;
import lostwhilehunting.LostWhileHunting;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author New User
 */
public class GameMenuView extends View implements Serializable{
    
    MainMenuView mainmenu = new MainMenuView();
    Game game = LostWhileHunting.getCurrentGame();
        
    public GameMenuView() {
        super("\n" 
                + "\n-----------------------------------------"
                + "\n| Game Menu                             |"
                + "\n----------------------------------------"
                + "\nM - Move to the next location"
                + "\nU - Use SurePass"
                + "\nS - Search Current Location"
                + "\nI - View Inventory"
                + "\nP - Check status of player"
                + "\nE - Equip items"
                + "\nV - View map"
                + "\nL - Print list of map locations"
                + "\nA - Sort list of map locations by name"
                + "\nQ - Return to Main Menu"
                + "\n----------------------------------------"
                + "\n Please make a selection.");
    }
    
    @Override
    public void display() {
        boolean done = false; // set flag to not done
        do {
            // promt for and get players name
            String value = this.getInput();
            if (value.toUpperCase().equals("Q")) // user wants to quit
                mainmenu.display(); // exit the game
            
            // do the requested action and display the next view
            try {
                done = this.doAction(value);
            } catch (NumberFormatException nf) {
                this.console.println("You must enter a valid number.");
                //this.display();
            }
        } 
        while (!done);
    } 
    
    @Override
    public boolean doAction(String choice) throws NumberFormatException{
        
        choice = choice.toUpperCase();
        
        switch (choice) {
            case ("M"): // move to next location
                this.moveToNextLocation();
                break;
            case ("U"): //use SurePass
                this.useSurePass();
                break;
            case ("S"): // search current location
                this.searchCurrentLocation();
                break;
            case ("I"): {
            try {
                // view inventory
                this.viewInventory();
            } catch (ItemControlException ex) {
                ex.getMessage();
            }
        }
                break;
            case ("P"): // check player status
                this.checkPlayerStatus();
                break;
            case ("E"): // equip items
                this.equipItems();
                break;
            case ("V") : {
                try {
                // view map
                    this.displayMap();
            } catch (LocationsControlException ex) {
                Logger.getLogger(GameMenuView.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
                break;
            case ("L"):
                this.getMapFilePath();
                break;
            case ("A"):
                this.sortMapLocationsByName();
                break;
            default: 
                this.console.println("Please choose an action from this list");
        }
        
        return false;
        
    }

    private void moveToNextLocation() {
        // allows player to search again
        ItemControl.searchAvailable = true;
        LocationsControl lc = new LocationsControl();
        
        //LocationsControl.incrementLocation();
        
        if(Player.getInjuryTracker()< 3){
            this.console.println("Injury Tracker: "+Player.getInjuryTracker());
            switch (lc.loadSimpleSceneIfNotMajorMapCoord()) {
                case 0:
                    CombatMenuView combatMenuView = new CombatMenuView();
                    //call combat view
                    combatMenuView.displayCombatMenuView();
                    break;
                case 1:
                    MajorSceneView majorScene = new MajorSceneView();
                    //call the major scene
                    majorScene.displayMajorSceneView();
                    break;
                case 2:
                    EndGameView theEnd = new EndGameView();
                    theEnd.displayEndGameView();
                    break;
                default: 
                    this.console.write("No scene loaded");
            }
        }else{
            this.console.println("\nYou are dead");
            
            if(LostWhileHunting.getCurrentGame().getItems().get(ItemType.extraLife.ordinal()).getQuantityInStock() > 0){
                
                this.console.println("\nYou have "+LostWhileHunting.getCurrentGame().getItems().get(ItemType.extraLife.ordinal()).getQuantityInStock()+" ExtraLife. Do you want to Use?");
                this.console.println("\nEnter Y|N");
                BufferedReader useLife = LostWhileHunting.getInFile();
                String lifeWriteChoice = "";
                boolean checker = false;
         
                    
                while(!checker){    
            
                    try {
                        lifeWriteChoice = useLife.readLine();
                        lifeWriteChoice = lifeWriteChoice.trim();
                        lifeWriteChoice = lifeWriteChoice.toUpperCase();
                        this.console.println("You Chose: "+lifeWriteChoice);    
                    }
                    catch (IOException ex) {
                        ErrorView.display(this.getClass().getName(), "Error reading from keyboard.");
                    }
                    switch (lifeWriteChoice) {
                        case "Y": // create and start a new game
                            this.console.println("\nYou were Revived by the Power of the Lord");
                            Player.setInjuryTracker(0);
                            GameControl.checkIfActorIsInjuredDeadOrAlive(Player.getInjuryTracker());
                
                            break;
                        case "N": // get and start an existing game
                            this.console.println("\nYou remain dead");
                
                            break;
                        default:
                            this.console.println("\n*** Invalid selection *** Try again");
                            continue;
                    }
                
                    break;
                }
            }
        }
    }

    private void useSurePass() {
        LocationsControl locationscontrol = new LocationsControl();
        locationscontrol.incrementLocationsMapSceneTypeIfSurePass(1);
    }

    private void searchCurrentLocation() {
        ItemControl itemcontrol = new ItemControl();
        if(ItemControl.searchAvailable) {
            try {
                itemcontrol.searchLocation();
            } catch (ItemControlException ex) {
                Logger.getLogger(GameMenuView.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        else {
            this.console.println("\n You have already searched this location."
                   + "\n You may only search a location once.");
        }
    }

    private void viewInventory() throws ItemControlException {
         ViewInventoryView inventoryView = new ViewInventoryView();
        
        // Display the view inventory view
        inventoryView.displayinventoryView();
         
    }
    
    private void checkPlayerStatus() {
        CheckPlayerStatusView playerStatus = new CheckPlayerStatusView();
        playerStatus.displayPlayerStatus();
    }
    
    private void equipItems() {
        EquipItemView equipitem = new EquipItemView();
        
        // Display the EquipItems view
        equipitem.display();
    }

    private void displayMap() throws LocationsControlException {
        
        
        game = LostWhileHunting.getCurrentGame();
        LocationsControl checkVisitedStages = new LocationsControl();
        
        Location[][] locations = game.getMap().getLocation();
        
        this.console.println("\n***Lost While Hunting Map***");
        this.console.print("   1  2  3  4  5  6  7  8  9");
        for (int i = 0; i < locations.length; i++) {
            this.console.print("\n  ----------------------------");
            this.console.print("\n" + (i + 1)+" ");           
            for (int j = 0; j < locations[i].length; j++) {
                this.console.print("|");
                Location location = locations[i][j];
                if (location.isVisited() == true) {
                    this.console.print(location.getScenes().getSymbol());
                } else {
                    this.console.print("??");
                }
            }
            this.console.print("|");
        }
       
        switch(checkVisitedStages.checkStages()){
            case 1:
                this.console.println("\n  ----------------------------" +"\n" 
                            + "\n <<< You just passed the first stage! You have more to explore in this game! >>>"
                + "\n *** Progress: " + ((checkVisitedStages.checkStages() * 100)/27) + "% ***"); 
                break;
            case 10:
                this.console.println("\n  ----------------------------" +"\n" 
                            + "\n <<< Now you are in stage 10. You have survived well! >>>"
                + "\n *** Progress: " + ((checkVisitedStages.checkStages() * 100)/27) + "% ***"); 
                break;
            case 19:
                this.console.println("\n  ----------------------------" +"\n" 
                            + "\n <<< You are a master of surviving! You passed stage 18. >>>"
                + "\n *** Progress: " + ((checkVisitedStages.checkStages() * 100)/27) + "% ***"); 
            case 26:
                this.console.println("\n  ----------------------------" +"\n" 
                            + "\n <<< Wow, you are almost finishing! You have one more stage to survive. >>>"
                + "\n *** Progress: " + ((checkVisitedStages.checkStages() * 100)/27) + "% ***"); 
            case 27:
                this.console.println("\n  ----------------------------" +"\n" 
                            + "\n <<< Congratulation! You survived. >>>"
                + "\n *** Progress: " + ((checkVisitedStages.checkStages() * 100)/27) + "% ***"); 
                break;
            default: 
                this.console.println("\n  ----------------------------" +"\n" 
                        + "\n *** Progress: " + ((checkVisitedStages.checkStages() * 100)/27) + "% ***");
                break;
        }
  
    }

    private void getMapFilePath() {
        this.console.println("\n\nEnter the file path for the file where "
                + "the game will be saved.");
        String filePath = this.getInput();
        
        try {
            this.printMap(filePath);
        }
        catch (Exception e) {
            ErrorView.display("MainMenuView", e.getMessage());
        }
    }

    private void printMap(String filePath) {
       
        Location[][] locations = game.getMap().getLocation();
        int sceneNumber = 0;
        String visited = null;
        
        try (PrintWriter out = new PrintWriter(filePath)) {
            
            out.println("\n\n          Map Locations          ");
            out.printf("%n%-15s%-20s%-15s", "SceneNumber", "SceneType", "Visited");
            out.println("\n----------------------------------------------------------");
            
            for (int i = 0; i < locations.length; i++) {
                for (int j = 0; j < locations[i].length; j++) {
                Location location = locations[i][j];
                sceneNumber++;
                if (location.isVisited() == true)
                    visited = "Yes";
                else
                    visited = "No";
                          
                out.printf("%-27s%-25s%-10s%n", sceneNumber, location.getScenes().getNameOfScene(), visited);
                }
            }
                        
            out.flush();
                   
        }
        catch (IOException ex) {
            ErrorView.display(this.getClass().getName(), ex.getMessage());
            
        }
        
        this.console.println("Your information has been written to the "
                + "requested file.");
    }

    private void sortMapLocationsByName() {
        this.console.println("sortMapLocationsByName() function called");
        
        Location[][] location = game.getMap().getLocation();
        
        String locationName[] = new String[27];
            
        int x = 0;
        
        for (int i=0; i < 3; i++) {
                for (int j=0; j < 9; j++) {
                    locationName[x] = location[i][j].getScenes().getNameOfScene();
                    x++;
                }
        }
        
       Arrays.sort(locationName);
       
       for (int i = 0; i < locationName.length; i++) {
           this.console.println(locationName[i]);
       }
                    
    }
       
}

    
