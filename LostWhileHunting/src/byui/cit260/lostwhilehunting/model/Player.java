/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.lostwhilehunting.model;

import java.io.Serializable;
import java.util.Objects;
import java.util.ArrayList;

/**
 * Player Class
 * @author Entire Group with Trevon as Scribe
 */
public class Player implements Serializable{
    
    //class instance variables
    private static String name;
    private static int numberOfSurePasses = 4;
    private static int injuryTracker = 0;
    private static String healthStatus="Healthy";
    private ArrayList<Game> games = new ArrayList<Game>();
    
           
    public Player() {
    }
    
    public static String getHealthStatus() {
        return healthStatus;
    }

    public static void setHealthStatus(String healthStatus) {
        Player.healthStatus = healthStatus;
    }
    

    public static int getInjuryTracker() {
        return injuryTracker;
    }

    public static void setInjuryTracker(int injuryTracker) {
        Player.injuryTracker = injuryTracker;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberOfSurePasses() {
        return numberOfSurePasses;
    }

    public void setNumberOfSurePasses(int numberOfSurePasses) {
        this.numberOfSurePasses = numberOfSurePasses;
    }  
    
    //Game Class getter and setter methods

    public ArrayList<Game> getGames() {
        return games;
    }

    public void setGames(ArrayList<Game> games) {
        this.games = games;
    }

    //Class Hash, Equals, and toString override functions
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 41 * hash + Objects.hashCode(this.name);
        hash = 41 * hash + this.numberOfSurePasses;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Player other = (Player) obj;
        if (this.numberOfSurePasses != other.numberOfSurePasses) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Player{" + "name=" + name + ", numberOfSurePasses=" + numberOfSurePasses + '}';
    }

    
    
    
}
