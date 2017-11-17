/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.lostwhilehunting.view;

import byui.cit260.lostwhilehunting.control.ItemControl;
import byui.cit260.lostwhilehunting.model.ItemType;
import byui.cit260.lostwhilehunting.model.Items;
import java.util.Scanner;
import lostwhilehunting.LostWhileHunting;

/**
 *
 * @author Administrator
 */
public class EquipItemView extends View{
    
    GameMenuView gamemenu = new GameMenuView();
    ItemControl itemcontrol= new ItemControl();
    private String menu;

    public EquipItemView() {
        super("\n"
                    + "\n----------------------------------------------"
                    + "\n| Equip Items                                |"
                    + "\n----------------------------------------------"
                    + "\nR - Equip Rifle "+LostWhileHunting.getCurrentGame().getItems().get(ItemType.rifle.ordinal()).getQuantityInStock()
                    + "\nB - Equip Bullets "+LostWhileHunting.getCurrentGame().getItems().get(ItemType.bullets.ordinal()).getQuantityInStock()
                    + "\nK - Equip Knife "+LostWhileHunting.getCurrentGame().getItems().get(ItemType.knife.ordinal()).getQuantityInStock()
                    + "\nM - Equip Map "+LostWhileHunting.getCurrentGame().getItems().get(ItemType.map.ordinal()).getQuantityInStock()
                    + "\nN - Equip Meat "+LostWhileHunting.getCurrentGame().getItems().get(ItemType.meat.ordinal()).getQuantityInStock()
                    + "\nE - Equip ExtraLife "+LostWhileHunting.getCurrentGame().getItems().get(ItemType.extraLife.ordinal()).getQuantityInStock()
                    + "\nQ - Quit"
                    + "\n---------------------------------------------");
        
    }
      
    
    
    @Override
    public boolean doAction(String choice) {
       
        choice = choice.toUpperCase(); // convert choice to upper case
        
        switch (choice) {
            case "R": // create and start a new game
                itemcontrol.equipItem("Rifle");
                
                break;
            case "B": // get and start an existing game
                itemcontrol.equipItem("Bullets");
                
                break;
            case "K": // display the help menu
                itemcontrol.equipItem("Knife");
                
                break;
            case "M": // save the current game
                itemcontrol.equipItem("Map");
                
                break;
            case "N": // save the current game
                itemcontrol.equipItem("Meat");
                
                break;
            case "E": // save the current game
                itemcontrol.equipItem("ExtraLife");
                
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
