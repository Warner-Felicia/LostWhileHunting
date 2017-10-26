/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.lostwhilehunting.view;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class StartProgramView {

    private String promptMessage;
    
    public StartProgramView() {
        
        this.promptMessage = "\nPlease enter your name: ";
        //display the banner when view is created
        this.displayBanner();
    }

    private void displayBanner() {
        System.out.println("\n******************************************************"
                          +"\n*                                                    *"
    +"\n*         Welcome to Lost While Hunting              *"
    +"\n* The game is a text based role-playing game.        *"
    +"\n* In the game, the player will be taking on the role *"
    +"\n* of one of three characters. The purpose of the game*"
    +"\n* is to find the Oregon trail group.                 *"
    +"\n* The game includes several landmarks,               *"
    +"\n* and along the wilderness the player will make      *"
    +"\n* decisions that will have consequences              *"
    +"\n* on the other characters. Good Luck!                *"
    +"\n*                                                    *"            
    +"\n******************************************************");
    }

    public void displayStartProgramView() {
        System.out.println("\n*** displayStartProgram() function called ***");
        
      /*do
            Prompt for and get the input value
            if (value == “Q”) then
            return
        
            do requested action and display the next view
        
        while the view is not done
        */
      boolean done = false;
      do{
          //Prompt for and get players name
          String playersName = this.getPlayersName();
          if(playersName.toUpperCase().equals("Q"))
              return;
          done = this.doAction(playersName);
          
      }while (!done);
      
      
    }
    
    private String getPlayersName() {
        Scanner keyboard = new Scanner(System.in);
        String value = "";
        
    }

    private boolean doAction(String playersName) {
        System.out.println("\n+++ doAction() called ***");
        return true;
    }
    
    
    
}
