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

public class ItemControl {
    
     Items items = new Items();
     
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
       items.setItem1(item);
       this.viewInventory(item);
       
       return item;
    }
    
    public int viewInventory(String newItem){

                     
        
        switch(newItem){
            case "Meat":
                
                itemId=1;
                meatAmount++;
                items.setMeatQuantity(meatAmount);
                System.out.println("You have "+items.getMeatQuantity()+" "+items.getMeat());  
                
                break;
            case "Rifle":
                
                itemId=2;
                rifleAmount++;
                items.setRifleQuantity(rifleAmount);
                System.out.println("You have "+items.getRifleQuantity()+" "+items.getRifle());
                
                break;
            case "Bullets":
                
                itemId=3;
                bulletAmount++;
                items.setBulletsQuantity(bulletAmount);
                System.out.println("You have "+items.getBulletsQuantity()+" "+items.getBullets());
                
                break;
            case "Map":
                
                itemId=4;
                mapAmount++;
                items.setMapQuantity(mapAmount);
                System.out.println("You have "+items.getMapQuantity()+" "+items.getMap());
                
                break;
                
            case "ExtraLife":
                
                itemId=5;
                extraLifeAmount++;
                items.setExtraLifeQuantity(extraLifeAmount);
                System.out.println("You have "+items.getExtraLifeQuantity()+" "+items.getExtraLife());
                
                break;
                
            case "Knife":
                
                itemId=6;
                knifeAmount++;
                items.setKnifeQuantity(knifeAmount);
                System.out.println("You have "+items.getKnifeQuantity()+" "+items.getKnife());
                              
                break;
                
            default:
                
                break;
            
        }
        
        System.out.println();
        
        return itemId;
    }

    
}


