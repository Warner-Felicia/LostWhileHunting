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
import java.util.Scanner;

/**
 *
 * @author Sony
 */
public class CheckPlayerStatusView {
    Player player = new Player();
    Game game = new Game();

    private String playerStatus;

    public CheckPlayerStatusView() {
        this.playerStatus = "\n Player Status:"
                + "\n -----------------------------------------------"
                + "\n Player Name: " + playerName()
                + "\n Hero: " + game.getHeroClass()
                + "\n Items Equipped: " + Items.getItem1() + ", " + Items.getItem2() + ", " + Items.getItem3()
                + "\n Health: " + player.getHealthStatus()
                + "\n -----------------------------------------------"
                + "\n"
                + "Q - Return To Game Menu";
    }

    public void displayPlayerStatus() {
        boolean done = false; // set flag to not done
        do {
            // promt for and get players name
            String PlayerStatusOption = this.getPlayerStatusOption();
            if (PlayerStatusOption.toUpperCase().equals("Q")) // user wants to quit
            {
                return; // exit the game
            }
            // do the requested action and display the next view
            done = this.doAction(PlayerStatusOption);
        } while (!done);
    }

    private String getPlayerStatusOption() {
        Scanner keyboard = new Scanner(System.in);
        String value = "";
        boolean valid = false;

        while (!valid) {
            System.out.println("\n" + this.playerStatus);

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
    

