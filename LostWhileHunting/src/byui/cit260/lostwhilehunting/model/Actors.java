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
 * @author New User
 */
public class Actors implements Serializable{
    
    private String name;
    private String description;
    private String mainStat;
    private ArrayList<Player> player = new ArrayList<Player>();
    private Game game;
    private Location location;
            
    public Actors() {
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public ArrayList<Player> getPlayer() {
        return player;
    }

    public Game getGame() {
        return game;
    }

    public Location getLocation() {
        return location;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }

    public String getMainStat() {
        return mainStat;
    }

    public void setMainStat(String mainStat) {
        this.mainStat = mainStat;
    }

    public void setPlayer(ArrayList<Player> player) {
        this.player = player;
    }

    public void setGame(Game game) {
        this.game = game;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 73 * hash + Objects.hashCode(this.name);
        hash = 73 * hash + Objects.hashCode(this.description);
        hash = 73 * hash + Objects.hashCode(this.mainStat);
        
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
        final Actors other = (Actors) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        if (!Objects.equals(this.mainStat, other.mainStat)) {
            return false;
        }
        
        return true;
    }

    @Override
    public String toString() {
        return "Actors{" + "name=" + name + ", description=" + description + ", mainStat=" + mainStat + ", player=" + player + ", game=" + game + ", location=" + location + '}';
    }

    
    
    
    
    
    
    
    
    
}
