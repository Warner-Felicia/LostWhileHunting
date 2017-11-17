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
        
        RegularSceneType scene1 = new RegularSceneType();
        scene1.nameOfScene = "Starting Area";
        scene1.description = "This is where the player will start.";
        scene1.safe = true;
        scenesContainer[0] = scene1;
        
        RegularSceneType scene2 = new RegularSceneType();
        scene2.nameOfScene = "Cool Stream";
        scene2.description = "The player can be refreshed here.";
        scene2.safe = true;
        scenesContainer[1] = scene2;
        
        RegularSceneType scene3 = new RegularSceneType();
        scene3.nameOfScene = "Cave";
        scene3.description = "Player can rest in this location";
        scene3.safe = true;
        scenesContainer[2] = scene3;
        
        RegularSceneType scene4 = new RegularSceneType();
        scene4.nameOfScene = "Deep Caverns";
        scene4.description = "The player has to be careful in this location.";
        scene4.safe = false;
        scenesContainer[3] = scene4;
        
        RegularSceneType scene5 = new RegularSceneType();
        scene5.nameOfScene = "Great River";
        scene5.description = "Danger.  Player must beware.";
        scene5.safe = false;
        scenesContainer[4] = scene5;
        
        RegularSceneType scene6 = new RegularSceneType();
        scene6.nameOfScene = "Starting Area";
        scene6.description = "This is where the player will start.";
        scene6.safe = true;
        scenesContainer[5] = scene6;
        
        RegularSceneType scene7 = new RegularSceneType();
        scene7.nameOfScene = "Starting Area";
        scene7.description = "This is where the player will start.";
        scene7.safe = true;
        scenesContainer[6] = scene7;
        
        RegularSceneType scene8 = new RegularSceneType();
        scene8.nameOfScene = "Starting Area";
        scene8.description = "This is where the player will start.";
        scene8.safe = true;
        scenesContainer[7] = scene8;
        
        RegularSceneType scene9 = new RegularSceneType();
        scene9.nameOfScene = "Starting Area";
        scene9.description = "This is where the player will start.";
        scene9.safe = true;
        scenesContainer[8] = scene9;
        
        RegularSceneType scene10 = new RegularSceneType();
        scene10.nameOfScene = "Starting Area";
        scene10.description = "This is where the player will start.";
        scene10.safe = true;
        scenesContainer[9] = scene10;
        
        return scenesContainer;
         
 /*        
Assign scene1 to its position in the scenes array
scene2 = Create a new ConstructionScene object
Assign values to each attribute in the Scene object
Assign scene2 to its position in the scenes array
scene2 = Create a new ResourceScene object
Assign values to each attribute in the Scene object
Assign scene2 to its position in the scenes array
…
…
…
RETURN scenes
}*/
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
