/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.lostwhilehunting.view;


import byui.cit260.lostwhilehunting.control.GameControl;
import byui.cit260.lostwhilehunting.model.Game;
import byui.cit260.lostwhilehunting.model.Items;
import byui.cit260.lostwhilehunting.model.Player;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Sony
 */
public class CheckPlayerStatusView extends View {
    Player player = new Player();
    Game game = new Game(); 

    private final String playerStatus;

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
                + "\n"
                + "Q - Return To Game Menu";
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
        choice = choice.toUpperCase();
if ("H".equals(choice)){
GameControl.healPlayerwithMeatOrLife();
}
        return false;
    }

    private String playerName() {
        Player players = new Player();
        String playerName = player.getName();
       

        if (" ".equals(playerName)) {
            return "unkown";
        } else {
        return playerName;
        }
    }
}
    

