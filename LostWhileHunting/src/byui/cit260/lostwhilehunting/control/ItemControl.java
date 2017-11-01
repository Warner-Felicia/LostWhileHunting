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
        
       /* switch(itemSpawn){
            case 1: item = "Meat";
            break;
            case 2: item = "Gun";
            break;
            case 3: item = "Bullets";
            break;
            case 4: item = "Map";
            break;
            case 5: item = "ExtraLife";
            break;
            case 6: item = "Knife";
            break;
            default: item = "invalid number";
            break;
        }*/
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

    public void overWriteItem(String item){
        
        System.out.println("\nAll item slots are full");
        System.out.println("\nDo you wish to overwrite? (Y for Yes | N for No)");
        Scanner overWrite = new Scanner(System.in);
        String overWriteChoice = "";
        boolean checker = false;
         
        overWriteChoice = overWrite.nextLine();
               
        while(!checker){    
                
            if (overWriteChoice.length() < 1 || overWriteChoice.toUpperCase() != "Y" || overWriteChoice.toUpperCase() != "N") {
                System.out.println("\nInvalid value: value can not be blank");
                continue;
            }else if(overWriteChoice.toUpperCase() == "Y"){
                System.out.println("\nItem1 was overwritten, note that Item1 will always be overwritten");
                Items.setItem1(item);
            }else{
                return;
            }
                
            break;
        }
    }
    
}


