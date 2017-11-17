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
public class ViewInventoryView extends View{
    
    ArrayList<InventoryItem> viewItems = new ArrayList<>();
    
    GameMenuView gamemenu = new GameMenuView();
    ItemControl itemcontrol= new ItemControl();
    private String menu;
    
    
    public ViewInventoryView() {
       
               super( "\n"
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
                    + "\nQ - Quit"
                    + "\n---------------------------------------------");
        
               
    }
      
      
    @Override
    public boolean doAction(String choice) {
       
        choice = choice.toUpperCase(); // convert choice to upper case
        
        switch (choice) {
            case "Q": // exit
                System.out.println("\nExiting");
                return true;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;
        }
        
        return true;
    }

    
}
