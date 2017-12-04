/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.lostwhilehunting.view;


import byui.cit260.lostwhilehunting.control.GameControl;
import byui.cit260.lostwhilehunting.model.Game;
import byui.cit260.lostwhilehunting.model.Items;
import byui.cit260.lostwhilehunting.model.Location;
import byui.cit260.lostwhilehunting.model.Player;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Serializable;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import lostwhilehunting.LostWhileHunting;

/**
 *
 * @author Sony
 */
public class CheckPlayerStatusView extends View implements Serializable{
    Player player = new Player();
    Game game = LostWhileHunting.getCurrentGame();
    String filePath;

    private final String playerStatus;
    private PrintWriter console = LostWhileHunting.getOutFile();
    private String playerStatusPrint;

    public CheckPlayerStatusView() {
        this.playerStatus = "\n Player Status:"
                + "\n -----------------------------------------------"
                + "\n Player Name: " + playerName()
                + "\n Hero: " + game.getHeroClass()
                + "\n Items Equipped: " + Items.getItem1() + ", " + Items.getItem2() + ", " + Items.getItem3()
                + "\n Health: " + Player.getHealthStatus()
                + "\n -----------------------------------------------"
                + "\n H - Heal"
                + "\n -----------------------------------------------"
                + "\n D - Download Player Status"
                + "\n -----------------------------------------------"
                + "\n Q - Return To Game Menu";
    }

    public void displayPlayerStatus() {
        boolean done = false; // set flag to not done
        do {
            // promt for and get players name
            String PlayerStatusOption = this.getInput();
            if (PlayerStatusOption.toUpperCase().equals("Q")) // user wants to quit
            {
                return; // exit the game
            }
            // do the requested action and display the next view
            done = this.doAction(PlayerStatusOption);
        } while (!done);
    }
@Override
    public String getInput() {
        
        String value = "";
        boolean valid = false;

        while (!valid) {
            this.console.println("\n" + this.playerStatus);

            try {
                value = this.keyboard.readLine();
                value = value.trim();
            } catch (IOException ex) {
                ErrorView.display(this.getClass().getName(), "Error reading "
                        + "from keyboard.");
            }
            

            if (value.length() < 1) {
                this.console.println("Please make a selection");
                continue;
            }

            break;
        }

        return value;
    }
@Override
    public boolean doAction(String choice) {
      switch (choice.toUpperCase()){
          case "H":
             GameControl.healPlayerwithMeatOrLife();
             break;
          case "D":
              this.getPlayerStatusPath();
              break;
          default: 
              this.console.println("Please choose an action from this list");
              break;
              
    }
        return false;
    }

    private String playerName() {
        Player players = new Player();
        String playerName = game.getPlayer().getName();
       

        if (" ".equals(playerName)) {
            return "unkown";
        } else {
        return playerName;
        }
    }

    // The classes for writing, reading, and printing the player status. 
    
    private void getPlayerStatusPath() {
       this.console.println("\n\nEnter the file path for the file where \nthe game will be saved: ");
       filePath = this.getInput();
       this.playerStatusPrint = "\n Player Status:"
                + "\n -----------------------------------------------"
                + "\n Player Name: " + playerName()
                + "\n Hero: " + game.getHeroClass()
                + "\n Items Equipped: " + Items.getItem1() + ", " + Items.getItem2() + ", " + Items.getItem3()
                + "\n Health: " + Player.getHealthStatus()
                + "\n -----------------------------------------------";
       try {
          String[] paragraphArray = this.openPlayerStatusFile();
          for (int i=0; i < paragraphArray.length; i++){
              System.out.println(paragraphArray[i]);
          }
       } catch (IOException ex) {
            System.out.print("Error - the file path doesn't exist");
        }
        
        try {
            this.writeToPlayerStatusFile(this.playerStatusPrint);
        } catch (IOException ex) {
            Logger.getLogger(CheckPlayerStatusView.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    }

    private void readPlayerStatusFile(String playerStatusPath) throws IOException {
        filePath = playerStatusPath;
    }
    
    private String[] openPlayerStatusFile() throws IOException {
            
        FileReader read = new FileReader(filePath);
        BufferedReader dataRead = new BufferedReader(read);
        
        int numberOfParagraphs = 10;
        String[] textRead = new String[numberOfParagraphs];
        
        for (int i=0; i < numberOfParagraphs; i++){
            textRead[i] = dataRead.readLine();
        }
        dataRead.close();
        return textRead;
        
       }
    
    private void writeToPlayerStatusFile(String playerStatus) throws IOException {
        
        FileWriter write = new FileWriter(filePath);
        try (PrintWriter printPlayerStatus = new PrintWriter(write)) {
            printPlayerStatus.printf("%s" + "%n", playerStatus);
        }
    }
    
    int readParagraph() throws IOException {
        FileReader readFile = new FileReader(filePath);
        BufferedReader bufferedRead = new BufferedReader(readFile);
        
        String paragraph;
        int numberOfParagraphs = 0;
        
        while ((paragraph = bufferedRead.readLine()) != null){
            numberOfParagraphs++;
        }
        bufferedRead.close();
        return numberOfParagraphs++;
    }
    
    

}

    
