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
import byui.cit260.lostwhilehunting.control.QuestionsAndSceneControl;
import byui.cit260.lostwhilehunting.exceptions.ItemControlException;
import byui.cit260.lostwhilehunting.exceptions.LocationsControlException;
import byui.cit260.lostwhilehunting.model.Location;
import byui.cit260.lostwhilehunting.model.Map;
import byui.cit260.lostwhilehunting.model.Player;
import byui.cit260.lostwhilehunting.model.RegularSceneType;
import byui.cit260.lostwhilehunting.model.SceneQuestions;
import byui.cit260.lostwhilehunting.model.SceneType;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import lostwhilehunting.LostWhileHunting;

public class LocationsControl {

    ItemControl itemcontrol = new ItemControl();
    Player p = new Player();
    
    public double incrementLocationsMapSceneTypeIfSurePass(int surePass){
        
        //Declare Variables used by function
        String inventoryItem = "";
        double randomizerNum = 0;
        double returnSuccessFailure= 0;
        Location[][] location = LostWhileHunting.getCurrentGame().getMap().getLocation();
        
        //always get the latest surePass Amount
        if(surePass > p.getNumberOfSurePasses() || surePass < p.getNumberOfSurePasses()){
            surePass = p.getNumberOfSurePasses();
        }else{
            //do nothing
        }
        
        // This if statement checks the surePass for amount
        if(surePass < 0 || surePass > 4){ //Checks for anomalies
            
            System.out.println("Hacking attempt detected or Major Catastrophy detected.");
            returnSuccessFailure = 99999; // assign 99999 for test class
            
        }else if(surePass != 0){
            
            //This generates a random number between 1 and 100
            randomizerNum = Math.random()*100;
           
            /* this if statement gives an 80% chance of success, 
            but if it fails you still get an item making it 100% success.*/
            if(randomizerNum <= 80){
                
                /* The moveToNextLocation function will increment the locations 
                and decrease the scenes between each main location.*/
                //moveToNextLocation(); This function has not been written yet
                
                System.out.println("Congrats you have managed to bypass the danger successfully.");
                surePass = surePass - 1; // decrease surePass by 1
                p.setNumberOfSurePasses(surePass);
                System.out.println("You now have "+p.getNumberOfSurePasses()+" surePasses left.");
                 
                for (Location[] rowCheck : location) {
                for (Location surePassCheck : rowCheck) {
                    if (surePassCheck.isVisited() == false) {
                        surePassCheck.setVisited(true);
                        
                        return 1;
                    }
                }
                }            
                LostWhileHunting.getCurrentGame().getMap().setLocation(location);
                returnSuccessFailure = 1;// assign 1 for test class
                
            }else{
                
                surePass = surePass - 1; // decrease surePass by 1
                p.setNumberOfSurePasses(surePass);
                try {
                    //This item will be written to the SetInventoryItem function in future iterations
                    inventoryItem = itemcontrol.generateItemFromItems();
                } catch (ItemControlException ex) {
                    System.out.println(ex.getMessage());
                }
                System.out.println("Your Sure Pass failed this time, but you found a " + inventoryItem);
                System.out.println("You now have "+p.getNumberOfSurePasses()+" surePasses left.");
                returnSuccessFailure = 0;// assign 0 for test class
                
            }
        }else{
            
            System.out.println("You have no Sure Passes left sadly, be careful on your journey");
            returnSuccessFailure = 99999; // assign 99999 for test class
            
        }
        
        return returnSuccessFailure;
    }
    
    public int loadSimpleSceneIfNotMajorMapCoord(){
        
        int returnResult=0;
        
        Location[][] location = LostWhileHunting.getCurrentGame().getMap().getLocation(); 
        String scene="Cannot load";
        
        for (Location[] rowCheck : location) {
                for (Location surePassCheck : rowCheck) {
                    if (surePassCheck.isVisited() == false) {
                        scene=surePassCheck.getScenes().getSymbol();
                        
                        if(null != scene)switch (scene) {
                            case "*1":
                            case "*2":
                            case "*3":
                                returnResult=0;
                                return returnResult;
                            case "SA":
                                returnResult=1;
                                return returnResult;
                            case "CS":
                                returnResult=1;
                                return returnResult;
                            case " C":
                                returnResult=1;
                                return returnResult;
                            case "DC":
                                returnResult=1;
                                break;
                            case "GR":
                                returnResult=1;
                                return returnResult;
                            case "ST":
                                returnResult=1;
                                return returnResult;
                            case " G":
                                returnResult=2;
                                return returnResult;
                            default:
                                System.out.println("Scene error");
                                break;
                        }
                       
                    }
                }
                return returnResult;
        } 
        
               
        return returnResult;
    }
    
    private static String loadMajorSceneIfMapCoordTrue() throws LocationsControlException {
        
         Location[][] location = LostWhileHunting.getCurrentGame().getMap().getLocation();
         String sceneStatus="";
        
        if (location == null) {
            throw new LocationsControlException("Locations array unsuccessfully passed.");
        }
        
         for (int i = 0; i < location.length; i++ ){
             for (int j = 0; j < location[i].length; j++ ) {
                 
                if (location[i][j].isVisited()==false) {
                    if(location[i][j].getScenes().getSymbol()==null){
                       throw new LocationsControlException("Symbols bugged.");
                    }else switch(location[i][j].getScenes().getSymbol()){
                        case "CS":
                            sceneStatus = "major";
                            return sceneStatus;
                        case " C":
                            sceneStatus = "major";
                            return sceneStatus;
                        case "DC":
                            sceneStatus = "major";
                            return sceneStatus;
                        case "GR":
                            sceneStatus = "major";
                            return sceneStatus;
                        case "ST":
                            sceneStatus = "major";
                            return sceneStatus;
                        case " G":
                            sceneStatus = "major";
                            return sceneStatus;
                        default:
                            sceneStatus = "minor";
                            return sceneStatus;                     
                    }
                  
                }
            }
        }
        return null;
    }  
    
    
    public static Map createMap(int noOfRows, int noOfColumns, ArrayList items) {
      
    if (noOfRows < 0 || noOfColumns < 0)
        return null;
    
    if (items == null || items.size() < 1)
        return null;
    
    Map map = new Map();
    map.setRowCount(noOfRows);
    map.setColumnCount(noOfColumns);
    
        Location[][] locations = createLocations(noOfRows, noOfColumns);
        map.setLocation(locations);   
    
    RegularSceneType[] scenes = QuestionsAndSceneControl.createScenes();
    
    
    SceneQuestions questions = new SceneQuestions();
    QuestionsAndSceneControl.createQuestions();
    
    LocationsControl.assignScenesToLocations(map, scenes);

        
        
        return map;
    }
    
    private static Location[][] createLocations(int noOfRows, int noOfColumns) {
         if (noOfRows < 1 || noOfColumns < 1)
             return null;
         
         Location[][] locationsCord = new Location[noOfRows][noOfColumns];
         for (int i = 0; i < locationsCord.length; i++ ){
             for (int j = 0; j < locationsCord[i].length; j++ ) {
                 Location location = new Location();
                 location.setRow(i);
                 location.setColumn(j);
                 location.setVisited(false);
                 locationsCord[i][j] = location;
             }
         }   
         
         return locationsCord;
    }
     
    
    private static void assignScenesToLocations(Map map, RegularSceneType[] scenesContainer){
        Location[][] locations = map.getLocation();
        
        //start point
        locations[0][0].setScenes(scenesContainer[SceneType.startingArea.ordinal()]);
        locations[0][1].setScenes(scenesContainer[SceneType.minor1.ordinal()]);
        locations[0][2].setScenes(scenesContainer[SceneType.minor1.ordinal()]);
        locations[0][3].setScenes(scenesContainer[SceneType.minor1.ordinal()]);
        locations[0][4].setScenes(scenesContainer[SceneType.coolStream.ordinal()]);
        locations[0][5].setScenes(scenesContainer[SceneType.minor1.ordinal()]);
        locations[0][6].setScenes(scenesContainer[SceneType.minor1.ordinal()]);
        locations[0][7].setScenes(scenesContainer[SceneType.minor1.ordinal()]);
        locations[0][8].setScenes(scenesContainer[SceneType.cave.ordinal()]);
        locations[1][0].setScenes(scenesContainer[SceneType.minor2.ordinal()]);
        locations[1][1].setScenes(scenesContainer[SceneType.minor2.ordinal()]);
        locations[1][2].setScenes(scenesContainer[SceneType.minor2.ordinal()]);
        locations[1][3].setScenes(scenesContainer[SceneType.deepCaverns.ordinal()]);
        locations[1][4].setScenes(scenesContainer[SceneType.minor2.ordinal()]);
        locations[1][5].setScenes(scenesContainer[SceneType.minor2.ordinal()]);
        locations[1][6].setScenes(scenesContainer[SceneType.minor2.ordinal()]);
        locations[1][7].setScenes(scenesContainer[SceneType.greatRiver.ordinal()]);
        locations[1][8].setScenes(scenesContainer[SceneType.minor3.ordinal()]);
        locations[2][0].setScenes(scenesContainer[SceneType.minor3.ordinal()]);
        locations[2][1].setScenes(scenesContainer[SceneType.minor3.ordinal()]);
        locations[2][2].setScenes(scenesContainer[SceneType.minor3.ordinal()]);
        locations[2][3].setScenes(scenesContainer[SceneType.smallTown.ordinal()]);
        locations[2][4].setScenes(scenesContainer[SceneType.minor3.ordinal()]);
        locations[2][5].setScenes(scenesContainer[SceneType.minor3.ordinal()]);
        locations[2][6].setScenes(scenesContainer[SceneType.minor3.ordinal()]);
        locations[2][7].setScenes(scenesContainer[SceneType.minor3.ordinal()]);
        locations[2][8].setScenes(scenesContainer[SceneType.goal.ordinal()]);
        
        
     }
    
     public static void incrementLocation() throws LocationsControlException{
        
        Location[][] location = LostWhileHunting.getCurrentGame().getMap().getLocation();
        
        if (location == null) {
            throw new LocationsControlException ("Locations array unsuccessfully passed.");
        }
        
        //Search for next unvisited location
        for (Location[] row : location) {
            for (Location column : row) {
                if (column.isVisited() == false) {
                    column.setVisited(true);
                    return;
                }
            }
        }
    }
     
     public int checkStages() throws LocationsControlException {
       
        Location[][] location = LostWhileHunting.getCurrentGame().getMap().getLocation();
        int total = 0; 
        // Location[][] location = LostWhileHunting.getCurrentGame().getMap().getLocation();
        
        if (location == null) {
            throw new LocationsControlException("There is an error. The total number of visited stages is undefined.");
        }
        
        //Search for next unvisited location
        for (Location[] row : location) {
            for (Location column : row) {
                if (column.isVisited() == false) {
                   total = total + 1;
                }
            }
        }
        return (27 - total);
    }
}
