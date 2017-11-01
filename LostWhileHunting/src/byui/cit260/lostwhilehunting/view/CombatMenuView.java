/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.lostwhilehunting.view;

/**
 *
 * @author Sony
 */
public class CombatMenuView {

    private final String menu;
    
    public CombatMenuView() {
        this.menu = "\n"
                    + "\n---------------------------------------"
                    + "\n What will you do?"
                    + "\n---------------------------------------"
                    + "\n"
                    + "\n A. Fight"
                    + "\n B. Flight"
                    + "\n C. Evade"
                    + "\n Q. Quit"
                    + "\n"
                    + "\n---------------------------------------"
                    + "\n Choose Wisely!";              
    }
    
    public void displayCombatMenuView() {
             boolean done = false; // set flag to not done
        do {
            // promt for and get players name
            String CombatMenuOption = this.getCombatMenuOption();
            if (CombatMenuOption.toUpperCase().equals("Q")) // user wants to quit
                return; // exit the game
            
            // do the requested action and display the next view
            done = this.doAction(CombatMenuOption);
        } while (!done);
    }

    private boolean doAction(String choice) {
        choice = choice.toUpperCase(); // Convert choice to uppercase
        
         switch (choice) {
            case "A": 
                this.fight();
                break;
            case "B":
                this.flight();
                break;
            case "C":
                this.evade();
                break;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;
        }
        
        return false;
    }

    private String getCombatMenuOption() {
       System.out.println("getCombatMenuOption is called");
        return null;
    }

    private void fight() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void flight() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void evade() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    

    }
    

