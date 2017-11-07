package byui.cit260.lostwhilehunting.view;

import byui.cit260.lostwhilehunting.control.GameControl;
import byui.cit260.lostwhilehunting.control.ItemControl;
import byui.cit260.lostwhilehunting.control.LocationsControl;
import byui.cit260.lostwhilehunting.model.Items;
import byui.cit260.lostwhilehunting.model.Player;
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
    
    MainMenuView mainmenu = new MainMenuView();
    GameControl game = new GameControl();
    private String menu;

    public GameMenuView() {
        this.menu = "\n" 
                    + "\n-----------------------------------------"
                    + "\n| Game Menu                             |"
                    + "\n----------------------------------------"
                    + "\nM - Move to the next location"
                    + "\nU - Use SurePass"
                    + "\nS - Search Current Location"
                    + "\nV - View Inventory"
                    + "\nC - Check status of player"
                    + "\nE - Equip items"
                    + "\nQ - Return to Main Menu"
                    + "\n----------------------------------------"
                    + "\n Please make a selection.";
    }
    
    void displayGameMenu() {
        
        boolean done = false;
        do {
            String menuOption = this.getMenuOption();
            if (menuOption.toUpperCase().equals("Q"))
                mainmenu.displayMainMenuView();
            
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
                this.checkPlayerStatus();
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
        if(Player.getInjuryTracker()< 3){
            System.out.println("Injury Tracker: "+Player.getInjuryTracker());
            CombatMenuView combatMenuView = new CombatMenuView();
            //call combat view
            combatMenuView.displayCombatMenuView();
        }else{
            System.out.println("\nYou are dead");
            
            if(Items.getExtraLifeQuantity() > 0){
                
                System.out.println("\nDo you want to use "+Items.getExtraLifeQuantity()+" of your ExtraLife");
                System.out.println("\nEnter Y|N");
                Scanner useLife = new Scanner(System.in);
                String lifeWriteChoice = "";
                boolean checker = false;
         
                    
                while(!checker){    
            
                    lifeWriteChoice = useLife.nextLine();
                    lifeWriteChoice = lifeWriteChoice.trim();
                    lifeWriteChoice = lifeWriteChoice.toUpperCase();
                    System.out.println("You Chose: "+lifeWriteChoice);    
            
                    switch (lifeWriteChoice) {
                        case "Y": // create and start a new game
                            System.out.println("\nYou were Revived by the Power of the Lord");
                            Player.setInjuryTracker(0);
                            GameControl.checkIfActorIsInjuredDeadOrAlive(Player.getInjuryTracker());
                
                            break;
                        case "N": // get and start an existing game
                            System.out.println("\nYou remain dead");
                
                            break;
                        default:
                            System.out.println("\n*** Invalid selection *** Try again");
                            continue;
                    }
                
                    break;
                }
            }
        }
    }

    private void useSurePass() {
        LocationsControl locationscontrol = new LocationsControl();
        locationscontrol.incrementLocationsMapSceneTypeIfSurePass(1);
    }

    private void searchCurrentLocation() {
         ItemControl itemcontrol = new ItemControl();
         itemcontrol.searchLocation();
    }

    private void viewInventory() {
         ViewInventoryView inventoryView = new ViewInventoryView();
        
        // Display the view inventory view
        inventoryView.displayViewInventoryView();
         
    }
    
    private void checkPlayerStatus() {
        CheckPlayerStatusView playerStatus = new CheckPlayerStatusView();
        playerStatus.displayPlayerStatus();
    }
    
    private void equipItems() {
        EquipItemView equipitem = new EquipItemView();
        
        // Display the EquipItems view
        equipitem.displayEquipItems();
    }

}

    
