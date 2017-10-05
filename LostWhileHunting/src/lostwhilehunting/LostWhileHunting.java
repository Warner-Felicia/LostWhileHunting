/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lostwhilehunting;

import byui.cit260.lostwhilehunting.model.Actors;
import byui.cit260.lostwhilehunting.model.Player;

/**
 *
 * @author Administrator
 */
public class LostWhileHunting {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Player playerOne = new Player();
        playerOne.setName("Fred Flintstone");
        playerOne.setNumberOfSurePasses(4);
        
        String playerOneName = playerOne.getName();
        int playerOneSurePasses = playerOne.getNumberOfSurePasses();
        
        System.out.println(playerOne.toString());
        
        System.out.println(Actors.Spinster.toString());
        System.out.println(Actors.TopshotYoungster.toString());
        System.out.println(Actors.BurlyMan.toString());
        System.out.println(Actors.Coyote.toString());
        System.out.println(Actors.Wolf.toString());
        System.out.println(Actors.SmallWolf.toString());
        System.out.println(Actors.Bear.toString());
        System.out.println(Actors.Thieves.toString());
        
    }
    
}
