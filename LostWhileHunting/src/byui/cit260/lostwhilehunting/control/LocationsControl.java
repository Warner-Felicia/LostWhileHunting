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
import byui.cit260.lostwhilehunting.model.Player;

public class LocationsControl {
    
    ItemControl itemcontrol = new ItemControl();
    Player p = new Player();
    
    public double incrementLocationsMapSceneTypeIfSurePass(int surePass){
        
        //Declare Variables used by function
        String inventoryItem = "";
        double randomizerNum = 0;
        double returnSuccessFailure= 0;
        
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
                returnSuccessFailure = 1;// assign 1 for test class
                
            }else{
                
                surePass = surePass - 1; // decrease surePass by 1
                p.setNumberOfSurePasses(surePass);
                //This item will be written to the SetInventoryItem function in future iterations
                inventoryItem = itemcontrol.generateItemFromItems();
                itemcontrol.viewInventory(inventoryItem);
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
    
    public double loadSimpleSceneIfNotMajorMapCoord(int column, int row){
        
        //Declare variable
        int returnResult = 0;
        
        /*This if statement checks if the column and row is equal
        Due to each major scene being at 0,0 3,3 5,5 7,7*/
        if(column == row){
            
            //if the column and row is equal check if column equals to a major scene number
            if(column == 0 || column == 3 || column == 5 || column == 7){
                
                System.out.println("You are now at a Major Scene, pay attention to new commands");
                //loadMajorSceneIfMapCoordTrue(column, row); -- not written yet
                returnResult = 3;
                
            }else{
                
                 System.out.println("New Scene Loaded");
                 //  QuestionsAndSceneControl.checkSceneQuestionChoiceAndReturnNewScene(); function not written yet
              
                returnResult = 5;
            }
        }else{
            
            System.out.println("New Scene Loaded");
            // QuestionsAndSceneControl.checkSceneQuestionChoiceAndReturnNewScene(); function not written yet
            returnResult = 5;
           
        }
        return returnResult;
    }

    private void loadMajorSceneIfMapCoordTrue(int column, int row) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
