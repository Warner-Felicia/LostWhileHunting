/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lostwhilehunting;

import byui.cit260.lostwhilehunting.model.Actors;
import byui.cit260.lostwhilehunting.model.Player;
import byui.cit260.lostwhilehunting.model.Map;
import byui.cit260.lostwhilehunting.model.Location;
import byui.cit260.lostwhilehunting.model.Items;
import byui.cit260.lostwhilehunting.model.Questions;
import byui.cit260.lostwhilehunting.model.RegularSceneType;
import byui.cit260.lostwhilehunting.model.ResourceSceneAmount;
import byui.cit260.lostwhilehunting.model.SceneQuestions;
import byui.cit260.lostwhilehunting.control.QuestionsAndSceneControl;
import byui.cit260.lostwhilehunting.control.ItemControl;
import byui.cit260.lostwhilehunting.model.Game;
import byui.cit260.lostwhilehunting.view.StartProgramView;

/**
 *
 * @author All group members
 */
public class LostWhileHunting {

    /**
     * @param args the command line arguments
     */
    private static Game currentGame = null;
    private static Player player = null;
    
    public static void main(String[] args) {
        
        StartProgramView startProgramView = new StartProgramView();
        startProgramView.displayStartProgramView();
        
              
    }

    public static Game getCurrentGame() {
        return currentGame;
    }

    public static void setCurrentGame(Game currentGame) {
        LostWhileHunting.currentGame = currentGame;
    }

    public static Player getPlayer() {
        return player;
    }
    
    public static void setPlayer(Player player) {
        LostWhileHunting.player = player;
    }
    
    
    
}
