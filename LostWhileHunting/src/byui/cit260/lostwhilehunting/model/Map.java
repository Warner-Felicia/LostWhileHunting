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
 * Map Class
 * @author Trevon Morris
 */
public class Map implements Serializable{
    
    /*Start("Initial Cave",0,0),
    Stream("Cool Stream",3,3),
    Cave("Dark Cave",6,6),
    Caverns("Deep Caverns",9,9),
    River("Great River",12,12),
    Town("Small Town",15,15),
    Goal("Oregon Trail",18,18);*/
    
    //class instance variables
    private String description;
    private int columnCount;
    private int rowCount;
    private ArrayList<Game> games = new ArrayList<Game>();
    
    //Public functions of Map Class

    public Map() {
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getColumnCount() {
        return columnCount;
    }

    public void setColumnCount(int columnCount) {
        this.columnCount = columnCount;
    }

    public int getRowCount() {
        return rowCount;
    }

    public void setRowCount(int rowCount) {
        this.rowCount = rowCount;
    }

    public ArrayList<Game> getGames() {
        return games;
    }

    public void setGames(ArrayList<Game> games) {
        this.games = games;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 23 * hash + Objects.hashCode(this.description);
        hash = 23 * hash + this.columnCount;
        hash = 23 * hash + this.rowCount;
        hash = 23 * hash + Objects.hashCode(this.games);
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
        final Map other = (Map) obj;
        if (this.columnCount != other.columnCount) {
            return false;
        }
        if (this.rowCount != other.rowCount) {
            return false;
        }
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        if (!Objects.equals(this.games, other.games)) {
            return false;
        }
        return true;
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String toString() {
        return super.toString(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone(); //To change body of generated methods, choose Tools | Templates.
    }

    
    
}
