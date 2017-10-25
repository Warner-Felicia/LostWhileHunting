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
public class ItemControl {
    
   
    public static String generateItemFromItems(){
        String item = "";
        double itemSpawn = 0;
        
        itemSpawn = Math.floor(Math.random()*6);
        
        if(itemSpawn==1){
            item = "Meat";
        }else if (itemSpawn == 2){
            item = "Gun";
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
       System.out.println("You found a: "+item);
       return item;
    }
    
    public static int viewInventory(String newItem){

        String item1 = "";
        String item2 = "";
        String item3 = "";
        
        int itemId = 0;
        int meatAmount = 0;
        int knifeAmount = 0;
        int gunAmount = 0;
        int bulletAmount = 0;
        int mapAmount = 0;
        int extraLifeAmount = 0;
        
        String[] itmArrayName = new String[6];
        int[] itmArrayAmount = new int[6];
        
        
        switch(newItem){
            case "Meat":
                
                itemId=1;
                meatAmount++;
                itmArrayName[0]="Meat";
                itmArrayAmount[0]=meatAmount;
                System.out.println("You have "+itmArrayAmount[0]+" "+itmArrayName[0]);
                
                break;
            case "Gun":
                
                itemId=2;
                gunAmount++;
                itmArrayName[1]="Gun";
                itmArrayAmount[1]=gunAmount;
                System.out.println("You have "+itmArrayAmount[1]+" "+itmArrayName[1]);
                
                break;
            case "Bullets":
                
                itemId=3;
                bulletAmount++;
                itmArrayName[2]="Bullets";
                itmArrayAmount[2]= bulletAmount;
                System.out.println("You have "+itmArrayAmount[2]+" "+itmArrayName[2]);
                
                break;
            case "Map":
                
                itemId=4;
                mapAmount++;
                itmArrayName[3]="Map";
                itmArrayAmount[3]=mapAmount;
                System.out.println("You have "+itmArrayAmount[3]+" "+itmArrayName[3]);
                
                break;
                
            case "ExtraLife":
                
                itemId=5;
                extraLifeAmount++;
                itmArrayName[4]="ExtraLife";
                itmArrayAmount[4]=extraLifeAmount;
                System.out.println("You have "+itmArrayAmount[4]+" "+itmArrayName[4]);
                
                break;
                
            case "Knife":
                
                itemId=6;
                knifeAmount++;
                itmArrayName[5]="Knife";
                itmArrayAmount[5]=knifeAmount;
                System.out.println("You have "+itmArrayAmount[5]+" "+itmArrayName[5]);
                
                break;
                
            default:
                
                break;
            
        }
        
        System.out.println();
        
        return itemId;
    }
    
}


