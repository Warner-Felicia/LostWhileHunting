/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.lostwhilehunting.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Objects;

/**
 *
 * @author Trevon Morris
 */
public enum Map implements Serializable{
    
    Start("Initial Cave",0,0),
    Stream("Cool Stream",3,3),
    Cave("Dark Cave",6,6),
    Caverns("Deep Caverns",9,9),
    River("Great River",12,12),
    Town("Small Town",15,15),
    Goal("Oregon Trail",18,18);
    
    //class instance variables
    private String description;
    private int columnCount;
    private int rowCount;
    private ArrayList<Game> games = new ArrayList<Game>();
    
    //Public functions of Map Class

    Map(String description, int columnCount, int rowCount) {
        this.description = description;
        this.columnCount = columnCount;
        this.rowCount = rowCount;
    }

    public String getDescription() {
        return description;
    }

    public double getColumnCount() {
        return columnCount;
    }
   
    public double getRowCount() {
        return rowCount;
    }
        
    // Game Class getter and setter funtions

    public ArrayList<Game> getGames() {
        return games;
    }

    public void setGames(ArrayList<Game> games) {
        this.games = games;
    }

    //Override To String
    
    @Override
    public String toString() {
        return "Map{" + "description=" + description + ", columnCount=" + columnCount + ", rowCount=" + rowCount + ", games=" + games + '}';
    }
        
    
}
