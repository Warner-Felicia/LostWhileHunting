/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.lostwhilehunting.view;

import byui.cit260.lostwhilehunting.control.ItemControl;
import byui.cit260.lostwhilehunting.model.Game;
import byui.cit260.lostwhilehunting.model.InventoryItem;
import byui.cit260.lostwhilehunting.model.ItemType;
import byui.cit260.lostwhilehunting.model.Items;
import java.util.ArrayList;
import java.util.Scanner;
import lostwhilehunting.LostWhileHunting;

/**
 *
 * @author Administrator
 */
public class ViewInventoryView{
    
    ArrayList<InventoryItem> viewItems = new ArrayList<>();
    
    GameMenuView gamemenu = new GameMenuView();
    ItemControl itemcontrol= new ItemControl();
    private String menu;
    
    
    public ViewInventoryView() {
       
            this.menu="\n"
                    + "\n----------------------------------------------"
                    + "\n| Inventory Items                            |"
                    + "\n----------------------------------------------"
                    + "\n"+LostWhileHunting.getCurrentGame().getItems().get(ItemType.rifle.ordinal()).getInventoryType()+" Amount: "+LostWhileHunting.getCurrentGame().getItems().get(ItemType.rifle.ordinal()).getQuantityInStock()
                    + "\n"+LostWhileHunting.getCurrentGame().getItems().get(ItemType.bullets.ordinal()).getInventoryType()+" Amount: "+LostWhileHunting.getCurrentGame().getItems().get(ItemType.bullets.ordinal()).getQuantityInStock()
                    + "\n"+LostWhileHunting.getCurrentGame().getItems().get(ItemType.knife.ordinal()).getInventoryType()+" Amount: "+LostWhileHunting.getCurrentGame().getItems().get(ItemType.knife.ordinal()).getQuantityInStock()
                    + "\n"+LostWhileHunting.getCurrentGame().getItems().get(ItemType.map.ordinal()).getInventoryType()+" Amount: "+LostWhileHunting.getCurrentGame().getItems().get(ItemType.map.ordinal()).getQuantityInStock()
                    + "\n"+LostWhileHunting.getCurrentGame().getItems().get(ItemType.meat.ordinal()).getInventoryType()+" Amount: "+LostWhileHunting.getCurrentGame().getItems().get(ItemType.meat.ordinal()).getQuantityInStock()
                    + "\n"+LostWhileHunting.getCurrentGame().getItems().get(ItemType.extraLife.ordinal()).getInventoryType()+" Amount: "+LostWhileHunting.getCurrentGame().getItems().get(ItemType.extraLife.ordinal()).getQuantityInStock()
                    + "\n----------------------------------------------"
                    + "\n| Equipped Items                            |"
                    + "\n----------------------------------------------"
                    + "\nItem1: "+Items.getItem1()+" | Item2: "+Items.getItem2()+" | Item3: "+Items.getItem3()+""
                    + "\n1 - Count Inventory Items"
                    + "\nQ - Quit"
                    + "\n---------------------------------------------";
        
               
    }
      
    
    public void displayinventoryView() {
        int value=0;
        boolean done = false; // set flag to not done
        do {
            // promt for and get players name
            try{
            value = this.getInput();
            }catch(NumberFormatException nf){
                System.out.println("Come on letters dont work! Its only the number 1 to check item amount."
                                   +"\nOr Simply press Q to exit to the Game Menu.");
            }
                        
            // do the requested action and display the next view
            done = this.doAction(value);
        } 
        while (!done);
    }
      
    public boolean doAction(int choice) {
       
       
        
        switch (choice) {
            case 1: // exit
                this.sumItems();
                System.out.println("\nYou have "+this.sumItems()+" overall in inventory");
                break;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;
        }
        
        return true;
    }

    
    public int getInput() {
       Scanner keyboard = new Scanner(System.in);
        int value = 0;
        String inputValue;
        boolean valid = false;
        
        while (!valid) {
            System.out.println("\n" + this.menu);
            
            inputValue = keyboard.nextLine();
                 
            if (inputValue.length() < 1) {
                System.out.println("\nInvalid value: value can not be blank");
                continue;
            }
            
            if (inputValue.toUpperCase().equals("Q"))
                gamemenu.display();
            
            value = Integer.parseInt(inputValue);
            
            break; // end the loop
        }
        
        return value;  // return the value entered
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
