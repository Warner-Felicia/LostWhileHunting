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
                
       System.out.println("The item generated is: "+item);
       return item;
    }
    
    
}
