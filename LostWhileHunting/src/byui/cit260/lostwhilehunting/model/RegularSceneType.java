/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.lostwhilehunting.model;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author Sony
 */
public class RegularSceneType implements Serializable {
    // Class instance variables
    private String nameOfScene;
    private String description;
    private boolean safe;
    
    // The constructor of the class

    public RegularSceneType() {
    }
    

     // Setting getter and setter for each variable.

    public String getNameOfScene() {
        return nameOfScene;
    }

    public void setNameOfScene(String nameOfScene) {
        this.nameOfScene = nameOfScene;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean getSafe() {
        return safe;
    }

    public void setSafe(boolean safe) {
        this.safe = safe;
    }
    public static RegularSceneType[] createScenes() {
        RegularSceneType[] scenesContainer = new RegularSceneType[10];
        
        RegularSceneType startingArea = new RegularSceneType();
        startingArea.nameOfScene = "Starting Area";
        startingArea.description = "This is where the player will start.";
        startingArea.safe = true;
        scenesContainer[0] = startingArea;
        
        RegularSceneType coolStream = new RegularSceneType();
        coolStream.nameOfScene = "Cool Stream";
        coolStream.description = "The player can be refreshed here.";
        coolStream.safe = true;
        scenesContainer[1] = coolStream;
        
        RegularSceneType cave = new RegularSceneType();
        cave.nameOfScene = "Cave";
        cave.description = "Player can rest in this location";
        cave.safe = true;
        scenesContainer[2] = cave;
        
        RegularSceneType deepCavern = new RegularSceneType();
        deepCavern.nameOfScene = "Deep Caverns";
        deepCavern.description = "The player has to be careful in this location.";
        deepCavern.safe = false;
        scenesContainer[3] = deepCavern;
        
        RegularSceneType greatRiver = new RegularSceneType();
        greatRiver.nameOfScene = "Great River";
        greatRiver.description = "Danger.  Player must beware.";
        greatRiver.safe = false;
        scenesContainer[4] = greatRiver;
        
        RegularSceneType smallTown = new RegularSceneType();
        smallTown.nameOfScene = "Small Town";
        smallTown.description = "The player can trade items they have for other items.";
        smallTown.safe = true;
        scenesContainer[5] = smallTown;
        
        RegularSceneType goal = new RegularSceneType();
        goal.nameOfScene = "Goal";
        goal.description = "player is successful, the game is complete.";
        goal.safe = false;
        scenesContainer[6] = goal;
        
        RegularSceneType minor1 = new RegularSceneType();
        minor1.nameOfScene = "Minor 1";
        minor1.description = "The player can encounter Coyote or Wolf.";
        minor1.safe = false;
        scenesContainer[7] = minor1;
        
        RegularSceneType minor2 = new RegularSceneType();
        minor2.nameOfScene = "Minor 2";
        minor2.description = "The player can encounter wolf or beer.";
        minor2.safe = false;
        scenesContainer[8] = minor2;
        
        RegularSceneType minor3 = new RegularSceneType();
        minor3.nameOfScene = "Minor 3";
        minor3.description = "The player may encounter beer or muggers.";
        minor3.safe = false;
        scenesContainer[9] = minor3;
        
        return scenesContainer;
         
    }
     //Class Hash, Equals, and toString override functions

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 67 * hash + Objects.hashCode(this.nameOfScene);
        hash = 67 * hash + Objects.hashCode(this.description);
        hash = 67 * hash + Objects.hashCode(this.safe);
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
        final RegularSceneType other = (RegularSceneType) obj;
        if (!Objects.equals(this.nameOfScene, other.nameOfScene)) {
            return false;
        }
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        if (!Objects.equals(this.safe, other.safe)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "RegularSceneType{" + "nameOfScene=" + nameOfScene + ", description=" + description + ", safe=" + safe + '}';
    }

    
    
    
    
}
