/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.lostwhilehunting.view;

import java.util.Scanner;

/**
 *
 * @author New User
 */
public class SelectACharacterView {
    
    private String menu;
    
    public SelectACharacterView() {
        this.menu = "\n"
                    + "\n----------------------------------------"
                    + "\n| Select a Character                   |"
                    + "\n----------------------------------------"
                    + "\nB - Burly Man"
                    + "\n     Butch"
                    + "\n     A super strong farmer, known to have won many fights"
                    + "\nT - Topshot Youngster"
                    + "\n     Timmy"
                    + "\n     A young teen taught by his father how to shoot from a distance"
                    + "\nS - Spinster"
                    + "\n     Sue"
                    + "\n     A sweet lady very good at hunting with traps"
                    + "\nQ - Return to previous menu"
                    + "\n----------------------------------------";
    }

    void displaySelectACharacterMenu() {
        
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
            
            if (value.length() < 1) {
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
            case "B":
                System.out.println("You selected Burly man");
                
                break;
            case "T":
                System.out.println("You selected Topshot Youngster");
                break;
            case "S":
                System.out.println("You selected Spinster");
                break;
            default:
                System.out.println("You must choose a character from the list.");
                return false;
        }
        
        return true;
        
        }
}
