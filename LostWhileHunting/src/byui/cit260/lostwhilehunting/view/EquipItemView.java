/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.lostwhilehunting.view;

import byui.cit260.lostwhilehunting.control.ItemControl;
import byui.cit260.lostwhilehunting.exceptions.ItemControlException;
import byui.cit260.lostwhilehunting.model.Game;
import byui.cit260.lostwhilehunting.model.ItemType;
import byui.cit260.lostwhilehunting.model.Items;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Serializable;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import lostwhilehunting.LostWhileHunting;

/**
 *
 * @author Trevon Morris
 */
public class EquipItemView extends View implements Serializable{
    
    GameMenuView gamemenu = new GameMenuView();
    ItemControl itemcontrol= new ItemControl();
    private String menu;
    PrintWriter console = LostWhileHunting.getOutFile();

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
       this.console.println("You had overall "+ this.sumItems()+ " items");
        choice = choice.toUpperCase(); // convert choice to upper case
        
        switch (choice) {
            case "R": {
           try {
               // create and start a new game
               itemcontrol.equipItem("Rifle");
           } catch (ItemControlException ex) {
               ErrorView.display(this.getClass().getName(), ex.getMessage());
           }
       }
                
                break;
            case "B": {
           try {
               // get and start an existing game
               itemcontrol.equipItem("Bullets");
           } catch (ItemControlException ex) {
               ErrorView.display(this.getClass().getName(), ex.getMessage());
           }
       }
                
                break;
            case "K": {
           try {
               // display the help menu
               itemcontrol.equipItem("Knife");
           } catch (ItemControlException ex) {
              ErrorView.display(this.getClass().getName(), ex.getMessage());
           }
       }
                
                break;
            case "M": {
           try {
               // save the current game
               itemcontrol.equipItem("Map");
           } catch (ItemControlException ex) {
              ErrorView.display(this.getClass().getName(), ex.getMessage());
           }
       }
                
                break;
            case "N": {
           try {
               // save the current game
               itemcontrol.equipItem("Meat");
           } catch (ItemControlException ex) {
              ErrorView.display(this.getClass().getName(), ex.getMessage());
           }
       }
                
                break;
            case "E": {
           try {
               // save the current game
               itemcontrol.equipItem("ExtraLife");
           } catch (ItemControlException ex) {
               ErrorView.display(this.getClass().getName(), ex.getMessage());
           }
       }
                
                break;
            case "Q": // exit
                this.console.println("\nExiting");
                return true;
            default:
                this.console.println("\n*** Invalid selection *** Try again");
                break;
        }
        this.console.println("You now have "+ this.sumItems()+ " items in Inventory");
        return true;
    }
    
   
     
    public void assigntoSlot(String item){
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

    public void overWriteItem(String item){
        
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
            } 
            catch (IOException ex) {
                ErrorView.display(this.getClass().getName(), "Error reading from keyboard.");
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
                this.console.println("\n*** Invalid selection *** Try again");
                continue;
            }
                
            break;
        }
    }
    
    private int sumItems(){
        
        Game sumItems = LostWhileHunting.getCurrentGame();
        int range = sumItems.getItems().size() - 1;
        int total=0;
        
        for(int i=0; i <= range; i++){
            total += sumItems.getItems().get(i).getQuantityInStock();
            
        }
        
        return total;
    }
    
}
