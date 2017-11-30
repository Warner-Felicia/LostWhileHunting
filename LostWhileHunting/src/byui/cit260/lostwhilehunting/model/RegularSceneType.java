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
    private String symbol;
    private String question;
    
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

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
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
