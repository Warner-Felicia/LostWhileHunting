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

public class QuestionsAndSceneControl {
    
    public static void loadCombatActions(String hero, String item1, String item2, String item3){
        
        //Variables
        int itemsEquipped = 0;
        int locationIncrement = 0;
        int regularSceneTypeAmount = 0;
        double randomizerNum = 0;
        double successFailureBoundary = 50;
        double classBonus = 0;
        
        
        if(item1 != ""){
            itemsEquipped = itemsEquipped + 1;
        }
        if(item2 != ""){
            itemsEquipped = itemsEquipped + 1;
        }
        if(item3 != ""){
            itemsEquipped = itemsEquipped + 1;
        }
        
        randomizerNum = Math.random()*100;
        
        if(hero.equals("BurlyMan")){
            classBonus=classBonus+10;
            successFailureBoundary = successFailureBoundary + (itemsEquipped * 10) + classBonus;   
            
                     
                if(randomizerNum <= successFailureBoundary){
                    //moveToNextLocation();
                    System.out.println();
                    System.out.println("You lost "+item1);
                    item1 = ItemControl.generateItemFromItems();
                    System.out.println();
                    System.out.println(hero + " Success  with a Random number of "+randomizerNum+ " Number of items: "+ itemsEquipped + " SuccessFailureBoundary of: " + successFailureBoundary);
                    System.out.println("Item1 status: "+ item1 );
                }else{
                    // do nothing
                    System.out.println();
                    System.out.println("You lost "+item1);
                    item1 = "";
                    System.out.println(hero + " Failure  with a Random number of "+randomizerNum+ " Number of items: "+ itemsEquipped + " SuccessFailureBoundary of: " + successFailureBoundary);
                    System.out.println("Item1 status: "+ item1 );
                }
                        
        }else{
                
            successFailureBoundary = successFailureBoundary + (itemsEquipped * 10);   
            
        
                if(randomizerNum <= successFailureBoundary){
                    //moveToNextLocation();
                    System.out.println();
                    System.out.println("You lost "+item1);
                    item1 = ItemControl.generateItemFromItems();
                    System.out.println();
                    System.out.println();
                    System.out.println(hero + " Success  with a Random number of "+randomizerNum+ " Number of items: "+ itemsEquipped + " SuccessFailureBoundary of: " + successFailureBoundary);
                    System.out.println("Item1 status :"+ item1 );
                }else{
                    // do nothing
                    System.out.println();
                    System.out.println("You lost "+item1);
                    item1 = "";
                    System.out.println();
                    System.out.println();
                    System.out.println(hero + " Failure  with a Random number of "+randomizerNum+ " Number of items: "+ itemsEquipped + " SuccessFailureBoundary of: " + successFailureBoundary);
                    System.out.println("Item1 status: "+ item1 );
                }
                
        
        }
        
       
        
                 
    }
    
}
