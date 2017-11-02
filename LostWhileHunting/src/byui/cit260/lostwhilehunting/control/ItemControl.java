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
       Items.setItem1(item);
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
                meatAmount++;
                Items.setMeatQuantity(meatAmount);
                System.out.println("You have "+Items.getMeatQuantity()+" "+Items.getMeat());  
                
                break;
            case "Rifle":
                
                itemId=2;
                rifleAmount++;
                Items.setRifleQuantity(rifleAmount);
                System.out.println("You have "+Items.getRifleQuantity()+" "+Items.getRifle());
                
                break;
            case "Bullets":
                
                itemId=3;
                bulletAmount++;
                Items.setBulletsQuantity(bulletAmount);
                System.out.println("You have "+Items.getBulletsQuantity()+" "+Items.getBullets());
                
                break;
            case "Map":
                
                itemId=4;
                mapAmount++;
                Items.setMapQuantity(mapAmount);
                System.out.println("You have "+Items.getMapQuantity()+" "+Items.getMap());
                
                break;
                
            case "ExtraLife":
                
                itemId=5;
                extraLifeAmount++;
                Items.setExtraLifeQuantity(extraLifeAmount);
                System.out.println("You have "+Items.getExtraLifeQuantity()+" "+Items.getExtraLife());
                
                break;
                
            case "Knife":
                
                itemId=6;
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

    
    
}


