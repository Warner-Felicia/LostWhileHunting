package byui.cit260.lostwhilehunting.view;

import byui.cit260.lostwhilehunting.control.GameControl;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author New User
 */
public class GameMenuView {
    
    private String menu;

    public GameMenuView() {
        this.menu = "\n| Game Menu                             |"
                    + "\n----------------------------------------"
                    + "\nM - Move to the next location"
                    + "\nU - Use SurePass"
                    + "\nS - Search Current Location"
                    + "\nV - View Inventory"
                    + "\nC - Check status of player"
                    + "\nE - Equip items"
                    + "\nQ - Return to Main Menu"
                    + "\n----------------------------------------";
    }
    
    void displayGameMenu() {
        
        boolean done = false;
        do {
            String menuOption = this.getMenuOption();
            if (menuOption.toUpperCase().equals("Q"))
                return;
            
            done = this.doAction(menuOption);
        }
        while (!done);
    }

    private String getMenuOption() {
        
        Scanner keyboard = new Scanner(System.in);
        String value = "";
        boolean valid = false;
        
        while (!valid) {
            System.out.println("\n" + this.menu);
            value = keyboard.nextLine();
            value = value.trim();
            
            if (value.length() < 0) {
                System.out.println("Please make a selection");
                continue;
            }
            
            break;
        }
        
        return value; 
        
    }

    private boolean doAction(String choice) {
        
        choice = choice.toUpperCase();
        
        switch (choice) {
            case ("M"): // move to next location
                this.moveToNextLocation();
                break;
            case ("U"): //use SurePass
                this.useSurePass();
                break;
            case ("S"): // search current location
                this.searchCurrentLocation();
                break;
            case ("V"): // view inventory
                this.viewInventory();
                break;
            case ("C"): // check player status
                GameControl.checkPlayerStatus();
                break;
            case ("E"): // equip items
                this.equipItems();
                break;
            default: 
                System.out.println("Please choose an action from this list");
        }
        
        return false;
        
    }

    private void moveToNextLocation() {
        System.out.println("\n *** moveToNextLocation() function called");
    }

    private void useSurePass() {
         System.out.println("\n *** useSurePass() function called");
    }

    private void equipItems() {
         System.out.println("\n *** equipItems() function called");
    }

    private void searchCurrentLocation() {
         System.out.println("\n *** searchCurrentLocation() function called");
    }

    private void viewInventory() {
         System.out.println("\n *** viewInventory() function called");
    }

}

    