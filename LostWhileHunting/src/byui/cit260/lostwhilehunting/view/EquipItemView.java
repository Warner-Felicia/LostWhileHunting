/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.lostwhilehunting.view;

import byui.cit260.lostwhilehunting.control.ItemControl;
import byui.cit260.lostwhilehunting.model.Items;
import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class EquipItemView {
    
    ItemControl itemcontrol= new ItemControl();
    private String menu;

    public EquipItemView() {
        this.menu = "\n"
                    + "\n----------------------------------------------"
                    + "\n| Equip Items                                |"
                    + "\n----------------------------------------------"
                    + "\nR - Equip Rifle"
                    + "\nB - Equip Bullets"
                    + "\nK - Equip Knife"
                    + "\nM - Equip Map"
                    + "\nN - Equip Meat"
                    + "\nE - Equip ExtraLife"
                    + "\nQ - Quit"
                    + "\n---------------------------------------------";
        
    }
      
    void displayEquipItems() {
        
        boolean done = false; // set flag to not done
        do {
            // promt for and get players name
            String equipitemsoption = this.getEquipItemsOption();
            if (equipitemsoption.toUpperCase().equals("Q")) // user wants to quit
                return; // exit the game
            
            // do the requested action and display the next view
            done = this.doAction(equipitemsoption);
        } while (!done);
    }
    
    private String getEquipItemsOption() {
       Scanner keyboard = new Scanner(System.in);
        String value = "";
        boolean valid = false;
        
        while (!valid) {
            System.out.println("\n" + this.menu);
            
            value = keyboard.nextLine();
            value = value.trim();
            
            if (value.length() < 1) {
                System.out.println("\nInvalid value: value can not be blank");
                continue;
            }
            
            break; // end the loop
        }
        
        return value;  // return the value entered
    }
    
    private boolean doAction(String choice) {
       
        choice = choice.toUpperCase(); // convert choice to upper case
        
        switch (choice) {
            case "R": // create and start a new game
                this.equipItem("Rifle");
                
                break;
            case "B": // get and start an existing game
                this.equipItem("Bullets");
                
                break;
            case "K": // display the help menu
                this.equipItem("Knife");
                
                break;
            case "M": // save the current game
                this.equipItem("Map");
                
                break;
            case "N": // save the current game
                this.equipItem("Meat");
                
                break;
            case "E": // save the current game
                this.equipItem("ExtraLife");
                
                break;
            case "Q": // exit
                System.out.println("\nExiting");
                return true;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;
        }
        
        return true;
    }
    
     private void equipItem(String item) {
         
       if(item=="Map"){ 
        if(Items.getMapQuantity()!=0){
         int deductMap = Items.getMapQuantity();
         deductMap = deductMap - 1;
         Items.setExtraLifeQuantity(deductMap);
        }else{
            System.out.println("\nYou have no "+ item +" in your inventory");
            return;
        }
       }else if(item=="Rifle"){ 
         if(Items.getExtraLifeQuantity()!=0){
         int deductRifle = Items.getRifleQuantity();
         deductRifle = deductRifle - 1;
         Items.setExtraLifeQuantity(deductRifle);
         }else{
            System.out.println("\nYou have no "+ item +" in your inventory");
            return;
       }
       }else if(item=="Bullets"){ 
         if(Items.getBulletsQuantity()!=0){
         int deductBullets = Items.getBulletsQuantity();
         deductBullets = deductBullets - 1;
         Items.setExtraLifeQuantity(deductBullets);
         }else{
            System.out.println("\nYou have no "+ item +" in your inventory");
            return;
         }
       }else if(item=="Knife"){  
         if(Items.getKnifeQuantity()!=0){
         int deductKnife = Items.getKnifeQuantity();
         deductKnife = deductKnife - 1;
         Items.setExtraLifeQuantity(deductKnife);
         }else{
            System.out.println("\nYou have no "+ item +" in your inventory");
            return;
       }
       }else if(item=="Meat"){ 
         if(Items.getMeatQuantity()!=0){
         int deductMeat = Items.getMeatQuantity();
         deductMeat = deductMeat - 1;
         Items.setExtraLifeQuantity(deductMeat);
         }else{
            System.out.println("\nYou have no "+ item +" in your inventory");
            return;
         }
       }else if(item=="ExtraLife"){ 
         if(Items.getExtraLifeQuantity()!=0){
         int deductExtraLife = Items.getExtraLifeQuantity();
         deductExtraLife = deductExtraLife - 1;
         Items.setExtraLifeQuantity(deductExtraLife);
         }else{
            System.out.println("\nYou have no "+ item +" in your inventory");
            return;
         }
       }else{
            System.out.println("\nItem does not exist");
            return;
       }
         
            if(Items.getItem1() == ""){
                Items.setItem1(item);
                System.out.println(item+" assigned to Item1");
            }else if(Items.getItem2()==""){
                Items.setItem2(item); 
                System.out.println(item+" assigned to Item2");
            }else if(Items.getItem3()==""){
                Items.setItem3(item); 
                System.out.println(item+" assigned to Item3");
            }else{
                this.overWriteItem(item);
            }
    
        
   
    }

    public void overWriteItem(String item){
        
        System.out.println("\nAll item slots are full");
        System.out.println("\nDo you wish to overwrite? (Y for Yes | N for No)");
        Scanner overWrite = new Scanner(System.in);
        String overWriteChoice = "";
        boolean checker = false;
         
                    
        while(!checker){    
            
            overWriteChoice = overWrite.nextLine();
            overWriteChoice = overWriteChoice.trim();
            overWriteChoice = overWriteChoice.toUpperCase();
            System.out.println("You Chose: "+overWriteChoice);    
            
            switch (overWriteChoice) {
            case "Y": // create and start a new game
                System.out.println("\nItem1 was overwritten, note that Item1 will always be overwritten");
                Items.setItem1(item);
                
                break;
            case "N": // get and start an existing game
                 System.out.println("\nNothing was changed");
                
                break;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                continue;
            }
                
            break;
        }
    }
    
}
