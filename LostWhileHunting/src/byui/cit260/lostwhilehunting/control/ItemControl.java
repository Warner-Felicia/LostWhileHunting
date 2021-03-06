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
import byui.cit260.lostwhilehunting.model.ItemType;
import byui.cit260.lostwhilehunting.model.Items;
import byui.cit260.lostwhilehunting.view.ErrorView;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Serializable;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import lostwhilehunting.LostWhileHunting;

public class ItemControl implements Serializable{
    
         
     private int itemId = 0;
     private int meatAmount = 0;
     private int knifeAmount = 0;
     private int rifleAmount = 0;
     private int bulletAmount = 0;
     private int mapAmount = 0;
     private int extraLifeAmount = 0;
     public static boolean searchAvailable = true;
     private PrintWriter console = LostWhileHunting.getOutFile();
     
   
    public String searchLocation() throws ItemControlException{
        
        String item = "";
        int itemSpawn = 0;
        int searchChance = 0;
        
        searchAvailable = false;
     
        searchChance = (int) (Math.floor(Math.random()*10));
        
        //placed brackets around the Mathh.Random section
        itemSpawn = (int) (Math.floor(Math.random()*6));
        if(searchChance <= 2){
            switch (itemSpawn) {
                case 1:
                    item = "Meat";
                    break;
                case 2:
                    item = "Rifle";
                    break;
                case 3:
                    item = "Bullets";
                    break;
                case 4:
                    item = "Map";
                    break;
                case 5:
                    item = "ExtraLife";
                    break;
                case 6:
                    item = "Knife";
                    break;
                default:
                    item = "ExtraLife";
                    break;
            }
            //Ensure that an is used before the E and a before others
            this.console.println();
            if("ExtraLife".equals(item)){
                this.console.println("You found an: "+item);
            }else{
                this.console.println("You found a: "+item);
            }
        }
        else{ this.console.println("Search yielded nothing");
        return "";
        }
        
        if(item==null)
            throw new ItemControlException("No Item was assigned. Reload Program to see if that fixes error");
                  
       this.addToInventory(item);
       
       return item;
    } 
     
    public String generateItemFromItems() throws ItemControlException{
        
        String item="";
        int itemSpawn;
        
        itemSpawn = (int) (Math.floor(Math.random()*6));
        
         switch (itemSpawn) {
             case 1:
                 item = "Meat";
                 break;
             case 2:
                 item = "Rifle";
                 break;
             case 3:
                 item = "Bullets";
                 break;
             case 4:
                 item = "Map";
                 break;
             case 5:
                 item = "ExtraLife";
                 break;
             case 6:
                 item = "Knife";
                 break;
             default:
                 item = "ExtraLife";
                 break;
         }
        
       
       this.console.println();
       if("ExtraLife".equals(item)){
           this.console.println("You found an: "+item);
       }else{
       this.console.println("You found a: "+item);
       }
       
       if(item==null)
            throw new ItemControlException("No Item was assigned. Reload Program to see if that fixes error");
       
       Items.setItem1(item);
       this.addToInventory(item);
       
       return item;
    }
    
    public int addToInventory(String newItem) throws ItemControlException{      
        
        if(newItem==null)
            throw new ItemControlException("No Item was passed to inventory. Reload Program to see if that fixes error");
        
        switch(newItem){
            case "Meat":
                
                itemId=1;
                meatAmount=LostWhileHunting.getCurrentGame().getItems().get(ItemType.meat.ordinal()).getQuantityInStock();
                meatAmount++;
                LostWhileHunting.getCurrentGame().getItems().get(ItemType.meat.ordinal()).setQuantityInStock(meatAmount);
                this.console.println("You have "
                                  +LostWhileHunting.getCurrentGame().getItems().get(ItemType.meat.ordinal()).getQuantityInStock()
                                  +" "
                                  +LostWhileHunting.getCurrentGame().getItems().get(ItemType.meat.ordinal()).getInventoryType());  
                
                break;
            case "Rifle":
                
                itemId=2;
                rifleAmount=LostWhileHunting.getCurrentGame().getItems().get(ItemType.rifle.ordinal()).getQuantityInStock();
                rifleAmount++;
                LostWhileHunting.getCurrentGame().getItems().get(ItemType.rifle.ordinal()).setQuantityInStock(rifleAmount);
                this.console.println("You have "
                                  +LostWhileHunting.getCurrentGame().getItems().get(ItemType.rifle.ordinal()).getQuantityInStock()
                                  +" "
                                  +LostWhileHunting.getCurrentGame().getItems().get(ItemType.rifle.ordinal()).getInventoryType());  
                
                break;
            case "Bullets":
                
                itemId=3;
                bulletAmount=LostWhileHunting.getCurrentGame().getItems().get(ItemType.bullets.ordinal()).getQuantityInStock();
                bulletAmount++;
                LostWhileHunting.getCurrentGame().getItems().get(ItemType.bullets.ordinal()).setQuantityInStock(bulletAmount);
                this.console.println("You have "
                                  +LostWhileHunting.getCurrentGame().getItems().get(ItemType.bullets.ordinal()).getQuantityInStock()
                                  +" "
                                  +LostWhileHunting.getCurrentGame().getItems().get(ItemType.bullets.ordinal()).getInventoryType());  
                
                break;
            case "Map":
                
                itemId=4;
                mapAmount=LostWhileHunting.getCurrentGame().getItems().get(ItemType.map.ordinal()).getQuantityInStock();
                mapAmount++;
                LostWhileHunting.getCurrentGame().getItems().get(ItemType.map.ordinal()).setQuantityInStock(mapAmount);
                this.console.println("You have "
                                  +LostWhileHunting.getCurrentGame().getItems().get(ItemType.map.ordinal()).getQuantityInStock()
                                  +" "
                                  +LostWhileHunting.getCurrentGame().getItems().get(ItemType.map.ordinal()).getInventoryType());
                
                break;
                
            case "ExtraLife":
                
                itemId=5;
                extraLifeAmount=LostWhileHunting.getCurrentGame().getItems().get(ItemType.extraLife.ordinal()).getQuantityInStock();
                extraLifeAmount++;
                LostWhileHunting.getCurrentGame().getItems().get(ItemType.extraLife.ordinal()).setQuantityInStock(extraLifeAmount);
                this.console.println("You have "
                                  +LostWhileHunting.getCurrentGame().getItems().get(ItemType.extraLife.ordinal()).getQuantityInStock()
                                  +" "
                                  +LostWhileHunting.getCurrentGame().getItems().get(ItemType.extraLife.ordinal()).getInventoryType());
                
                break;
                
            case "Knife":
                
                itemId=6;
                knifeAmount=LostWhileHunting.getCurrentGame().getItems().get(ItemType.knife.ordinal()).getQuantityInStock();
                knifeAmount++;
                LostWhileHunting.getCurrentGame().getItems().get(ItemType.knife.ordinal()).setQuantityInStock(knifeAmount);
                this.console.println("You have "
                                  +LostWhileHunting.getCurrentGame().getItems().get(ItemType.knife.ordinal()).getQuantityInStock()
                                  +" "
                                  +LostWhileHunting.getCurrentGame().getItems().get(ItemType.knife.ordinal()).getInventoryType());
                              
                break;
                
            default:
                
                break;
            
        }
        int nonprivateint = itemId;
              
        return nonprivateint;
    }

    public void equipItem(String item) throws ItemControlException{
        
        int mapAmount=LostWhileHunting.getCurrentGame().getItems().get(ItemType.map.ordinal()).getQuantityInStock();
        int rifleAmount=LostWhileHunting.getCurrentGame().getItems().get(ItemType.rifle.ordinal()).getQuantityInStock();
        int bulletsAmount=LostWhileHunting.getCurrentGame().getItems().get(ItemType.bullets.ordinal()).getQuantityInStock();
        int knifeAmount=LostWhileHunting.getCurrentGame().getItems().get(ItemType.knife.ordinal()).getQuantityInStock();
        int meatAmount=LostWhileHunting.getCurrentGame().getItems().get(ItemType.meat.ordinal()).getQuantityInStock();
        int extraLifeAmount=LostWhileHunting.getCurrentGame().getItems().get(ItemType.extraLife.ordinal()).getQuantityInStock();
        
        if(item==null)
            throw new ItemControlException("No Item was equipped. Reload Program to see if that fixes error");
        
         switch (item) {
             case "Map":
                 if(mapAmount != 0){
                     int deductMap = mapAmount;
                     deductMap = deductMap - 1;
                     LostWhileHunting.getCurrentGame().getItems().get(ItemType.map.ordinal()).setQuantityInStock(deductMap);
                 }else{
                     this.console.println("\nYou have no "+ item +" in your inventory");
                     return;
                 }        break;
             case "Rifle":
                 if(rifleAmount != 0){
                     int deductRifle = rifleAmount;
                     deductRifle = deductRifle - 1;
                     LostWhileHunting.getCurrentGame().getItems().get(ItemType.rifle.ordinal()).setQuantityInStock(deductRifle);
                 }else{
                     this.console.println("\nYou have no "+ item +" in your inventory");
                     return;
                 }         break;
             case "Bullets":
                 if(bulletsAmount != 0){
                     int deductBullets = bulletsAmount;
                     deductBullets = deductBullets - 1;
                     LostWhileHunting.getCurrentGame().getItems().get(ItemType.bullets.ordinal()).setQuantityInStock(deductBullets);
                 }else{
                     this.console.println("\nYou have no "+ item +" in your inventory");
                     return;
                 }       break;
             case "Knife":
                 if(knifeAmount != 0){
                     int deductKnife = knifeAmount;
                     deductKnife = deductKnife - 1;
                     LostWhileHunting.getCurrentGame().getItems().get(ItemType.knife.ordinal()).setQuantityInStock(deductKnife);
                 }else{
                     this.console.println("\nYou have no "+ item +" in your inventory");
                     return;
                 }         break;
             case "Meat":
                 if(meatAmount != 0){
                     int deductMeat = meatAmount;
                     deductMeat = deductMeat - 1;
                     LostWhileHunting.getCurrentGame().getItems().get(ItemType.meat.ordinal()).setQuantityInStock(deductMeat);
                 }else{
                     this.console.println("\nYou have no "+ item +" in your inventory");
                     return;
                 }       break;
             case "ExtraLife":
                 if(extraLifeAmount != 0){
                     int deductExtraLife = extraLifeAmount;
                     deductExtraLife = deductExtraLife - 1;
                     LostWhileHunting.getCurrentGame().getItems().get(ItemType.extraLife.ordinal()).setQuantityInStock(deductExtraLife);
                 }else{
                     this.console.println("\nYou have no "+ item +" in your inventory");
                     return;
                 }       break;
             default:
                 ErrorView.display(this.getClass().getName(), "\n*** No Item by that name exists, Software restart needed *** Restart Game");
                 throw new ItemControlException("No Item by that name exists, Software restart needed");
                 
         }
         
            if("".equals(Items.getItem1())){
                Items.setItem1(item);
                this.console.println(item+" assigned to Item1");
            }else if("".equals(Items.getItem2())){
                Items.setItem2(item); 
                this.console.println(item+" assigned to Item2");
            }else if("".equals(Items.getItem3())){
                Items.setItem3(item); 
                this.console.println(item+" assigned to Item3");
            }else{
                this.overWriteItem(item);
            }
    
        
   
    }

    private void overWriteItem(String item) throws ItemControlException{
        
        if(item==null)
            throw new ItemControlException("No Item was assigned. Reload Program to see if that fixes error");
        
        this.console.println("\nAll item slots are full");
        this.console.println("\nDo you wish to overwrite? (Y for Yes | N for No)");
        BufferedReader overWrite = LostWhileHunting.getInFile();
        String overWriteChoice = "";
        boolean checker = false;
         
                    
        while(!checker){    
            
            try {
                overWriteChoice = overWrite.readLine();
                overWriteChoice = overWriteChoice.trim();
                overWriteChoice = overWriteChoice.toUpperCase();
                this.console.println("You Chose: "+overWriteChoice); 
            } catch (IOException ex) {
                ErrorView.display(this.getClass().getName(), "Error reading "
                        + "from keyboard.");
            }
               
            
            switch (overWriteChoice) {
            case "Y": // create and start a new game
               this.console.println("\nItem1 was overwritten, note that Item1 will always be overwritten");
                Items.setItem1(item);
                
                break;
            case "N": // get and start an existing game
                 this.console.println("\nNothing was changed");
                
                break;
            default:
                ErrorView.display(this.getClass().getName(), "\n*** Invalid selection *** Try again");
                continue;
            }
                
            break;
        }
    }
    
    
}


