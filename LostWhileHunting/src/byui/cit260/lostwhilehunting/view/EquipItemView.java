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
                    + "\nR - Equip Rifle "+Items.getRifleQuantity()
                    + "\nB - Equip Bullets "+Items.getBulletsQuantity()
                    + "\nK - Equip Knife "+Items.getKnifeQuantity()
                    + "\nM - Equip Map "+Items.getMapQuantity()
                    + "\nN - Equip Meat "+Items.getMeatQuantity()
                    + "\nE - Equip ExtraLife "+Items.getExtraLifeQuantity()
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
        
         int deductMap=0;
         int deductRifle=0;
         int deductBullets=0;
         int deductKnife=0;
         int deductMeat=0;
         int deductExtraLife=0;
         
       if(null == item){
           System.out.println("\nItem does not exist");
       }else switch (item) {
            case "Map":
                if(Items.getMapQuantity()!=0){
                    deductMap = Items.getMapQuantity();
                    deductMap--;
                    Items.setMapQuantity(deductMap);
                    this.assigntoSlot(item);
                }else{
                    System.out.println("\nYou have no "+ item +" in your inventory");
                }       break;
            case "Rifle":
                if(Items.getRifleQuantity()!=0){
                    deductRifle = Items.getRifleQuantity();
                    deductRifle--;
                    Items.setRifleQuantity(deductRifle);
                    this.assigntoSlot(item);
                }else{
                    System.out.println("\nYou have no "+ item +" in your inventory");
                }        break;
            case "Bullets":
                if(Items.getBulletsQuantity()!=0){
                    deductBullets = Items.getBulletsQuantity();
                    deductBullets--;
                    Items.setBulletsQuantity(deductBullets);
                    this.assigntoSlot(item);
                }else{
                    System.out.println("\nYou have no "+ item +" in your inventory");
                }      break;
            case "Knife":
                if(Items.getKnifeQuantity()!=0){
                    deductKnife = Items.getKnifeQuantity();
                    deductKnife--;
                    Items.setKnifeQuantity(deductKnife);
                    this.assigntoSlot(item);
                }else{
                    System.out.println("\nYou have no "+ item +" in your inventory");
                }        break;
            case "Meat":
                if(Items.getMeatQuantity()!=0){
                    deductMeat = Items.getMeatQuantity();
                    deductMeat--;
                    Items.setMeatQuantity(deductMeat);
                    this.assigntoSlot(item);
                }else{
                    System.out.println("\nYou have no "+ item +" in your inventory");
                }      break;
            case "ExtraLife":
                if(Items.getExtraLifeQuantity()!=0){
                    deductExtraLife = Items.getExtraLifeQuantity();
                    deductExtraLife--;
                    Items.setExtraLifeQuantity(deductExtraLife);
                    this.assigntoSlot(item);
                }else{
                    System.out.println("\nYou have no "+ item +" in your inventory");
                }      break;
            default:
                System.out.println("\nItem does not exist");
                break;
        }
         
      
   
    }
     
    public void assigntoSlot(String item){
        if("".equals(Items.getItem1())){
                Items.setItem1(item);
                System.out.println(item+" assigned to Item1");
            }else if("".equals(Items.getItem2())){
                Items.setItem2(item); 
                System.out.println(item+" assigned to Item2");
            }else if("".equals(Items.getItem3())){
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
