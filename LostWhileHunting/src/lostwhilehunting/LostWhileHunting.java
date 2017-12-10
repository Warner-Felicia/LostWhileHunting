/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lostwhilehunting;

import byui.cit260.lostwhilehunting.model.Player;
import byui.cit260.lostwhilehunting.model.Game;
import byui.cit260.lostwhilehunting.view.StartProgramView;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

/**
 *
 * @author All group members
 */
public class LostWhileHunting {

    /**
     * @param args the command line arguments
     */
    
    // Felicia fix
    private static Game currentGame = null;
    private static Player player = null;
    private static PrintWriter outFile = null;
    private static BufferedReader inFile = null;
    private static PrintWriter logFile = null;
    
    public static void main(String[] args) {
        
        StartProgramView startProgramView = new StartProgramView();
        
        try {
        LostWhileHunting.inFile = new BufferedReader(new InputStreamReader(System.in));
        
        LostWhileHunting.outFile = new PrintWriter(System.out, true);
        
            try {
                String filePath = "logfile.txt";
                LostWhileHunting.logFile = new PrintWriter(filePath);
                
            }
            catch (Exception e) {
                getOutFile().println("Exception: " + e.toString() +
                                    "\nCause: " + e.getCause() +
                                    "\nMessage " +e.getMessage());
            }
        startProgramView.display();
        } 
        catch (Throwable te) {
            outFile.println(te.getMessage());
            te.printStackTrace();
            startProgramView.display();
        }
        finally {
            try {
                if (LostWhileHunting.inFile != null);
                LostWhileHunting.inFile.close();
                
                if (LostWhileHunting.outFile != null);
                LostWhileHunting.outFile.close();
                
                if (LostWhileHunting.logFile != null);
                LostWhileHunting.logFile.close();
            } 
            catch (IOException ex) {
                outFile.println("Error closing files.");
            }
        }        
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

    public static PrintWriter getOutFile() {
        return outFile;
    }

    public static void setOutFile(PrintWriter outFile) {
        LostWhileHunting.outFile = outFile;
    }

    public static BufferedReader getInFile() {
        return inFile;
    }

    public static void setInFile(BufferedReader inFile) {
        LostWhileHunting.inFile = inFile;
    }

    public static PrintWriter getLogFile() {
        return logFile;
    }

    public static void setLogFile(PrintWriter logFile) {
        LostWhileHunting.logFile = logFile;
    }
    
    
    
    
    
    
    
}
