/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.lostwhilehunting.view;

import byui.cit260.lostwhilehunting.control.ItemControl;
import byui.cit260.lostwhilehunting.exceptions.ItemControlException;
import byui.cit260.lostwhilehunting.model.Game;
import byui.cit260.lostwhilehunting.model.InventoryItem;
import byui.cit260.lostwhilehunting.model.ItemType;
import byui.cit260.lostwhilehunting.model.Items;
import static byui.cit260.lostwhilehunting.view.InventoryCharacterStream.game;
import static byui.cit260.lostwhilehunting.view.InventoryCharacterStream.items;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import lostwhilehunting.LostWhileHunting;

/**
 *
 * @author Trevon Morris
 */
public class ViewInventoryView implements Serializable{
    
    ArrayList<InventoryItem> viewItems = new ArrayList<>();
    InventoryCharacterStream callPrint = new InventoryCharacterStream();
    
    GameMenuView gamemenu = new GameMenuView();
    ItemControl itemcontrol= new ItemControl();
    private String menu;
    private PrintWriter console = LostWhileHunting.getOutFile();
    
    
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
                    + "\nS - Count Inventory Items"
                    + "\nP - Print Inventory to a file"
                    + "\nA - Sort Inventory Alphebetically"
                    + "\nN - Sort Inventory by Quantity"
                    + "\nQ - Quit"
                    + "\n---------------------------------------------";
        
               
    }
      
    
    public void displayinventoryView() throws ItemControlException {
        boolean done = false; // set flag to not done
        do {
            // promt for and get players name
            String viewInventoryOption = this.getInput();
            if (viewInventoryOption.toUpperCase().equals("Q")) // user wants to quit
                return; // exit the game
            
            // do the requested action and display the next view
            done = this.doAction(viewInventoryOption);
        } while (!done);
    }
      
    public boolean doAction(String choice) throws ItemControlException {
        switch (choice.toUpperCase()) {
            case "S": // exit
                this.sumItems();
                this.console.println("\nYou have "+this.sumItems()+" overall in inventory");
                break;
            case "P": // exit
                try{
                this.printItemsToFile();
                }catch(IOException ie){
                    ie.getMessage();
                }
                break;
            case "A":
                this.sortItemsByName();
                break;
            case "N":
                this.sortItemsByQuantity();
                break;                   
              
            default:
                this.console.println("\n*** Invalid selection *** Try again");
                break;
        }
        
        return false;
    }

    
    public String getInput() {
       BufferedReader keyboard = LostWhileHunting.getInFile();
        int value = 0;
        String inputValue="";
        boolean valid = false;
        
        while (!valid) {
            this.console.println("\n" + this.menu);
            
            try {
                inputValue = keyboard.readLine();
            
                if (inputValue.length() < 1) {
                this.console.println("\nInvalid value: value can not be blank");
                continue;
                }
            
                if (inputValue.toUpperCase().equals("Q"))
                    gamemenu.display();
            
                break; // end the loop
            }
            catch (IOException ex) {
                ErrorView.display(this.getClass().getName(), "Error reading from keyboard.");
            }
        }
        
        return inputValue;  // return the value entered
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

    private void printItemsToFile() throws ItemControlException, IOException{
        this.console.println("\n\nEnter the file path for the Item save ");
        String filePath = this.getInput();
        
        callPrint.saveItems(filePath);
        
    }

    private void sortItemsByName() {
                
        game = LostWhileHunting.getCurrentGame();
        items = game.getItems();
        
        Collections.sort(items, InventoryItem.ItemNameComparator);
        
        for (InventoryItem item: items) {
            this.console.println(item.getInventoryType() + " " 
                    + item.getQuantityInStock());
        }
    }

    private void sortItemsByQuantity() {
        
        game = LostWhileHunting.getCurrentGame();
        items = game.getItems();
        
        Collections.sort(items);
        
        for (InventoryItem item: items) {
            this.console.println(item.getInventoryType() + " " 
                    + item.getQuantityInStock());
        }
    }
}    
       