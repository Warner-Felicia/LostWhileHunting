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
                    + "\nG - Equip Rifle"
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
            case "G": // create and start a new game
                this.equipRifle();
                
                break;
            case "B": // get and start an existing game
                this.equipBullets();
                
                break;
            case "K": // display the help menu
                this.equipKnife();
                
                break;
            case "M": // save the current game
                this.equipMap();
                
                break;
            case "N": // save the current game
                this.equipMeat();
                
                break;
            case "E": // save the current game
                this.equipExtraLife();
                
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

    private void equipRifle() {
        
        if(Items.getExtraLifeQuantity()!=0){
         int deductRifle = Items.getRifleQuantity();
         deductRifle = deductRifle - 1;
         Items.setExtraLifeQuantity(deductRifle);
         
            if(Items.getItem1() == ""){
                Items.setItem1("Rifle");
            }else if(Items.getItem2()==""){
                Items.setItem2("Rifle"); 
            }else if(Items.getItem3()==""){
                Items.setItem3("Rifle"); 
            }else{
                
                itemcontrol.overWriteItem("Rifle");
                
            }
            
    
        }else{
            System.out.println("\nSeriously? You know that item is empty right");
        }
    }

    private void equipBullets() {
        
        if(Items.getBulletsQuantity()!=0){
         int deductBullets = Items.getBulletsQuantity();
         deductBullets = deductBullets - 1;
         Items.setExtraLifeQuantity(deductBullets);
         
            if(Items.getItem1() == ""){
                Items.setItem1("Bullets");
            }else if(Items.getItem2()==""){
                Items.setItem2("Bullets"); 
            }else if(Items.getItem3()==""){
                Items.setItem3("Bullets"); 
            }else{
                itemcontrol.overWriteItem("Bullets");
            }
    
        }else{
            System.out.println("\nSeriously? You know that item is empty right");
        }
    }

    private void equipKnife() {
        
        if(Items.getKnifeQuantity()!=0){
         int deductKnife = Items.getKnifeQuantity();
         deductKnife = deductKnife - 1;
         Items.setExtraLifeQuantity(deductKnife);
         
            if(Items.getItem1() == ""){
                Items.setItem1("Knife");
            }else if(Items.getItem2()==""){
                Items.setItem2("Knife"); 
            }else if(Items.getItem3()==""){
                Items.setItem3("Knife"); 
            }else{
                itemcontrol.overWriteItem("Knife");
            }
    
        }else{
            System.out.println("\nSeriously? You know that item is empty right");
        }
    }

    private void equipMap() {
        
        if(Items.getMapQuantity()!=0){
         int deductMap = Items.getMapQuantity();
         deductMap = deductMap - 1;
         Items.setExtraLifeQuantity(deductMap);
         
            if(Items.getItem1() == ""){
                Items.setItem1("Map");
            }else if(Items.getItem2()==""){
                Items.setItem2("Map"); 
            }else if(Items.getItem3()==""){
                Items.setItem3("Map"); 
            }else{
                itemcontrol.overWriteItem("Map");
            }
    
        }else{
            System.out.println("\nSeriously? You know that item is empty right");
        }
        
    }

    private void equipMeat() {
        
        if(Items.getMeatQuantity()!=0){
         int deductMeat = Items.getMeatQuantity();
         deductMeat = deductMeat - 1;
         Items.setExtraLifeQuantity(deductMeat);
         
            if(Items.getItem1() == ""){
                Items.setItem1("Meat");
            }else if(Items.getItem2()==""){
                Items.setItem2("Meat"); 
            }else if(Items.getItem3()==""){
                Items.setItem3("Meat"); 
            }else{
                itemcontrol.overWriteItem("Meat");
            }
    
        }else{
            System.out.println("\nSeriously? You know that item is empty right");
        }
    }

    private void equipExtraLife() {
     
        if(Items.getExtraLifeQuantity()!=0){
         int deductExtraLife = Items.getExtraLifeQuantity();
         deductExtraLife = deductExtraLife - 1;
         Items.setExtraLifeQuantity(deductExtraLife);
         
            if(Items.getItem1() == ""){
                Items.setItem1("ExtraLife");
            }else if(Items.getItem2()==""){
                Items.setItem2("ExtraLife"); 
            }else if(Items.getItem3()==""){
                Items.setItem3("ExtraLife"); 
            }else{
                itemcontrol.overWriteItem("ExtraLife");
            }
    
        }else{
            System.out.println("\nSeriously? You know that item is empty right");
        }
    }
    
}