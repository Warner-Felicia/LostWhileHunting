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
import java.util.Scanner;
import lostwhilehunting.LostWhileHunting;

public class ItemControl {
    
         
     private int itemId = 0;
     private int meatAmount = 0;
     private int knifeAmount = 0;
     private int rifleAmount = 0;
     private int bulletAmount = 0;
     private int mapAmount = 0;
     private int extraLifeAmount = 0;
     public static boolean searchAvailable = true;
   
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
                   
                    break;
            }
            //Ensure that an is used before the E and a before others
            System.out.println();
            if("ExtraLife".equals(item)){
                System.out.println("You found an: "+item);
            }else{
                System.out.println("You found a: "+item);
            }
        }
        else{ System.out.println("Search yielded nothing");
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
        System.out.println(itemSpawn);
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
               
                 break;
         }
        
       
       System.out.println();
       if("ExtraLife".equals(item)){
           System.out.println("You found an: "+item);
       }else{
       System.out.println("You found a: "+item);
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
                System.out.println("You have "
                                  +LostWhileHunting.getCurrentGame().getItems().get(ItemType.meat.ordinal()).getQuantityInStock()
                                  +" "
                                  +LostWhileHunting.getCurrentGame().getItems().get(ItemType.meat.ordinal()).getInventoryType());  
                
                break;
            case "Rifle":
                
                itemId=2;
                rifleAmount=LostWhileHunting.getCurrentGame().getItems().get(ItemType.rifle.ordinal()).getQuantityInStock();
                rifleAmount++;
                LostWhileHunting.getCurrentGame().getItems().get(ItemType.rifle.ordinal()).setQuantityInStock(rifleAmount);
                System.out.println("You have "
                                  +LostWhileHunting.getCurrentGame().getItems().get(ItemType.rifle.ordinal()).getQuantityInStock()
                                  +" "
                                  +LostWhileHunting.getCurrentGame().getItems().get(ItemType.rifle.ordinal()).getInventoryType());  
                
                break;
            case "Bullets":
                
                itemId=3;
                bulletAmount=LostWhileHunting.getCurrentGame().getItems().get(ItemType.bullets.ordinal()).getQuantityInStock();
                bulletAmount++;
                LostWhileHunting.getCurrentGame().getItems().get(ItemType.bullets.ordinal()).setQuantityInStock(bulletAmount);
                System.out.println("You have "
                                  +LostWhileHunting.getCurrentGame().getItems().get(ItemType.bullets.ordinal()).getQuantityInStock()
                                  +" "
                                  +LostWhileHunting.getCurrentGame().getItems().get(ItemType.bullets.ordinal()).getInventoryType());  
                
                break;
            case "Map":
                
                itemId=4;
                mapAmount=LostWhileHunting.getCurrentGame().getItems().get(ItemType.map.ordinal()).getQuantityInStock();
                mapAmount++;
                LostWhileHunting.getCurrentGame().getItems().get(ItemType.map.ordinal()).setQuantityInStock(mapAmount);
                System.out.println("You have "
                                  +LostWhileHunting.getCurrentGame().getItems().get(ItemType.map.ordinal()).getQuantityInStock()
                                  +" "
                                  +LostWhileHunting.getCurrentGame().getItems().get(ItemType.map.ordinal()).getInventoryType());
                
                break;
                
            case "ExtraLife":
                
                itemId=5;
                extraLifeAmount=LostWhileHunting.getCurrentGame().getItems().get(ItemType.extraLife.ordinal()).getQuantityInStock();
                extraLifeAmount++;
                LostWhileHunting.getCurrentGame().getItems().get(ItemType.extraLife.ordinal()).setQuantityInStock(extraLifeAmount);
                System.out.println("You have "
                                  +LostWhileHunting.getCurrentGame().getItems().get(ItemType.extraLife.ordinal()).getQuantityInStock()
                                  +" "
                                  +LostWhileHunting.getCurrentGame().getItems().get(ItemType.extraLife.ordinal()).getInventoryType());
                
                break;
                
            case "Knife":
                
                itemId=6;
                knifeAmount=LostWhileHunting.getCurrentGame().getItems().get(ItemType.knife.ordinal()).getQuantityInStock();
                knifeAmount++;
                LostWhileHunting.getCurrentGame().getItems().get(ItemType.knife.ordinal()).setQuantityInStock(knifeAmount);
                System.out.println("You have "
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
        
        if(item==null)
            throw new ItemControlException("No Item was equipped. Reload Program to see if that fixes error");
        
       if(item=="Map"){ 
        if(LostWhileHunting.getCurrentGame().getItems().get(ItemType.map.ordinal()).getQuantityInStock()!=0){
         int deductMap = LostWhileHunting.getCurrentGame().getItems().get(ItemType.map.ordinal()).getQuantityInStock();
         deductMap = deductMap - 1;
         LostWhileHunting.getCurrentGame().getItems().get(ItemType.map.ordinal()).setQuantityInStock(deductMap);
        }else{
            System.out.println("\nYou have no "+ item +" in your inventory");
            return;
        }
       }else if(item=="Rifle"){ 
         if(LostWhileHunting.getCurrentGame().getItems().get(ItemType.rifle.ordinal()).getQuantityInStock()!=0){
         int deductRifle = LostWhileHunting.getCurrentGame().getItems().get(ItemType.rifle.ordinal()).getQuantityInStock();
         deductRifle = deductRifle - 1;
         LostWhileHunting.getCurrentGame().getItems().get(ItemType.rifle.ordinal()).setQuantityInStock(deductRifle);
         }else{
            System.out.println("\nYou have no "+ item +" in your inventory");
            return;
       }
       }else if(item=="Bullets"){ 
         if(LostWhileHunting.getCurrentGame().getItems().get(ItemType.bullets.ordinal()).getQuantityInStock()!=0){
         int deductBullets = LostWhileHunting.getCurrentGame().getItems().get(ItemType.bullets.ordinal()).getQuantityInStock();
         deductBullets = deductBullets - 1;
         LostWhileHunting.getCurrentGame().getItems().get(ItemType.bullets.ordinal()).setQuantityInStock(deductBullets);
         }else{
            System.out.println("\nYou have no "+ item +" in your inventory");
            return;
         }
       }else if(item=="Knife"){  
         if(LostWhileHunting.getCurrentGame().getItems().get(ItemType.knife.ordinal()).getQuantityInStock()!=0){
         int deductKnife = LostWhileHunting.getCurrentGame().getItems().get(ItemType.knife.ordinal()).getQuantityInStock();
         deductKnife = deductKnife - 1;
         LostWhileHunting.getCurrentGame().getItems().get(ItemType.knife.ordinal()).setQuantityInStock(deductKnife);
         }else{
            System.out.println("\nYou have no "+ item +" in your inventory");
            return;
       }
       }else if(item=="Meat"){ 

           if(LostWhileHunting.getCurrentGame().getItems().get(ItemType.meat.ordinal()).getQuantityInStock()!=0){
         int deductMeat = LostWhileHunting.getCurrentGame().getItems().get(ItemType.meat.ordinal()).getQuantityInStock();
         deductMeat = deductMeat - 1;
         LostWhileHunting.getCurrentGame().getItems().get(ItemType.meat.ordinal()).setQuantityInStock(deductMeat);
         }else{
            System.out.println("\nYou have no "+ item +" in your inventory");
            return;
         }
       }else if(item=="ExtraLife"){ 
         if(LostWhileHunting.getCurrentGame().getItems().get(ItemType.extraLife.ordinal()).getQuantityInStock()!=0){
         int deductExtraLife = LostWhileHunting.getCurrentGame().getItems().get(ItemType.extraLife.ordinal()).getQuantityInStock();
         deductExtraLife = deductExtraLife - 1;
         LostWhileHunting.getCurrentGame().getItems().get(ItemType.extraLife.ordinal()).setQuantityInStock(deductExtraLife);
         }else{
            System.out.println("\nYou have no "+ item +" in your inventory");
            return;
         }
       }else{
            throw new ItemControlException("No Item by that name exists, Software restart needed");
         
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

    private void overWriteItem(String item) throws ItemControlException{
        
        if(item==null)
            throw new ItemControlException("No Item was assigned. Reload Program to see if that fixes error");
        
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


