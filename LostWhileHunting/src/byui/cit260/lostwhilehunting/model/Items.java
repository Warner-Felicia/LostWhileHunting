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
public class Items implements Serializable{
    
    private String type;
    private int quantityInStock;
    private String status;
    private Game game;
    private ArrayList<ResourceSceneAmount> resourceSceneAmount = new 
        ArrayList<ResourceSceneAmount>();

    public Items() {
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getQuantityInStock() {
        return quantityInStock;
    }

    public Game getGame() {
        return game;
    }

    public ArrayList<ResourceSceneAmount> getResourceSceneAmount() {
        return resourceSceneAmount;
    }
    
    public void setQuantityInStock(int quantityInStock) {
        this.quantityInStock = quantityInStock;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setGame(Game game) {
        this.game = game;
    }

    public void setResourceSceneAmount(ArrayList<ResourceSceneAmount> resourceSceneAmount) {
        this.resourceSceneAmount = resourceSceneAmount;
    }
    
    @Override
    public int hashCode() {
        int hash = 5;
        hash = 73 * hash + Objects.hashCode(this.type);
        hash = 73 * hash + this.quantityInStock;
        hash = 73 * hash + Objects.hashCode(this.status);
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
        final Items other = (Items) obj;
        if (this.quantityInStock != other.quantityInStock) {
            return false;
        }
        if (!Objects.equals(this.type, other.type)) {
            return false;
        }
        if (!Objects.equals(this.status, other.status)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Items{" + "type=" + type + ", quantityInStock=" + quantityInStock + ", status=" + status + '}';
    }
    
}
