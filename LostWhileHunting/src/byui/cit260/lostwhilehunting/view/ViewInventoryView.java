/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.lostwhilehunting.view;

import byui.cit260.lostwhilehunting.control.ItemControl;
import byui.cit260.lostwhilehunting.model.Items;
import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class ViewInventoryView {
    
    ItemControl itemcontrol= new ItemControl();
    private String menu;

    public ViewInventoryView() {
        this.menu = "\n"
                    + "\n----------------------------------------------"
                    + "\n| Inventory Items                            |"
                    + "\n----------------------------------------------"
                    + "\n"+Items.getRifle()+" Amount: "+Items.getRifleQuantity()
                    + "\n"+Items.getBullets()+" Amount: "+Items.getBulletsQuantity()
                    + "\n"+Items.getKnife()+" Amount: "+Items.getKnifeQuantity()
                    + "\n"+Items.getMap()+" Amount: "+Items.getMapQuantity()
                    + "\n"+Items.getMeat()+" Amount: "+Items.getMeatQuantity()
                    + "\n"+Items.getExtraLife()+" Amount: "+Items.getExtraLifeQuantity()
                    + "\n----------------------------------------------"
                    + "\n| Equipped Items                            |"
                    + "\n----------------------------------------------"
                    + "\nItem1: "+Items.getItem1()+" | Item2: "+Items.getItem2()+" | Item3: "+Items.getItem3()+""
                    + "\nQ - Quit"
                    + "\n---------------------------------------------";
        
    }
      
    void displayViewInventoryView() {
        
        boolean done = false; // set flag to not done
        do {
            // promt for and get players name
            String viewinventoryviewoption = this.getViewInventoryViewOption();
            if (viewinventoryviewoption.toUpperCase().equals("Q")) // user wants to quit
                return; // exit the game
            
            // do the requested action and display the next view
            done = this.doAction(viewinventoryviewoption);
        } while (!done);
    }
    
    private String getViewInventoryViewOption() {
       Scanner keyboard = new Scanner(System.in);
        String value = "";
        boolean valid = false;
        
        while (!valid) {
            System.out.println("\n" + this.menu);
            
            value = keyboard.nextLine();
            value = value.trim();
            
            if (value.length() < 1) {
                System.out.println("\nInvalid value: value can not be blank");
                continue;
            }
            
            break; // end the loop
        }
        
        return value;  // return the value entered
    }
    
    private boolean doAction(String choice) {
       
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
