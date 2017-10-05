/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.lostwhilehunting.model;

import java.io.Serializable;
/**
 *
 * @author Entire group with Trevon as Scribe
 */
public class Game implements Serializable{
    
    //class instance variables
    private double totalScore;
    private int numberOfSaves;
    private long totalTime;
    private Player player;
    private Map map;

    //Class public functions
    public Game() {
    }

    public double getTotalScore() {
        return totalScore;
    }

    public void setTotalScore(double totalScore) {
        this.totalScore = totalScore;
    }

    public int getNumberOfSaves() {
        return numberOfSaves;
    }

    public void setNumberOfSaves(int numberOfSaves) {
        this.numberOfSaves = numberOfSaves;
    }

    public long getTotalTime() {
        return totalTime;
    }

    public void setTotalTime(long totalTime) {
        this.totalTime = totalTime;
    }

    // Player Class getter and setter functions
    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }
    
    // Map class getter and setter functions

    public Map getMap() {
        return map;
    }

    public void setMap(Map map) {
        this.map = map;
    }
    
    
    
    //Class Hash, Equals, and toString override functions
    @Override
    public int hashCode() {
        int hash = 3;
        hash = 41 * hash + (int) (Double.doubleToLongBits(this.totalScore) ^ (Double.doubleToLongBits(this.totalScore) >>> 32));
        hash = 41 * hash + this.numberOfSaves;
        hash = 41 * hash + (int) (this.totalTime ^ (this.totalTime >>> 32));
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
        final Game other = (Game) obj;
        if (Double.doubleToLongBits(this.totalScore) != Double.doubleToLongBits(other.totalScore)) {
            return false;
        }
        if (this.numberOfSaves != other.numberOfSaves) {
            return false;
        }
        if (this.totalTime != other.totalTime) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Game{" + "totalScore=" + totalScore + ", numberOfSaves=" + numberOfSaves + ", totalTime=" + totalTime + '}';
    }
    
    
    
}
