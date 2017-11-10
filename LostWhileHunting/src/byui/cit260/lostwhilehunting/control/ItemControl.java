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

import byui.cit260.lostwhilehunting.model.Items;
import java.util.Scanner;

public class ItemControl {
    
         
     private int itemId = 0;
     private int meatAmount = 0;
     private int knifeAmount = 0;
     private int rifleAmount = 0;
     private int bulletAmount = 0;
     private int mapAmount = 0;
     private int extraLifeAmount = 0;
     static boolean searchAvailable = true;
   
    public String searchLocation(){
        
        String item = "";
        double itemSpawn = 0;
        double searchChance = 0;
     
        searchChance = Math.floor(Math.random()*10);
        itemSpawn = Math.floor(Math.random()*6);
        if(searchChance <= 2){
        if(itemSpawn==1){
            item = "Meat";
        }else if (itemSpawn == 2){
            item = "Rifle";
        }else if (itemSpawn == 3){
            item = "Bullets";
        }else if (itemSpawn == 4){
            item = "Map";
        }else if (itemSpawn == 5){
            item = "ExtraLife";
        }else{
            item = "Knife";  
        }
        }
        else{ System.out.println("Search yielded nothing");
        }
        
       
       System.out.println();
       if(item == "ExtraLife"){
           System.out.println("You found an: "+item);
       }else{
       System.out.println("You found a: "+item);
       }
       
       this.viewInventory(item);
       
       return item;
    } 
     
    public String generateItemFromItems(){
        
        String item = "";
        double itemSpawn = 0;
        
        itemSpawn = Math.floor(Math.random()*6);
        
        if(itemSpawn==1){
            item = "Meat";
        }else if (itemSpawn == 2){
            item = "Rifle";
        }else if (itemSpawn == 3){
            item = "Bullets";
        }else if (itemSpawn == 4){
            item = "Map";
        }else if (itemSpawn == 5){
            item = "ExtraLife";
        }else{
            item = "Knife";  
        }
        
       
       System.out.println();
       if(item == "ExtraLife"){
           System.out.println("You found an: "+item);
       }else{
       System.out.println("You found a: "+item);
       }
       Items.setItem1(item);
       this.viewInventory(item);
       
       return item;
    }
    
    public int viewInventory(String newItem){

                     
        
        switch(newItem){
            case "Meat":
                
                itemId=1;
                meatAmount=Items.getMeatQuantity();
                meatAmount++;
                Items.setMeatQuantity(meatAmount);
                System.out.println("You have "+Items.getMeatQuantity()+" "+Items.getMeat());  
                
                break;
            case "Rifle":
                
                itemId=2;
                rifleAmount=Items.getRifleQuantity();
                rifleAmount++;
                Items.setRifleQuantity(rifleAmount);
                System.out.println("You have "+Items.getRifleQuantity()+" "+Items.getRifle());
                
                break;
            case "Bullets":
                
                itemId=3;
                bulletAmount=Items.getBulletsQuantity();
                bulletAmount++;
                Items.setBulletsQuantity(bulletAmount);
                System.out.println("You have "+Items.getBulletsQuantity()+" "+Items.getBullets());
                
                break;
            case "Map":
                
                itemId=4;
                mapAmount=Items.getMapQuantity();
                mapAmount++;
                Items.setMapQuantity(mapAmount);
                System.out.println("You have "+Items.getMapQuantity()+" "+Items.getMap());
                
                break;
                
            case "ExtraLife":
                
                itemId=5;
                extraLifeAmount=Items.getExtraLifeQuantity();
                extraLifeAmount++;
                Items.setExtraLifeQuantity(extraLifeAmount);
                System.out.println("You have "+Items.getExtraLifeQuantity()+" "+Items.getExtraLife());
                
                break;
                
            case "Knife":
                
                itemId=6;
                knifeAmount=Items.getKnifeQuantity();
                knifeAmount++;
                Items.setKnifeQuantity(knifeAmount);
                System.out.println("You have "+Items.getKnifeQuantity()+" "+Items.getKnife());
                              
                break;
                
            default:
                
                break;
            
        }
        
        System.out.println();
        
        return itemId;
    }

    public void equipItem(String item) {
         
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

    private void overWriteItem(String item){
        
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


